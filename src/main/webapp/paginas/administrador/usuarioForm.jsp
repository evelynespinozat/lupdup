<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	
				
				
	<form class="" method="POST" id="idFormEditarUsuario" name="formEditarUsuario" novalidate="novalidate" autocomplete="off">
		<div class="row">
			<div class="col-sm-12">
			
			
			
				<s:hidden name="edicion_usuarioDto.srlIdUsuario"></s:hidden>
				<s:hidden name="edicion_usuarioDto.intIdDonante"></s:hidden>
				<div class="row form-row">
					<div class="col-sm-4 " id="idCampUsuario_IdPerfil">
						<label for="edicion_usuarioDto.intIdPerfil" class="form-label">Perfil:</label>
						<div>
							<s:select name="edicion_usuarioDto.intIdPerfil" cssClass="form-control " tabindex="1" list="#session.listPerfil" headerKey="" headerValue="-Seleccionar-" listValue="strNomPerfil" listKey="srlIdPerfil"></s:select>
						</div>
					</div>
					<div class="col-sm-4 " id="idCampUsuario_NomUsuario">
               			<label for="edicion_usuarioDto.strNomUsuario" class="form-label">Usuario</label>
              				<s:textfield name="edicion_usuarioDto.strNomUsuario" cssClass="form-control " tabindex="2" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-4 " id="idCampUsuario_ClvUsuario">
               			<label for="edicion_usuarioDto.strClvUsuario" class="form-label">Password</label>
              				<s:password name="edicion_usuarioDto.strClvUsuario" cssClass="form-control " tabindex="3" size="40" maxlength="15"  ></s:password>
					</div>
				</div>
				<div class="row form-row">
					<div class="col-sm-4 " id="idCampUsuario_NomResponsable">
               			<label for="edicion_usuarioDto.strNomResponsable" class="form-label">Nombres</label>
              				<s:textfield name="edicion_usuarioDto.strNomResponsable" cssClass="form-control " tabindex="4" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-4 " id="idCampUsuario_NomAppaterno">
               			<label for="edicion_usuarioDto.strNomAppaterno" class="form-label">Apellido paterno</label>
              				<s:textfield name="edicion_usuarioDto.strNomAppaterno" cssClass="form-control " tabindex="5" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-4 " id="idCampUsuario_NomApmaterno">
               			<label for="edicion_usuarioDto.strNomApmaterno" class="form-label">Apellido materno</label>
              				<s:textfield name="edicion_usuarioDto.strNomApmaterno" cssClass="form-control " tabindex="6" size="40" maxlength="300"  />
					</div>
				</div>
				<div class="row form-row">
					<div class="col-sm-4 " id="idCampUsuario_DesTelefono">
               			<label for="edicion_usuarioDto.strDesTelefono" class="form-label">Tel&eacute;fono</label>
              				<s:textfield name="edicion_usuarioDto.strDesTelefono" cssClass="form-control " tabindex="7" size="40" maxlength="12"  />
					</div>
					<div class="col-sm-4 " id="idCampUsuario_DesCorreo">
               			<label for="edicion_usuarioDto.strDesCorreo" class="form-label">Correo</label>
              				<s:textfield name="edicion_usuarioDto.strDesCorreo" cssClass="form-control " tabindex="8" size="40" maxlength="300"  
              					data-toggle="popover" data-viewport="#idCampUsuario_DesCorreo" 
              					data-html="true" 
              					data-placement="auto" 
              					data-content='<span style="color:#FF0000;">El formato del campo e-mail no es válido. Ejemplo: juandt@correo.com</span>' 
              				/>
					</div>
					<div class="col-sm-4 " id="idCampUsuario_DesCelular">
               			<label for="edicion_usuarioDto.strDesCelular" class="form-label">Celular</label>
              				<s:textfield name="edicion_usuarioDto.strDesCelular" cssClass="form-control " tabindex="9" size="40" maxlength="12"  />
					</div>
				</div>
			
			</div>
		</div>
		
		
		<div class="row">
			<div class="col-sm-12">
				<div class="pull-right">
					<button class="btn btn-primary" type="button" id="idBtnGuardarUsuario" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
					<button class="btn btn-default" type="button" id="idBtnVolverUsuario" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
				</div>
			</div>
		</div>
		</br>
	</form>

</div>

