var oTableDefaultUsuario			= null;
var responsiveHelperUsuario		= undefined;
var breakpointDefinitionUsuario	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {
	$('#idBtnSalirUsuario').click(salir_usuario);
	$('#idBtnConsultarUsuario').click(buscar_basico_usuario);
	$('#idBtnMostrarTodosUsuario').click(mostrarTodos_usuario);
	$('#idBtnNuevoUsuario').click(nuevo_usuario);
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
	
	instanciardt_basico_usuario();

});






function mostrarTodos_usuario() {
	deshabilitaBotones_usuario(true);
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
	buscar_basico_usuario('');
}
function instanciardt_basico_usuario(ejecutaBuscar) {
	oTableDefaultUsuario = null;
	oTableDefaultUsuario = $('#tableDefaultUsuario').dataTable({
		autoWidth      : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperUsuario) {
	            responsiveHelperUsuario = new ResponsiveDatatablesHelper(oTableDefaultUsuario, breakpointDefinitionUsuario);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperUsuario.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperUsuario.respond();
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
		"sAjaxDataProp": "listUsuario",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "strNomUsuario"},
				{"mData" : "strNomResponsable"},
				{"mData" : "strNomAppaterno"},
				{"mData" : "strNomApmaterno"},
				{"mData" : "strDesCorreo"},
				{"mData" : "strDesCelular"},
				{"mData" : "intIdPerfilDesc"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [7],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_usuario" onclick="editar_usuario(\'' + row.srlIdUsuario + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_usuario" onclick="eliminar_usuario(\'' + row.srlIdUsuario + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
				buscar_basico_usuario();
	    }
	});
}

function buscar_basico_usuario() {

	deshabilitaBotones_usuario(true);
	$('#loadAjax').modal('toggle');
	var request = ajaxRequest(ctx+"/buscarUsuario.action", "POST", "json", $("#idFormBuscarUsuario").serialize());
	request.done(function(json) {
		oTableDefaultUsuario.fnClearTable();
		var oSettings = oTableDefaultUsuario.fnSettings();
		oTableDefaultUsuario.fnClearTable(this);
		for (var i=0; i<json.listUsuario.length; i++) {
			oTableDefaultUsuario.oApi._fnAddData(oSettings, json.listUsuario[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultUsuario.fnDraw();
		$('#loadAjax').modal('toggle');
		deshabilitaBotones_usuario(false);
	});

}
function nuevo_usuario() {
	deshabilitaBotones_usuario(true);
	var frm		= document.form;
	frm.action	= "nuevoUsuario.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();

	
	return false;
}

function editar_usuario(srlIdUsuario) {
	deshabilitaBotones_usuario(true);
	var frm		= document.form;
	frm.action	= "editarUsuario.action";
	frm.method	= "POST";
	frm.target	= "_self";
	$('#buscar_seleccion_id').val(srlIdUsuario);
	frm.submit();
	
	return false;
}

function salir_usuario() {
	document.location.href = "home.action";
	return false;
}

function eliminar_usuario(srlIdUsuario) {
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
        	$.post('eliminarUsuario.action', frm.serialize(), function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
    			buscar_basico_usuario();
        		$('.eliminar-info-modal').modal('hide');
        	}, "json");
		});
		$("#idBtnNo").click(function() {
			$('.eliminar-info-modal').modal('hide');
		});
		
	});
	$('.eliminar-info-modal').modal('show');
}


function deshabilitaBotones_usuario(deshabilitarBoton) {
	$('#idBtnSalirUsuario').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarUsuario').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosUsuario').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoUsuario').prop('disabled', deshabilitarBoton);
	$(".btn_buscar_control_usuario").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});

}

