<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
                                    <li class="dropdown <%=actionName.equals("campaniaCooperante") ? "current" : ""%>"><a href="campaniaCooperante.action">Campania</a>
                                    <li class="dropdown <%=actionName.equals("clubDonanteCampania") ? "current" : ""%>"><a href="clubDonanteCampania.action">Donantes en campana</a></li>
                                </ul>
                            </div>
                        </nav>
