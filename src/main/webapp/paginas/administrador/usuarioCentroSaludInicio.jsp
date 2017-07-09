<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container-fluid" id="idDivPrincipalUsuarioCentroSalud">
	<div class="row">
		<div class="grid simple">
			
			<div class="grid-title">
				<div class="row form-row">
					<div class="col-sm-12">
						<div class="botonera">
							<button class="btn btn-primary" type="button" id="idBtnNuevoUsuarioCentroSalud" tabindex="10"><i class="fa fa-file-o"></i> Nuevo </button>
														<button class="btn btn-primary" type="button" id="idBtnSalirUsuarioCentroSalud" tabindex="10"><i class="fa fa-power-off"></i> Salir </button>
						</div>
					</div>
				</div>
			</div>
			
			<div class="grid-body no-border">
				<form class="" method="POST" id="idFormBuscarUsuarioCentroSalud" name="formBuscarUsuarioCentroSalud" novalidate="novalidate">
					
					<div class="row ">
						<div class="col-sm-12">
							<h4 class="semi-bold"><span class="light">Listado de</span> <span class="semi-bold">Usuario</span><br>
							</h4>
														<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_intIdPerfil" class="form-label">Perfil</label>
		                			<s:select name="buscar_intIdPerfil" cssClass="form-control " tabindex="1" list="#session.listPerfil" headerKey="" headerValue="-Seleccionar-" listValue="strNomPerfil" listKey="srlIdPerfil"></s:select>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strNomUsuario" class="form-label">Usuario</label>
		                			<s:textfield name="buscar_strNomUsuario" cssClass="form-control" tabindex="2" size="40" maxlength="300"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strClvUsuario" class="form-label">Password</label>
		                			<s:password name="buscar_strClvUsuario" cssClass="form-control" tabindex="3" size="40" maxlength="15"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strNomResponsable" class="form-label">Nombres</label>
		                			<s:textfield name="buscar_strNomResponsable" cssClass="form-control" tabindex="4" size="40" maxlength="300"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strNomAppaterno" class="form-label">Ap. paterno</label>
		                			<s:textfield name="buscar_strNomAppaterno" cssClass="form-control" tabindex="5" size="40" maxlength="300"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strNomApmaterno" class="form-label">Ap. materno</label>
		                			<s:textfield name="buscar_strNomApmaterno" cssClass="form-control" tabindex="6" size="40" maxlength="300"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strDesCorreo" class="form-label">Correo</label>
		                			<s:textfield name="buscar_strDesCorreo" cssClass="form-control" tabindex="8" size="40" maxlength="300"/>
								</div>
							</div>

						</div>
					</div>
					
					<div class="row form-row">
						<div class="col-sm-12">
							<div class="botonera">
																<button class="btn btn-primary" type="button" id="idBtnConsultarUsuarioCentroSalud" tabindex="10"><i class="fa fa-filter"></i> Filtrar </button>
								<button class="btn btn-primary" type="button" id="idBtnMostrarTodosUsuarioCentroSalud" tabindex="10"><i class="fa fa-file-o"></i> Mostrar todos </button>
															</div>
						</div>
					</div>
					
				</form>
			</div>
			

			<div class="grid-body no-border" >      
				<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered table-hover" id="tableDefaultUsuarioCentroSalud" >
					<thead>     
						<tr>
							<th width="20%">Nom Usuario</th>
							<th width="20%">Clv Usuario</th>
							<th width="20%">Nom Responsable</th>
							<th width="20%">Nom Appaterno</th>
							<th width="20%">Nom Apmaterno</th>
							<th width="20%">Des Telefono</th>
							<th width="20%">Des Correo</th>
							<th width="20%">Des Celular</th>
							<th style="width: 6%;">Detalle</th>
						</tr>
					</thead>
				</table>
				<br>
			</div>
		</div>
	</div>
</div>
<div id="idDivEditarUsuarioCentroSalud"></div>
<div id="dialog-info-eliminar" hidden="true">
    <br>  <p> <strong>&iquest;EST&Aacute; SEGURO QUE DESEA ELIMINAR EL REGISTRO&#63;</strong></p>
</div>

<s:form action="" name="form" id="form" namespace="/">
	<s:hidden name="buscar_seleccion_id" id="buscar_seleccion_id" />
</s:form>
