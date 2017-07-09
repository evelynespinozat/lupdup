$(document).ready(function() {
//	$('#idBtnSalirFichaResultados').click(salir_ficha_resultados);
//	$('#idBtnConsultarFichaResultados').click(buscar_basico_ficha_resultados);
//	$('#idBtnMostrarTodosFichaResultados').click(mostrarTodos_ficha_resultados);
//	$('#idBtnNuevoFichaResultados').click(nuevo_ficha_resultados);
//	$('.datepicker').each(function() {
//		$(this).unbind("datepicker");
//	});
//	$('.datepicker').each(function() {
//		$(this).datepicker({
//			dateFormat: 'dd/mm/yy',
//			buttonImageOnly: true,
//			changeMonth: true,
//			changeYear: true,
//			currentText: 'Hoy',
//			monthNames: ['Enero','Febrero','Marzo','Abril','Mayo','Junio',
//			'Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'],
//			monthNamesShort: ['Ene','Feb','Mar','Abr','May','Jun',
//			'Jul','Ago','Sep','Oct','Nov','Dic'],
//			dayNames: ['Domingo','Lunes','Martes','Mi&eacute;rcoles','Jueves','Viernes','S&aacute;bado'],
//			dayNamesShort: ['Dom','Lun','Mar','Mi&eacute;','Juv','Vie','S&aacute;b'],
//			dayNamesMin: ['Do','Lu','Ma','Mi','Ju','Vi','S&aacute;'],
//			
//			showOn: "button",
//			buttonImage: "image/calendar.png",
//			buttonImageOnly: true,
//			buttonText: "Select date"
//		});
//	});
//	
//	instanciardt_basico_ficha_resultados();
});



//function mostrarTodos_ficha_resultados() {
//	deshabilitaBotones_ficha_resultados(true);
//	$("input[name=buscar_dteFecAnalisis]").val("");
//	$("input[name=buscar_strHorAnalisis]").val("");
//	$("input[name=buscar_intIndEstado]").val("");
//	$("input[name=buscar_intNumUnidades]").val("");
//	buscar_basico_ficha_resultados('');
//}
//
//function buscar_basico_ficha_resultados() {
//
//	deshabilitaBotones_ficha_resultados(true);
//	$('#loadAjax').modal('toggle');
//	var request = ajaxRequest(ctx+"/buscarFichaResultados.action", "POST", "json", $("#idFormBuscarFichaResultados").serialize());
//	request.done(function(json) {
//		oTableDefaultFichaResultados.fnClearTable();
//		var oSettings = oTableDefaultFichaResultados.fnSettings();
//		oTableDefaultFichaResultados.fnClearTable(this);
//		for (var i=0; i<json.listFichaResultados.length; i++) {
//			oTableDefaultFichaResultados.oApi._fnAddData(oSettings, json.listFichaResultados[i]);
//		}
//		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
//		oTableDefaultFichaResultados.fnDraw();
//		$('#loadAjax').modal('toggle');
//		deshabilitaBotones_ficha_resultados(false);
//	});
//
//}
//function nuevo_ficha_resultados() {
//	deshabilitaBotones_ficha_resultados(true);
//	var frm		= document.form;
//	frm.action	= "nuevoFichaResultados.action";
//	frm.method	= "POST";
//	frm.target	= "_self";
//	frm.submit();
//
//	
//	return false;
//}
//
//function editar_ficha_resultados(srlIdFicha) {
//	deshabilitaBotones_ficha_resultados(true);
//	var frm		= document.form;
//	frm.action	= "editarFichaResultados.action";
//	frm.method	= "POST";
//	frm.target	= "_self";
//	$('#buscar_seleccion_id').val(srlIdFicha);
//	frm.submit();
//	
//	return false;
//}
//
//function salir_ficha_resultados() {
//	document.location.href = "home.action";
//	return false;
//}
//
//function eliminar_ficha_resultados(srlIdFicha) {
//	$('.eliminar-info-modal').off('shown.bs.modal');
//	$('.eliminar-info-modal').on('shown.bs.modal', function (e) {
//		$("#idBtnSi").each(function() {
//			$(this).unbind("click");
//		});
//		$("#idBtnNo").each(function() {
//			$(this).unbind("click");
//		});
//		$("#idBtnSi").click(function() {
//			var frm		= $("#form");
//        	$('#buscar_seleccion_id').val(srlIdFicha);
//        	$.post('eliminarFichaResultados.action', frm.serialize(), function(datos) {
//	    		if(datos.actionErrors.length > 0) {
//	    			mostrarMensajesErrorStruts(datos.actionErrors);
//	    		} else {
//	    			mostrarMensajesStruts(datos.actionMessages);
//	    		}
//    			buscar_basico_ficha_resultados();
//        		$('.eliminar-info-modal').modal('hide');
//        	}, "json");
//		});
//		$("#idBtnNo").click(function() {
//			$('.eliminar-info-modal').modal('hide');
//		});
//		
//	});
//	$('.eliminar-info-modal').modal('show');
//}
//
//function deshabilitaBotones_ficha_resultados(deshabilitarBoton) {
//	$('#idBtnSalirFichaResultados').prop('disabled', deshabilitarBoton);
//	$('#idBtnConsultarFichaResultados').prop('disabled', deshabilitarBoton);
//	$('#idBtnMostrarTodosFichaResultados').prop('disabled', deshabilitarBoton);
//	$('#idBtnNuevoFichaResultados').prop('disabled', deshabilitarBoton);
//	$(".btn_buscar_control_ficha_resultados").each(function() {
//		$(this).prop('disabled', deshabilitarBoton);
//	});
//
//}

