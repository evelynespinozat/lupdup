var oTableDefaultSedeEntidadColaboradora			= null;
var responsiveHelperSedeEntidadColaboradora		= undefined;
var breakpointDefinitionSedeEntidadColaboradora	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {

});

function iniciarEventosDialogInicio_sede_entidad_colaboradora() {
	$("#idBtnNuevoSedeEntidadColaboradora").each(function() {
		$(this).unbind("click");
	});
	$('#idBtnNuevoSedeEntidadColaboradora').click(nuevo_sede_entidad_colaboradora);
	instanciardt_basico_sede_entidad_colaboradora(true);
}





function mostrarTodos_sede_entidad_colaboradora() {
	deshabilitaBotones_sede_entidad_colaboradora(true);
	$("input[name=buscar_intIdEntidadcolaboradora]").val("");
	$("input[name=buscar_strNomNombre]").val("");
	$("input[name=buscar_strDesDireccion]").val("");
	$("input[name=buscar_strNumTelefono]").val("");
	$("input[name=buscar_strNumCelular]").val("");
	$("input[name=buscar_intIdUbigeo]").val("");
	buscar_basico_sede_entidad_colaboradora('');
}
function instanciardt_basico_sede_entidad_colaboradora(ejecutaBuscar) {
	oTableDefaultSedeEntidadColaboradora = null;
	oTableDefaultSedeEntidadColaboradora = $('#tableDefaultSedeEntidadColaboradora').dataTable({
		autoWidth      : false,
		paging        : false,
		searching     : false,
        info          : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperSedeEntidadColaboradora) {
	            responsiveHelperSedeEntidadColaboradora = new ResponsiveDatatablesHelper(oTableDefaultSedeEntidadColaboradora, breakpointDefinitionSedeEntidadColaboradora);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperSedeEntidadColaboradora.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperSedeEntidadColaboradora.respond();
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
		"sAjaxDataProp": "listSedeEntidadColaboradora",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "strNomNombre"},
				{"mData" : "strDesDireccion"},
				{"mData" : "strNumTelefono"},
				{"mData" : "strNumCelular"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [4],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_sede_entidad_colaboradora" onclick="editar_sede_entidad_colaboradora(\'' + row.srlIdSedeentidad + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_sede_entidad_colaboradora" onclick="eliminar_sede_entidad_colaboradora(\'' + row.srlIdSedeentidad + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
			if(ejecutaBuscar) {
				buscar_basico_sede_entidad_colaboradora();
			}
	    }
	});
}

function buscar_basico_sede_entidad_colaboradora() {

	if(!oTableDefaultSedeEntidadColaboradora) {
		instanciardt_basico_sede_entidad_colaboradora();
	}
	var request = ajaxRequest(ctx+"/buscarSedeEntidadColaboradora.action", "POST", "json", $("#idFormBuscarSedeEntidadColaboradora").serialize());
	request.done(function(json) {
		oTableDefaultSedeEntidadColaboradora.fnClearTable();
		var oSettings = oTableDefaultSedeEntidadColaboradora.fnSettings();
		oTableDefaultSedeEntidadColaboradora.fnClearTable(this);
		for (var i=0; i<json.listSedeEntidadColaboradora.length; i++) {
			oTableDefaultSedeEntidadColaboradora.oApi._fnAddData(oSettings, json.listSedeEntidadColaboradora[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultSedeEntidadColaboradora.fnDraw();
		deshabilitaBotones_sede_entidad_colaboradora(false);
	});

}
function nuevo_sede_entidad_colaboradora() {
	$('.sede-entidad-colaboradora-modal').off('shown.bs.modal');
	$('.sede-entidad-colaboradora-modal').off('hidden.bs.modal');
	$('.sede-entidad-colaboradora-modal').on('shown.bs.modal', function (e) {
		$.post('nuevoSedeEntidadColaboradora.action', null, function(datos) {
			$("#idDivEditarSedeEntidadColaboradora").html(datos);
			iniciarEventosDialogEditar_sede_entidad_colaboradora(true);
			$("#idDivEditarTituloSedeEntidadColaboradora").html("<h3><strong>Sede Entidad Colaboradora</strong></h3>");
			deshabilitaBotones_sede_entidad_colaboradora(false);
		});
	});
	$('.sede-entidad-colaboradora-modal').on('hidden.bs.modal', function (e) {
		$("#idDivEditarSedeEntidadColaboradora").html("");
	});
	$('.sede-entidad-colaboradora-modal').modal('show');

	
	return false;
}

function editar_sede_entidad_colaboradora(srlIdSedeentidad) {
	$('.sede-entidad-colaboradora-modal').off('shown.bs.modal');
	$('.sede-entidad-colaboradora-modal').off('hidden.bs.modal');
	$('.sede-entidad-colaboradora-modal').on('shown.bs.modal', function (e) {
		var param	= {
				buscar_seleccion_id:srlIdSedeentidad
		};
		$.post('editarSedeEntidadColaboradora.action', param, function(datos) {
			$("#idDivEditarSedeEntidadColaboradora").html(datos);
			iniciarEventosDialogEditar_sede_entidad_colaboradora(true);
			$("#idDivEditarTituloSedeEntidadColaboradora").html("<h3><strong>Sede Entidad Colaboradora</strong></h3>");
			deshabilitaBotones_sede_entidad_colaboradora(false);
		});
	});
	$('.sede-entidad-colaboradora-modal').on('hidden.bs.modal', function (e) {
		$("#idDivEditarSedeEntidadColaboradora").html("");
	});
	$('.sede-entidad-colaboradora-modal').modal('show');
	
	return false;
}

function salir_sede_entidad_colaboradora() {
	volver_sede_entidad_colaboradora();
	return false;
}

function eliminar_sede_entidad_colaboradora(srlIdSedeentidad) {
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
        	$('#buscar_seleccion_id').val(srlIdSedeentidad);
        	$.post('eliminarSedeEntidadColaboradora.action', frm.serialize(), function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
    			buscar_basico_sede_entidad_colaboradora();
        		$('.eliminar-info-modal').modal('hide');
        	}, "json");
		});
		$("#idBtnNo").click(function() {
			$('.eliminar-info-modal').modal('hide');
		});
		
	});
	$('.eliminar-info-modal').modal('show');
}


function deshabilitaBotones_sede_entidad_colaboradora(deshabilitarBoton) {

}

