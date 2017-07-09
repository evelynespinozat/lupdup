var oTableDefaultDonante			= null;
var responsiveHelperDonante		= undefined;
var breakpointDefinitionDonante	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {
	$('#idBtnSalirDonante').click(salir_donante);
	$('#idBtnConsultarDonante').click(buscar_basico_donante);
	$('#idBtnMostrarTodosDonante').click(mostrarTodos_donante);
	$('#idBtnNuevoDonante').click(nuevo_donante);
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
	
	instanciardt_basico_donante();

});






function mostrarTodos_donante() {
	deshabilitaBotones_donante(true);
	$("input[name=buscar_strNomNombre]").val("");
	$("input[name=buscar_strNomAppaterno]").val("");
	$("input[name=buscar_strNomApmaterno]").val("");
	$("input[name=buscar_dteFecNacimiento]").val("");
	$("input[name=buscar_intIndEstadocivil]").val("");
	$("input[name=buscar_intIndSexo]").val("");
	$("input[name=buscar_intDesGradoinstruc]").val("");
	$("input[name=buscar_strDesOcupacion]").val("");
	$("input[name=buscar_intIndDonante]").val("");
	$("input[name=buscar_strNumCelular]").val("");
	$("input[name=buscar_strNumCelular2]").val("");
	$("input[name=buscar_strNumTelefono]").val("");
	$("input[name=buscar_strDesCorreo]").val("");
	$("input[name=buscar_strDesDireccion]").val("");
	$("input[name=buscar_intCntPuntos]").val("");
	$("input[name=buscar_intIndTipo]").val("");
	buscar_basico_donante('');
}
function instanciardt_basico_donante(ejecutaBuscar) {
	oTableDefaultDonante = null;
	oTableDefaultDonante = $('#tableDefaultDonante').dataTable({
		autoWidth      : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperDonante) {
	            responsiveHelperDonante = new ResponsiveDatatablesHelper(oTableDefaultDonante, breakpointDefinitionDonante);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperDonante.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperDonante.respond();
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
		"sAjaxDataProp": "listDonante",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "strNomNombre"},
				{"mData" : "strNomAppaterno"},
				{"mData" : "strNomApmaterno"},
				{"mData" : "intIndEstadocivilDesc"},
				{"mData" : "intIndSexoDesc"},
				{"mData" : "strDesOcupacion"},
				{"mData" : "intIndDonanteDesc"},
				{"mData" : "strNumCelular"},
				{"mData" : "strNumCelular2"},
				{"mData" : "strNumTelefono"},
				{"mData" : "strDesCorreo"},
				{"mData" : "strDesDireccion"},
				{"mData" : "intIndTipo"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [13],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_donante" onclick="editar_donante(\'' + row.srlIdDonante + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_donante" onclick="eliminar_donante(\'' + row.srlIdDonante + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
				buscar_basico_donante();
	    }
	});
}

function buscar_basico_donante() {

	deshabilitaBotones_donante(true);
	$('#loadAjax').modal('toggle');
	var request = ajaxRequest(ctx+"/buscarDonante.action", "POST", "json", $("#idFormBuscarDonante").serialize());
	request.done(function(json) {
		oTableDefaultDonante.fnClearTable();
		var oSettings = oTableDefaultDonante.fnSettings();
		oTableDefaultDonante.fnClearTable(this);
		for (var i=0; i<json.listDonante.length; i++) {
			oTableDefaultDonante.oApi._fnAddData(oSettings, json.listDonante[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultDonante.fnDraw();
		$('#loadAjax').modal('toggle');
		deshabilitaBotones_donante(false);
	});

}
function nuevo_donante() {
	deshabilitaBotones_donante(true);
	var frm		= document.form;
	frm.action	= "nuevoDonante.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();

	
	return false;
}

function editar_donante(srlIdDonante) {
	deshabilitaBotones_donante(true);
	var frm		= document.form;
	frm.action	= "editarDonante.action";
	frm.method	= "POST";
	frm.target	= "_self";
	$('#buscar_seleccion_id').val(srlIdDonante);
	frm.submit();
	
	return false;
}

function salir_donante() {
	document.location.href = "home.action";
	return false;
}

function eliminar_donante(srlIdDonante) {
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
        	$('#buscar_seleccion_id').val(srlIdDonante);
        	$.post('eliminarDonante.action', frm.serialize(), function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
    			buscar_basico_donante();
        		$('.eliminar-info-modal').modal('hide');
        	}, "json");
		});
		$("#idBtnNo").click(function() {
			$('.eliminar-info-modal').modal('hide');
		});
		
	});
	$('.eliminar-info-modal').modal('show');
}


function deshabilitaBotones_donante(deshabilitarBoton) {
	$('#idBtnSalirDonante').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarDonante').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosDonante').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoDonante').prop('disabled', deshabilitarBoton);
	$(".btn_buscar_control_donante").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});

}

