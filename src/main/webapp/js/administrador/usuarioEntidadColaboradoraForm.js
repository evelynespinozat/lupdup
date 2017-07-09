	



function iniciarEventosDialogEditar_usuario_entidad_colaboradora(esEditar) {



	$("#idBtnGuardarUsuarioEntidadColaboradora").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverUsuarioEntidadColaboradora").each(function() {
		$(this).unbind("click");
	});
	

	
	$('#idBtnGuardarUsuarioEntidadColaboradora').click(guardar_usuario_entidad_colaboradora);
	$('#idBtnVolverUsuarioEntidadColaboradora').click(volver_usuario_entidad_colaboradora);
	

}
function volver_usuario_entidad_colaboradora() {
	deshabilitaBotones_usuario_entidad_colaboradora(true);
	$('.usuario-entidad-colaboradora-modal').modal('hide');
	buscar_basico_usuario_entidad_colaboradora();
	deshabilitaBotones_usuario_entidad_colaboradora(false);
	return false;
}

function guardar_usuario_entidad_colaboradora() {
	deshabilitaBotones_usuario_entidad_colaboradora(true);
	var frm		= $("#idFormEditarUsuarioEntidadColaboradora");
	$.post('guardarUsuarioEntidadColaboradora.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_usuario_entidad_colaboradora(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_usuario_entidad_colaboradora();
		}
	},'json');
	return false;
}

function deshabilitaBotones_usuario_entidad_colaboradora(deshabilitarBoton) {
	$('#idBtnGuardarUsuarioEntidadColaboradora').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverUsuarioEntidadColaboradora").prop('disabled', deshabilitarBoton);
}
