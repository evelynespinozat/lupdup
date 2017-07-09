$(document).ready(function() {
	iniciarEventosDialogEditar_centro_salud(true);
});

function iniciarEventosDialogEditar_centro_salud(esEditar) {
	$("#idBtnGuardarCentroSalud").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverCentroSalud").each(function() {
		$(this).unbind("click");
	});
	

	if(esEditar) {
		iniciarEventosDialogInicio_sede_salud();
	}
	if(esEditar) {
		iniciarEventosDialogInicio_usuario_centro_salud();
	}
	
	$('#idBtnGuardarCentroSalud').click(guardar_centro_salud);
	$('#idBtnVolverCentroSalud').click(volver_centro_salud);
}
function volver_centro_salud() {
	deshabilitaBotones_centro_salud(true);
	var frm		= document.formEditarCentroSalud;
	frm.action	= "centroSalud.action";
	frm.method	= "POST";
	frm.submit();
	deshabilitaBotones_centro_salud(false);
	return false;
}

function guardar_centro_salud() {
	deshabilitaBotones_centro_salud(true);
	var frm		= $("#idFormEditarCentroSalud");
	$.post('guardarCentroSalud.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_centro_salud(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_centro_salud();
		}
	},'json');
	return false;
}

function deshabilitaBotones_centro_salud(deshabilitarBoton) {
	$('#idBtnGuardarCentroSalud').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverCentroSalud").prop('disabled', deshabilitarBoton);
}
