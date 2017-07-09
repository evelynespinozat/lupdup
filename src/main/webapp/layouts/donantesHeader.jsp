<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page import="pmp.lupdup.general.util.CadenaUtil"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String[] menuArr	= new String[]{"home", "cita","donante", "donanteCampania", "fichaResultados", "historialPuntos"};
List<String> listMenu	= Arrays.asList(menuArr);

String actionNameCurr	= CadenaUtil.getStr(request.getAttribute("actionName"));
String actionName		= "";
if(listMenu.contains(actionNameCurr)) {
	session.setAttribute("actionName", actionNameCurr);
	actionName	= actionNameCurr;
} else {
	actionName = CadenaUtil.getStr(session.getAttribute("actionName"));
}
%>
	
	
						<nav class="main-menu">
							
							<div class="navbar-header">
								<!-- Toggle Button -->		
								<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
								</button>
							</div>
							
							<div class="navbar-collapse collapse clearfix">
								<ul class="navigation">
									<li class="dropdown <%=actionName.equals("home") ? "current" : ""%>"><a href="home.action">Principal</a></li>
									<li class="dropdown <%=actionName.equals("cita") ? "current" : ""%>"><a href="cita.action">Cita</a></li>
									<li class="dropdown <%=actionName.equals("donante") ? "current" : ""%>"><a href="donante.action">Donante</a>
									<s:if test="%{#session.USUARIO_ACTUAL.perfilAdministrador||#session.USUARIO_ACTUAL.perfilDonante}">
										<ul>
											<li class="current"><a href="allegados.action">Allegados</a></li>
											<li><a href="cuestionarioRpta.action">Cuestionario</a></li>
										</ul>
									</s:if>
									</li>
									<s:if test="%{#session.ha_donado&&(#session.USUARIO_ACTUAL.perfilAdministrador||#session.USUARIO_ACTUAL.perfilDonante)}">
									<li class="dropdown <%=actionName.equals("donanteCampania") ? "current" : ""%>"><a href="donanteCampania.action">Club</a></li>
									<li class="dropdown <%=actionName.equals("fichaResultados") ? "current" : ""%>"><a href="fichaResultados.action">Resultados</a></li>
									<li class="dropdown <%=actionName.equals("historialPuntos") ? "current" : ""%>"><a href="historialPuntos.action">Historial Puntos</a>
										<ul>
											<li><a href="estadisticaPuntos.action">Estad&iacute;stica</a></li>
										</ul>
									</li>
									</s:if>
								</ul>
							</div>
						</nav>


<%--
<nav class="navbar navbar-fixed-top " role="navigation" style="height: 20px; background-color: #FFFFFF">
	<div class="navbar-top">
		<div class="panel ">
			<div class="row">
				<div class="col-sm-10">
				
					<div class="btn btn-default">
						<a href="home.action">Principal</a>
					</div>
					
					<s:if test="%{#session.USUARIO_ACTUAL.perfilAdministrador||#session.USUARIO_ACTUAL.perfilDonante}">
					<div class="btn btn-default">
						<a href="donante.action">Donante</a>
					</div>
					
					<div class="btn btn-default">
						<a href="allegados.action">Allegados</a>
					</div>
					
					<div class="btn btn-default">
						<a href="cuestionarioRpta.action">Cuestionario</a>
					</div>
					
					<div class="btn btn-default">
						<a href="donanteCampania.action">Club</a>
					</div>
					
					<div class="btn btn-default">
						<a href="cita.action">Cita</a>
					</div>
					
					<div class="btn btn-default">
						<a href="fichaResultados.action">Resultados</a>
					</div>
					
					<div class="btn btn-default">
						<a href="historialPuntos.action">Historial Puntos</a>
					</div>
					
					<div class="btn btn-default">
						<a href="estadisticaPuntos.action">Estadistica</a>
					</div>
					</s:if>
					
				</div>
				<div class="col-sm-2">
					<s:if test="%{#session.USUARIO_ACTUAL != null}">
						<div class="pull-right">
							<ul class="orange nav navbar-nav ">
								<li class="dropdown user-dropdown text-right">
									<a href="#" class="dropdown-toggle orange clsLoginBlue" data-toggle="dropdown">
										<i class="fa fa-user"></i>
										${sessionScope.USUARIO_ACTUAL.strNomResponsable}
										${sessionScope.USUARIO_ACTUAL.strNomAppaterno}
										${sessionScope.USUARIO_ACTUAL.strNomApmaterno}
										<b class="caret"></b>
									</a>
									<ul class="dropdown-menu pull-right">
										<s:if test="%{#session.USUARIO_ACTUAL.perfilAdministrador||#session.USUARIO_ACTUAL.perfilCentroSalud||#session.USUARIO_ACTUAL.perfilEntidadCooperante}">
										<li><a href="donante.action"><i class="fa fa-gear"></i> Donante</a></li>
										<s:if test="%{#session.USUARIO_ACTUAL.perfilAdministrador}">
										<li><a href="bandejaCita.action"><i class="fa fa-gear"></i> C. Salud</a></li>
										</s:if>
										<s:if test="%{#session.USUARIO_ACTUAL.perfilAdministrador}">
										<li><a href="campaniaCooperante.action"><i class="fa fa-gear"></i> E. Cooperante</a></li>
										</s:if>
										<s:if test="%{#session.USUARIO_ACTUAL.perfilAdministrador}">
										<li><a href="centroSalud.action"><i class="fa fa-gear"></i> Administrador</a></li>
										</s:if>
										<li class="divider"></li>
										</s:if>
										<li><a href="salir.action"><i class="fa fa-sign-out"></i> Cerrar Sesión</a></li>
									</ul>
								</li>
							</ul>
						</div>
					</s:if>
					<s:else>
						<div class="pull-right " style="margin-top: 15px;margin-right: 15px;">
							<a href="home.action" class="clsLogin"><i class="fa fa-lg fa-sign-in"></i> Login</a> 
						</div>
					</s:else>
				</div>
			</div>
		</div>
	</div>
</nav>
--%>