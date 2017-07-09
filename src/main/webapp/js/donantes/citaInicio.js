var oTableDefaultCita			= null;
var responsiveHelperCita		= undefined;
var breakpointDefinitionCita	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {
	$('#idBtnSalirCita').click(salir_cita);
	$('#idBtnConsultarCita').click(buscar_basico_cita);
	$('#idBtnMostrarTodosCita').click(mostrarTodos_cita);
	$('#idBtnNuevoCita').click(nuevo_cita);
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
	
	instanciardt_basico_cita();

});






function mostrarTodos_cita() {
	deshabilitaBotones_cita(true);
	$("input[name=buscar_dteFecCita]").val("");
	$("input[name=buscar_strHorCita]").val("");
	buscar_basico_cita('');
}
function instanciardt_basico_cita(ejecutaBuscar) {
	oTableDefaultCita = null;
	oTableDefaultCita = $('#tableDefaultCita').dataTable({
		autoWidth      : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperCita) {
	            responsiveHelperCita = new ResponsiveDatatablesHelper(oTableDefaultCita, breakpointDefinitionCita);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperCita.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperCita.respond();
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
		"sAjaxDataProp": "listCita",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "strHorCita"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [1],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_cita" onclick="editar_cita(\'' + row.srlIdCita + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_cita" onclick="eliminar_cita(\'' + row.srlIdCita + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
				buscar_basico_cita();
	    }
	});
}

function buscar_basico_cita() {

	deshabilitaBotones_cita(true);
	$('#loadAjax').modal('toggle');
	var request = ajaxRequest(ctx+"/buscarCita.action", "POST", "json", $("#idFormBuscarCita").serialize());
	request.done(function(json) {
		oTableDefaultCita.fnClearTable();
		var oSettings = oTableDefaultCita.fnSettings();
		oTableDefaultCita.fnClearTable(this);
		for (var i=0; i<json.listCita.length; i++) {
			oTableDefaultCita.oApi._fnAddData(oSettings, json.listCita[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultCita.fnDraw();
		$('#loadAjax').modal('toggle');
		deshabilitaBotones_cita(false);
	});

}
function nuevo_cita() {
	deshabilitaBotones_cita(true);
	var frm		= document.form;
	frm.action	= "nuevoCita.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();

	
	return false;
}

function editar_cita(srlIdCita) {
	deshabilitaBotones_cita(true);
	var frm		= document.form;
	frm.action	= "editarCita.action";
	frm.method	= "POST";
	frm.target	= "_self";
	$('#buscar_seleccion_id').val(srlIdCita);
	frm.submit();
	
	return false;
}

function salir_cita() {
	document.location.href = "home.action";
	return false;
}

function eliminar_cita(srlIdCita) {
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
        	$('#buscar_seleccion_id').val(srlIdCita);
        	$.post('eliminarCita.action', frm.serialize(), function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
    			buscar_basico_cita();
        		$('.eliminar-info-modal').modal('hide');
        	}, "json");
		});
		$("#idBtnNo").click(function() {
			$('.eliminar-info-modal').modal('hide');
		});
		
	});
	$('.eliminar-info-modal').modal('show');
}


function deshabilitaBotones_cita(deshabilitarBoton) {
	$('#idBtnSalirCita').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarCita').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosCita').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoCita').prop('disabled', deshabilitarBoton);
	$(".btn_buscar_control_cita").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});

}

