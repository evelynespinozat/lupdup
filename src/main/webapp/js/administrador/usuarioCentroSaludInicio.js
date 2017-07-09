var oTableDefaultUsuarioCentroSalud			= null;
var responsiveHelperUsuarioCentroSalud		= undefined;
var breakpointDefinitionUsuarioCentroSalud	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {

});

function iniciarEventosDialogInicio_usuario_centro_salud() {
	$("#idBtnNuevoUsuarioCentroSalud").each(function() {
		$(this).unbind("click");
	});
	$('#idBtnNuevoUsuarioCentroSalud').click(nuevo_usuario_centro_salud);
	instanciardt_basico_usuario_centro_salud(true);
}





function mostrarTodos_usuario_centro_salud() {
	deshabilitaBotones_usuario_centro_salud(true);
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
	buscar_basico_usuario_centro_salud('');
}
function instanciardt_basico_usuario_centro_salud(ejecutaBuscar) {
	oTableDefaultUsuarioCentroSalud = null;
	oTableDefaultUsuarioCentroSalud = $('#tableDefaultUsuarioCentroSalud').dataTable({
		autoWidth      : false,
		paging        : false,
		searching     : false,
        info          : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperUsuarioCentroSalud) {
	            responsiveHelperUsuarioCentroSalud = new ResponsiveDatatablesHelper(oTableDefaultUsuarioCentroSalud, breakpointDefinitionUsuarioCentroSalud);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperUsuarioCentroSalud.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperUsuarioCentroSalud.respond();
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
		"sAjaxDataProp": "listUsuarioCentroSalud",
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
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_usuario_centro_salud" onclick="editar_usuario_centro_salud(\'' + row.srlIdUsuario + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_usuario_centro_salud" onclick="eliminar_usuario_centro_salud(\'' + row.srlIdUsuario + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
			if(ejecutaBuscar) {
				buscar_basico_usuario_centro_salud();
			}
	    }
	});
}

function buscar_basico_usuario_centro_salud() {

	if(!oTableDefaultUsuarioCentroSalud) {
		instanciardt_basico_usuario_centro_salud();
	}
	var request = ajaxRequest(ctx+"/buscarUsuarioCentroSalud.action", "POST", "json", $("#idFormBuscarUsuarioCentroSalud").serialize());
	request.done(function(json) {
		oTableDefaultUsuarioCentroSalud.fnClearTable();
		var oSettings = oTableDefaultUsuarioCentroSalud.fnSettings();
		oTableDefaultUsuarioCentroSalud.fnClearTable(this);
		for (var i=0; i<json.listUsuarioCentroSalud.length; i++) {
			oTableDefaultUsuarioCentroSalud.oApi._fnAddData(oSettings, json.listUsuarioCentroSalud[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultUsuarioCentroSalud.fnDraw();
		deshabilitaBotones_usuario_centro_salud(false);
	});

}
function nuevo_usuario_centro_salud() {
	$('.usuario-centro-salud-modal').off('shown.bs.modal');
	$('.usuario-centro-salud-modal').off('hidden.bs.modal');
	$('.usuario-centro-salud-modal').on('shown.bs.modal', function (e) {
		$.post('nuevoUsuarioCentroSalud.action', null, function(datos) {
			$("#idDivEditarUsuarioCentroSalud").html(datos);
			iniciarEventosDialogEditar_usuario_centro_salud(true);
			$("#idDivEditarTituloUsuarioCentroSalud").html("<h3><strong>Usuario</strong></h3>");
			deshabilitaBotones_usuario_centro_salud(false);
		});
	});
	$('.usuario-centro-salud-modal').on('hidden.bs.modal', function (e) {
		$("#idDivEditarUsuarioCentroSalud").html("");
	});
	$('.usuario-centro-salud-modal').modal('show');

	
	return false;
}

function editar_usuario_centro_salud(srlIdUsuario) {
	$('.usuario-centro-salud-modal').off('shown.bs.modal');
	$('.usuario-centro-salud-modal').off('hidden.bs.modal');
	$('.usuario-centro-salud-modal').on('shown.bs.modal', function (e) {
		var param	= {
				buscar_seleccion_id:srlIdUsuario
		};
		$.post('editarUsuarioCentroSalud.action', param, function(datos) {
			$("#idDivEditarUsuarioCentroSalud").html(datos);
			iniciarEventosDialogEditar_usuario_centro_salud(true);
			$("#idDivEditarTituloUsuarioCentroSalud").html("<h3><strong>Usuario</strong></h3>");
			deshabilitaBotones_usuario_centro_salud(false);
		});
	});
	$('.usuario-centro-salud-modal').on('hidden.bs.modal', function (e) {
		$("#idDivEditarUsuarioCentroSalud").html("");
	});
	$('.usuario-centro-salud-modal').modal('show');
	
	return false;
}

function salir_usuario_centro_salud() {
	volver_usuario_centro_salud();
	return false;
}

function eliminar_usuario_centro_salud(srlIdUsuario) {
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
        	$.post('eliminarUsuarioCentroSalud.action', frm.serialize(), function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
    			buscar_basico_usuario_centro_salud();
        		$('.eliminar-info-modal').modal('hide');
        	}, "json");
		});
		$("#idBtnNo").click(function() {
			$('.eliminar-info-modal').modal('hide');
		});
		
	});
	$('.eliminar-info-modal').modal('show');
}


function deshabilitaBotones_usuario_centro_salud(deshabilitarBoton) {

}

