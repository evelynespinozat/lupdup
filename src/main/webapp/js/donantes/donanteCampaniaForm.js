$(document).ready(function() {
	iniciarEventosDialogEditar_donante_campania(true);
});

	



function iniciarEventosDialogEditar_donante_campania(esEditar) {



	$("#idBtnGuardarDonanteCampania").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverDonanteCampania").each(function() {
		$(this).unbind("click");
	});
	

	
	$('#idBtnGuardarDonanteCampania').click(guardar_donante_campania);
	$('#idBtnVolverDonanteCampania').click(volver_donante_campania);
	

}
function volver_donante_campania() {
	deshabilitaBotones_donante_campania(true);
	var frm		= document.formEditarDonanteCampania;
	frm.action	= "donanteCampania.action";
	frm.method	= "POST";
	frm.submit();
	deshabilitaBotones_donante_campania(false);
	return false;
}

function guardar_donante_campania() {
	deshabilitaBotones_donante_campania(true);
	var frm		= $("#idFormEditarDonanteCampania");
	$.post('guardarDonanteCampania.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_donante_campania(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_donante_campania();
		}
	},'json');
	return false;
}

function deshabilitaBotones_donante_campania(deshabilitarBoton) {
	$('#idBtnGuardarDonanteCampania').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverDonanteCampania").prop('disabled', deshabilitarBoton);
}
