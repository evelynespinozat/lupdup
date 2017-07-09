	



function iniciarEventosDialogEditar_usuario_centro_salud(esEditar) {



	$("#idBtnGuardarUsuarioCentroSalud").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverUsuarioCentroSalud").each(function() {
		$(this).unbind("click");
	});
	

	
	$('#idBtnGuardarUsuarioCentroSalud').click(guardar_usuario_centro_salud);
	$('#idBtnVolverUsuarioCentroSalud').click(volver_usuario_centro_salud);
	

}
function volver_usuario_centro_salud() {
	deshabilitaBotones_usuario_centro_salud(true);
	$('.usuario-centro-salud-modal').modal('hide');
	buscar_basico_usuario_centro_salud();
	deshabilitaBotones_usuario_centro_salud(false);
	return false;
}

function guardar_usuario_centro_salud() {
	deshabilitaBotones_usuario_centro_salud(true);
	var frm		= $("#idFormEditarUsuarioCentroSalud");
	$.post('guardarUsuarioCentroSalud.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_usuario_centro_salud(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_usuario_centro_salud();
		}
	},'json');
	return false;
}

function deshabilitaBotones_usuario_centro_salud(deshabilitarBoton) {
	$('#idBtnGuardarUsuarioCentroSalud').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverUsuarioCentroSalud").prop('disabled', deshabilitarBoton);
}
