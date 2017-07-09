<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="pmp.lupdup.general.util.CadenaUtil"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String[] menuArr	= new String[]{"centroSalud","entidadColaboradora", "cuestionario", "imagen", "usuario"};
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
                                    <li class="dropdown <%=actionName.equals("centroSalud") ? "current" : ""%>"><a href="centroSalud.action">Centro Salud</a></li>
                                    <li class="dropdown <%=actionName.equals("entidadColaboradora") ? "current" : ""%>"><a href="entidadColaboradora.action">E. Colaboradora</a>
									<li class="dropdown <%=actionName.equals("cuestionario") ? "current" : ""%>"><a href="cuestionario.action">Cuestionario</a>
									<li class="dropdown <%=actionName.equals("imagen") ? "current" : ""%>"><a href="imagen.action">Imagen</a>
									<li class="dropdown <%=actionName.equals("usuario") ? "current" : ""%>"><a href="usuario.action">Usuario</a>
                                </ul>
                            </div>
                        </nav>




<%--
<nav class="navbar navbar-fixed-top " role="navigation" style="height: 40px; background-color: #FFFFFF">
	<div class="navbar-top">
		<div class="panel ">
			<div class="row">
				<div class="col-sm-10">
					
					<div class="btn btn-default">
						<a href="centroSalud.action">Centro Salud</a>
					</div>
					
					<div class="btn btn-default">
						<a href="entidadColaboradora.action">Entidad Colaboradora</a>
					</div>
					
					<div class="btn btn-default">
						<a href="cuestionario.action">Cuestionario</a>
					</div>
					
					<div class="btn btn-default">
						<a href="imagen.action">Imagen</a>
					</div>
					
					<div class="btn btn-default">
						<a href="usuario.action">Usuario</a>
					</div>
					

						
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
										<li><a href="bandejaCita.action"><i class="fa fa-gear"></i> C. Salud</a></li>
										<li><a href="campaniaCooperante.action"><i class="fa fa-gear"></i> E. Cooperante</a></li>
										<li><a href="centroSalud.action"><i class="fa fa-gear"></i> Administrador</a></li>
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
							<a href="login.action" class="clsLogin"><i class="fa fa-lg fa-sign-in"></i> Login</a>
						</div>
					</s:else>
				</div>
			</div>
		</div>
	</div>
</nav>
--%>