$(document).ready(function() {
	iniciarEventosDialogEditar_cuestionario_rpta(true);
});

	



function iniciarEventosDialogEditar_cuestionario_rpta(esEditar) {



	$("#idBtnGuardarCuestionarioRpta").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverCuestionarioRpta").each(function() {
		$(this).unbind("click");
	});
	

	
	$('#idBtnGuardarCuestionarioRpta').click(guardar_cuestionario_rpta);
	$('#idBtnVolverCuestionarioRpta').click(volver_cuestionario_rpta);
	

}
function volver_cuestionario_rpta() {
	deshabilitaBotones_cuestionario_rpta(true);
	var frm		= document.formEditarCuestionarioRpta;
	frm.action	= "cuestionarioRpta.action";
	frm.method	= "POST";
	frm.submit();
	deshabilitaBotones_cuestionario_rpta(false);
	return false;
}

function guardar_cuestionario_rpta() {
	deshabilitaBotones_cuestionario_rpta(true);
	var frm		= $("#idFormEditarCuestionarioRpta");
	$.post('guardarCuestionarioRpta.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_cuestionario_rpta(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_cuestionario_rpta();
		}
	},'json');
	return false;
}

function deshabilitaBotones_cuestionario_rpta(deshabilitarBoton) {
	$('#idBtnGuardarCuestionarioRpta').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverCuestionarioRpta").prop('disabled', deshabilitarBoton);
}
