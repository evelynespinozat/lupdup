//$(document).ready(function() {
//	iniciarEventosDialogEditar_club_donante_campania(true);
//});

function iniciarEventosDialogEditar_club_donante_campania(esEditar) {
	$("#idBtnGuardarClubDonanteCampania").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverClubDonanteCampania").each(function() {
		$(this).unbind("click");
	});
	
	$('#idBtnGuardarClubDonanteCampania').click(guardar_club_donante_campania);
	$('#idBtnVolverClubDonanteCampania').click(volver_club_donante_campania);
}
function volver_club_donante_campania() {
	deshabilitaBotones_club_donante_campania(true);
	$('.editar-info-modal').modal('hide');
	buscar_basico_club_donante_campania();
	deshabilitaBotones_club_donante_campania(false);
	return false;
}

function guardar_club_donante_campania() {
	deshabilitaBotones_club_donante_campania(true);
	var frm		= $("#idFormEditarClubDonanteCampania");
	$.post('guardarClubDonanteCampania.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_club_donante_campania(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_club_donante_campania();
		}
	},'json');
	return false;
}

function deshabilitaBotones_club_donante_campania(deshabilitarBoton) {
	$('#idBtnGuardarClubDonanteCampania').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverClubDonanteCampania").prop('disabled', deshabilitarBoton);
}
