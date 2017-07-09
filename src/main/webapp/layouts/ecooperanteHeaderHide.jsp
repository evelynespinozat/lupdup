<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="pmp.lupdup.general.util.CadenaUtil"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String[] menuArr	= new String[]{"campaniaCooperante","clubDonanteCampania"};
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
						<li class="dropdown <%=actionName.equals("campaniaCooperante") ? "current" : ""%>"><a href="campaniaCooperante.action">Campania</a>
						<li class="dropdown <%=actionName.equals("clubDonanteCampania") ? "current" : ""%>"><a href="clubDonanteCampania.action">Donantes en campana</a></li>
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
		
