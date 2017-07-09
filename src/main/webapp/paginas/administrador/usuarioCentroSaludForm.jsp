<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	
				
				
					<form class="" method="POST" id="idFormEditarUsuarioCentroSalud" name="formEditarUsuarioCentroSalud" novalidate="novalidate">
						<div class="row">
							<div class="col-sm-12">
							
							
							
								<s:hidden name="edicion_usuarioCentroSaludDto.srlIdUsuario"></s:hidden>
								<s:hidden name="edicion_usuarioCentroSaludDto.intIdDonante"></s:hidden>
								<s:hidden name="edicion_usuarioCentroSaludDto.intIdCentrosalud"></s:hidden>
<%-- 								<s:hidden name="edicion_usuarioCentroSaludDto.intIdSedeCentrosalud"></s:hidden> --%>
								<div class="row form-row">
									<div class="col-sm-6 " id="idCampUsuarioCentroSalud_IdSedeCentroSalud">
										<label for="edicion_usuarioCentroSaludDto.intIdPerfil" class="form-label">Sede:</label>
										<div>
											<s:select name="edicion_usuarioCentroSaludDto.intIdSedeCentrosalud" cssClass="form-control " tabindex="1" list="#session.listSedeSalud" headerKey="" headerValue="-Seleccionar-" listValue="strNomNombre" listKey="srlIdSedesalud"></s:select>
										</div>
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampUsuarioCentroSalud_IdPerfil">
										<label for="edicion_usuarioCentroSaludDto.intIdPerfil" class="form-label">Perfil:</label>
										<div>
											<s:select name="edicion_usuarioCentroSaludDto.intIdPerfil" cssClass="form-control " tabindex="1" list="#session.listPerfil" headerKey="" headerValue="-Seleccionar-" listValue="strNomPerfil" listKey="srlIdPerfil" disabled="true"></s:select>
										</div>
									</div>
									<div class="col-sm-4 " id="idCampUsuarioCentroSalud_NomUsuario">
			                			<label for="edicion_usuarioCentroSaludDto.strNomUsuario" class="form-label">Usuario</label>
		                				<s:textfield name="edicion_usuarioCentroSaludDto.strNomUsuario" cssClass="form-control " tabindex="2" size="40" maxlength="300"  />
									</div>
									<div class="col-sm-4 " id="idCampUsuarioCentroSalud_ClvUsuario">
			                			<label for="edicion_usuarioCentroSaludDto.strClvUsuario" class="form-label">Password</label>
		                				<s:password name="edicion_usuarioCentroSaludDto.strClvUsuario" cssClass="form-control " tabindex="3" size="40" maxlength="15"  />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampUsuarioCentroSalud_NomResponsable">
			                			<label for="edicion_usuarioCentroSaludDto.strNomResponsable" class="form-label">Nombres</label>
		                				<s:textfield name="edicion_usuarioCentroSaludDto.strNomResponsable" cssClass="form-control " tabindex="4" size="40" maxlength="300"  />
									</div>
									<div class="col-sm-4 " id="idCampUsuarioCentroSalud_NomAppaterno">
			                			<label for="edicion_usuarioCentroSaludDto.strNomAppaterno" class="form-label">Ap. paterno</label>
		                				<s:textfield name="edicion_usuarioCentroSaludDto.strNomAppaterno" cssClass="form-control " tabindex="5" size="40" maxlength="300"  />
									</div>
									<div class="col-sm-4 " id="idCampUsuarioCentroSalud_NomApmaterno">
			                			<label for="edicion_usuarioCentroSaludDto.strNomApmaterno" class="form-label">Ap. materno</label>
		                				<s:textfield name="edicion_usuarioCentroSaludDto.strNomApmaterno" cssClass="form-control " tabindex="6" size="40" maxlength="300"  />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampUsuarioCentroSalud_DesTelefono">
			                			<label for="edicion_usuarioCentroSaludDto.strDesTelefono" class="form-label">Tel&eacute;fono</label>
		                				<s:textfield name="edicion_usuarioCentroSaludDto.strDesTelefono" cssClass="form-control " tabindex="7" size="40" maxlength="12"  />
									</div>
									<div class="col-sm-4 " id="idCampUsuarioCentroSalud_DesCorreo">
			                			<label for="edicion_usuarioCentroSaludDto.strDesCorreo" class="form-label">Correo</label>
		                				<s:textfield name="edicion_usuarioCentroSaludDto.strDesCorreo" cssClass="form-control " tabindex="8" size="40" maxlength="300"  />
									</div>
									<div class="col-sm-4 " id="idCampUsuarioCentroSalud_DesCelular">
			                			<label for="edicion_usuarioCentroSaludDto.strDesCelular" class="form-label">Celular</label>
		                				<s:textfield name="edicion_usuarioCentroSaludDto.strDesCelular" cssClass="form-control " tabindex="9" size="40" maxlength="12"  />
									</div>
								</div>
							
							</div>
						</div>
						
						
						<div class="row">
							<div class="col-sm-12">
								<div class="pull-right">
									<button class="btn btn-primary" type="button" id="idBtnGuardarUsuarioCentroSalud" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
									<button class="btn btn-default" type="button" id="idBtnVolverUsuarioCentroSalud" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
								</div>
							</div>
						</div>
						</br>
					</form>

</div>

