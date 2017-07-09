<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container-fluid" id="idDivPrincipalDonante">
	<div class="row">
		<div class="grid simple">
			
			<div class="grid-title">
				<div class="row form-row">
					<div class="col-sm-12">
						<div class="botonera">
							<button class="btn btn-primary" type="button" id="idBtnNuevoDonante" tabindex="10"><i class="fa fa-file-o"></i> Nuevo </button>
							<button class="btn btn-primary" type="button" id="idBtnSalirDonante" tabindex="10"><i class="fa fa-power-off"></i> Salir </button>
						</div>
					</div>
				</div>
			</div>
			
			<div class="grid-body no-border">
				<form class="" method="POST" id="idFormBuscarDonante" name="formBuscarDonante" novalidate="novalidate">
					
					<div class="row ">
						<div class="col-sm-12">
							<h4 class="semi-bold"><span class="light">Listado de</span> <span class="semi-bold">Donante</span><br>
							</h4>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strNomNombre" class="form-label">Nom Nombre</label>
		                			<s:textfield name="buscar_strNomNombre" cssClass="form-control" tabindex="1" size="40" maxlength="300"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strNomAppaterno" class="form-label">Nom Appaterno</label>
		                			<s:textfield name="buscar_strNomAppaterno" cssClass="form-control" tabindex="2" size="40" maxlength="300"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strNomApmaterno" class="form-label">Nom Apmaterno</label>
		                			<s:textfield name="buscar_strNomApmaterno" cssClass="form-control" tabindex="3" size="40" maxlength="300"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
					    			<label for="buscar_dteFecNacimiento" class="form-label">Fec Nacimiento</label>
					    			<s:textfield name="buscar_dteFecNacimiento" cssClass="form-control datepicker" tabindex="4" size="40" maxlength="30"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_intIndEstadocivil" class="form-label">Ind Estadocivil</label>
		                			<s:select name="buscar_intIndEstadocivil" cssClass="form-control " tabindex="5" list="#session.listCatalogo" headerKey="" headerValue="-Seleccionar-" listValue="strDesIndicador" listKey="srlIdCatalogo"></s:select>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_intIndSexo" class="form-label">Ind Sexo</label>
		                			<s:select name="buscar_intIndSexo" cssClass="form-control " tabindex="6" list="#session.listCatalogo" headerKey="" headerValue="-Seleccionar-" listValue="strDesIndicador" listKey="srlIdCatalogo"></s:select>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_intDesGradoinstruc" class="form-label">Des Gradoinstruc</label>
		                			<s:select name="buscar_intDesGradoinstruc" cssClass="form-control " tabindex="7" list="#session.listCatalogo" headerKey="" headerValue="-Seleccionar-" listValue="strDesIndicador" listKey="srlIdCatalogo"></s:select>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strDesOcupacion" class="form-label">Des Ocupacion</label>
		                			<s:textfield name="buscar_strDesOcupacion" cssClass="form-control" tabindex="8" size="40" maxlength="300"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_intIndDonante" class="form-label">Ind Donante</label>
		                			<s:select name="buscar_intIndDonante" cssClass="form-control " tabindex="9" list="#session.listCatalogo" headerKey="" headerValue="-Seleccionar-" listValue="strDesIndicador" listKey="srlIdCatalogo"></s:select>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strNumCelular" class="form-label">Num Celular</label>
		                			<s:textfield name="buscar_strNumCelular" cssClass="form-control" tabindex="10" size="40" maxlength="12"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strNumCelular2" class="form-label">Num Celular2</label>
		                			<s:textfield name="buscar_strNumCelular2" cssClass="form-control" tabindex="11" size="40" maxlength="12"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strNumTelefono" class="form-label">Num Telefono</label>
		                			<s:textfield name="buscar_strNumTelefono" cssClass="form-control" tabindex="12" size="40" maxlength="12"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strDesCorreo" class="form-label">Des Correo</label>
		                			<s:textfield name="buscar_strDesCorreo" cssClass="form-control" tabindex="13" size="40" maxlength="300"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strDesDireccion" class="form-label">Des Direccion</label>
		                			<s:textfield name="buscar_strDesDireccion" cssClass="form-control" tabindex="14" size="40" maxlength="300"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_intCntPuntos" class="form-label">Cnt Puntos</label>
		                			<s:textfield name="buscar_intCntPuntos" cssClass="form-control" tabindex="15" size="40" maxlength="30"/>
								</div>
							</div>


						</div>
					</div>
					
					<div class="row form-row">
						<div class="col-sm-12">
							<div class="botonera">
								<button class="btn btn-primary" type="button" id="idBtnConsultarDonante" tabindex="10"><i class="fa fa-filter"></i> Filtrar </button>
								<button class="btn btn-primary" type="button" id="idBtnMostrarTodosDonante" tabindex="10"><i class="fa fa-file-o"></i> Mostrar todos </button>
							</div>
						</div>
					</div>
					
				</form>
			</div>
			

			<div class="grid-body no-border" >      
				<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered table-hover" id="tableDefaultDonante" >
					<thead>     
						<tr>
							<th width="20%">Nom Nombre</th>
							<th width="20%">Nom Appaterno</th>
							<th width="20%">Nom Apmaterno</th>
							<th width="20%">Ind Estadocivil</th>
							<th width="20%">Ind Sexo</th>
							<th width="20%">Des Ocupacion</th>
							<th width="20%">Ind Donante</th>
							<th width="20%">Num Celular</th>
							<th width="20%">Num Celular2</th>
							<th width="20%">Num Telefono</th>
							<th width="20%">Des Correo</th>
							<th width="20%">Des Direccion</th>
							<th width="20%">Ind Tipo</th>
							<th style="width: 6%;">Detalle</th>
						</tr>
					</thead>
				</table>
				<br>
			</div>
		</div>
	</div>
</div>
<div id="idDivEditarDonante"></div>
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
