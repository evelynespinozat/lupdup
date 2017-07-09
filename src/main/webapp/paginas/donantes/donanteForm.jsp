<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	
	<form class="" method="POST" id="idFormEditarDonante" name="formEditarDonante" novalidate="novalidate">
		
		<div class="row">
			<div class="col-sm-3">
				<s:hidden name="edicion_donanteDto.srlIdDonante"></s:hidden>
				<s:hidden name="edicion_donanteDto.intIdUsuario"></s:hidden>
				<s:hidden name="edicion_donanteDto.intIndTipo"></s:hidden>
				<s:hidden name="edicion_donanteDto.intCntPuntos"></s:hidden>
				<s:hidden name="edicion_donanteDto.indActivo"></s:hidden>
				<s:hidden name="edicion_donanteDto.strIndUbicacion"></s:hidden>
				<s:hidden name="edicion_donanteDto.intIndZoom"></s:hidden>
				
				<s:hidden name="edicion_usuarioDto.srlIdUsuario"></s:hidden>
				<s:hidden name="edicion_usuarioDto.intIdDonante"></s:hidden>
				<s:hidden name="edicion_usuarioDto.intIdPerfil"></s:hidden>
				<s:hidden name="edicion_usuarioDto.indActivo"></s:hidden>
				<div class="row form-row">
					<div class="col-sm-12 " id="idCampDonante_strNumDni">
               			<label for="edicion_donanteDto.strNumDni" class="form-label">DNI:</label>
              				<s:textfield name="edicion_donanteDto.strNumDni" cssClass="form-control solonumeros" tabindex="1" size="40" maxlength="8"  />
					</div>
					<div class="col-sm-12 " id="idCampDonante_NomNombre">
               			<label for="edicion_donanteDto.strNomNombre" class="form-label">Nombres completos:</label>
              				<s:textfield name="edicion_donanteDto.strNomNombre" cssClass="form-control " tabindex="1" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-12 " id="idCampDonante_NomAppaterno">
               			<label for="edicion_donanteDto.strNomAppaterno" class="form-label">Apellido paterno:</label>
              				<s:textfield name="edicion_donanteDto.strNomAppaterno" cssClass="form-control " tabindex="2" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-12 " id="idCampDonante_NomApmaterno">
               			<label for="edicion_donanteDto.strNomApmaterno" class="form-label">Apellido materno:</label>
              				<s:textfield name="edicion_donanteDto.strNomApmaterno" cssClass="form-control " tabindex="3" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-12 " id="idCampDonante_FecNacimiento">
						<label for="edicion_donanteDto.dteFecNacimiento" class="form-label">Fecha de nacimiento:</label>
						<div><s:textfield name="edicion_donanteDto.dteFecNacimientoFecha" cssClass="form-control datepicker" tabindex="4" size="40" maxlength="30" /></div>
					</div>
					<div class="col-sm-12 " id="idCampDonante_IndEstadocivil">
						<label for="edicion_donanteDto.intIndEstadocivil" class="form-label">Estado civil:</label>
						<div>
							<s:select name="edicion_donanteDto.intIndEstadocivil" cssClass="form-control " tabindex="5" list="#session.listCatalogoEstadoCivi" headerKey="" headerValue="-Seleccionar-" listValue="strDesIndicador" listKey="srlIdCatalogo"></s:select>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="row form-row">
					<div class="col-sm-12 " id="idCampDonante_IndSexo">
						<label for="edicion_donanteDto.intIndSexo" class="form-label">Sexo:</label>
						<div>
							<s:select name="edicion_donanteDto.intIndSexo" cssClass="form-control " tabindex="6" list="#session.listCatalogoSexo" headerKey="" headerValue="-Seleccionar-" listValue="strDesIndicador" listKey="srlIdCatalogo"></s:select>
						</div>
					</div>
					<div class="col-sm-12 " id="idCampDonante_DesGradoinstruc">
						<label for="edicion_donanteDto.intDesGradoinstruc" class="form-label">Grado de instrucci&oacute;n:</label>
						<div>
							<s:select name="edicion_donanteDto.intDesGradoinstruc" cssClass="form-control " tabindex="7" list="#session.listCatalogoGradoInstruccion" headerKey="" headerValue="-Seleccionar-" listValue="strDesIndicador" listKey="srlIdCatalogo"></s:select>
						</div>
					</div>
					<div class="col-sm-12 " id="idCampDonante_DesOcupacion">
               			<label for="edicion_donanteDto.strDesOcupacion" class="form-label">Ocupaci&oacute;n:</label>
              				<s:textfield name="edicion_donanteDto.strDesOcupacion" cssClass="form-control " tabindex="8" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-12 " id="idCampUsuario_NomUsuario">
               			<label for="edicion_usuarioDto.strNomUsuario" class="form-label">Usuario:</label>
              				<s:textfield name="edicion_usuarioDto.strNomUsuario" cssClass="form-control " tabindex="2" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-12 " id="idCampUsuario_ClvUsuario">
               			<label for="edicion_usuarioDto.strClvUsuario" class="form-label">Password:</label>
              				<s:password name="edicion_usuarioDto.strClvUsuario" cssClass="form-control " tabindex="3" size="40" maxlength="15"  />
					</div>
					<div class="col-sm-12 " id="idCampUsuario_ClvUsuario2">
               			<label for="edicion_usuarioDto.strClvUsuario" class="form-label">Repetir password:</label>
              				<s:password name="edicion_usuarioDto.strClvUsuario2" cssClass="form-control " tabindex="3" size="40" maxlength="15"  />
					</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="row form-row">
					<div class="col-sm-12 " id="idCampDonante_IndDonante">
						<label for="edicion_donanteDto.intIndDonante" class="form-label">Es donante nuevo?:</label>
						<div>
							<s:select name="edicion_donanteDto.intIndDonante" cssClass="form-control " tabindex="9" list="#session.listCatalogoSiNo" headerKey="" headerValue="-Seleccionar-" listValue="strDesIndicador" listKey="srlIdCatalogo"></s:select>
						</div>
					</div>
					<div class="col-sm-12 " id="idCampDonante_NumCelular">
               			<label for="edicion_donanteDto.strNumCelular" class="form-label">Celular:</label>
              				<s:textfield name="edicion_donanteDto.strNumCelular" cssClass="form-control " tabindex="10" size="40" maxlength="12"  />
					</div>
					<div class="col-sm-12 " id="idCampDonante_NumCelular2">
               			<label for="edicion_donanteDto.strNumCelular2" class="form-label">Celular 2:</label>
              				<s:textfield name="edicion_donanteDto.strNumCelular2" cssClass="form-control " tabindex="11" size="40" maxlength="12"  />
					</div>
					<div class="col-sm-12 " id="idCampDonante_NumTelefono">
               			<label for="edicion_donanteDto.strNumTelefono" class="form-label">Tel&eacute;fono:</label>
              				<s:textfield name="edicion_donanteDto.strNumTelefono" cssClass="form-control " tabindex="12" size="40" maxlength="12"  />
					</div>
					<div class="col-sm-12 " id="idCampDonante_DesCorreo">
               			<label for="edicion_donanteDto.strDesCorreo" class="form-label">Correo electr&oacute;nico:</label>
              				<s:textfield name="edicion_donanteDto.strDesCorreo" cssClass="form-control " tabindex="13" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-12 " id="idCampDonante_DesDireccion">
               			<label for="edicion_donanteDto.strDesDireccion" class="form-label">Direcci&oacute;n:</label>
              				<s:textfield name="edicion_donanteDto.strDesDireccion" cssClass="form-control " tabindex="14" size="40" maxlength="300"  />
					</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="row form-row">
					<div class="col-sm-12 " id="idCampDonante_intIdDepartamento">
               			<label for="edicion_donanteDto.intIdDepartamento" class="form-label">Departamento:</label>
							<s:select name="edicion_donanteDto.intIdDepartamento" cssClass="form-control " tabindex="9" list="#session.listUbigeoDepartamento" headerKey="" headerValue="-Seleccionar-" listValue="strDesUbigeo" listKey="intIdDepartamento"></s:select>
					</div>
					<div class="col-sm-12 " id="idCampDonante_intIdProvincia">
               			<label for="edicion_donanteDto.intIdProvincia" class="form-label">Provincia:</label>
							<s:select name="edicion_donanteDto.intIdProvincia" cssClass="form-control " tabindex="9" list="#session.listUbigeoProvincia" headerKey="" headerValue="-Seleccionar-" listValue="strDesUbigeo" listKey="intIdProvincia"></s:select>
					</div>
					<div class="col-sm-12 " id="idCampDonante_Distrito">
               			<label for="edicion_donanteDto.intIdUbigeo" class="form-label">Distrito:</label>
							<s:select name="edicion_donanteDto.intIdUbigeo" cssClass="form-control " tabindex="9" list="#session.listUbigeoDistrito" headerKey="" headerValue="-Seleccionar-" listValue="strDesUbigeo" listKey="srlIdUbigeo"></s:select>
					</div>
					
				</div>
				
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12 " id="idCampDonante_Ubicacion" style="height: 400px;">
             			<label class="form-label">Ubicaci&oacute;n: ubica en el mapa tu dirección para mostrarte los centros de salud mas cercanos a tu dirección.</label>
				<div id="map" style="height: 100%;"></div>
			</div>
		</div>
