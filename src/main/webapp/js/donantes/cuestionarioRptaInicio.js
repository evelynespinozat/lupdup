$(document).ready(function() {
	
	$("#idBtnGuardarCuestionarioRpta").each(function() {
		$(this).unbind("click");
	});
//	$("#idBtnVolverCuestionarioRpta").each(function() {
//		$(this).unbind("click");
//	});
	
	$('#idBtnGuardarCuestionarioRpta').click(guardar_cuestionario_rpta);
//	$('#idBtnVolverCuestionarioRpta').click(volver_cuestionario_rpta);
	
});

function guardar_cuestionario_rpta() {
	deshabilitaBotones_cuestionario_rpta(true);
	var frm		= $("#idFormCuestionarioRpta");
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
function volver_cuestionario_rpta() {
	deshabilitaBotones_cuestionario_rpta(true);
	var frm		= document.formEditarCuestionarioRpta;
	frm.action	= "cuestionarioRpta.action";
	frm.method	= "POST";
	frm.submit();
	deshabilitaBotones_cuestionario_rpta(false);
	return false;
}

function salir_cuestionario_rpta() {
	document.location.href = "home.action";
	return false;
}


function deshabilitaBotones_cuestionario_rpta(deshabilitarBoton) {
	$('#idBtnGuardarCuestionarioRpta').prop('disabled', deshabilitarBoton);
//	$(".btn_buscar_control_cuestionario_rpta").each(function() {
//		$(this).prop('disabled', deshabilitarBoton);
//	});
}

