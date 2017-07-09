$(document).ready(function() {
	iniciarEventosDialogEditar_ficha_resultados(true);
});

	



function iniciarEventosDialogEditar_ficha_resultados(esEditar) {



	$("#idBtnGuardarFichaResultados").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverFichaResultados").each(function() {
		$(this).unbind("click");
	});
	$('.datepicker').each(function() {
		$(this).unbind("datepicker");
	});
	

	if(esEditar) {
		iniciarEventosDialogInicio_detalle_ficha();
	}
	
	$('#idBtnGuardarFichaResultados').click(guardar_ficha_resultados);
	$('#idBtnVolverFichaResultados').click(volver_ficha_resultados);
	
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
function volver_ficha_resultados() {
	deshabilitaBotones_ficha_resultados(true);
	var frm		= document.formEditarFichaResultados;
	frm.action	= "fichaResultados.action";
	frm.method	= "POST";
	frm.submit();
	deshabilitaBotones_ficha_resultados(false);
	return false;
}

function guardar_ficha_resultados() {
	deshabilitaBotones_ficha_resultados(true);
	var id	= "#idFormEditarFichaResultados";
	$(id).unbind("submit");
	$(id).submit(function(event) {
		$(this).ajaxSubmit({
			url:		"guardarFichaResultados.action",
			type:		"POST",
			dataType:	"json",
			success:	function(datos) {
				sessionFinalizoJson(datos);
				if(datos.actionErrors.length > 0) {
					mostrarMensajesErrorStruts(datos.actionErrors);
					deshabilitaBotones_ficha_resultados(false);
				} else {
					mostrarMensajesStruts(datos.actionMessages);
					volver_ficha_resultados();
				}
			}
		});
		return false;
	});
	$(id).submit();
	return false;
}

function deshabilitaBotones_ficha_resultados(deshabilitarBoton) {
	$('#idBtnGuardarFichaResultados').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverFichaResultados").prop('disabled', deshabilitarBoton);
}
