function iniciarEventosDialogEditar_sede_salud(esEditar) {
	$("#idBtnGuardarSedeSalud").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverSedeSalud").each(function() {
		$(this).unbind("click");
	});
	
	$('#idBtnGuardarSedeSalud').click(guardar_sede_salud);
	$('#idBtnVolverSedeSalud').click(volver_sede_salud);
	
	initMapCenter();
}
function volver_sede_salud() {
	deshabilitaBotones_sede_salud(true);
	$('.sede-salud-modal').modal('hide');
	buscar_basico_sede_salud();
	deshabilitaBotones_sede_salud(false);
	return false;
}

function guardar_sede_salud() {
	deshabilitaBotones_sede_salud(true);
	var frm		= $("#idFormEditarSedeSalud");
	if($("input[name='edicion_sedeSaludDto.strIndUbicacion']").val() != "") {
		$.post('guardarSedeSalud.action', frm.serialize(), function(datos) {
			sessionFinalizoJson(datos);
			if(datos.actionErrors.length > 0) {
				mostrarMensajesErrorStruts(datos.actionErrors);
				deshabilitaBotones_sede_salud(false);
			} else {
				mostrarMensajesStruts(datos.actionMessages);
				volver_sede_salud();
			}
		},'json');
	} else {
		mostrarMensajesErrorStruts(["El usuario debe marcar la ubicación de la sede en el mapa, para continuar."]);
		deshabilitaBotones_sede_salud(false);
	}
	return false;
}

function deshabilitaBotones_sede_salud(deshabilitarBoton) {
	$('#idBtnGuardarSedeSalud').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverSedeSalud").prop('disabled', deshabilitarBoton);
}


var markers	= [];
var map		= null;
function initMapCenter() {
	if(map) {
		google.maps.event.trigger(map, 'resize');
		var point	= $("input[name='edicion_sedeSaludDto.strIndUbicacion']").val();
		var zoom	= $("input[name='edicion_sedeSaludDto.intIndZoom']").val();
		if(point != "" && zoom != "") {
			setMarket(leerWktPoint(point));
			zoom	= parseInt(zoom);
			if(zoom > 0) {
				map.setZoom(zoom);
			}
		} else {
			removeAllMarkets();
			var originalMapCenter = new google.maps.LatLng(-12.038783331181438, -77.02102661132812);
			map.setCenter(originalMapCenter);
			map.setZoom(10);
		}
	} else {
		alert("The map is null");
	}
}
function initMap() {
	var originalMapCenter = new google.maps.LatLng(-12.188764176418985, -76.9976806640625);
	map = new google.maps.Map(document.getElementById('map'), {
		zoom: 11,
		center: originalMapCenter
	});
	
	map.addListener('click', function(event) {
		setMarket(event.latLng);
	});
	
}
function leerWktPoint(str) {
	str = str.replace("POINT(", "");
	str = str.replace(")", "");
    var arrStr = str.split(" ");
    return new google.maps.LatLng(parseFloat(arrStr[1]), parseFloat(arrStr[0]));
}
function setMarket(ubicacion) {
	$("input[name='edicion_sedeSaludDto.strIndUbicacion']").val("POINT("+ubicacion.lng()+" "+ubicacion.lat()+")");
	$("input[name='edicion_sedeSaludDto.intIndZoom']").val(""+map.getZoom());
	removeAllMarkets();
	var marker = new google.maps.Marker({
		position: ubicacion,
		map: map,
		title: 'Mi ubicacion'
	});
	markers.push(marker);
	var mapCenter = new google.maps.LatLng(ubicacion.lat(), ubicacion.lng());
	map.setCenter(mapCenter);
	console.log("latLng="+ubicacion);
	console.log("zoom="+map.getZoom());
}
function removeAllMarkets() {
	if(markers.length > 0) {
		for (var i = 0; i < markers.length; i++) {
			markers[i].setMap(null);
		}
	}
}