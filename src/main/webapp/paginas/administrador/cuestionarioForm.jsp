<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	
	<form class="" method="POST" id="idFormEditarCuestionario" name="formEditarCuestionario" novalidate="novalidate">
		<div class="row">
			<div class="col-sm-12">
			
				<s:hidden name="edicion_cuestionarioDto.srlIdCuestionario"></s:hidden>
				<div class="row form-row">
					<div class="col-sm-4 " id="idCampCuestionario_DesCuestionario">
               			<label for="edicion_cuestionarioDto.strDesCuestionario" class="form-label">Pregunta:</label>
              				<s:textfield name="edicion_cuestionarioDto.strDesCuestionario" cssClass="form-control " tabindex="1" size="40" maxlength="300"  />
					</div>
					<div class="col-sm-4 " id="idCampCuestionario_IndTipo">
						<label for="edicion_cuestionarioDto.intIndTipo" class="form-label">Tipo:</label>
						<div>
							<s:select name="edicion_cuestionarioDto.intIndTipo" cssClass="form-control " tabindex="2" list="#session.listCatalogo" headerKey="" headerValue="-Seleccionar-" listValue="strDesIndicador" listKey="srlIdCatalogo"></s:select>
						</div>
					</div>
				</div>
			
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-12">
				<div class="pull-right">
					<button class="btn btn-primary" type="button" id="idBtnGuardarCuestionario" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
					<button class="btn btn-default" type="button" id="idBtnVolverCuestionario" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
				</div>
			</div>
		</div>
		</br>
	</form>
	
</div>

