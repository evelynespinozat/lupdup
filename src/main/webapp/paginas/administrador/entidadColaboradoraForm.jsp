<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	
				
				
					<form class="" method="POST" id="idFormEditarEntidadColaboradora" name="formEditarEntidadColaboradora" novalidate="novalidate">
						<div class="row">
							<div class="col-sm-12">
							
							
							
								<s:hidden name="edicion_entidadColaboradoraDto.srlIdEntidadcolaboradora"></s:hidden>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampEntidadColaboradora_NomNombre">
			                			<label for="edicion_entidadColaboradoraDto.strNomNombre" class="form-label">Nombre</label>
		                				<s:textfield name="edicion_entidadColaboradoraDto.strNomNombre" cssClass="form-control " tabindex="1" size="40" maxlength="100"  />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-12 " id="idCampSedeEntidadColaboradora_SedeEntidadColaboradora">
										<div class="row form-row">
											<div class="col-sm-12 ">
												<label class="form-label">Sede Entidad Colaboradora:</label>
												<button class="btn btn-primary" type="button" id="idBtnNuevoSedeEntidadColaboradora" tabindex="10"><i class="fa fa-file-o"></i> Nuevo </button>
											</div>
										</div>
										<div class="row form-row">
											<div class="col-sm-12 ">
												<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered table-hover" id="tableDefaultSedeEntidadColaboradora" >
													<thead>     
														<tr>
															<th width="20%">Nombre</th>
															<th width="20%">Direcci&oacute;n</th>
															<th width="20%">Tel&eacute;fono</th>
															<th width="20%">Celular</th>
															<th style="width: 6%;">Detalle</th>
														</tr>
													</thead>
												</table>
											</div>
										</div>
										
									</div>
								</div>
								
								<div class="row form-row">
									<div class="col-sm-12 " id="idCampUsuarioEntidadColaboradora_Usuario">
										<div class="row form-row">
											<div class="col-sm-12 ">
												<label class="form-label">Usuario:</label>
												<button class="btn btn-primary" type="button" id="idBtnNuevoUsuarioEntidadColaboradora" tabindex="10"><i class="fa fa-file-o"></i> Nuevo </button>
											</div>
										</div>
										<div class="row form-row">
											<div class="col-sm-12 ">
												<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered table-hover" id="tableDefaultUsuarioEntidadColaboradora" >
													<thead>     
														<tr>
															<th width="20%">Usuario</th>
															<th width="20%">Nombres</th>
															<th width="20%">Ap. paterno</th>
															<th width="20%">Ap. materno</th>
															<th width="20%">Telefono</th>
															<th width="20%">Correo</th>
															<th width="20%">Celular</th>
															<th style="width: 6%;">Detalle</th>
														</tr>
													</thead>
												</table>
											</div>
										</div>
									</div>
								</div>
								
							</div>
						</div>
						
						
						<div class="row">
							<div class="col-sm-12">
								<div class="pull-right">
									<button class="btn btn-primary" type="button" id="idBtnGuardarEntidadColaboradora" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
									<button class="btn btn-default" type="button" id="idBtnVolverEntidadColaboradora" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
								</div>
							</div>
						</div>
						</br>
					</form>

	<div class="modal fade sede-entidad-colaboradora-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabelx1">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<!--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>-->
					<div class="modal-title" id="idDivEditarTituloSedeEntidadColaboradora"><h3><strong>Sede Entidad Colaboradora</strong></h3></div>
				</div>
				<div class="modal-body" id="idDivEditarSedeEntidadColaboradora">
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade usuario-entidad-colaboradora-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabelx1">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<!--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>-->
					<div class="modal-title" id="idDivEditarTituloUsuarioEntidadColaboradora"><h3><strong>Usuario</strong></h3></div>
				</div>
				<div class="modal-body" id="idDivEditarUsuarioEntidadColaboradora">
				</div>
			</div>
		</div>
	</div>

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
</div>

