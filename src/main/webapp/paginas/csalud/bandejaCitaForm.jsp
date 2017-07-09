<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	
				
				
					<form class="" method="POST" id="idFormEditarBandejaCita" name="formEditarBandejaCita" novalidate="novalidate">
						<div class="row">
							<div class="col-sm-12">
							
							
							
								<s:hidden name="edicion_bandejaCitaDto.srlIdCita"></s:hidden>
								<s:hidden name="edicion_bandejaCitaDto.intIdSede"></s:hidden>
								<s:hidden name="edicion_bandejaCitaDto.intIdDonante"></s:hidden>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampBandejaCita_FecCita">
										<label for="edicion_bandejaCitaDto.dteFecCita" class="form-label">Fec Cita:</label>
										<div><s:textfield name="edicion_bandejaCitaDto.dteFecCitaFecha" cssClass="form-control datepicker" tabindex="1" size="40" maxlength="30" /></div>
									</div>
									<div class="col-sm-4 " id="idCampBandejaCita_HorCita">
			                			<label for="edicion_bandejaCitaDto.strHorCita" class="form-label">Hor Cita</label>
		                				<s:textfield name="edicion_bandejaCitaDto.strHorCita" cssClass="form-control " tabindex="2" size="40" maxlength="6"  />
									</div>
									</div>
							
							</div>
						</div>
						
						
						<div class="row">
							<div class="col-sm-12">
								<div class="pull-right">
									<button class="btn btn-primary" type="button" id="idBtnGuardarBandejaCita" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
									<button class="btn btn-default" type="button" id="idBtnVolverBandejaCita" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
								</div>
							</div>
						</div>
						</br>
					</form>

</div>

