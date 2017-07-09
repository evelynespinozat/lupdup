<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	
				
				
					<form class="" method="POST" id="idFormEditarUsuarioEntidadColaboradora" name="formEditarUsuarioEntidadColaboradora" novalidate="novalidate">
						<div class="row">
							<div class="col-sm-12">
							
							
							
								<s:hidden name="edicion_usuarioEntidadColaboradoraDto.srlIdUsuario"></s:hidden>
								<s:hidden name="edicion_usuarioEntidadColaboradoraDto.intIdDonante"></s:hidden>
<%-- 								<s:hidden name="edicion_usuarioEntidadColaboradoraDto.intIdEntidadcolaboradora"></s:hidden> --%>
								<div class="row form-row">
									<div class="col-sm-6 " id="idCampUsuarioEntidadColaboradora_intIdSedeEntidadcolaboradora">
										<label for="edicion_usuarioEntidadColaboradoraDto.intIdSedeEntidadcolaboradora" class="form-label">Sede:</label>
										<div>
											<s:select name="edicion_usuarioEntidadColaboradoraDto.intIdSedeEntidadcolaboradora" cssClass="form-control " tabindex="1" list="#session.listSedeSalud" headerKey="" headerValue="-Seleccionar-" listValue="strNomNombre" listKey="srlIdSedeentidad"></s:select>
										</div>
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampUsuarioEntidadColaboradora_IdPerfil">
										<label for="edicion_usuarioEntidadColaboradoraDto.intIdPerfil" class="form-label">Perfil:</label>
										<div>
											
											<s:select name="edicion_usuarioEntidadColaboradoraDto.intIdPerfil" cssClass="form-control " tabindex="1" list="#session.listPerfil" headerKey="" headerValue="-Seleccionar-" listValue="strNomPerfil" listKey="srlIdPerfil" disabled="true"></s:select>
										</div>
									</div>
									<div class="col-sm-4 " id="idCampUsuarioEntidadColaboradora_NomUsuario">
			                			<label for="edicion_usuarioEntidadColaboradoraDto.strNomUsuario" class="form-label">Usuario</label>
		                				<s:textfield name="edicion_usuarioEntidadColaboradoraDto.strNomUsuario" cssClass="form-control " tabindex="2" size="40" maxlength="300"  />
									</div>
									<div class="col-sm-4 " id="idCampUsuarioEntidadColaboradora_ClvUsuario">
			                			<label for="edicion_usuarioEntidadColaboradoraDto.strClvUsuario" class="form-label">Password</label>
		                				<s:password name="edicion_usuarioEntidadColaboradoraDto.strClvUsuario" cssClass="form-control " tabindex="3" size="40" maxlength="15"  />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampUsuarioEntidadColaboradora_NomResponsable">
			                			<label for="edicion_usuarioEntidadColaboradoraDto.strNomResponsable" class="form-label">Nombres</label>
		                				<s:textfield name="edicion_usuarioEntidadColaboradoraDto.strNomResponsable" cssClass="form-control " tabindex="4" size="40" maxlength="300"  />
									</div>
									<div class="col-sm-4 " id="idCampUsuarioEntidadColaboradora_NomAppaterno">
			                			<label for="edicion_usuarioEntidadColaboradoraDto.strNomAppaterno" class="form-label">Ap. paterno</label>
		                				<s:textfield name="edicion_usuarioEntidadColaboradoraDto.strNomAppaterno" cssClass="form-control " tabindex="5" size="40" maxlength="300"  />
									</div>
									<div class="col-sm-4 " id="idCampUsuarioEntidadColaboradora_NomApmaterno">
			                			<label for="edicion_usuarioEntidadColaboradoraDto.strNomApmaterno" class="form-label"> Ap. materno</label>
		                				<s:textfield name="edicion_usuarioEntidadColaboradoraDto.strNomApmaterno" cssClass="form-control " tabindex="6" size="40" maxlength="300"  />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampUsuarioEntidadColaboradora_DesTelefono">
			                			<label for="edicion_usuarioEntidadColaboradoraDto.strDesTelefono" class="form-label">Telefono</label>
		                				<s:textfield name="edicion_usuarioEntidadColaboradoraDto.strDesTelefono" cssClass="form-control " tabindex="7" size="40" maxlength="12"  />
									</div>
									<div class="col-sm-4 " id="idCampUsuarioEntidadColaboradora_DesCorreo">
			                			<label for="edicion_usuarioEntidadColaboradoraDto.strDesCorreo" class="form-label">Correo</label>
		                				<s:textfield name="edicion_usuarioEntidadColaboradoraDto.strDesCorreo" cssClass="form-control " tabindex="8" size="40" maxlength="300"  />
									</div>
									<div class="col-sm-4 " id="idCampUsuarioEntidadColaboradora_DesCelular">
			                			<label for="edicion_usuarioEntidadColaboradoraDto.strDesCelular" class="form-label">Celular</label>
		                				<s:textfield name="edicion_usuarioEntidadColaboradoraDto.strDesCelular" cssClass="form-control " tabindex="9" size="40" maxlength="12"  />
									</div>
								</div>
							
							</div>
						</div>
						
						
						<div class="row">
							<div class="col-sm-12">
								<div class="pull-right">
									<button class="btn btn-primary" type="button" id="idBtnGuardarUsuarioEntidadColaboradora" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
									<button class="btn btn-default" type="button" id="idBtnVolverUsuarioEntidadColaboradora" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
								</div>
							</div>
						</div>
						</br>
					</form>

</div>

