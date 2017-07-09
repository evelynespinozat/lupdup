var oTableDefaultHistorialPuntos		= null;
var responsiveHelperHistorialPuntos		= undefined;
var breakpointDefinitionHistorialPuntos	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {
	

	var line1	= eval("["+$("input[name='datosGrafica1a']").val()+"]");
	var line2	= eval("["+$("input[name='datosGrafica1b']").val()+"]");
	var plot1 = $.jqplot('chart1', [line1, line2], {
		legend: {show:false},
		axes:{
			xaxis: {
                renderer: $.jqplot.CategoryAxisRenderer,
                label: '% de puntos ganados por fecha',
                labelOptions:{
					fontFamily:'Helvetica',
					fontSize: '14pt'
				},
				labelRenderer: $.jqplot.CanvasAxisLabelRenderer,
                tickRenderer: $.jqplot.CanvasAxisTickRenderer,
                tickOptions: {
                    angle: -30
                }
            },
            yaxis: {
                //autoscale:true,
                min:0, 
                max:100, 
                labelRenderer: $.jqplot.CanvasAxisLabelRenderer,
                tickRenderer: $.jqplot.CanvasAxisTickRenderer,
                labelOptions:{
					fontFamily:'Helvetica',
					fontSize: '14pt'
				},
                tickOptions: {
					labelPosition: 'middle', 
                    angle: -30
                }
            }
		}
	});	
});

function editar_historial_puntos(srlIdHistorialpuntos) {
	deshabilitaBotones_historial_puntos(true);
	var frm		= document.form;
	frm.action	= "editarHistorialPuntos.action";
	frm.method	= "POST";
	frm.target	= "_self";
	$('#buscar_seleccion_id').val(srlIdHistorialpuntos);
	frm.submit();
	
	return false;
}

function salir_historial_puntos() {
	document.location.href = "home.action";
	return false;
}
