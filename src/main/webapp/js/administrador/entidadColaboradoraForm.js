$(document).ready(function() {
	iniciarEventosDialogEditar_entidad_colaboradora(true);
});

	



function iniciarEventosDialogEditar_entidad_colaboradora(esEditar) {



	$("#idBtnGuardarEntidadColaboradora").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverEntidadColaboradora").each(function() {
		$(this).unbind("click");
	});
	

	if(esEditar) {
		iniciarEventosDialogInicio_sede_entidad_colaboradora();
	}
	if(esEditar) {
		iniciarEventosDialogInicio_usuario_entidad_colaboradora();
	}
	
	$('#idBtnGuardarEntidadColaboradora').click(guardar_entidad_colaboradora);
	$('#idBtnVolverEntidadColaboradora').click(volver_entidad_colaboradora);
	

}
function volver_entidad_colaboradora() {
	deshabilitaBotones_entidad_colaboradora(true);
	var frm		= document.formEditarEntidadColaboradora;
	frm.action	= "entidadColaboradora.action";
	frm.method	= "POST";
	frm.submit();
	deshabilitaBotones_entidad_colaboradora(false);
	return false;
}

function guardar_entidad_colaboradora() {
	deshabilitaBotones_entidad_colaboradora(true);
	var frm		= $("#idFormEditarEntidadColaboradora");
	$.post('guardarEntidadColaboradora.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_entidad_colaboradora(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_entidad_colaboradora();
		}
	},'json');
	return false;
}

function deshabilitaBotones_entidad_colaboradora(deshabilitarBoton) {
	$('#idBtnGuardarEntidadColaboradora').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverEntidadColaboradora").prop('disabled', deshabilitarBoton);
}
