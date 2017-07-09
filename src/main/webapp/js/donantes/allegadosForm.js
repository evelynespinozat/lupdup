$(document).ready(function() {
	iniciarEventosDialogEditar_allegados(true);
});

	



function iniciarEventosDialogEditar_allegados(esEditar) {



	$("#idBtnGuardarAllegados").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverAllegados").each(function() {
		$(this).unbind("click");
	});
	$('.datepicker').each(function() {
		$(this).unbind("datepicker");
	});
	

	
	$('#idBtnGuardarAllegados').click(guardar_allegados);
	$('#idBtnVolverAllegados').click(volver_allegados);
	
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
function volver_allegados() {
	deshabilitaBotones_allegados(true);
	var frm		= document.formEditarAllegados;
	frm.action	= "allegados.action";
	frm.method	= "POST";
	frm.submit();
	deshabilitaBotones_allegados(false);
	return false;
}

function guardar_allegados() {
	deshabilitaBotones_allegados(true);
	var frm		= $("#idFormEditarAllegados");
	$.post('guardarAllegados.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_allegados(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_allegados();
		}
	},'json');
	return false;
}

function deshabilitaBotones_allegados(deshabilitarBoton) {
	$('#idBtnGuardarAllegados').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverAllegados").prop('disabled', deshabilitarBoton);
}
