var oTableDefaultCentroSalud			= null;
var responsiveHelperCentroSalud		= undefined;
var breakpointDefinitionCentroSalud	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {
	$('#idBtnSalirCentroSalud').click(salir_centro_salud);
	$('#idBtnConsultarCentroSalud').click(buscar_basico_centro_salud);
	$('#idBtnMostrarTodosCentroSalud').click(mostrarTodos_centro_salud);
	$('#idBtnNuevoCentroSalud').click(nuevo_centro_salud);
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
	
	instanciardt_basico_centro_salud();

});






function mostrarTodos_centro_salud() {
	deshabilitaBotones_centro_salud(true);
	$("input[name=buscar_strNomNombre]").val("");
	$("input[name=buscar_intIndTipoentidad]").val("");
	buscar_basico_centro_salud('');
}
function instanciardt_basico_centro_salud(ejecutaBuscar) {
	oTableDefaultCentroSalud = null;
	oTableDefaultCentroSalud = $('#tableDefaultCentroSalud').dataTable({
		autoWidth      : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperCentroSalud) {
	            responsiveHelperCentroSalud = new ResponsiveDatatablesHelper(oTableDefaultCentroSalud, breakpointDefinitionCentroSalud);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperCentroSalud.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperCentroSalud.respond();
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
		"sAjaxDataProp": "listCentroSalud",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "strNomNombre"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [1],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_centro_salud" onclick="editar_centro_salud(\'' + row.srlIdCentrosalud + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_centro_salud" onclick="eliminar_centro_salud(\'' + row.srlIdCentrosalud + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
				buscar_basico_centro_salud();
	    }
	});
}

function buscar_basico_centro_salud() {

	deshabilitaBotones_centro_salud(true);
	$('#loadAjax').modal('toggle');
	var request = ajaxRequest(ctx+"/buscarCentroSalud.action", "POST", "json", $("#idFormBuscarCentroSalud").serialize());
	request.done(function(json) {
		oTableDefaultCentroSalud.fnClearTable();
		var oSettings = oTableDefaultCentroSalud.fnSettings();
		oTableDefaultCentroSalud.fnClearTable(this);
		for (var i=0; i<json.listCentroSalud.length; i++) {
			oTableDefaultCentroSalud.oApi._fnAddData(oSettings, json.listCentroSalud[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultCentroSalud.fnDraw();
		$('#loadAjax').modal('toggle');
		deshabilitaBotones_centro_salud(false);
	});

}
function nuevo_centro_salud() {
	deshabilitaBotones_centro_salud(true);
	var frm		= document.form;
	frm.action	= "nuevoCentroSalud.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();

	
	return false;
}

function editar_centro_salud(srlIdCentrosalud) {
	deshabilitaBotones_centro_salud(true);
	var frm		= document.form;
	frm.action	= "editarCentroSalud.action";
	frm.method	= "POST";
	frm.target	= "_self";
	$('#buscar_seleccion_id').val(srlIdCentrosalud);
	frm.submit();
	
	return false;
}

function salir_centro_salud() {
	document.location.href = "home.action";
	return false;
}

function eliminar_centro_salud(srlIdCentrosalud) {
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
        	$('#buscar_seleccion_id').val(srlIdCentrosalud);
        	$.post('eliminarCentroSalud.action', frm.serialize(), function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
    			buscar_basico_centro_salud();
        		$('.eliminar-info-modal').modal('hide');
        	}, "json");
		});
		$("#idBtnNo").click(function() {
			$('.eliminar-info-modal').modal('hide');
		});
		
	});
	$('.eliminar-info-modal').modal('show');
}


function deshabilitaBotones_centro_salud(deshabilitarBoton) {
	$('#idBtnSalirCentroSalud').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarCentroSalud').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosCentroSalud').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoCentroSalud').prop('disabled', deshabilitarBoton);
	$(".btn_buscar_control_centro_salud").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});

}

