<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
               			<label for="edicion_donanteDto.intIdProvincia" class="form-label">Provincia:</label>
							<s:select name="edicion_donanteDto.intIdProvincia" cssClass="form-control " tabindex="9" list="#session.listUbigeoProvincia" headerKey="" headerValue="-Seleccionar-" listValue="strDesUbigeo" listKey="intIdProvincia"></s:select>
