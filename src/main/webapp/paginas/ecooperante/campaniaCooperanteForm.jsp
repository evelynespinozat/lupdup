<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	
				
				
					<form class="" method="POST" id="idFormEditarCampaniaCooperante" name="formEditarCampaniaCooperante" novalidate="novalidate" enctype="multipart/form-data">
						<div class="row">
							<div class="col-sm-12">
							
							
							
								<s:hidden name="edicion_campaniaCooperanteDto.srlIdCampania"></s:hidden>
								<s:hidden name="edicion_campaniaCooperanteDto.intIdEntidadcolaboradora"></s:hidden>
								<br>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampCampaniaCooperante_DesCampania">
			                			<label for="edicion_campaniaCooperanteDto.strDesCampania" class="form-label">Campania</label>
		                				<s:textfield name="edicion_campaniaCooperanteDto.strDesCampania" cssClass="form-control " tabindex="1" size="40" maxlength="300"  />
									</div>
									<div class="col-sm-4 " id="idCampCampaniaCooperante_CntAsignada">
			                			<label for="edicion_campaniaCooperanteDto.intCntAsignada" class="form-label">Cantidad Asignada</label>
		                				<s:textfield name="edicion_campaniaCooperanteDto.intCntAsignada" cssClass="form-control " tabindex="2" size="40" maxlength="30"  />
									</div>
									<div class="col-sm-4 " id="idCampCampaniaCooperante_CntDisponible">
			                			<label for="edicion_campaniaCooperanteDto.intCntDisponible" class="form-label">Cantidad Disponible</label>
		                				<s:textfield name="edicion_campaniaCooperanteDto.intCntDisponible" cssClass="form-control " tabindex="3" size="40" maxlength="30"  />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampCampaniaCooperante_FecInicio">
										<label for="edicion_campaniaCooperanteDto.dteFecInicio" class="form-label">Fecha Inicio:</label>
										<div><s:textfield name="edicion_campaniaCooperanteDto.dteFecInicioFecha" cssClass="form-control datepicker" tabindex="4" size="40" maxlength="30" /></div>
									</div>
									<div class="col-sm-4 " id="idCampCampaniaCooperante_FecFin">
										<label for="edicion_campaniaCooperanteDto.dteFecFin" class="form-label">Fecha Fin:</label>
										<div><s:textfield name="edicion_campaniaCooperanteDto.dteFecFinFecha" cssClass="form-control datepicker" tabindex="5" size="40" maxlength="30" /></div>
									</div>
									<div class="col-sm-4 " id="idCampCampaniaCooperante_IndActivo">
										<label for="edicion_campaniaCooperanteDto.intIndActivo" class="form-label">Activo:</label>
										<div>
											
											<s:select name="edicion_campaniaCooperanteDto.intIndActivo" cssClass="form-control " tabindex="6" list="#session.listCatalogo" headerKey="" headerValue="-Seleccionar-" listValue="strDesIndicador" listKey="srlIdCatalogo"></s:select>
										</div>
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampCampaniaCooperante_NumDescuento">
			                			<label for="edicion_campaniaCooperanteDto.intNumDescuento" class="form-label">Descuento</label>
		                				<s:textfield name="edicion_campaniaCooperanteDto.intNumDescuento" cssClass="form-control " tabindex="7" size="40" maxlength="30"  />
									</div>
									<div class="col-sm-4 " id="idCampCampaniaCooperante_DesRegalo">
			                			<label for="edicion_campaniaCooperanteDto.strDesRegalo" class="form-label">Descripci&oacute;n Regalo</label>
		                				<s:textfield name="edicion_campaniaCooperanteDto.strDesRegalo" cssClass="form-control " tabindex="8" size="40" maxlength="300"  />
									</div>
									<div class="col-sm-4 " id="idCampCampaniaCooperante_CntMinpuntos">
			                			<label for="edicion_campaniaCooperanteDto.intCntMinpuntos" class="form-label">Cantidad puntos minimo</label>
		                				<s:textfield name="edicion_campaniaCooperanteDto.intCntMinpuntos" cssClass="form-control " tabindex="9" size="40" maxlength="30"  />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampCampaniaCooperante_CntGusta">
			                			<label for="edicion_campaniaCooperanteDto.intCntGusta" class="form-label">Cantidad de Me Gusta</label>
		                				<s:textfield name="edicion_campaniaCooperanteDto.intCntGusta" cssClass="form-control " tabindex="10" size="40" maxlength="30"  />
									</div>
									<div class="col-sm-4 " id="idCampCampaniaCooperante_IdImagen">
										<label for="edicion_campaniaCooperanteDto.intIdImagen" class="form-label">Imagen:</label>
										<div>
											<s:hidden name="edicion_campaniaCooperanteDto.intIdImagen"></s:hidden>
											<s:file name="edicion_campania_cooperante_intIdImagen" cssClass="form-control " tabindex="11" size="40"/>
										</div>
									</div>
									</div>
							
							</div>
						</div>
						
						
						<div class="row">
							<div class="col-sm-12">
								<div class="pull-right">
									<button class="btn btn-primary" type="button" id="idBtnGuardarCampaniaCooperante" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
									<button class="btn btn-default" type="button" id="idBtnVolverCampaniaCooperante" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
								</div>
							</div>
						</div>
						</br>
					</form>

</div>

