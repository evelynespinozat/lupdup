var oTableDefaultClubDonanteCampania			= null;
var responsiveHelperClubDonanteCampania		= undefined;
var breakpointDefinitionClubDonanteCampania	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {
	$('#idBtnSalirClubDonanteCampania').click(salir_club_donante_campania);
	$('#idBtnConsultarClubDonanteCampania').click(buscar_basico_club_donante_campania);
	$('#idBtnMostrarTodosClubDonanteCampania').click(mostrarTodos_club_donante_campania);
	$('#idBtnNuevoClubDonanteCampania').click(nuevo_club_donante_campania);
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
	instanciardt_basico_club_donante_campania();
});

function mostrarTodos_club_donante_campania() {
	deshabilitaBotones_club_donante_campania(true);
	$("input[name=buscar_intIndEstado]").val("");
	$("input[name=buscar_strDesDocumento]").val("");
	$("input[name=buscar_strDesComentario]").val("");
	buscar_basico_club_donante_campania('');
}

function instanciardt_basico_club_donante_campania(ejecutaBuscar) {
	oTableDefaultClubDonanteCampania = null;
	oTableDefaultClubDonanteCampania = $('#tableDefaultClubDonanteCampania').dataTable({
		autoWidth      : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperClubDonanteCampania) {
	            responsiveHelperClubDonanteCampania = new ResponsiveDatatablesHelper(oTableDefaultClubDonanteCampania, breakpointDefinitionClubDonanteCampania);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperClubDonanteCampania.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperClubDonanteCampania.respond();
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
		"sAjaxDataProp": "listClubDonanteCampania",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "strNumDni"},
				{"mData" : "strNomNombre"},
				{"mData" : "strNomAppaterno"},
				{"mData" : "strNomApmaterno"},
				{"mData" : "dteFecAsisteString"},
				{"mData" : "strHorAsiste"},
				{"mData" : "intIndEstadoDesc"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [7],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
			                		var html_item	= '<div style="width:100px;">';
			                		html_item	= '<button title="Ver datos" class="btn btn-primary btn_buscar_control_club_donante_campania" onclick="ver_datos_club_donante_campania(\'' + row.intIdCampania + '\',\'' + row.intIdDonante + '\');return false;"><i class="fa fa-edit"></i></button>';
			                		html_item	+= '</div>';
			                		return html_item;
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
				buscar_basico_club_donante_campania();
	    }
	});
}

function buscar_basico_club_donante_campania() {
	deshabilitaBotones_club_donante_campania(true);
	$('#loadAjax').modal('toggle');
	var request = ajaxRequest(ctx+"/buscarClubDonanteCampania.action", "POST", "json", $("#idFormBuscarClubDonanteCampania").serialize());
	request.done(function(json) {
		oTableDefaultClubDonanteCampania.fnClearTable();
		var oSettings = oTableDefaultClubDonanteCampania.fnSettings();
		oTableDefaultClubDonanteCampania.fnClearTable(this);
		for (var i=0; i<json.listClubDonanteCampania.length; i++) {
			oTableDefaultClubDonanteCampania.oApi._fnAddData(oSettings, json.listClubDonanteCampania[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultClubDonanteCampania.fnDraw();
		$('#loadAjax').modal('toggle');
		deshabilitaBotones_club_donante_campania(false);
	});
}

function nuevo_club_donante_campania() {
	deshabilitaBotones_club_donante_campania(true);
	var frm		= document.form;
	frm.action	= "nuevoClubDonanteCampania.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();
	return false;
}

function ver_datos_club_donante_campania(intIdCampania, intIdDonante) {
	$('.editar-info-modal').off('shown.bs.modal');
	$('.editar-info-modal').on('shown.bs.modal', function (e) {
    	var param	= {
    			intIdCampania: intIdCampania,
    			intIdDonante: intIdDonante
    	};
    	$.post('editarClubDonanteCampania.action', param, function(datos) {
    		$("#idDivEditarClubDonanteCampania").html(datos);
    		iniciarEventosDialogEditar_club_donante_campania(true);
    	});
	});
	$('.editar-info-modal').modal('show');
	
}

function salir_club_donante_campania() {
	document.location.href = "home.action";
	return false;
}

function deshabilitaBotones_club_donante_campania(deshabilitarBoton) {
	$('#idBtnSalirClubDonanteCampania').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarClubDonanteCampania').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosClubDonanteCampania').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoClubDonanteCampania').prop('disabled', deshabilitarBoton);
	$(".btn_buscar_control_club_donante_campania").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});
}
