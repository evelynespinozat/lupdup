$(document).ready(function() {
	iniciarEventosDialogEditar_donante(true);
});

function iniciarEventosDialogEditar_donante(esEditar) {
	$("#idBtnGuardarDonante").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverDonante").each(function() {
		$(this).unbind("click");
	});
	$('.datepicker').each(function() {
		$(this).unbind("datepicker");
	});
	
	$("select[name='edicion_donanteDto.intIdDepartamento']").each(function() {
		$(this).unbind("change");
	});
	
//	if(esEditar) {
//		iniciarEventosDialogInicio_allegados();
//	}
	
	$("select[name='edicion_donanteDto.intIdDepartamento']").change(change_donante_ubigeo_departamento);
	
	$('#idBtnGuardarDonante').click(guardar_donante);
	$('#idBtnVolverDonante').click(volver_donante);
	
	$('.datepicker').each(function() {
		$(this).datepicker({
			dateFormat: 'dd/mm/yy',
			buttonImageOnly: true,
			changeMonth: true,
			changeYear: true,
			currentText: 'Hoy',
			monthNames: ['Enero','Febrero','Marzo','Abril','Mayo','Junio',
			'Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'],
			monthNamesShort: ['Ene','Feb','Mar','Abr','May','Jun',
			'Jul','Ago','Sep','Oct','Nov','Dic'],
			dayNames: ['Domingo','Lunes','Martes','Mi&eacute;rcoles','Jueves','Viernes','S&aacute;bado'],
			dayNamesShort: ['Dom','Lun','Mar','Mi&eacute;','Juv','Vie','S&aacute;b'],
			dayNamesMin: ['Do','Lu','Ma','Mi','Ju','Vi','S&aacute;'],
			
			showOn: "button",
			buttonImage: "image/calendar.png",
			buttonImageOnly: true,
			buttonText: "Select date"
		});
	});
	iniciarKey($("#idFormEditarDonante"));
}
var markers	= [];
var map		= null;
function initMap() {
	//alert("ok");
	var originalMapCenter = new google.maps.LatLng(-12.041704524973218, -76.99115753173828);
	map = new google.maps.Map(document.getElementById('map'), {
		zoom: 11,
		center: originalMapCenter
	});
	
	map.addListener('click', function(event) {
		setMarket(event.latLng);
	});
	
	setTimeout(function() {
		var point	= $("input[name='edicion_donanteDto.strIndUbicacion']").val();
		var zoom	= $("input[name='edicion_donanteDto.intIndZoom']").val();
		if(point!="") {
			setMarket(leerWktPoint(point));
			zoom	= parseInt(zoom);
			if(zoom > 0) {
				map.setZoom(zoom);
			}
		}
	}, 1000);
}
function leerWktPoint(str) {
	str = str.replace("POINT(", "");
	str = str.replace(")", "");
    var arrStr = str.split(" ");
    return new google.maps.LatLng(parseFloat(arrStr[1]), parseFloat(arrStr[0]));
}
function setMarket(ubicacion) {
	$("input[name='edicion_donanteDto.strIndUbicacion']").val("POINT("+ubicacion.lng()+" "+ubicacion.lat()+")");
	$("input[name='edicion_donanteDto.intIndZoom']").val(""+map.getZoom());
	if(markers.length > 0) {
		for (var i = 0; i < markers.length; i++) {
			markers[i].setMap(null);
		}
	}
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

function volver_donante() {
	deshabilitaBotones_donante(true);
	var frm		= document.formEditarDonante;
	frm.action	= "donante.action";
	frm.method	= "POST";
	frm.submit();
	deshabilitaBotones_donante(false);
	return false;
}

function guardar_donante() {
	deshabilitaBotones_donante(true);
	var frm		= $("#idFormEditarDonante");
	if($("input[name='edicion_donanteDto.strIndUbicacion']").val() != "") {
		$.post('guardarDonante.action', frm.serialize(), function(datos) {
			sessionFinalizoJson(datos);
			if(datos.actionErrors.length > 0) {
				mostrarMensajesErrorStruts(datos.actionErrors);
				deshabilitaBotones_donante(false);
			} else {
				mostrarMensajesStruts(datos.actionMessages);
				volver_donante();
			}
		},'json');
	} else {
		mostrarMensajesErrorStruts(["El usuario debe marcar su ubicacion en el mapa, para continuar."]);
		deshabilitaBotones_donante(false);
	}
	return false;
}

function change_donante_ubigeo_departamento() {
	var intIdDepartamento	= $("select[name='edicion_donanteDto.intIdDepartamento']").val();
	var param	= {
			"intIdDepartamento":intIdDepartamento
	};
	$.post('donanteUbigeoProvinciaCargar.action', param, function(datos) {
		sessionFinalizo(datos);
		$("#idCampDonante_intIdProvincia").html(datos);

		$("select[name='edicion_donanteDto.intIdProvincia']").each(function() {
			$(this).unbind("change");
		});
		$("select[name='edicion_donanteDto.intIdProvincia']").change(change_donante_ubigeo_provincia);
		change_donante_ubigeo_provincia();
	});
}
function change_donante_ubigeo_provincia() {
	var intIdDepartamento	= $("select[name='edicion_donanteDto.intIdDepartamento']").val();
	var intIdProvincia		= $("select[name='edicion_donanteDto.intIdProvincia']").val();
	var param	= {
			"intIdDepartamento":intIdDepartamento,
			"intIdProvincia":intIdProvincia
	};
	$.post('donanteUbigeoDistritoCargar.action', param, function(datos) {
		sessionFinalizo(datos);
		$("#idCampDonante_Distrito").html(datos);
	});

}

function deshabilitaBotones_donante(deshabilitarBoton) {
	$('#idBtnGuardarDonante').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverDonante").prop('disabled', deshabilitarBoton);
}
