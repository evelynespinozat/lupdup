var oTableDefaultDonanteCampania			= null;
var responsiveHelperDonanteCampania		= undefined;
var breakpointDefinitionDonanteCampania	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {
	$('.clsAplicar').click(function() {
		aplicar_donante_campania($(this));
	});
	
});

function aplicar_donante_campania(_this) {
	var idCampania				= _this.attr("id-campania");
	var intNumDescuento			= _this.attr("num-descuento");
	var dblNumPrecio			= _this.attr("num-precio");
	var dblNumPrecioPanpania	= _this.attr("num-precio-campania");
	var strDesComentario		= _this.attr("des-comentario");
	
	$('.aplicar-info-modal').off('shown.bs.modal');
	$('.aplicar-info-modal').on('shown.bs.modal', function (e) {
		$("#idBtnSi").each(function() {
			$(this).unbind("click");
		});
		$("#idBtnNo").each(function() {
			$(this).unbind("click");
		});
		$("#idBtnSi").click(function() {
			
			var frm		= {
					"edicion_donanteCampaniaDto.intIdCampania": idCampania,
					"edicion_donanteCampaniaDto.intIdDonante": "",
					"edicion_donanteCampaniaDto.intNumDescuento": intNumDescuento,
					"edicion_donanteCampaniaDto.dblNumPrecio": dblNumPrecio,
					"edicion_donanteCampaniaDto.dblNumPrecioPanpania": dblNumPrecioPanpania,
					"edicion_donanteCampaniaDto.strDesComentario": strDesComentario,
			};
        	$('#buscar_seleccion_id').val();
        	$.post('guardarDonanteCampania.action', frm, function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
        		$('.aplicar-info-modal').modal('hide');
        		refrescar_donante_campania();
        	}, "json");
			$(this).unbind("click");
			
		});
		$("#idBtnNo").click(function() {
			$('.aplicar-info-modal').modal('hide');
		});
		
	});
	$('.aplicar-info-modal').modal('show');
}

function refrescar_donante_campania() {
	var frm		= document.form;
	frm.action	= "donanteCampania.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();
}
function deshabilitaBotones_donante_campania(deshabilitarBoton) {
	$('#idBtnSalirDonanteCampania').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarDonanteCampania').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosDonanteCampania').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoDonanteCampania').prop('disabled', deshabilitarBoton);
	$(".btn_buscar_control_donante_campania").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});
}
