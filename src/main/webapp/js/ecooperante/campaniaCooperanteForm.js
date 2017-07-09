$(document).ready(function() {
	iniciarEventosDialogEditar_campania_cooperante(true);
});

	



function iniciarEventosDialogEditar_campania_cooperante(esEditar) {



	$("#idBtnGuardarCampaniaCooperante").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverCampaniaCooperante").each(function() {
		$(this).unbind("click");
	});
	$('.datepicker').each(function() {
		$(this).unbind("datepicker");
	});
	

	
	$('#idBtnGuardarCampaniaCooperante').click(guardar_campania_cooperante);
	$('#idBtnVolverCampaniaCooperante').click(volver_campania_cooperante);
	
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
function volver_campania_cooperante() {
	deshabilitaBotones_campania_cooperante(true);
	var frm		= document.formEditarCampaniaCooperante;
	frm.action	= "campaniaCooperante.action";
	frm.method	= "POST";
	frm.submit();
	deshabilitaBotones_campania_cooperante(false);
	return false;
}

function guardar_campania_cooperante() {
	deshabilitaBotones_campania_cooperante(true);
	var id	= "#idFormEditarCampaniaCooperante";
	$(id).unbind("submit");
	$(id).submit(function(event) {
		$(this).ajaxSubmit({
			url:		"guardarCampaniaCooperante.action",
			type:		"POST",
			dataType:	"json",
			success:	function(datos) {
				sessionFinalizoJson(datos);
				if(datos.actionErrors.length > 0) {
					mostrarMensajesErrorStruts(datos.actionErrors);
					deshabilitaBotones_campania_cooperante(false);
				} else {
					mostrarMensajesStruts(datos.actionMessages);
					volver_campania_cooperante();
				}
			}
		});
		return false;
	});
	$(id).submit();
	return false;
}

function deshabilitaBotones_campania_cooperante(deshabilitarBoton) {
	$('#idBtnGuardarCampaniaCooperante').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverCampaniaCooperante").prop('disabled', deshabilitarBoton);
}
