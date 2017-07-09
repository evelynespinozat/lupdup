var oTableDefaultEntidadColaboradora			= null;
var responsiveHelperEntidadColaboradora		= undefined;
var breakpointDefinitionEntidadColaboradora	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {
	$('#idBtnSalirEntidadColaboradora').click(salir_entidad_colaboradora);
	$('#idBtnConsultarEntidadColaboradora').click(buscar_basico_entidad_colaboradora);
	$('#idBtnMostrarTodosEntidadColaboradora').click(mostrarTodos_entidad_colaboradora);
	$('#idBtnNuevoEntidadColaboradora').click(nuevo_entidad_colaboradora);
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
	
	instanciardt_basico_entidad_colaboradora();

});






function mostrarTodos_entidad_colaboradora() {
	deshabilitaBotones_entidad_colaboradora(true);
	$("input[name=buscar_strNomNombre]").val("");
	buscar_basico_entidad_colaboradora('');
}
function instanciardt_basico_entidad_colaboradora(ejecutaBuscar) {
	oTableDefaultEntidadColaboradora = null;
	oTableDefaultEntidadColaboradora = $('#tableDefaultEntidadColaboradora').dataTable({
		autoWidth      : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperEntidadColaboradora) {
	            responsiveHelperEntidadColaboradora = new ResponsiveDatatablesHelper(oTableDefaultEntidadColaboradora, breakpointDefinitionEntidadColaboradora);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperEntidadColaboradora.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperEntidadColaboradora.respond();
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
		"sAjaxDataProp": "listEntidadColaboradora",
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
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_entidad_colaboradora" onclick="editar_entidad_colaboradora(\'' + row.srlIdEntidadcolaboradora + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_entidad_colaboradora" onclick="eliminar_entidad_colaboradora(\'' + row.srlIdEntidadcolaboradora + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
				buscar_basico_entidad_colaboradora();
	    }
	});
}

function buscar_basico_entidad_colaboradora() {

	deshabilitaBotones_entidad_colaboradora(true);
	$('#loadAjax').modal('toggle');
	var request = ajaxRequest(ctx+"/buscarEntidadColaboradora.action", "POST", "json", $("#idFormBuscarEntidadColaboradora").serialize());
	request.done(function(json) {
		oTableDefaultEntidadColaboradora.fnClearTable();
		var oSettings = oTableDefaultEntidadColaboradora.fnSettings();
		oTableDefaultEntidadColaboradora.fnClearTable(this);
		for (var i=0; i<json.listEntidadColaboradora.length; i++) {
			oTableDefaultEntidadColaboradora.oApi._fnAddData(oSettings, json.listEntidadColaboradora[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultEntidadColaboradora.fnDraw();
		$('#loadAjax').modal('toggle');
		deshabilitaBotones_entidad_colaboradora(false);
	});

}
function nuevo_entidad_colaboradora() {
	deshabilitaBotones_entidad_colaboradora(true);
	var frm		= document.form;
	frm.action	= "nuevoEntidadColaboradora.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();

	
	return false;
}

function editar_entidad_colaboradora(srlIdEntidadcolaboradora) {
	deshabilitaBotones_entidad_colaboradora(true);
	var frm		= document.form;
	frm.action	= "editarEntidadColaboradora.action";
	frm.method	= "POST";
	frm.target	= "_self";
	$('#buscar_seleccion_id').val(srlIdEntidadcolaboradora);
	frm.submit();
	
	return false;
}

function salir_entidad_colaboradora() {
	document.location.href = "home.action";
	return false;
}

function eliminar_entidad_colaboradora(srlIdEntidadcolaboradora) {
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
        	$('#buscar_seleccion_id').val(srlIdEntidadcolaboradora);
        	$.post('eliminarEntidadColaboradora.action', frm.serialize(), function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
    			buscar_basico_entidad_colaboradora();
        		$('.eliminar-info-modal').modal('hide');
        	}, "json");
		});
		$("#idBtnNo").click(function() {
			$('.eliminar-info-modal').modal('hide');
		});
		
	});
	$('.eliminar-info-modal').modal('show');
}


function deshabilitaBotones_entidad_colaboradora(deshabilitarBoton) {
	$('#idBtnSalirEntidadColaboradora').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarEntidadColaboradora').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosEntidadColaboradora').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoEntidadColaboradora').prop('disabled', deshabilitarBoton);
	$(".btn_buscar_control_entidad_colaboradora").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});

}

