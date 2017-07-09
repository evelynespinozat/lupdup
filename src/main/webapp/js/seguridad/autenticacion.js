$(document).ready(function() {
	$('#idBtnIngresar').click(autenticacion);
	$('#idBtnSalirCapa').click(salir_capa);
	$(".loginaction").each(function() {
		$(this).unbind("keypress");
		$(this).keypress(function(event) {
			var key		= (event.which) ? event.which : event.keyCode;
			if(key == 13) {
				autenticacion();
			}
		});
	});
});
function autenticacion() {
	deshabilitaBotones_autenticacion(true);
	var frm		= document.formAutenticacion;
	frm.action	= "autenticarUsuario.action";
	frm.method	= "POST";
	frm.submit();
	return false;
}
function deshabilitaBotones_autenticacion(deshabilitarBoton) {
	$('#idBtnIngresar').prop('disabled', deshabilitarBoton);
}

function salir_capa() {
	document.location.href = "home.action";
	return false;
}






var markers	= [];
var map		= null;
function initMap() {
	var originalMapCenter = new google.maps.LatLng(-12.041704524973218, -76.99115753173828);
	map = new google.maps.Map(document.getElementById('map'), {
		zoom: 11,
		center: originalMapCenter
	});
	
//	map.addListener('click', function(event) {
//		setMarket(event.latLng);
//	});
	
	setTimeout(function() {
		inciarSedes();
	}, 1000);
}
function inciarSedes() {
	removeAllMarkers();
	var listSedeSalud	= $("#idDivListSedeSalud").html();
	var arrSedes		= listSedeSalud.split(";");
	for(var i=0;i<arrSedes.length;i++) {
		if(arrSedes[i].length>0) {
			var arrDataSede		= arrSedes[i].split("|");
			//arrDataSede[0];// srlIdSede
			//arrDataSede[1];// strIndUbicacion
			//arrDataSede[2];// strNomNombre
			//arrDataSede[3];// strDesDireccion
			//arrDataSede[4];// strDesHospital
			//arrDataSede[5];// steIndHoraDesdeHastaString
			setMarket(leerWktPoint(arrDataSede[1]),arrDataSede[0],arrDataSede[2],arrDataSede[3],arrDataSede[4],arrDataSede[5]);
		}
	}
	
//	var ubicacionDonante	= $("#idDivUbiDonante").html();
//	if(ubicacionDonante != "") {
//		setMarketDonante(leerWktPoint(ubicacionDonante)	);
//	}
}
function leerWktPoint(str) {
	str = str.replace("POINT(", "");
	str = str.replace(")", "");
    var arrStr = str.split(" ");
    return new google.maps.LatLng(parseFloat(arrStr[1]), parseFloat(arrStr[0]));
}
function setMarket(ubicacion, id, desc, descDireccion, descHosp, horario) {
	var marker = new google.maps.Marker({
		position: ubicacion,
		map: map,
		title: descHosp+": "+desc,
		idSede: id,
		descDireccion: descDireccion,
		descHospital: descHosp
	});
	marker.addListener('click', function() {
		//alert("msg marker: id="+$(this).attr("idSede"));
//		$("#idSpanHospital").html($(this).attr("descHospital"));
//		$("#idSpanDireccionSede").html($(this).attr("descDireccion"));
//		$("#idSpanHorario").html("Horario de atenci&oacute;n: "+horario);
		
		//$("input[name='edicion_citaDto.intIdSede']").val($(this).attr("idSede"));
		alert("Sede sel: " + horario);
	});
	markers.push(marker);
	console.log("latLng="+ubicacion+" zoom="+map.getZoom());
}
//function setMarketDonante(ubicacion) {
//    var pinImage = new google.maps.MarkerImage("http://www.googlemapsmarkers.com/v1/000099/");
//	var marker = new google.maps.Marker({
//		position: ubicacion,
//		map: map,
//		icon: pinImage,
//		title: "Mi ubicación",
//	});
//	markers.push(marker);
//	var mapCenter = new google.maps.LatLng(ubicacion.lat(), ubicacion.lng());
//	map.setCenter(mapCenter);
//	map.setZoom(14);
//	console.log("latLng="+ubicacion);
//}
function removeAllMarkers() {
	if(markers.length > 0) {
		for (var i = 0; i < markers.length; i++) {
			markers[i].setMap(null);
		}
	}
}
