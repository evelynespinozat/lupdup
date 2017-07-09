<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
				
	<form class="" method="POST" id="idFormEditarAllegados" name="formEditarAllegados" novalidate="novalidate">
		<div class="row">
			<div class="col-sm-12">
				
				<s:hidden name="edicion_allegadosDto.srlIdAllegados"></s:hidden>
				<s:hidden name="edicion_allegadosDto.intIdDonante"></s:hidden>
				<s:hidden name="edicion_allegadosDto.dteFecUltimaModificacion"></s:hidden>
				<div class="row form-row">
					<div class="col-sm-3 " id="idCampAllegados_NomNombre">
               			<label for="edicion_allegadosDto.strNomNombre" class="form-label">Nombre</label>
              				<s:textfield name="edicion_allegadosDto.strNomNombre" cssClass="form-control " tabindex="1" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-3 " id="idCampAllegados_NomAppaterno">
               			<label for="edicion_allegadosDto.strNomAppaterno" class="form-label">Ap. paterno</label>
              				<s:textfield name="edicion_allegadosDto.strNomAppaterno" cssClass="form-control " tabindex="2" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-3 " id="idCampAllegados_NomApmaterno">
               			<label for="edicion_allegadosDto.strNomApmaterno" class="form-label">Ap. materno</label>
              				<s:textfield name="edicion_allegadosDto.strNomApmaterno" cssClass="form-control " tabindex="3" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-3 " id="idCampAllegados_FecNacimiento">
						<label for="edicion_allegadosDto.dteFecNacimiento" class="form-label">Fecha Nacimiento:</label>
						<div><s:textfield name="edicion_allegadosDto.dteFecNacimientoFecha" cssClass="form-control datepicker" tabindex="4" size="40" maxlength="30" /></div>
					</div>
				</div>
				<div class="row form-row">
					<div class="col-sm-3 " id="idCampAllegados_NumCelular">
               			<label for="edicion_allegadosDto.strNumCelular" class="form-label">Celular</label>
              				<s:textfield name="edicion_allegadosDto.strNumCelular" cssClass="form-control " tabindex="5" size="40" maxlength="12"  />
					</div>
					<div class="col-sm-3 " id="idCampAllegados_NumTelefono">
               			<label for="edicion_allegadosDto.strNumTelefono" class="form-label">Telefono</label>
              				<s:textfield name="edicion_allegadosDto.strNumTelefono" cssClass="form-control " tabindex="6" size="40" maxlength="12"  />
					</div>
					<div class="col-sm-3 " id="idCampAllegados_DesCorreoelectronico">
               			<label for="edicion_allegadosDto.strDesCorreoelectronico" class="form-label">Correo electronico</label>
              				<s:textfield name="edicion_allegadosDto.strDesCorreoelectronico" cssClass="form-control " tabindex="7" size="40" maxlength="500"  />
					</div>
					<div class="col-sm-3 " id="idCampAllegados_NumDni">
               			<label for="edicion_allegadosDto.strNumDni" class="form-label">DNI</label>
              				<s:textfield name="edicion_allegadosDto.strNumDni" cssClass="form-control " tabindex="8" size="40" maxlength="15"  />
					</div>
				</div>
				<div class="row form-row">
					<div class="col-sm-3 " id="idCampAllegados_IdTipopariente">
						<label for="edicion_allegadosDto.intIdTipopariente" class="form-label">Tipo parentesco:</label>
						<div>
							
							<s:select name="edicion_allegadosDto.intIdTipopariente" cssClass="form-control " tabindex="9" list="#session.listCatalogo" headerKey="" headerValue="-Seleccionar-" listValue="strDesIndicador" listKey="srlIdCatalogo"></s:select>
						</div>
					</div>
				</div>
			
			</div>
		</div>
		
		
		<div class="row">
			<div class="col-sm-12">
				<div class="pull-right">
					<button class="btn btn-primary" type="button" id="idBtnGuardarAllegados" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
					<button class="btn btn-default" type="button" id="idBtnVolverAllegados" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
				</div>
			</div>
		</div>
		</br>
	</form>

</div>

