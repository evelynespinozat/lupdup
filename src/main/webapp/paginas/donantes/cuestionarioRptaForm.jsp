<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	
				
				
					<form class="" method="POST" id="idFormEditarCuestionarioRpta" name="formEditarCuestionarioRpta" novalidate="novalidate">
						<div class="row">
							<div class="col-sm-12">
							
							
							
								<s:hidden name="edicion_cuestionarioRptaDto.srlIdDonantecuestionariorpta"></s:hidden>
								<s:hidden name="edicion_cuestionarioRptaDto.intIdCuestionario"></s:hidden>
								<s:hidden name="edicion_cuestionarioRptaDto.intIdDonante"></s:hidden>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampCuestionarioRpta_EsCheck">
										<label for="edicion_cuestionarioRptaDto.strEsCheck" class="form-label">Es Check:</label>
										<div><s:checkbox  name="edicion_cuestionarioRptaDto.strEsCheckBoolean" tabindex="1" theme="simple" /></div>
									</div>
									<div class="col-sm-4 " id="idCampCuestionarioRpta_DesRespuesta">
			                			<label for="edicion_cuestionarioRptaDto.strDesRespuesta" class="form-label">Des Respuesta</label>
		                				<s:textfield name="edicion_cuestionarioRptaDto.strDesRespuesta" cssClass="form-control " tabindex="2" size="40" maxlength="500"  />
									</div>
									</div>
							
							</div>
						</div>
						
						
						<div class="row">
							<div class="col-sm-12">
								<div class="pull-right">
									<button class="btn btn-primary" type="button" id="idBtnGuardarCuestionarioRpta" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
									<button class="btn btn-default" type="button" id="idBtnVolverCuestionarioRpta" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
								</div>
							</div>
						</div>
						</br>
					</form>

</div>

