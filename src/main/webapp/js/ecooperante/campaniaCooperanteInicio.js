var oTableDefaultCampaniaCooperante			= null;
var responsiveHelperCampaniaCooperante		= undefined;
var breakpointDefinitionCampaniaCooperante	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {
	$('#idBtnSalirCampaniaCooperante').click(salir_campania_cooperante);
	$('#idBtnConsultarCampaniaCooperante').click(buscar_basico_campania_cooperante);
	$('#idBtnMostrarTodosCampaniaCooperante').click(mostrarTodos_campania_cooperante);
	$('#idBtnNuevoCampaniaCooperante').click(nuevo_campania_cooperante);
	$('.datepicker').each(function() {
		$(this).unbind("datepicker");
	});
	$('.datepicker').each(function() {
		$(this).datepicker({
			dateFormat: 'dd/mm/yy',
			buttonImageOnly: true,
			changeMonth: true,
			changeYear: true,
			currentText: 'Hoy',
			monthNames: ['Enero','Febrero','Marzo','Abril','Mayo','Junio',
			'Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'],
			monthNamesShort: ['Ene','Feb','Mar','Abr','May','Jun',
			'Jul','Ago','Sep','Oct','Nov','Dic'],
			dayNames: ['Domingo','Lunes','Martes','Mi&eacute;rcoles','Jueves','Viernes','S&aacute;bado'],
			dayNamesShort: ['Dom','Lun','Mar','Mi&eacute;','Juv','Vie','S&aacute;b'],
			dayNamesMin: ['Do','Lu','Ma','Mi','Ju','Vi','S&aacute;'],
			
			showOn: "button",
			buttonImage: "image/calendar.png",
			buttonImageOnly: true,
			buttonText: "Select date"
		});
	});
	
	instanciardt_basico_campania_cooperante();

});






function mostrarTodos_campania_cooperante() {
	deshabilitaBotones_campania_cooperante(true);
	$("input[name=buscar_strDesCampania]").val("");
	$("input[name=buscar_intCntAsignada]").val("");
	$("input[name=buscar_intCntDisponible]").val("");
	$("input[name=buscar_dteFecInicio]").val("");
	$("input[name=buscar_dteFecFin]").val("");
	$("input[name=buscar_intIndActivo]").val("");
	$("input[name=buscar_intNumDescuento]").val("");
	$("input[name=buscar_strDesRegalo]").val("");
	$("input[name=buscar_intCntMinpuntos]").val("");
	$("input[name=buscar_intCntGusta]").val("");
	buscar_basico_campania_cooperante('');
}
function instanciardt_basico_campania_cooperante(ejecutaBuscar) {
	oTableDefaultCampaniaCooperante = null;
	oTableDefaultCampaniaCooperante = $('#tableDefaultCampaniaCooperante').dataTable({
		autoWidth      : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperCampaniaCooperante) {
	            responsiveHelperCampaniaCooperante = new ResponsiveDatatablesHelper(oTableDefaultCampaniaCooperante, breakpointDefinitionCampaniaCooperante);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperCampaniaCooperante.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperCampaniaCooperante.respond();
	    },
		"sDom": "<'row'<'col-md-12'f>> <'row' <'col-md-6'l><'col-md-6'p>>  t <'row'<'col-md-12'p i> >",
		"aaSorting": [],
		"oLanguage": {
			"sUrl": "tools/bootstrap-datatables/lang/spanish.json"
		},
		"aLengthMenu": [
		                [25, 50, 100, 200, -1],
		                [25, 50, 100, 200, "Todos"]
		],
		"sAjaxDataProp": "listCampaniaCooperante",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "strDesCampania"},
				{"mData" : "intIndActivoDesc"},
				{"mData" : "strDesRegalo"},
				{"mData" : null},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [3],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<img src="descargar.action?strNomCodigo='+row.intIdImagen+'" style="height: 50px;"/>';
		                	 }
		                 },
		                 {
		                	 "aTargets": [4],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_campania_cooperante" onclick="editar_campania_cooperante(\'' + row.srlIdCampania + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_campania_cooperante" onclick="eliminar_campania_cooperante(\'' + row.srlIdCampania + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
				buscar_basico_campania_cooperante();
	    }
	});
}

function buscar_basico_campania_cooperante() {

	deshabilitaBotones_campania_cooperante(true);
	$('#loadAjax').modal('toggle');
	var request = ajaxRequest(ctx+"/buscarCampaniaCooperante.action", "POST", "json", $("#idFormBuscarCampaniaCooperante").serialize());
	request.done(function(json) {
		oTableDefaultCampaniaCooperante.fnClearTable();
		var oSettings = oTableDefaultCampaniaCooperante.fnSettings();
		oTableDefaultCampaniaCooperante.fnClearTable(this);
		for (var i=0; i<json.listCampaniaCooperante.length; i++) {
			oTableDefaultCampaniaCooperante.oApi._fnAddData(oSettings, json.listCampaniaCooperante[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultCampaniaCooperante.fnDraw();
		$('#loadAjax').modal('toggle');
		deshabilitaBotones_campania_cooperante(false);
	});

}
function nuevo_campania_cooperante() {
	deshabilitaBotones_campania_cooperante(true);
	var frm		= document.form;
	frm.action	= "nuevoCampaniaCooperante.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();

	
	return false;
}

function editar_campania_cooperante(srlIdCampania) {
	deshabilitaBotones_campania_cooperante(true);
	var frm		= document.form;
	frm.action	= "editarCampaniaCooperante.action";
	frm.method	= "POST";
	frm.target	= "_self";
	$('#buscar_seleccion_id').val(srlIdCampania);
	frm.submit();
	
	return false;
}

function salir_campania_cooperante() {
	document.location.href = "home.action";
	return false;
}

function eliminar_campania_cooperante(srlIdCampania) {
	$('.eliminar-info-modal').off('shown.bs.modal');
	$('.eliminar-info-modal').on('shown.bs.modal', function (e) {
		$("#idBtnSi").each(function() {
			$(this).unbind("click");
		});
		$("#idBtnNo").each(function() {
			$(this).unbind("click");
		});
		$("#idBtnSi").click(function() {
			var frm		= $("#form");
        	$('#buscar_seleccion_id').val(srlIdCampania);
        	$.post('eliminarCampaniaCooperante.action', frm.serialize(), function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
    			buscar_basico_campania_cooperante();
        		$('.eliminar-info-modal').modal('hide');
        	}, "json");
		});
		$("#idBtnNo").click(function() {
			$('.eliminar-info-modal').modal('hide');
		});
		
	});
	$('.eliminar-info-modal').modal('show');
}


function deshabilitaBotones_campania_cooperante(deshabilitarBoton) {
	$('#idBtnSalirCampaniaCooperante').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarCampaniaCooperante').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosCampaniaCooperante').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoCampaniaCooperante').prop('disabled', deshabilitarBoton);
	$(".btn_buscar_control_campania_cooperante").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});

}

