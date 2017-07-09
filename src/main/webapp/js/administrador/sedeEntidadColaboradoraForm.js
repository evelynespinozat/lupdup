	



function iniciarEventosDialogEditar_sede_entidad_colaboradora(esEditar) {



	$("#idBtnGuardarSedeEntidadColaboradora").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverSedeEntidadColaboradora").each(function() {
		$(this).unbind("click");
	});
	

	
	$('#idBtnGuardarSedeEntidadColaboradora').click(guardar_sede_entidad_colaboradora);
	$('#idBtnVolverSedeEntidadColaboradora').click(volver_sede_entidad_colaboradora);
	

}
function volver_sede_entidad_colaboradora() {
	deshabilitaBotones_sede_entidad_colaboradora(true);
	$('.sede-entidad-colaboradora-modal').modal('hide');
	buscar_basico_sede_entidad_colaboradora();
	deshabilitaBotones_sede_entidad_colaboradora(false);
	return false;
}

function guardar_sede_entidad_colaboradora() {
	deshabilitaBotones_sede_entidad_colaboradora(true);
	var frm		= $("#idFormEditarSedeEntidadColaboradora");
	$.post('guardarSedeEntidadColaboradora.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_sede_entidad_colaboradora(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_sede_entidad_colaboradora();
		}
	},'json');
	return false;
}

function deshabilitaBotones_sede_entidad_colaboradora(deshabilitarBoton) {
	$('#idBtnGuardarSedeEntidadColaboradora').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverSedeEntidadColaboradora").prop('disabled', deshabilitarBoton);
}
