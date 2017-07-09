var oTableDefaultBandejaCita			= null;
var responsiveHelperBandejaCita		= undefined;
var breakpointDefinitionBandejaCita	= {
	tablet: 1024,
	phone : 480
};

$(document).ready(function() {
	$('#idBtnSalirBandejaCita').click(salir_bandeja_cita);
	$('#idBtnConsultarBandejaCita').click(buscar_basico_bandeja_cita);
	$('#idBtnMostrarTodosBandejaCita').click(mostrarTodos_bandeja_cita);
	$('#idBtnNuevoBandejaCita').click(nuevo_bandeja_cita);
	$('select[name=buscar_intIdCentroSalud]').change(change_buscar_intIdCentroSalud);
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
	instanciardt_basico_bandeja_cita();
});

function mostrarTodos_bandeja_cita() {
	deshabilitaBotones_bandeja_cita(true);
	$("input[name=buscar_strNumDni]").val("");
	$("input[name=buscar_strNomNombre]").val("");
	$('input[name=buscar_strNomAppaterno]').val("");
	$('input[name=buscar_strNomApmaterno]').val("");
	$('input[name=buscar_dteFecCitaDesde]').val("");
	$('input[name=buscar_dteFecCitaHasta]').val("");
	if($('select[name=buscar_intIdCentroSalud]').attr("disabled") != "disabled") {
		$('select[name=buscar_intIdCentroSalud]').val("");
		$('select[name=buscar_intIdSedeCentroSalud]').val("");
	}
	buscar_basico_bandeja_cita(''); 
}

function instanciardt_basico_bandeja_cita(ejecutaBuscar) {
	oTableDefaultBandejaCita = null;
	oTableDefaultBandejaCita = $('#tableDefaultBandejaCita').dataTable({
		autoWidth      : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperBandejaCita) {
	            responsiveHelperBandejaCita = new ResponsiveDatatablesHelper(oTableDefaultBandejaCita, breakpointDefinitionBandejaCita);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperBandejaCita.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperBandejaCita.respond();
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
		"sAjaxDataProp": "listBandejaCita",
		"sAjaxSource": null,
		"aoColumns": [
						{"mData" : "strNumDni"},
						{"mData" : "strNomNombre"},
						{"mData" : "strNomAppaterno"},
						{"mData" : "strNomApmaterno"},
						{"mData" : "dteFecCitaFecha"},
						{"mData" : "strHorCita"},
						{"mData" : "intIdEstadoDesc"},
						
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [7],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		var html_item	= '<div style="width:100px;">';
								var programado	= $("input[name=catalogo_estado_cita_donante_programado]").val();
		                		if((""+row.intIdEstado) == programado) {
			                		 html_item	+= '<button title="Asistencia" class="btn btn-primary btn_buscar_control_bandeja_cita" onclick="registrar_asistencia_bandeja_cita(\'' + row.srlIdCita + '\');return false;"><i class="fa fa-check"></i></button>';
		                		 } else {
			                		 html_item	+= '<button title="Asistencia" class="btn btn-primary btn_buscar_control_bandeja_cita" disabled="disabled"><i class="fa fa-check-circle"></i></button>&nbsp;&nbsp;&nbsp;';
			                		 html_item	+= '<button title="Ver ficha" class="btn btn-primary btn_buscar_control_bandeja_cita" onclick="ver_ficha_bandeja_cita(\'' + row.intIdDonante + '\',\'' + row.intIdCentrosalud + '\',\'' + row.srlIdCita + '\');return false;"><i class="fa fa-edit"></i></button>';
		                		 }
		                		 html_item	+= '</div>';
		                		 return html_item;
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
				buscar_basico_bandeja_cita();
	    }
	});
}

function buscar_basico_bandeja_cita() {
	deshabilitaBotones_bandeja_cita(true);
	$('#loadAjax').modal('toggle');
	//alert("frm="+$("#idFormBuscarBandejaCita").serialize());
	var request = ajaxRequest(ctx+"/buscarBandejaCita.action", "POST", "json", $("#idFormBuscarBandejaCita").serialize());
	request.done(function(json) {
		oTableDefaultBandejaCita.fnClearTable();
		var oSettings = oTableDefaultBandejaCita.fnSettings();
		oTableDefaultBandejaCita.fnClearTable(this);
		for (var i=0; i<json.listBandejaCita.length; i++) {
			oTableDefaultBandejaCita.oApi._fnAddData(oSettings, json.listBandejaCita[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultBandejaCita.fnDraw();
		$('#loadAjax').modal('toggle');
		deshabilitaBotones_bandeja_cita(false);
	});
}

function nuevo_bandeja_cita() {
	deshabilitaBotones_bandeja_cita(true);
	var frm		= document.form;
	frm.action	= "nuevoBandejaCita.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();
	return false;
}

function editar_bandeja_cita(srlIdCita) {
	deshabilitaBotones_bandeja_cita(true);
	var frm		= document.form;
	frm.action	= "editarBandejaCita.action";
	frm.method	= "POST";
	frm.target	= "_self";
	$('#buscar_seleccion_id').val(srlIdCita);
	frm.submit();
	
	return false;
}

function salir_bandeja_cita() {
	document.location.href = "home.action";
	return false;
}

function ver_ficha_bandeja_cita(intIdDonante, intIdCentrosalud, srlIdCita) {
	$('.editar-ficha-modal').off('shown.bs.modal');
	$('.editar-ficha-modal').on('shown.bs.modal', function (e) {
		var param	= {
				intIdDonante:intIdDonante,
				intIdCentrosalud:intIdCentrosalud,
				intIdCita:srlIdCita
		};
		$.post('editarFichaBandejaCita.action', param, function(datos) {
			$("#idDivEditarFichaBandejaCita").html(datos);
			iniciarEventosDialogEditar_ficha_bandeja_cita(true);
		});
	});
	$('.editar-ficha-modal').modal('show');
}
function registrar_asistencia_bandeja_cita(srlIdCita) {
	$('.asistencia-info-modal').off('shown.bs.modal');
	$('.asistencia-info-modal').on('shown.bs.modal', function (e) {
		$("#idBtnSi").each(function() {
			$(this).unbind("click");
		});
		$("#idBtnNo").each(function() {
			$(this).unbind("click");
		});
		$("#idBtnSi").click(function() {
        	var param	= {
        		buscar_seleccion_id: srlIdCita,
        	}
        	$.post('guardarBandejaCita.action', param, function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
    			buscar_basico_bandeja_cita();
        		$('.asistencia-info-modal').modal('hide');
        	}, "json");
		});
		$("#idBtnNo").click(function() {
			$('.asistencia-info-modal').modal('hide');
		});
	});
	$('.asistencia-info-modal').modal('show');
}
function change_buscar_intIdCentroSalud() {
	var buscar_intIdCentroSalud	= $('select[name=buscar_intIdCentroSalud]').val();
	var param	= {
			buscar_intIdCentroSalud: buscar_intIdCentroSalud
	};
	$.post('comboSedeCentroSaludBandejaCita.action', param, function(datos) {
		$('#idDivSelectSedeCentroSalud').html(datos);
	});
}
function deshabilitaBotones_bandeja_cita(deshabilitarBoton) {
	$('#idBtnSalirBandejaCita').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarBandejaCita').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosBandejaCita').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoBandejaCita').prop('disabled', deshabilitarBoton);
//	$('select[name=buscar_intIdSedeCentroSalud]').prop('disabled', deshabilitarBoton);
//	$('select[name=buscar_intIdCentroSalud]').prop('disabled', deshabilitarBoton);
	
	$(".btn_buscar_control_bandeja_cita").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});

}
