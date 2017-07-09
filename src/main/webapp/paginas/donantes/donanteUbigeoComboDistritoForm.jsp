<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
               			<label for="edicion_donanteDto.intIdUbigeo" class="form-label">Distrito:</label>
							<s:select name="edicion_donanteDto.intIdUbigeo" cssClass="form-control " tabindex="9" list="#session.listUbigeoDistrito" headerKey="" headerValue="-Seleccionar-" listValue="strDesUbigeo" listKey="srlIdUbigeo"></s:select>
