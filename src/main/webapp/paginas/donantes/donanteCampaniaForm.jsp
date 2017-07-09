<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	
	<form class="" method="POST" id="idFormEditarDonanteCampania" name="formEditarDonanteCampania" novalidate="novalidate">
		<div class="row">
			<div class="col-sm-12">
				
				<s:hidden name="edicion_donanteCampaniaDto.intIdCampania"></s:hidden>
				<s:hidden name="edicion_donanteCampaniaDto.intIdDonante"></s:hidden>
				<s:hidden name="edicion_donanteCampaniaDto.intIndEstado"></s:hidden>
				<div class="row form-row">
					<div class="col-sm-4 " id="idCampDonanteCampania_DesDocumento">
               			<label for="edicion_donanteCampaniaDto.strDesDocumento" class="form-label">Documento</label>
              				<s:textfield name="edicion_donanteCampaniaDto.strDesDocumento" cssClass="form-control " tabindex="1" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-4 " id="idCampDonanteCampania_NumPrecio">
               			<label for="edicion_donanteCampaniaDto.dblNumPrecio" class="form-label">Precio</label>
              				<s:textfield name="edicion_donanteCampaniaDto.dblNumPrecio" cssClass="form-control " tabindex="2" size="40" maxlength="30"  />
					</div>
					<div class="col-sm-4 " id="idCampDonanteCampania_NumPrecioPanpania">
               			<label for="edicion_donanteCampaniaDto.dblNumPrecioPanpania" class="form-label">Precio Panpania</label>
              				<s:textfield name="edicion_donanteCampaniaDto.dblNumPrecioPanpania" cssClass="form-control " tabindex="3" size="40" maxlength="30"  />
					</div>
				</div>
				<div class="row form-row">
					<div class="col-sm-4 " id="idCampDonanteCampania_DesComentario">
               			<label for="edicion_donanteCampaniaDto.strDesComentario" class="form-label">Comentario</label>
              				<s:textfield name="edicion_donanteCampaniaDto.strDesComentario" cssClass="form-control " tabindex="4" size="40" maxlength="500"  />
					</div>
				</div>
				
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-12">
				<div class="pull-right">
					<button class="btn btn-primary" type="button" id="idBtnGuardarDonanteCampania" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
					<button class="btn btn-default" type="button" id="idBtnVolverDonanteCampania" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
				</div>
			</div>
		</div>
		</br>
	</form>
	
</div>

