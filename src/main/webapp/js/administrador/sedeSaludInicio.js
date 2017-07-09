var oTableDefaultSedeSalud			= null;
var responsiveHelperSedeSalud		= undefined;
var breakpointDefinitionSedeSalud	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {

});

function iniciarEventosDialogInicio_sede_salud() {
	$("#idBtnNuevoSedeSalud").each(function() {
		$(this).unbind("click");
	});
	$('#idBtnNuevoSedeSalud').click(nuevo_sede_salud);
	instanciardt_basico_sede_salud(true);
}

function mostrarTodos_sede_salud() {
	deshabilitaBotones_sede_salud(true);
	$("input[name=buscar_strNomNombre]").val("");
	$("input[name=buscar_strDesDireccion]").val("");
	$("input[name=buscar_strNumTelefono]").val("");
	$("input[name=buscar_strNumCelular]").val("");
	$("input[name=buscar_intIdCentrosalud]").val("");
	buscar_basico_sede_salud('');
}
function instanciardt_basico_sede_salud(ejecutaBuscar) {
	oTableDefaultSedeSalud = null;
	oTableDefaultSedeSalud = $('#tableDefaultSedeSalud').dataTable({
		autoWidth      : false,
		paging        : false,
		searching     : false,
        info          : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperSedeSalud) {
	            responsiveHelperSedeSalud = new ResponsiveDatatablesHelper(oTableDefaultSedeSalud, breakpointDefinitionSedeSalud);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperSedeSalud.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperSedeSalud.respond();
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
		"sAjaxDataProp": "listSedeSalud",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "strNomNombre"},
				{"mData" : "strDesDireccion"},
				{"mData" : "strNumTelefono"},
				{"mData" : "dteIndHoraDesdeHastaString"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [4],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_sede_salud" onclick="editar_sede_salud(\'' + row.srlIdSedesalud + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_sede_salud" onclick="eliminar_sede_salud(\'' + row.srlIdSedesalud + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
			if(ejecutaBuscar) {
				buscar_basico_sede_salud();
			}
	    }
	});
}

function buscar_basico_sede_salud() {

	if(!oTableDefaultSedeSalud) {
		instanciardt_basico_sede_salud();
	}
	var request = ajaxRequest(ctx+"/buscarSedeSalud.action", "POST", "json", $("#idFormBuscarSedeSalud").serialize());
	request.done(function(json) {
		oTableDefaultSedeSalud.fnClearTable();
		var oSettings = oTableDefaultSedeSalud.fnSettings();
		oTableDefaultSedeSalud.fnClearTable(this);
		for (var i=0; i<json.listSedeSalud.length; i++) {
			oTableDefaultSedeSalud.oApi._fnAddData(oSettings, json.listSedeSalud[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultSedeSalud.fnDraw();
		deshabilitaBotones_sede_salud(false);
	});

}
function nuevo_sede_salud() {
	$('.sede-salud-modal').off('shown.bs.modal');
	$('.sede-salud-modal').off('hidden.bs.modal');
	$('.sede-salud-modal').on('shown.bs.modal', function (e) {
		$.post('nuevoSedeSalud.action', null, function(datos) {
			$("#idDivEditarSedeSalud").html(datos);
			iniciarEventosDialogEditar_sede_salud(true);
			$("#idDivEditarTituloSedeSalud").html("<h3><strong>Sede Salud</strong></h3>");
			deshabilitaBotones_sede_salud(false);
		});
	});
	$('.sede-salud-modal').on('hidden.bs.modal', function (e) {
		$("#idDivEditarSedeSalud").html("");
	});
	$('.sede-salud-modal').modal('show');

	
	return false;
}

function editar_sede_salud(srlIdSedesalud) {
	$('.sede-salud-modal').off('shown.bs.modal');
	$('.sede-salud-modal').off('hidden.bs.modal');
	$('.sede-salud-modal').on('shown.bs.modal', function (e) {
		var param	= {
				buscar_seleccion_id:srlIdSedesalud
		};
		$.post('editarSedeSalud.action', param, function(datos) {
			$("#idDivEditarSedeSalud").html(datos);
			iniciarEventosDialogEditar_sede_salud(true);
			$("#idDivEditarTituloSedeSalud").html("<h3><strong>Sede Salud</strong></h3>");
			deshabilitaBotones_sede_salud(false);
		});
	});
	$('.sede-salud-modal').on('hidden.bs.modal', function (e) {
		$("#idDivEditarSedeSalud").html("");
	});
	$('.sede-salud-modal').modal('show');
	
	return false;
}

function salir_sede_salud() {
	volver_sede_salud();
	return false;
}

function eliminar_sede_salud(srlIdSedesalud) {
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
        	$('#buscar_seleccion_id').val(srlIdSedesalud);
        	$.post('eliminarSedeSalud.action', frm.serialize(), function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
    			buscar_basico_sede_salud();
        		$('.eliminar-info-modal').modal('hide');
        	}, "json");
		});
		$("#idBtnNo").click(function() {
			$('.eliminar-info-modal').modal('hide');
		});
		
	});
	$('.eliminar-info-modal').modal('show');
}


function deshabilitaBotones_sede_salud(deshabilitarBoton) {

}

