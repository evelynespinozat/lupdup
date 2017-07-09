<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container-fluid" id="idDivPrincipalUsuario">
	<div class="row">
		<div class="grid simple">
			
			<div class="grid-title">
				<div class="row form-row">
					<div class="col-sm-12">
						<div class="botonera">
							<button class="btn btn-primary" type="button" id="idBtnNuevoUsuario" tabindex="10"><i class="fa fa-file-o"></i> Nuevo </button>
							<button class="btn btn-primary" type="button" id="idBtnSalirUsuario" tabindex="10"><i class="fa fa-power-off"></i> Salir </button>
						</div>
					</div>
				</div>
			</div>
			
			<div class="grid-body no-border">
				<form class="" method="POST" id="idFormBuscarUsuario" name="formBuscarUsuario" novalidate="novalidate">
					
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
		                			<label for="buscar_strDesCorreo" class="form-label">Correo</label>
		                			<s:textfield name="buscar_strDesCorreo" cssClass="form-control" tabindex="8" size="40" maxlength="300"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strDesCelular" class="form-label">Celular</label>
		                			<s:textfield name="buscar_strDesCelular" cssClass="form-control" tabindex="9" size="40" maxlength="12"/>
								</div>
							</div>


						</div>
					</div>
					
					<div class="row form-row">
						<div class="col-sm-12">
							<div class="botonera">
								<button class="btn btn-primary" type="button" id="idBtnConsultarUsuario" tabindex="10"><i class="fa fa-filter"></i> Filtrar </button>
								<button class="btn btn-primary" type="button" id="idBtnMostrarTodosUsuario" tabindex="10"><i class="fa fa-file-o"></i> Mostrar todos </button>
							</div>
						</div>
					</div>
					
				</form>
			</div>
			

			<div class="grid-body no-border" >      
				<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered table-hover" id="tableDefaultUsuario" >
					<thead>     
						<tr>
							<th width="10%">Usuario</th>
							<th width="20%">Nombres</th>
							<th width="20%">Apellido paterno</th>
							<th width="20%">Apellido materno</th>
							<th width="10%">Correo</th>
							<th width="5%">Celular</th>
							<th width="5%">Perfil</th>
							<th style="width: 6%;">Detalle</th>
						</tr>
					</thead>
				</table>
				<br>
			</div>
		</div>
	</div>
</div>
<div id="idDivEditarUsuario"></div>
<div class="modal fade eliminar-info-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabelx1">
	<div class="modal-dialog modal-md">
		<div class="modal-content">
			<div class="modal-header">
				<!--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>-->
				<h4 class="modal-title" id="">Eliminar</h4>
			</div>
			<div class="modal-body" id="idDivEliminar">
		    	<div class="row">
					<div class="col-sm-12">
				    	<p><strong>&iquest;EST&Aacute; SEGURO QUE DESEA ELIMINAR EL REGISTRO&#63;</strong></p>
					</div>
				</div>
		    	<div class="row">
					<div class="col-sm-12">&nbsp;</div>
				</div>
		    	<div class="row">
					<div class="col-sm-12">
						<div class="pull-right">
							<button class="btn btn-primary" type="button" id="idBtnSi" tabindex="10"><i class="fa fa-trash-o"></i> Si </button>
							<button class="btn btn-default" type="button" id="idBtnNo" tabindex="10"><i class="fa fa-reply"></i> No </button>
						</div>
					</div>
				</div>
				
			</div>
		</div>
	</div>
</div>

<s:form action="" name="form" id="form" namespace="/">
	<s:hidden name="buscar_seleccion_id" id="buscar_seleccion_id" />
</s:form>
