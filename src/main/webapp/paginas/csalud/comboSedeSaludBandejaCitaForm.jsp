<%@page import="pmp.lupdup.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:if test="%{#session.USUARIO_ACTUAL.perfilAdministrador}">
	<div id="idDivSelectSedeCentroSalud"><s:select name="buscar_intIdSedeCentroSalud" cssClass="form-control " tabindex="5" list="#session.listSedeSalud" headerKey="" headerValue="-Seleccionar-" listValue="strNomNombre" listKey="srlIdSedesalud"></s:select></div>
</s:if>
<s:else>
	<div id="idDivSelectSedeCentroSalud"><s:select name="buscar_intIdSedeCentroSalud" cssClass="form-control " tabindex="5" list="#session.listSedeSalud" headerKey="" headerValue="-Seleccionar-" listValue="strNomNombre" listKey="srlIdSedesalud" disabled="true"></s:select></div>
</s:else>