
function iniciarEventosDialogEditar_ficha_bandeja_cita(esEditar) {
	$("#idBtnGuardarFichaResultados").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverFichaResultados").each(function() {
		$(this).unbind("click");
	});
	$('.datepicker').each(function() {
		$(this).unbind("datepicker");
	});
	
	$('#idBtnGuardarFichaResultados').click(guardar_ficha_bandeja_cita);
	$('#idBtnVolverFichaResultados').click(volver_ficha_bandeja_cita);
	
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

function volver_ficha_bandeja_cita() {
	deshabilitaBotones_ficha_bandeja_cita(true);
//	var frm		= document.formEditarFichaResultados;
//	frm.action	= "bandejaCita.action";
//	frm.method	= "POST";
//	frm.submit();
	buscar_basico_bandeja_cita();
	$('.editar-ficha-modal').modal('hide');
	deshabilitaBotones_ficha_bandeja_cita(false);
	return false;
}

function guardar_ficha_bandeja_cita() {
	deshabilitaBotones_ficha_bandeja_cita(true);
	var id	= "#idFormEditarFichaResultados";
	$(id).unbind("submit");
	$(id).submit(function(event) {
		$(this).ajaxSubmit({
			url:		"guardarFichaBandejaCita.action",
			type:		"POST",
			dataType:	"json",
			success:	function(datos) {
				sessionFinalizoJson(datos);
				if(datos.actionErrors.length > 0) {
					mostrarMensajesErrorStruts(datos.actionErrors);
					deshabilitaBotones_ficha_bandeja_cita(false);
				} else {
					mostrarMensajesStruts(datos.actionMessages);
					volver_ficha_bandeja_cita();
				}
			}
		});
		return false;
	});
	$(id).submit();
	return false;
}

function deshabilitaBotones_ficha_bandeja_cita(deshabilitarBoton) {
	$('#idBtnGuardarFichaResultados').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverFichaResultados").prop('disabled', deshabilitarBoton);
}
