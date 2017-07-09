var oTableDefaultCuestionario			= null;
var responsiveHelperCuestionario		= undefined;
var breakpointDefinitionCuestionario	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {
	$('#idBtnSalirCuestionario').click(salir_cuestionario);
	$('#idBtnConsultarCuestionario').click(buscar_basico_cuestionario);
	$('#idBtnMostrarTodosCuestionario').click(mostrarTodos_cuestionario);
	$('#idBtnNuevoCuestionario').click(nuevo_cuestionario);
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
	
	instanciardt_basico_cuestionario();

});






function mostrarTodos_cuestionario() {
	deshabilitaBotones_cuestionario(true);
	$("input[name=buscar_strDesCuestionario]").val("");
	$("input[name=buscar_intIndTipo]").val("");
	buscar_basico_cuestionario('');
}
function instanciardt_basico_cuestionario(ejecutaBuscar) {
	oTableDefaultCuestionario = null;
	oTableDefaultCuestionario = $('#tableDefaultCuestionario').dataTable({
		autoWidth      : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperCuestionario) {
	            responsiveHelperCuestionario = new ResponsiveDatatablesHelper(oTableDefaultCuestionario, breakpointDefinitionCuestionario);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperCuestionario.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperCuestionario.respond();
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
		"sAjaxDataProp": "listCuestionario",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "strDesCuestionario"},
				{"mData" : "intIndTipoDesc"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [2],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_cuestionario" onclick="editar_cuestionario(\'' + row.srlIdCuestionario + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_cuestionario" onclick="eliminar_cuestionario(\'' + row.srlIdCuestionario + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
				buscar_basico_cuestionario();
	    }
	});
}

function buscar_basico_cuestionario() {

	deshabilitaBotones_cuestionario(true);
	$('#loadAjax').modal('toggle');
	var request = ajaxRequest(ctx+"/buscarCuestionario.action", "POST", "json", $("#idFormBuscarCuestionario").serialize());
	request.done(function(json) {
		oTableDefaultCuestionario.fnClearTable();
		var oSettings = oTableDefaultCuestionario.fnSettings();
		oTableDefaultCuestionario.fnClearTable(this);
		for (var i=0; i<json.listCuestionario.length; i++) {
			oTableDefaultCuestionario.oApi._fnAddData(oSettings, json.listCuestionario[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultCuestionario.fnDraw();
		$('#loadAjax').modal('toggle');
		deshabilitaBotones_cuestionario(false);
	});

}
function nuevo_cuestionario() {
	deshabilitaBotones_cuestionario(true);
	var frm		= document.form;
	frm.action	= "nuevoCuestionario.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();

	
	return false;
}

function editar_cuestionario(srlIdCuestionario) {
	deshabilitaBotones_cuestionario(true);
	var frm		= document.form;
	frm.action	= "editarCuestionario.action";
	frm.method	= "POST";
	frm.target	= "_self";
	$('#buscar_seleccion_id').val(srlIdCuestionario);
	frm.submit();
	
	return false;
}

function salir_cuestionario() {
	document.location.href = "home.action";
	return false;
}

function eliminar_cuestionario(srlIdCuestionario) {
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
        	$('#buscar_seleccion_id').val(srlIdCuestionario);
        	$.post('eliminarCuestionario.action', frm.serialize(), function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
    			buscar_basico_cuestionario();
        		$('.eliminar-info-modal').modal('hide');
        	}, "json");
		});
		$("#idBtnNo").click(function() {
			$('.eliminar-info-modal').modal('hide');
		});
		
	});
	$('.eliminar-info-modal').modal('show');
}


function deshabilitaBotones_cuestionario(deshabilitarBoton) {
	$('#idBtnSalirCuestionario').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarCuestionario').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosCuestionario').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoCuestionario').prop('disabled', deshabilitarBoton);
	$(".btn_buscar_control_cuestionario").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});

}

