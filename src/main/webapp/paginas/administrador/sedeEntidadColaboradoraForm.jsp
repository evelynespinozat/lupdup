<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	
				
				
					<form class="" method="POST" id="idFormEditarSedeEntidadColaboradora" name="formEditarSedeEntidadColaboradora" novalidate="novalidate">
						<div class="row">
							<div class="col-sm-12">
							
							
							
								<s:hidden name="edicion_sedeEntidadColaboradoraDto.srlIdSedeentidad"></s:hidden>
								<s:hidden name="edicion_sedeEntidadColaboradoraDto.intIdEntidadcolaboradora"></s:hidden>
								<s:hidden name="edicion_sedeEntidadColaboradoraDto.intIdUbigeo"></s:hidden>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampSedeEntidadColaboradora_NomNombre">
			                			<label for="edicion_sedeEntidadColaboradoraDto.strNomNombre" class="form-label">Nombre</label>
		                				<s:textfield name="edicion_sedeEntidadColaboradoraDto.strNomNombre" cssClass="form-control " tabindex="1" size="40" maxlength="300"  />
									</div>
									<div class="col-sm-4 " id="idCampSedeEntidadColaboradora_DesDireccion">
			                			<label for="edicion_sedeEntidadColaboradoraDto.strDesDireccion" class="form-label">Direcci&oacute;n</label>
		                				<s:textfield name="edicion_sedeEntidadColaboradoraDto.strDesDireccion" cssClass="form-control " tabindex="2" size="40" maxlength="300"  />
									</div>
									<div class="col-sm-4 " id="idCampSedeEntidadColaboradora_NumTelefono">
			                			<label for="edicion_sedeEntidadColaboradoraDto.strNumTelefono" class="form-label">Tel&eacute;fono</label>
		                				<s:textfield name="edicion_sedeEntidadColaboradoraDto.strNumTelefono" cssClass="form-control " tabindex="3" size="40" maxlength="12"  />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampSedeEntidadColaboradora_NumCelular">
			                			<label for="edicion_sedeEntidadColaboradoraDto.strNumCelular" class="form-label">Celular</label>
		                				<s:textfield name="edicion_sedeEntidadColaboradoraDto.strNumCelular" cssClass="form-control " tabindex="4" size="40" maxlength="12"  />
									</div>
									</div>
							
							</div>
						</div>
						
						
						<div class="row">
							<div class="col-sm-12">
								<div class="pull-right">
									<button class="btn btn-primary" type="button" id="idBtnGuardarSedeEntidadColaboradora" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
									<button class="btn btn-default" type="button" id="idBtnVolverSedeEntidadColaboradora" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
								</div>
							</div>
						</div>
						</br>
					</form>

</div>

