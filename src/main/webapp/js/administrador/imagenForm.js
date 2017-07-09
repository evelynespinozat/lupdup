$(document).ready(function() {
	iniciarEventosDialogEditar_imagen(true);
});

	



function iniciarEventosDialogEditar_imagen(esEditar) {



	$("#idBtnGuardarImagen").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverImagen").each(function() {
		$(this).unbind("click");
	});
	

	
	$('#idBtnGuardarImagen').click(guardar_imagen);
	$('#idBtnVolverImagen').click(volver_imagen);
	

}
function volver_imagen() {
	deshabilitaBotones_imagen(true);
	var frm		= document.formEditarImagen;
	frm.action	= "imagen.action";
	frm.method	= "POST";
	frm.submit();
	deshabilitaBotones_imagen(false);
	return false;
}

function guardar_imagen() {
	deshabilitaBotones_imagen(true);
	var frm		= $("#idFormEditarImagen");
	$.post('guardarImagen.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_imagen(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_imagen();
		}
	},'json');
	return false;
}

function deshabilitaBotones_imagen(deshabilitarBoton) {
	$('#idBtnGuardarImagen').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverImagen").prop('disabled', deshabilitarBoton);
}
