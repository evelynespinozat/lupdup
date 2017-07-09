<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<link rel="stylesheet" type="text/css" href="tools/jquery.jqplot/jquery.jqplot.min.css" />
<link type="text/css" rel="stylesheet" href="tools/jquery.jqplot/syntaxhighlighter/styles/shCoreDefault.min.css" />
<link type="text/css" rel="stylesheet" href="tools/jquery.jqplot/syntaxhighlighter/styles/shThemejqPlot.min.css" />

<div class="container-fluid" id="idDivPrincipalHistorialPuntos">
	<div class="row">
		
		<div class="col-sm-12">
			<div class="row ">
				<div class="col-sm-12">
					<h4 class="semi-bold"><span class="semi-bold">Historial de puntos ganados</span><br>
					</h4>
				</div>
			</div>
		</div>
		
		<div class="col-lg-12">
			<div class="row">
				<div class="col-sm-12">
					<p>Puntos ganados</p>
				</div>
			</div>
			
			<div class="row"><div class="col-sm-12">&nbsp;</div></div>
			
			<div class="row">
				<div class="col-sm-12">
					<div id="chart1" style="margin-top:20px; margin-left:20px; width:100%; height:300px;"></div>
					<input type="hidden" name="datosGrafica1a" value="<s:iterator value="%{#session.listHistorialPuntosGanados}" var="historial">['${historial.dteFecPuntoFecha}', ${historial.intCntPuntoganado}],</s:iterator>"/>
					<input type="hidden" name="datosGrafica1b" value="<s:iterator value="%{#session.listHistorialPuntosPerdidos}" var="historial">['${historial.dteFecPuntoFecha}', ${historial.intCntPuntoperdido}],</s:iterator>"/>
				</div>
			</div>
			
			<div class="row"><div class="col-sm-12">&nbsp;</div></div>
			
			<div class="row">
				<div class="col-sm-12">
					Total puntos ganados: ${sessionScope.intTotalHistorialPuntosGanados}
				</div>
			</div>
			<div class="row">
				<div class="col-sm-12">
					Total puntos consumidos: ${sessionScope.intTotalHistorialPuntosPerdidos}
				</div>
			</div>
			<div class="row">
				<div class="col-sm-12">
					Total puntos disponibles: ${sessionScope.intTotalHistorialPuntos}
				</div>
			</div>
			
			<div class="row"><div class="col-sm-12">&nbsp;</div></div>
			
			<div class="row">
				<div class="col-sm-12">
					<button class="btn btn-primary" name="promociones" onclick="document.location.href='donanteCampania.action';">Ver promociones del club</button>
				</div>
			</div>
			
		</div>
			
	</div>
</div>

<script type="text/javascript" src="tools/jquery.jqplot/jquery.jqplot.min.js"></script>
<script type="text/javascript" src="tools/jquery.jqplot/syntaxhighlighter/scripts/shCore.min.js"></script>
<script type="text/javascript" src="tools/jquery.jqplot/syntaxhighlighter/scripts/shBrushJScript.min.js"></script>
<script type="text/javascript" src="tools/jquery.jqplot/syntaxhighlighter/scripts/shBrushXml.min.js"></script>

<script type="text/javascript" src="tools/jquery.jqplot/plugins/jqplot.logAxisRenderer.min.js"></script>
<script type="text/javascript" src="tools/jquery.jqplot/plugins/jqplot.canvasTextRenderer.min.js"></script>
<script type="text/javascript" src="tools/jquery.jqplot/plugins/jqplot.canvasAxisLabelRenderer.min.js"></script>
<script type="text/javascript" src="tools/jquery.jqplot/plugins/jqplot.canvasAxisTickRenderer.min.js"></script>
<script type="text/javascript" src="tools/jquery.jqplot/plugins/jqplot.dateAxisRenderer.min.js"></script>
<script type="text/javascript" src="tools/jquery.jqplot/plugins/jqplot.categoryAxisRenderer.min.js"></script>
<script type="text/javascript" src="tools/jquery.jqplot/plugins/jqplot.barRenderer.min.js"></script>
