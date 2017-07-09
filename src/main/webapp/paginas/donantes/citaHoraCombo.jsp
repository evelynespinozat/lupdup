<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:select name="edicion_citaDto.strHorCita" cssClass="form-control " tabindex="2" list="#session.listHora" headerKey="" headerValue="-Seleccionar-" listKey="id" listValue="desc"></s:select>