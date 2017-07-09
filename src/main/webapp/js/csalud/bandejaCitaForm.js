$(document).ready(function() {
	iniciarEventosDialogEditar_bandeja_cita(true);
});

	



function iniciarEventosDialogEditar_bandeja_cita(esEditar) {



	$("#idBtnGuardarBandejaCita").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverBandejaCita").each(function() {
		$(this).unbind("click");
	});
	$('.datepicker').each(function() {
		$(this).unbind("datepicker");
	});
	

	
	$('#idBtnGuardarBandejaCita').click(guardar_bandeja_cita);
	$('#idBtnVolverBandejaCita').click(volver_bandeja_cita);
	
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
function volver_bandeja_cita() {
	deshabilitaBotones_bandeja_cita(true);
	var frm		= document.formEditarBandejaCita;
	frm.action	= "bandejaCita.action";
	frm.method	= "POST";
	frm.submit();
	deshabilitaBotones_bandeja_cita(false);
	return false;
}

function guardar_bandeja_cita() {
	deshabilitaBotones_bandeja_cita(true);
	var frm		= $("#idFormEditarBandejaCita");
	$.post('guardarBandejaCita.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_bandeja_cita(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_bandeja_cita();
		}
	},'json');
	return false;
}

function deshabilitaBotones_bandeja_cita(deshabilitarBoton) {
	$('#idBtnGuardarBandejaCita').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverBandejaCita").prop('disabled', deshabilitarBoton);
}
