<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
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
		<section class="hidden-bar right-align">
			
			<div class="hidden-bar-closer">
				<button class="btn"><i class="fa fa-close"></i></button>
			</div>
			<!-- Hidden Bar Wrapper -->
			<div class="hidden-bar-wrapper">
			
				<!-- .logo -->
				<div class="logo text-center">
					<a href="index.html"><img src="tools/html_template/images/logo-2.png" alt=""></a>			
				</div><!-- /.logo -->
				
				<!-- .Side-menu -->
				<div class="side-menu">
				<!-- .navigation -->
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
                                        	<li><a href="estadisticaPuntos.action">Estadistica</a></li>
                                        </ul>
									</li>
									</s:if>

					</ul>
				</div><!-- /.Side-menu -->
			
				<div class="social-icons">
					<ul>
						<li><a href="#"><i class="fa fa-facebook"></i></a></li>
						<li><a href="#"><i class="fa fa-twitter"></i></a></li>
						<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
						<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
					</ul>
				</div>
			
			</div><!-- / Hidden Bar Wrapper -->
		</section>
		
