<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
				
	<form class="" method="POST" id="idFormEditarClubDonanteCampania" name="formEditarClubDonanteCampania" novalidate="novalidate">
		<div class="row">
			<div class="col-sm-12">
				
				<s:hidden name="edicion_clubDonanteCampaniaDto.intIdCampania"></s:hidden>
				<s:hidden name="edicion_clubDonanteCampaniaDto.intIdDonante"></s:hidden>
				<s:hidden name="edicion_clubDonanteCampaniaDto.intIndEstado"></s:hidden>
				
<!-- 	private String strNumDni; -->
<!-- 	private String strNomNombre; -->
<!-- 	private String strNomAppaterno; -->
<!-- 	private String strNomApmaterno; -->
<!-- 	private String strDesCorreo; -->
	
				<div class="row form-row">
					<div class="col-sm-12 " id="idCampClubDonanteCampania_strNumDni">
               			<label for="edicion_clubDonanteCampaniaDto.strNumDni" class="form-label">DNI</label>
              				<s:textfield name="edicion_clubDonanteCampaniaDto.strNumDni" cssClass="form-control " tabindex="1" size="40" disabled="true"/>
					</div>
				</div>
				<div class="row form-row">
					<div class="col-sm-4 " id="idCampClubDonanteCampania_strNomNombre">
               			<label for="edicion_clubDonanteCampaniaDto.strNomNombre" class="form-label">Nombre completo</label>
              				<s:textfield name="edicion_clubDonanteCampaniaDto.strNomNombre" cssClass="form-control " tabindex="2" size="40" disabled="true"/>
					</div>
					<div class="col-sm-4 " id="idCampClubDonanteCampania_strNomAppaterno">
               			<label for="edicion_clubDonanteCampaniaDto.strNomAppaterno" class="form-label">Apellido paterno</label>
              				<s:textfield name="edicion_clubDonanteCampaniaDto.strNomAppaterno" cssClass="form-control " tabindex="3" size="40" disabled="true"/>
					</div>
					<div class="col-sm-4 " id="idCampClubDonanteCampania_strNomApmaterno">
               			<label for="edicion_clubDonanteCampaniaDto.strNomApmaterno" class="form-label">Apellido materno</label>
              				<s:textfield name="edicion_clubDonanteCampaniaDto.strNomApmaterno" cssClass="form-control " tabindex="3" size="40" disabled="true"/>
					</div>
				</div>
				<div class="row form-row">
					<div class="col-sm-4 " id="idCampClubDonanteCampania_strDesCampania">
               			<label for="edicion_clubDonanteCampaniaDto.strDesCampania" class="form-label">Descripcion campa&ntilde;a</label>
              				<s:textfield name="edicion_clubDonanteCampaniaDto.strDesCampania" cssClass="form-control " tabindex="2" size="40" disabled="true"/>
					</div>
					<div class="col-sm-4 " id="idCampClubDonanteCampania_intNumDescuento">
               			<label for="edicion_clubDonanteCampaniaDto.intNumDescuento" class="form-label">Descuento</label>
              				<s:textfield name="edicion_clubDonanteCampaniaDto.intNumDescuento" cssClass="form-control " tabindex="3" size="40" disabled="true"/>
					</div>
				</div>
				<div class="row form-row">
					<div class="col-sm-4 " id="idCampClubDonanteCampania_DesDocumento">
               			<label for="edicion_clubDonanteCampaniaDto.strDesDocumento" class="form-label">Documento</label>
              				<s:textfield name="edicion_clubDonanteCampaniaDto.strDesDocumento" cssClass="form-control " tabindex="1" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-4 " id="idCampClubDonanteCampania_NumPrecio">
               			<label for="edicion_clubDonanteCampaniaDto.dblNumPrecio" class="form-label">Precio</label>
              				<s:textfield name="edicion_clubDonanteCampaniaDto.dblNumPrecio" cssClass="form-control " tabindex="2" size="40" maxlength="30"  />
					</div>
					<div class="col-sm-4 " id="idCampClubDonanteCampania_NumPrecioPanpania">
               			<label for="edicion_clubDonanteCampaniaDto.dblNumPrecioPanpania" class="form-label">Precio Panpa&ntilde;a</label>
              				<s:textfield name="edicion_clubDonanteCampaniaDto.dblNumPrecioPanpania" cssClass="form-control " tabindex="3" size="40" maxlength="30"  />
					</div>
				</div>
				<div class="row form-row">
					<div class="col-sm-12 " id="idCampClubDonanteCampania_DesComentario">
               			<label for="edicion_clubDonanteCampaniaDto.strDesComentario" class="form-label">Comentario</label>
              				<s:textfield name="edicion_clubDonanteCampaniaDto.strDesComentario" cssClass="form-control " tabindex="4" size="40" maxlength="500"  />
					</div>
				</div>
			
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-12">
				<div class="pull-right">
					<button class="btn btn-primary" type="button" id="idBtnGuardarClubDonanteCampania" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
					<button class="btn btn-default" type="button" id="idBtnVolverClubDonanteCampania" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
				</div>
			</div>
		</div>
		</br>
	</form>
	
</div>
