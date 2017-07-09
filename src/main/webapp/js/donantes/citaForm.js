$(document).ready(function() {
	iniciarEventosDialogEditar_cita(true);
});


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
			//arrDataSede[6];// steIndHoraDesdeString
			//arrDataSede[7];// steIndHoraHastaString
			setMarket(leerWktPoint(arrDataSede[1]),arrDataSede[0],arrDataSede[2],arrDataSede[3],arrDataSede[4],arrDataSede[5],arrDataSede[6],arrDataSede[7]);
		}
	}
	
	var ubicacionDonante	= $("#idDivUbiDonante").html();
	if(ubicacionDonante != "") {
		setMarketDonante(leerWktPoint(ubicacionDonante)	);
	}
}
function leerWktPoint(str) {
	str = str.replace("POINT(", "");
	str = str.replace(")", "");
    var arrStr = str.split(" ");
    return new google.maps.LatLng(parseFloat(arrStr[1]), parseFloat(arrStr[0]));
}
function reinciarColorSedes() {
    var pinImage = new google.maps.MarkerImage("http://www.googlemapsmarkers.com/v1/F35048/");
	for(var i=0;i<markers.length;i++) {
		markers[i].setIcon(pinImage);
	}
}
function setMarket(ubicacion, id, desc, descDireccion, descHosp, horario, horaDesde, horaHasta) {
    var pinImage = new google.maps.MarkerImage("http://www.googlemapsmarkers.com/v1/F35048/");
	var marker = new google.maps.Marker({
		position: ubicacion,
		map: map,
		title: descHosp+": "+desc,
		icon: pinImage,
		idSede: id,
		descDireccion: descDireccion,
		descHospital: descHosp,
		horaDesde: horaDesde,
		horaHasta: horaHasta
	});
	marker.addListener('click', function() {
		//alert("msg marker: id="+$(this).attr("idSede"));
		$("#idSpanHospital").html($(this).attr("descHospital"));
		$("#idSpanDireccionSede").html($(this).attr("descDireccion"));
		$("#idSpanHorario").html("Horario de atenci&oacute;n: "+horario);
		
		$("input[name='edicion_citaDto.intIdSede']").val($(this).attr("idSede"));
		reinciarColorSedes();
	    var pinImage = new google.maps.MarkerImage("http://www.googlemapsmarkers.com/v1/06FF06/");
	    $(this)[0].setIcon(pinImage);
	    
	    cargarComboHoraCita($(this).attr("horaDesde"), $(this).attr("horaHasta"));
	    trazarRuta(markerDonante.getPosition(), $(this)[0].getPosition());
	});
	markers.push(marker);
	console.log("latLng="+ubicacion+" zoom="+map.getZoom());
}
var markerDonante	= null;
function setMarketDonante(ubicacion) {
//    var pinColor	= "FE7569";
    var pinImage = new google.maps.MarkerImage("http://www.googlemapsmarkers.com/v1/000099/");
//    var pinImage	= new google.maps.MarkerImage(
//    		"http://chart.apis.google.com/chart?chst=d_map_pin_letter&chld=%E2%80%A2|" + pinColor,
//    		new google.maps.Size(21, 34),
//    		new google.maps.Point(0,0),
//    		new google.maps.Point(10, 34));
    markerDonante = new google.maps.Marker({
		position: ubicacion,
		map: map,
		icon: pinImage,
		title: "Mi ubicación",
	});
//	markers.push(markerDonante);
	var mapCenter = new google.maps.LatLng(ubicacion.lat(), ubicacion.lng());
	map.setCenter(mapCenter);
	map.setZoom(14);
	console.log("latLng="+ubicacion);
}
function removeAllMarkers() {
	if(markers.length > 0) {
		for (var i = 0; i < markers.length; i++) {
			markers[i].setMap(null);
		}
	}
	if(markerDonante !=null) {
		markerDonante.setMap(null);
	}

}

function iniciarEventosDialogEditar_cita(esEditar) {
	$("#idBtnGuardarCita").each(function() {
		$(this).unbind("click");
	});
//	$("#idBtnVolverCita").each(function() {
//		$(this).unbind("click");
//	});
	$('.datepicker').each(function() {
		$(this).unbind("datepicker");
	});
	

	
	$('#idBtnGuardarCita').click(guardar_cita);
//	$('#idBtnVolverCita').click(volver_cita);
	
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

}
function volver_cita() {
	deshabilitaBotones_cita(true);
	var frm		= document.formEditarCita;
	frm.action	= "cita.action";
	frm.method	= "POST";
	frm.submit();
	deshabilitaBotones_cita(false);
	return false;
}

function guardar_cita() {
	deshabilitaBotones_cita(true);
	var intIdSede	= $("input[name='edicion_citaDto.intIdSede']").val();
	if(intIdSede == "") {
		mostrarMensajesErrorStruts(["Debe seleccionar una sede hospitalaria donde desea donar"]);
		deshabilitaBotones_cita(false);
		return false;
	}
	var dteFecCitaFecha	= $("input[name='edicion_citaDto.dteFecCitaFecha']").val();
	if(dteFecCitaFecha == "") {
		mostrarMensajesErrorStruts(["Debe seleccionar una fecha para su programación"]);
		deshabilitaBotones_cita(false);
		return false;
	}
	var strHorCita	= $("select[name='edicion_citaDto.strHorCita']").val();
	if(strHorCita == "") {
		mostrarMensajesErrorStruts(["Debe seleccionar una hora para su programación"]);
		deshabilitaBotones_cita(false);
		return false;
	}
	var frm		= $("#idFormEditarCita");
	$.post('guardarCita.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_cita(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			if(datos.cita_sin_login == "true") {
				var frm		= document.formEditarCita;
				frm.action	= "donante.action";
				frm.method	= "POST";
				frm.submit();
			} else {
				volver_cita();
			}
		}
	},'json');
	return false;
}
function cargarComboHoraCita(horaDesde, horaHasta) {
	var param	= {
			filtrar_strHoraDesde: horaDesde,
			filtrar_strHoraHasta: horaHasta
	};
	$.post('formatoHoraCita.action', param, function(datos) {
		$("#idDivHoraCita").html(datos);
	});
}
var directionsDisplay	 = null;
function trazarRuta(puntoOrigen, puntoDestino) {
	console.log("trazarRuta: puntoOrigen="+puntoOrigen+" puntoDestino="+puntoDestino);
	//map
	if(directionsDisplay != null) {
		directionsDisplay.setMap(null);
	}
	directionsService = new google.maps.DirectionsService();
	directionsDisplay = new google.maps.DirectionsRenderer(
			{
				suppressMarkers: true
			});
	
	var request		= {
			origin:puntoOrigen,
			destination:puntoDestino,
			travelMode: google.maps.DirectionsTravelMode.DRIVING
			};
	
	directionsService.route(request, function(result, status) {
		   if (status == google.maps.DirectionsStatus.OK) {
		      directionsDisplay.setMap(map);
		      var mystr="";
		      for(var i in result.routes){
		         var mylegs=result.routes[i].legs;
		         for(var j in mylegs){
		            mystr += mylegs[j].distance.text;
		            mystr += " " + mylegs[j].duration.text+ " <br/> ";
		         }
		         mystr+=" <br/>";
		         $("#infoRecorrido").html(mystr);
		      }
		      directionsDisplay.setDirections(result);
		   }
		});
}
function deshabilitaBotones_cita(deshabilitarBoton) {
	$('#idBtnGuardarCita').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverCita").prop('disabled', deshabilitarBoton);
}
