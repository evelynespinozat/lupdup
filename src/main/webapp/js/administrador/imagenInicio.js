var oTableDefaultImagen			= null;
var responsiveHelperImagen		= undefined;
var breakpointDefinitionImagen	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {
	$('#idBtnSalirImagen').click(salir_imagen);
	$('#idBtnConsultarImagen').click(buscar_basico_imagen);
	$('#idBtnMostrarTodosImagen').click(mostrarTodos_imagen);
	$('#idBtnNuevoImagen').click(nuevo_imagen);
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
	
	instanciardt_basico_imagen();

});






function mostrarTodos_imagen() {
	deshabilitaBotones_imagen(true);
	$("input[name=buscar_strNomDescripcion]").val("");
	buscar_basico_imagen('');
}
function instanciardt_basico_imagen(ejecutaBuscar) {
	oTableDefaultImagen = null;
	oTableDefaultImagen = $('#tableDefaultImagen').dataTable({
		autoWidth      : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperImagen) {
	            responsiveHelperImagen = new ResponsiveDatatablesHelper(oTableDefaultImagen, breakpointDefinitionImagen);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperImagen.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperImagen.respond();
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
		"sAjaxDataProp": "listImagen",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "strNomDescripcion"},
				{"mData" : "lngNomFechaUltimaMod"},
				{"mData" : "strNomCodigo"},
				{"mData" : "lngNumTamanio"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [4],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_imagen" onclick="editar_imagen(\'' + row.srlIdImagen + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_imagen" onclick="eliminar_imagen(\'' + row.srlIdImagen + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
				buscar_basico_imagen();
	    }
	});
}

function buscar_basico_imagen() {

	deshabilitaBotones_imagen(true);
	$('#loadAjax').modal('toggle');
	var request = ajaxRequest(ctx+"/buscarImagen.action", "POST", "json", $("#idFormBuscarImagen").serialize());
	request.done(function(json) {
		oTableDefaultImagen.fnClearTable();
		var oSettings = oTableDefaultImagen.fnSettings();
		oTableDefaultImagen.fnClearTable(this);
		for (var i=0; i<json.listImagen.length; i++) {
			oTableDefaultImagen.oApi._fnAddData(oSettings, json.listImagen[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultImagen.fnDraw();
		$('#loadAjax').modal('toggle');
		deshabilitaBotones_imagen(false);
	});

}
function nuevo_imagen() {
	deshabilitaBotones_imagen(true);
	var frm		= document.form;
	frm.action	= "nuevoImagen.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();

	
	return false;
}

function editar_imagen(srlIdImagen) {
	deshabilitaBotones_imagen(true);
	var frm		= document.form;
	frm.action	= "editarImagen.action";
	frm.method	= "POST";
	frm.target	= "_self";
	$('#buscar_seleccion_id').val(srlIdImagen);
	frm.submit();
	
	return false;
}

function salir_imagen() {
	document.location.href = "home.action";
	return false;
}

function eliminar_imagen(srlIdImagen) {
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
        	$('#buscar_seleccion_id').val(srlIdImagen);
        	$.post('eliminarImagen.action', frm.serialize(), function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
    			buscar_basico_imagen();
        		$('.eliminar-info-modal').modal('hide');
        	}, "json");
		});
		$("#idBtnNo").click(function() {
			$('.eliminar-info-modal').modal('hide');
		});
		
	});
	$('.eliminar-info-modal').modal('show');
}


function deshabilitaBotones_imagen(deshabilitarBoton) {
	$('#idBtnSalirImagen').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarImagen').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosImagen').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoImagen').prop('disabled', deshabilitarBoton);
	$(".btn_buscar_control_imagen").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});

}

