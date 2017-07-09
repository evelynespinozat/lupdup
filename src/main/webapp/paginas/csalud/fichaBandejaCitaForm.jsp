<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	<div class="row">
		<div class="col-sm-12">
			<form class="" method="POST" id="idFormEditarFichaResultados" name="formEditarFichaResultados" novalidate="novalidate" enctype="multipart/form-data">
				<div class="row">
					<div class="col-sm-12">
						<s:hidden name="edicion_fichaResultadosDto.srlIdFicha"></s:hidden>
						<s:hidden name="edicion_fichaResultadosDto.intIdDonante"></s:hidden>
						<s:hidden name="edicion_fichaResultadosDto.intIdCentrosalud"></s:hidden>
						<s:hidden name="edicion_fichaResultadosDto.intIndEstado"></s:hidden>
						<s:hidden name="edicion_fichaResultadosDto.intIdImagen"/>
						<s:hidden name="edicion_fichaResultadosDto.intIdCita"/>
						
						<s:hidden name="edicion_detalleFichaDto.srlIdDetalleficha"></s:hidden>
						<s:hidden name="edicion_detalleFichaDto.intIdFicha"></s:hidden>
						
						<div class="row form-row">
							<div class="col-sm-3 " id="idCampFichaResultados_FecAnalisis">
								<label for="edicion_fichaResultadosDto.dteFecAnalisis" class="form-label">Fecha Analisis:</label>
								<div><s:textfield name="edicion_fichaResultadosDto.dteFecAnalisisFecha" cssClass="form-control datepicker" tabindex="4"  maxlength="30" /></div>
							</div>
							<div class="col-sm-3 " id="idCampFichaResultados_HorAnalisis">
		               			<label for="edicion_fichaResultadosDto.strHorAnalisis" class="form-label">Hora Analisis</label>
									<s:select name="edicion_fichaResultadosDto.strHorAnalisis" cssClass="form-control " tabindex="2" list="#session.listHora" headerKey="" headerValue="-Seleccionar-" listKey="id" listValue="desc"></s:select>
							</div>
							<div class="col-sm-3 " id="idCampFichaResultados_NumUnidades">
		               			<label for="edicion_fichaResultadosDto.intNumUnidades" class="form-label">Unidades</label>
		              				<s:textfield name="edicion_fichaResultadosDto.intNumUnidades" cssClass="form-control " tabindex="4"  maxlength="30"  />
							</div>
						</div>
						
						<div class="row form-row">
							<div class="col-sm-3 " id="idCampDetalleFicha_NumHematies">
		               			<label for="edicion_detalleFichaDto.intNumHematies" class="form-label">Hematies</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumHematies" cssClass="form-control " tabindex="5"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumHemoglobina">
		               			<label for="edicion_detalleFichaDto.intNumHemoglobina" class="form-label">Hemoglobina</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumHemoglobina" cssClass="form-control " tabindex="6"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumHematocrito">
		               			<label for="edicion_detalleFichaDto.intNumHematocrito" class="form-label">Hematocrito</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumHematocrito" cssClass="form-control " tabindex="7"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumVcm">
		               			<label for="edicion_detalleFichaDto.intNumVcm" class="form-label">Vcm</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumVcm" cssClass="form-control " tabindex="8"  maxlength="30"  />
							</div>
						</div>
						<div class="row form-row">
							<div class="col-sm-3 " id="idCampDetalleFicha_NumChm">
		               			<label for="edicion_detalleFichaDto.intNumChm" class="form-label">Chm</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumChm" cssClass="form-control " tabindex="5"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumLinfocitos">
		               			<label for="edicion_detalleFichaDto.intNumLinfocitos" class="form-label">Linfocitos</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumLinfocitos" cssClass="form-control " tabindex="6"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumPlaquetas">
		               			<label for="edicion_detalleFichaDto.intNumPlaquetas" class="form-label">Plaquetas</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumPlaquetas" cssClass="form-control " tabindex="7"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumLeucocitos">
		               			<label for="edicion_detalleFichaDto.intNumLeucocitos" class="form-label">Leucocitos</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumLeucocitos" cssClass="form-control " tabindex="8"  maxlength="30"  />
							</div>
						</div>
						<div class="row form-row">
							<div class="col-sm-3 " id="idCampDetalleFicha_NumNeutrofilos">
		               			<label for="edicion_detalleFichaDto.intNumNeutrofilos" class="form-label">Neutrofilos</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumNeutrofilos" cssClass="form-control " tabindex="5"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumEosinofilos">
		               			<label for="edicion_detalleFichaDto.intNumEosinofilos" class="form-label">Eosinofilos</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumEosinofilos" cssClass="form-control " tabindex="6"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumVsg">
		               			<label for="edicion_detalleFichaDto.intNumVsg" class="form-label">Vsg</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumVsg" cssClass="form-control " tabindex="7"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumGlucosa">
		               			<label for="edicion_detalleFichaDto.intNumGlucosa" class="form-label">Glucosa</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumGlucosa" cssClass="form-control " tabindex="8"  maxlength="30"  />
							</div>
						</div>
						<div class="row form-row">
							<div class="col-sm-3 " id="idCampDetalleFicha_NumUrea">
		               			<label for="edicion_detalleFichaDto.intNumUrea" class="form-label">Urea</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumUrea" cssClass="form-control " tabindex="5"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumAcisourico">
		               			<label for="edicion_detalleFichaDto.intNumAcisourico" class="form-label">Acisourico</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumAcisourico" cssClass="form-control " tabindex="6"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumCreatinina">
		               			<label for="edicion_detalleFichaDto.intNumCreatinina" class="form-label">Creatinina</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumCreatinina" cssClass="form-control " tabindex="7"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumColesterol">
		               			<label for="edicion_detalleFichaDto.intNumColesterol" class="form-label">Colesterol</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumColesterol" cssClass="form-control " tabindex="8"  maxlength="30"  />
							</div>
						</div>
						<div class="row form-row">
							<div class="col-sm-3 " id="idCampDetalleFicha_NumHdl">
		               			<label for="edicion_detalleFichaDto.intNumHdl" class="form-label">Hdl</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumHdl" cssClass="form-control " tabindex="5"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumLdl">
		               			<label for="edicion_detalleFichaDto.intNumLdl" class="form-label">Ldl</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumLdl" cssClass="form-control " tabindex="6"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumTrigliceridos">
		               			<label for="edicion_detalleFichaDto.intNumTrigliceridos" class="form-label">Trigliceridos</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumTrigliceridos" cssClass="form-control " tabindex="7"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumTransaminasaGot">
		               			<label for="edicion_detalleFichaDto.intNumTransaminasaGot" class="form-label">Transaminasa Got</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumTransaminasaGot" cssClass="form-control " tabindex="8"  maxlength="30"  />
							</div>
						</div>
						<div class="row form-row">
							<div class="col-sm-3 " id="idCampDetalleFicha_NumTransaminasaGpt">
		               			<label for="edicion_detalleFichaDto.intNumTransaminasaGpt" class="form-label">Transaminasa GPT</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumTransaminasaGpt" cssClass="form-control " tabindex="5"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumTransaminasaGgt">
		               			<label for="edicion_detalleFichaDto.intNumTransaminasaGgt" class="form-label">Transaminasa GGT</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumTransaminasaGgt" cssClass="form-control " tabindex="6"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumFosfatasaAlcalina">
		               			<label for="edicion_detalleFichaDto.intNumFosfatasaAlcalina" class="form-label">Fosfatasa Alcalina</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumFosfatasaAlcalina" cssClass="form-control " tabindex="7"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumCalcio">
		               			<label for="edicion_detalleFichaDto.intNumCalcio" class="form-label">Calcio</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumCalcio" cssClass="form-control " tabindex="8"  maxlength="30"  />
							</div>
						</div>
						<div class="row form-row">
							<div class="col-sm-3 " id="idCampDetalleFicha_NumHierro">
		               			<label for="edicion_detalleFichaDto.intNumHierro" class="form-label">Hierro</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumHierro" cssClass="form-control " tabindex="5"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumPotacio">
		               			<label for="edicion_detalleFichaDto.intNumPotacio" class="form-label">Potacio</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumPotacio" cssClass="form-control " tabindex="6"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumSodio">
		               			<label for="edicion_detalleFichaDto.intNumSodio" class="form-label">Sodio</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumSodio" cssClass="form-control " tabindex="7"  maxlength="30"  />
							</div>
							<div class="col-sm-3 " id="idCampDetalleFicha_NumBilirrubina">
		               			<label for="edicion_detalleFichaDto.intNumBilirrubina" class="form-label">Bilirrubina</label>
		              				<s:textfield name="edicion_detalleFichaDto.intNumBilirrubina" cssClass="form-control " tabindex="8"  maxlength="30"  />
							</div>
						</div>
						
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="pull-right">
							<button class="btn btn-primary" type="button" id="idBtnGuardarFichaResultados" tabindex="9"><i class="fa fa fa-save"></i> Guardar </button>
							<button class="btn btn-default" type="button" id="idBtnVolverFichaResultados" tabindex="9"><i class="fa fa fa-power-off"></i> Salir </button>
						</div>
					</div>
				</div>
				</br>
			</form>
			
			<s:form action="" name="form" id="form" namespace="/">
				<s:hidden name="buscar_seleccion_id" id="buscar_seleccion_id" />
			</s:form>
		</div>
	</div>
</div>