<!-- 		<div class="row form-row"> -->
<!-- 			<div class="col-sm-12 " id="idCampAllegados_Allegados"> -->
<!-- 				<div class="row form-row"> -->
<!-- 					<div class="col-sm-12 "> -->
<!-- 						<label class="form-label">Allegados:</label> -->
<!-- 						<button class="btn btn-primary" type="button" id="idBtnNuevoAllegados" tabindex="10"><i class="fa fa-file-o"></i> Nuevo </button> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 				<div class="row form-row"> -->
<!-- 					<div class="col-sm-12 "> -->
<!-- 						<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered table-hover" id="tableDefaultAllegados" > -->
<!-- 							<thead>      -->
<!-- 								<tr> -->
<!-- 									<th width="20%">Nom Nombre</th> -->
<!-- 									<th width="20%">Nom Appaterno</th> -->
<!-- 									<th width="20%">Nom Apmaterno</th> -->
<!-- 									<th width="20%">Num Celular</th> -->
<!-- 									<th width="20%">Num Telefono</th> -->
<!-- 									<th width="20%">Des Correoelectronico</th> -->
<!-- 									<th width="20%">Num Dni</th> -->
<!-- 									<th style="width: 6%;">Detalle</th> -->
<!-- 								</tr> -->
<!-- 							</thead> -->
<!-- 						</table> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 			</div> -->
<!-- 		</div> -->
		
		
		<div class="row">
			<div class="col-sm-12">
				<div class="pull-right">
					<br>
					<button class="btn btn-primary" type="button" id="idBtnGuardarDonante" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
					<button class="btn btn-default" type="button" id="idBtnVolverDonante" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
				</div>
			</div>
		</div>
		</br>
	</form>

<!-- 	<div class="modal fade allegados-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabelx1"> -->
<!-- 		<div class="modal-dialog modal-lg"> -->
<!-- 			<div class="modal-content"> -->
<!-- 				<div class="modal-header"> -->
<%-- 					<!--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>--> --%>
<%-- 					<div class="modal-title" id="idDivEditarTituloAllegados"><h3><strong>Allegados</strong></h3></div> --%>
<!-- 				</div> -->
<!-- 				<div class="modal-body" id="idDivEditarAllegados"> -->
<!-- 				</div> -->
<!-- 			</div> -->
<!-- 		</div> -->
<!-- 	</div> -->

	<s:form action="" name="form" id="form" namespace="/">
		<s:hidden name="buscar_seleccion_id" id="buscar_seleccion_id" />
	</s:form>
</div>

	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA6tsJfr_VUkdPoJWxKtWWS_5WcNw95Oow&signed_in=true&callback=initMap" ></script>
