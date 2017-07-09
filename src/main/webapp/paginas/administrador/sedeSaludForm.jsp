<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	<form class="" method="POST" id="idFormEditarSedeSalud" name="formEditarSedeSalud" novalidate="novalidate">
		<div class="row">
			<div class="col-sm-12">
				<s:hidden name="edicion_sedeSaludDto.srlIdSedesalud"></s:hidden>
				<s:hidden name="edicion_sedeSaludDto.intIdCentrosalud"></s:hidden>
				<s:hidden name="edicion_sedeSaludDto.strIndUbicacion"></s:hidden>
				<s:hidden name="edicion_sedeSaludDto.intIndZoom"></s:hidden>
				<div class="row form-row">
					<div class="col-sm-4 " id="idCampSedeSalud_NomNombre">
               			<label for="edicion_sedeSaludDto.strNomNombre" class="form-label">Nombre:</label>
              				<s:textfield name="edicion_sedeSaludDto.strNomNombre" cssClass="form-control " tabindex="1" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-4 " id="idCampSedeSalud_DesDireccion">
               			<label for="edicion_sedeSaludDto.strDesDireccion" class="form-label">Direcci&oacute;n:</label>
              				<s:textfield name="edicion_sedeSaludDto.strDesDireccion" cssClass="form-control " tabindex="2" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-4 " id="idCampSedeSalud_NumTelefono">
               			<label for="edicion_sedeSaludDto.strNumTelefono" class="form-label">Tel&eacute;fono:</label>
              				<s:textfield name="edicion_sedeSaludDto.strNumTelefono" cssClass="form-control solonumeros" tabindex="3" size="40" maxlength="12"  />
					</div>
				</div>
				<div class="row form-row">
					<div class="col-sm-4 " id="idCampSedeSalud_NumCelular">
               			<label for="edicion_sedeSaludDto.strNumCelular" class="form-label">Celular:</label>
              				<s:textfield name="edicion_sedeSaludDto.strNumCelular" cssClass="form-control solonumeros" tabindex="4" size="40" maxlength="12"  />
					</div>
					<div class="col-sm-4 " id="idCampSedeSalud_dteIndHoraDesdeString">
               			<label for="edicion_sedeSaludDto.dteIndHoraDesdeString" class="form-label">Horario desde (Formato HH:mm):</label>
<%--               				<s:textfield name="edicion_sedeSaludDto.dteIndHoraDesdeString" cssClass="form-control " tabindex="4" size="40" maxlength="12"  /> --%>
							<s:select name="edicion_sedeSaludDto.dteIndHoraDesdeString" cssClass="form-control " tabindex="5" list="#session.listHora" headerKey="" headerValue="-Seleccionar-" listKey="id" listValue="desc"></s:select>
					</div>
					<div class="col-sm-4 " id="idCampSedeSalud_dteIndHoraHastaString">
               			<label for="edicion_sedeSaludDto.dteIndHoraHastaString" class="form-label">Horario hasta (Formato HH:mm):</label>
<%--               				<s:textfield name="edicion_sedeSaludDto.dteIndHoraHastaString" cssClass="form-control " tabindex="6" size="40" maxlength="12"  /> --%>
							<s:select name="edicion_sedeSaludDto.dteIndHoraHastaString" cssClass="form-control " tabindex="5" list="#session.listHora" headerKey="" headerValue="-Seleccionar-" listKey="id" listValue="desc"></s:select>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-12">
				<div class="pull-right">
					<button class="btn btn-primary" type="button" id="idBtnGuardarSedeSalud" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
					<button class="btn btn-default" type="button" id="idBtnVolverSedeSalud" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
				</div>
			</div>
		</div>
		</br>
	</form>
	
</div>
