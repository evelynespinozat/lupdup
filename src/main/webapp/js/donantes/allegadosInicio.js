var oTableDefaultAllegados			= null;
var responsiveHelperAllegados		= undefined;
var breakpointDefinitionAllegados	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {
	$('#idBtnSalirAllegados').click(salir_allegados);
	$('#idBtnConsultarAllegados').click(buscar_basico_allegados);
	$('#idBtnMostrarTodosAllegados').click(mostrarTodos_allegados);
	$('#idBtnNuevoAllegados').click(nuevo_allegados);
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
	
	instanciardt_basico_allegados();
	
	if($("input[name=permiteModificarAllegados]").val() == "false") {
		$('#idBtnNuevoAllegados').addClass("disabled");
	}
});






function mostrarTodos_allegados() {
	deshabilitaBotones_allegados(true);
	$("input[name=buscar_intIdDonante]").val("");
	$("input[name=buscar_strNomNombre]").val("");
	$("input[name=buscar_strNomAppaterno]").val("");
	$("input[name=buscar_strNomApmaterno]").val("");
	$("input[name=buscar_dteFecNacimiento]").val("");
	$("input[name=buscar_strNumCelular]").val("");
	$("input[name=buscar_strNumTelefono]").val("");
	$("input[name=buscar_strDesCorreoelectronico]").val("");
	$("input[name=buscar_strNumDni]").val("");
	$("input[name=buscar_intIdTipopariente]").val("");
	buscar_basico_allegados('');
}
function instanciardt_basico_allegados(ejecutaBuscar) {
	oTableDefaultAllegados = null;
	oTableDefaultAllegados = $('#tableDefaultAllegados').dataTable({
		autoWidth      : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperAllegados) {
	            responsiveHelperAllegados = new ResponsiveDatatablesHelper(oTableDefaultAllegados, breakpointDefinitionAllegados);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperAllegados.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperAllegados.respond();
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
		"sAjaxDataProp": "listAllegados",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "strNomNombre"},
				{"mData" : "strNomAppaterno"},
				{"mData" : "strNomApmaterno"},
				{"mData" : "strNumCelular"},
				{"mData" : "strNumTelefono"},
				{"mData" : "strDesCorreoelectronico"},
				{"mData" : "strNumDni"},
				{"mData" : "intIdTipoparienteDesc"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 
		                 {
		                	 "aTargets": [8],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 if($("input[name=permiteModificarAllegados]").val() == "true") {
			                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_allegados" onclick="editar_allegados(\'' + row.srlIdAllegados + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
			                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_allegados" onclick="eliminar_allegados(\'' + row.srlIdAllegados + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
			                		 
		                		 } else {
			                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary disabled btn_buscar_control_allegados" onclick="editar_allegados(\'' + row.srlIdAllegados + '\');return false;" ><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
			                		 +'<button title="Eliminar" class="btn btn-danger disabled btn_buscar_control_allegados" onclick="eliminar_allegados(\'' + row.srlIdAllegados + '\');return false;" ><i class="fa fa-trash-o"></i></button>'+'</div>';
		                		 }
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
				buscar_basico_allegados();
	    }
	});
}

function buscar_basico_allegados() {

	deshabilitaBotones_allegados(true);
	$('#loadAjax').modal('toggle');
	var request = ajaxRequest(ctx+"/buscarAllegados.action", "POST", "json", $("#idFormBuscarAllegados").serialize());
	request.done(function(json) {
		oTableDefaultAllegados.fnClearTable();
		var oSettings = oTableDefaultAllegados.fnSettings();
		oTableDefaultAllegados.fnClearTable(this);
		for (var i=0; i<json.listAllegados.length; i++) {
			oTableDefaultAllegados.oApi._fnAddData(oSettings, json.listAllegados[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultAllegados.fnDraw();
		$('#loadAjax').modal('toggle');
		deshabilitaBotones_allegados(false);
	});

}
function nuevo_allegados() {
	deshabilitaBotones_allegados(true);
	var frm		= document.form;
	frm.action	= "nuevoAllegados.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();

	
	return false;
}

function editar_allegados(srlIdAllegados) {
	deshabilitaBotones_allegados(true);
	var frm		= document.form;
	frm.action	= "editarAllegados.action";
	frm.method	= "POST";
	frm.target	= "_self";
	$('#buscar_seleccion_id').val(srlIdAllegados);
	frm.submit();
	
	return false;
}

function salir_allegados() {
	document.location.href = "home.action";
	return false;
}

function eliminar_allegados(srlIdAllegados) {
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
        	$('#buscar_seleccion_id').val(srlIdAllegados);
        	$.post('eliminarAllegados.action', frm.serialize(), function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
    			buscar_basico_allegados();
        		$('.eliminar-info-modal').modal('hide');
        	}, "json");
		});
		$("#idBtnNo").click(function() {
			$('.eliminar-info-modal').modal('hide');
		});
		
	});
	$('.eliminar-info-modal').modal('show');
}


function deshabilitaBotones_allegados(deshabilitarBoton) {
	$('#idBtnSalirAllegados').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarAllegados').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosAllegados').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoAllegados').prop('disabled', deshabilitarBoton);
	$(".btn_buscar_control_allegados").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});

}

