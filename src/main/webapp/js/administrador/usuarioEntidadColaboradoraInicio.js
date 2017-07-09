var oTableDefaultUsuarioEntidadColaboradora			= null;
var responsiveHelperUsuarioEntidadColaboradora		= undefined;
var breakpointDefinitionUsuarioEntidadColaboradora	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {

});

function iniciarEventosDialogInicio_usuario_entidad_colaboradora() {
	$("#idBtnNuevoUsuarioEntidadColaboradora").each(function() {
		$(this).unbind("click");
	});
	$('#idBtnNuevoUsuarioEntidadColaboradora').click(nuevo_usuario_entidad_colaboradora);
	instanciardt_basico_usuario_entidad_colaboradora(true);
}





function mostrarTodos_usuario_entidad_colaboradora() {
	deshabilitaBotones_usuario_entidad_colaboradora(true);
	$("input[name=buscar_intIdDonante]").val("");
	$("input[name=buscar_intIdPerfil]").val("");
	$("input[name=buscar_strNomUsuario]").val("");
	$("input[name=buscar_strClvUsuario]").val("");
	$("input[name=buscar_strNomResponsable]").val("");
	$("input[name=buscar_strNomAppaterno]").val("");
	$("input[name=buscar_strNomApmaterno]").val("");
	$("input[name=buscar_strDesTelefono]").val("");
	$("input[name=buscar_strDesCorreo]").val("");
	$("input[name=buscar_strDesCelular]").val("");
	$("input[name=buscar_intIdCentrosalud]").val("");
	$("input[name=buscar_intIdEntidadcolaboradora]").val("");
	buscar_basico_usuario_entidad_colaboradora('');
}
function instanciardt_basico_usuario_entidad_colaboradora(ejecutaBuscar) {
	oTableDefaultUsuarioEntidadColaboradora = null;
	oTableDefaultUsuarioEntidadColaboradora = $('#tableDefaultUsuarioEntidadColaboradora').dataTable({
		autoWidth      : false,
		paging        : false,
		searching     : false,
        info          : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperUsuarioEntidadColaboradora) {
	            responsiveHelperUsuarioEntidadColaboradora = new ResponsiveDatatablesHelper(oTableDefaultUsuarioEntidadColaboradora, breakpointDefinitionUsuarioEntidadColaboradora);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperUsuarioEntidadColaboradora.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperUsuarioEntidadColaboradora.respond();
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
		"sAjaxDataProp": "listUsuarioEntidadColaboradora",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "strNomUsuario"},
//				{"mData" : "strClvUsuario"},
				{"mData" : "strNomResponsable"},
				{"mData" : "strNomAppaterno"},
				{"mData" : "strNomApmaterno"},
				{"mData" : "strDesTelefono"},
				{"mData" : "strDesCorreo"},
				{"mData" : "strDesCelular"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [7],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_usuario_entidad_colaboradora" onclick="editar_usuario_entidad_colaboradora(\'' + row.srlIdUsuario + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_usuario_entidad_colaboradora" onclick="eliminar_usuario_entidad_colaboradora(\'' + row.srlIdUsuario + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
			if(ejecutaBuscar) {
				buscar_basico_usuario_entidad_colaboradora();
			}
	    }
	});
}

function buscar_basico_usuario_entidad_colaboradora() {

	if(!oTableDefaultUsuarioEntidadColaboradora) {
		instanciardt_basico_usuario_entidad_colaboradora();
	}
	var request = ajaxRequest(ctx+"/buscarUsuarioEntidadColaboradora.action", "POST", "json", $("#idFormBuscarUsuarioEntidadColaboradora").serialize());
	request.done(function(json) {
		oTableDefaultUsuarioEntidadColaboradora.fnClearTable();
		var oSettings = oTableDefaultUsuarioEntidadColaboradora.fnSettings();
		oTableDefaultUsuarioEntidadColaboradora.fnClearTable(this);
		for (var i=0; i<json.listUsuarioEntidadColaboradora.length; i++) {
			oTableDefaultUsuarioEntidadColaboradora.oApi._fnAddData(oSettings, json.listUsuarioEntidadColaboradora[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultUsuarioEntidadColaboradora.fnDraw();
		deshabilitaBotones_usuario_entidad_colaboradora(false);
	});

}
function nuevo_usuario_entidad_colaboradora() {
	$('.usuario-entidad-colaboradora-modal').off('shown.bs.modal');
	$('.usuario-entidad-colaboradora-modal').off('hidden.bs.modal');
	$('.usuario-entidad-colaboradora-modal').on('shown.bs.modal', function (e) {
		$.post('nuevoUsuarioEntidadColaboradora.action', null, function(datos) {
			$("#idDivEditarUsuarioEntidadColaboradora").html(datos);
			iniciarEventosDialogEditar_usuario_entidad_colaboradora(true);
			$("#idDivEditarTituloUsuarioEntidadColaboradora").html("<h3><strong>Usuario</strong></h3>");
			deshabilitaBotones_usuario_entidad_colaboradora(false);
		});
	});
	$('.usuario-entidad-colaboradora-modal').on('hidden.bs.modal', function (e) {
		$("#idDivEditarUsuarioEntidadColaboradora").html("");
	});
	$('.usuario-entidad-colaboradora-modal').modal('show');

	
	return false;
}

function editar_usuario_entidad_colaboradora(srlIdUsuario) {
	$('.usuario-entidad-colaboradora-modal').off('shown.bs.modal');
	$('.usuario-entidad-colaboradora-modal').off('hidden.bs.modal');
	$('.usuario-entidad-colaboradora-modal').on('shown.bs.modal', function (e) {
		var param	= {
				buscar_seleccion_id:srlIdUsuario
		};
		$.post('editarUsuarioEntidadColaboradora.action', param, function(datos) {
			$("#idDivEditarUsuarioEntidadColaboradora").html(datos);
			iniciarEventosDialogEditar_usuario_entidad_colaboradora(true);
			$("#idDivEditarTituloUsuarioEntidadColaboradora").html("<h3><strong>Usuario</strong></h3>");
			deshabilitaBotones_usuario_entidad_colaboradora(false);
		});
	});
	$('.usuario-entidad-colaboradora-modal').on('hidden.bs.modal', function (e) {
		$("#idDivEditarUsuarioEntidadColaboradora").html("");
	});
	$('.usuario-entidad-colaboradora-modal').modal('show');
	
	return false;
}

function salir_usuario_entidad_colaboradora() {
	volver_usuario_entidad_colaboradora();
	return false;
}

function eliminar_usuario_entidad_colaboradora(srlIdUsuario) {
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
        	$('#buscar_seleccion_id').val(srlIdUsuario);
        	$.post('eliminarUsuarioEntidadColaboradora.action', frm.serialize(), function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
    			buscar_basico_usuario_entidad_colaboradora();
        		$('.eliminar-info-modal').modal('hide');
        	}, "json");
		});
		$("#idBtnNo").click(function() {
			$('.eliminar-info-modal').modal('hide');
		});
		
	});
	$('.eliminar-info-modal').modal('show');
}


function deshabilitaBotones_usuario_entidad_colaboradora(deshabilitarBoton) {

}

