<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	
				
				
					<form class="" method="POST" id="idFormEditarImagen" name="formEditarImagen" novalidate="novalidate">
						<div class="row">
							<div class="col-sm-12">
							
							
							
								<s:hidden name="edicion_imagenDto.srlIdImagen"></s:hidden>
								<s:hidden name="edicion_imagenDto.strNomExtension"></s:hidden>
								<s:hidden name="edicion_imagenDto.lngNomFechaUltimaMod"></s:hidden>
								<s:hidden name="edicion_imagenDto.strNomHash"></s:hidden>
								<s:hidden name="edicion_imagenDto.strNomCodigo"></s:hidden>
								<s:hidden name="edicion_imagenDto.lngNumTamanio"></s:hidden>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampImagen_NomDescripcion">
			                			<label for="edicion_imagenDto.strNomDescripcion" class="form-label">Descripci&oacute;n</label>
		                				<s:textfield name="edicion_imagenDto.strNomDescripcion" cssClass="form-control " tabindex="1" size="40" maxlength="300"  />
									</div>
									</div>
							
							</div>
						</div>
						
						
						<div class="row">
							<div class="col-sm-12">
								<div class="pull-right">
									<button class="btn btn-primary" type="button" id="idBtnGuardarImagen" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
									<button class="btn btn-default" type="button" id="idBtnVolverImagen" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
								</div>
							</div>
						</div>
						</br>
					</form>

</div>

