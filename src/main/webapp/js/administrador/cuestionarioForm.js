$(document).ready(function() {
	iniciarEventosDialogEditar_cuestionario(true);
});

	



function iniciarEventosDialogEditar_cuestionario(esEditar) {



	$("#idBtnGuardarCuestionario").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverCuestionario").each(function() {
		$(this).unbind("click");
	});
	

	
	$('#idBtnGuardarCuestionario').click(guardar_cuestionario);
	$('#idBtnVolverCuestionario').click(volver_cuestionario);
	

}
function volver_cuestionario() {
	deshabilitaBotones_cuestionario(true);
	var frm		= document.formEditarCuestionario;
	frm.action	= "cuestionario.action";
	frm.method	= "POST";
	frm.submit();
	deshabilitaBotones_cuestionario(false);
	return false;
}

function guardar_cuestionario() {
	deshabilitaBotones_cuestionario(true);
	var frm		= $("#idFormEditarCuestionario");
	$.post('guardarCuestionario.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_cuestionario(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_cuestionario();
		}
	},'json');
	return false;
}

function deshabilitaBotones_cuestionario(deshabilitarBoton) {
	$('#idBtnGuardarCuestionario').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverCuestionario").prop('disabled', deshabilitarBoton);
}
