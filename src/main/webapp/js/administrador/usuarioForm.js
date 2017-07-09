$(document).ready(function() {
	iniciarEventosDialogEditar_usuario(true);
});
function iniciarEventosDialogEditar_usuario(esEditar) {
	$("#idBtnGuardarUsuario").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverUsuario").each(function() {
		$(this).unbind("click");
	});
	$('#idBtnGuardarUsuario').click(guardar_usuario);
	$('#idBtnVolverUsuario').click(volver_usuario);
}
function volver_usuario() {
	deshabilitaBotones_usuario(true);
	var frm		= document.formEditarUsuario;
	frm.action	= "usuario.action";
	frm.method	= "POST";
	frm.submit();
	deshabilitaBotones_usuario(false);
	return false;
}
function guardar_usuario() {
	deshabilitaBotones_usuario(true);
	if(!validarEmail($("input[name='edicion_usuarioDto.strDesCorreo']").val())) {
		$("input[name='edicion_usuarioDto.strDesCorreo']").popover('toggle');
		$("input[name='edicion_usuarioDto.strDesCorreo']").css('border', '1px solid #FF0000');
		setTimeout(function() {
			$("input[name='edicion_usuarioDto.strDesCorreo']").css('border', '1px solid #ccc');
			$("input[name='edicion_usuarioDto.strDesCorreo']").popover('toggle');
		}, 2000);
		deshabilitaBotones_usuario(false);
		return;
	}
	var frm		= $("#idFormEditarUsuario");
	$.post('guardarUsuario.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_usuario(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_usuario();
		}
	},'json');
	return false;
}
function deshabilitaBotones_usuario(deshabilitarBoton) {
	$('#idBtnGuardarUsuario').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverUsuario").prop('disabled', deshabilitarBoton);
}
