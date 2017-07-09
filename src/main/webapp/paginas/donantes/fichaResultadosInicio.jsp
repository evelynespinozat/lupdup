<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	<div class="row">
		<div class="col-sm-12">
			<div class="row ">
				<div class="col-sm-12">
					<h4 class="semi-bold"><span class="semi-bold">Resultados del examen de sangre</span><br>
					</h4>
				</div>
			</div>
		</div>
	<div class="row">
		<div class="col-sm-12">
			<form class="" method="POST" id="idFormEditarFichaResultados" name="formEditarFichaResultados" novalidate="novalidate" enctype="multipart/form-data">
				<div class="row">
					<div class="col-sm-12">
						<s:hidden name="fichaResultados.srlIdFicha"></s:hidden>
						<s:hidden name="fichaResultados.intIdDonante"></s:hidden>
						<s:hidden name="fichaResultados.intIdCentrosalud"></s:hidden>
						<s:hidden name="fichaResultados.intIndEstado"></s:hidden>
						<s:hidden name="fichaResultados.intIdImagen"/>
						<s:hidden name="detalleFicha.srlIdDetalleficha"></s:hidden>
						<s:hidden name="detalleFicha.intIdFicha"></s:hidden>
						
						<div class="row form-row">
							<div class="col-sm-2 " id="idCampFichaResultados_FecAnalisis">
								<label for="fichaResultados.dteFecAnalisis" class="form-label">Fecha de an&aacute;lisis:</label>
								<div><s:textfield name="fichaResultados.dteFecAnalisisFecha" cssClass="form-control datepicker" tabindex="2" disabled="true" maxlength="30" /></div>
							</div>
							<div class="col-sm-2 " id="idCampFichaResultados_HorAnalisis">
		               			<label for="fichaResultados.strHorAnalisis" class="form-label">Hora an&aacute;lisis</label>
		              				<s:textfield name="fichaResultados.strHorAnalisis" cssClass="form-control " tabindex="3" disabled="true" maxlength="6"  />
							</div>
							<div class="col-sm-2 " id="idCampFichaResultados_NumUnidades">
		               			<label for="fichaResultados.intNumUnidades" class="form-label">Unidades</label>
		              				<s:textfield name="fichaResultados.intNumUnidades" cssClass="form-control " tabindex="4" disabled="true" maxlength="30"  />
							</div>
						</div>
						
						
						
						<div class="row form-row">
							<div class="col-sm-2 " id="idCampDetalleFicha_NumHematies">
		               			<label for="detalleFicha.intNumHematies" class="form-label">Hematies</label>
		              				<s:textfield name="detalleFicha.intNumHematies" cssClass="form-control " tabindex="1" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumHemoglobina">
		               			<label for="detalleFicha.intNumHemoglobina" class="form-label">Hemoglobina</label>
		              				<s:textfield name="detalleFicha.intNumHemoglobina" cssClass="form-control " tabindex="2" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumHematocrito">
		               			<label for="detalleFicha.intNumHematocrito" class="form-label">Hematocrito</label>
		              				<s:textfield name="detalleFicha.intNumHematocrito" cssClass="form-control " tabindex="3" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumVcm">
		               			<label for="detalleFicha.intNumVcm" class="form-label">Vcm</label>
		              				<s:textfield name="detalleFicha.intNumVcm" cssClass="form-control " tabindex="4" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumChm">
		               			<label for="detalleFicha.intNumChm" class="form-label">Chm</label>
		              				<s:textfield name="detalleFicha.intNumChm" cssClass="form-control " tabindex="5" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumLinfocitos">
		               			<label for="detalleFicha.intNumLinfocitos" class="form-label">Linfocitos</label>
		              				<s:textfield name="detalleFicha.intNumLinfocitos" cssClass="form-control " tabindex="6" disabled="true" maxlength="30"  />
							</div>
						</div>
						<div class="row form-row">
							<div class="col-sm-2 " id="idCampDetalleFicha_NumPlaquetas">
		               			<label for="detalleFicha.intNumPlaquetas" class="form-label">Plaquetas</label>
		              				<s:textfield name="detalleFicha.intNumPlaquetas" cssClass="form-control " tabindex="7" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumLeucocitos">
		               			<label for="detalleFicha.intNumLeucocitos" class="form-label">Leucocitos</label>
		              				<s:textfield name="detalleFicha.intNumLeucocitos" cssClass="form-control " tabindex="8" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumNeutrofilos">
		               			<label for="detalleFicha.intNumNeutrofilos" class="form-label">Neutrofilos</label>
		              				<s:textfield name="detalleFicha.intNumNeutrofilos" cssClass="form-control " tabindex="9" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumEosinofilos">
		               			<label for="detalleFicha.intNumEosinofilos" class="form-label">Eosinofilos</label>
		              				<s:textfield name="detalleFicha.intNumEosinofilos" cssClass="form-control " tabindex="10" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumVsg">
		               			<label for="detalleFicha.intNumVsg" class="form-label">Vsg</label>
		              				<s:textfield name="detalleFicha.intNumVsg" cssClass="form-control " tabindex="11" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumGlucosa">
		               			<label for="detalleFicha.intNumGlucosa" class="form-label">Glucosa</label>
		              				<s:textfield name="detalleFicha.intNumGlucosa" cssClass="form-control " tabindex="12" disabled="true" maxlength="30"  />
							</div>
						</div>
						<div class="row form-row">
							<div class="col-sm-2 " id="idCampDetalleFicha_NumUrea">
		               			<label for="detalleFicha.intNumUrea" class="form-label">Urea</label>
		              				<s:textfield name="detalleFicha.intNumUrea" cssClass="form-control " tabindex="13" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumAcisourico">
		               			<label for="detalleFicha.intNumAcisourico" class="form-label">Acisourico</label>
		              				<s:textfield name="detalleFicha.intNumAcisourico" cssClass="form-control " tabindex="14" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumCreatinina">
		               			<label for="detalleFicha.intNumCreatinina" class="form-label">Creatinina</label>
		              				<s:textfield name="detalleFicha.intNumCreatinina" cssClass="form-control " tabindex="15" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumColesterol">
		               			<label for="detalleFicha.intNumColesterol" class="form-label">Colesterol</label>
		              				<s:textfield name="detalleFicha.intNumColesterol" cssClass="form-control " tabindex="16" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumHdl">
		               			<label for="detalleFicha.intNumHdl" class="form-label">Hdl</label>
		              				<s:textfield name="detalleFicha.intNumHdl" cssClass="form-control " tabindex="17" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumLdl">
		               			<label for="detalleFicha.intNumLdl" class="form-label">Ldl</label>
		              				<s:textfield name="detalleFicha.intNumLdl" cssClass="form-control " tabindex="18" disabled="true" maxlength="30"  />
							</div>
						</div>
						<div class="row form-row">
							<div class="col-sm-2 " id="idCampDetalleFicha_NumTrigliceridos">
		               			<label for="detalleFicha.intNumTrigliceridos" class="form-label">Trigliceridos</label>
		              				<s:textfield name="detalleFicha.intNumTrigliceridos" cssClass="form-control " tabindex="19" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumTransaminasaGot">
		               			<label for="detalleFicha.intNumTransaminasaGot" class="form-label">Transaminasa Got</label>
		              				<s:textfield name="detalleFicha.intNumTransaminasaGot" cssClass="form-control " tabindex="20" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumTransaminasaGpt">
		               			<label for="detalleFicha.intNumTransaminasaGpt" class="form-label">Transaminasa Gpt</label>
		              				<s:textfield name="detalleFicha.intNumTransaminasaGpt" cssClass="form-control " tabindex="21" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumTransaminasaGgt">
		               			<label for="detalleFicha.intNumTransaminasaGgt" class="form-label">Transaminasa Ggt</label>
		              				<s:textfield name="detalleFicha.intNumTransaminasaGgt" cssClass="form-control " tabindex="22" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumFosfatasaAlcalina">
		               			<label for="detalleFicha.intNumFosfatasaAlcalina" class="form-label">Fosfatasa Alcalina</label>
		              				<s:textfield name="detalleFicha.intNumFosfatasaAlcalina" cssClass="form-control " tabindex="23" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumCalcio">
		               			<label for="detalleFicha.intNumCalcio" class="form-label">Calcio</label>
		              				<s:textfield name="detalleFicha.intNumCalcio" cssClass="form-control " tabindex="24" disabled="true" maxlength="30"  />
							</div>
						</div>
						<div class="row form-row">
							<div class="col-sm-2 " id="idCampDetalleFicha_NumHierro">
		               			<label for="detalleFicha.intNumHierro" class="form-label">Hierro</label>
		              				<s:textfield name="detalleFicha.intNumHierro" cssClass="form-control " tabindex="25" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumPotacio">
		               			<label for="detalleFicha.intNumPotacio" class="form-label">Potacio</label>
		              				<s:textfield name="detalleFicha.intNumPotacio" cssClass="form-control " tabindex="26" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumSodio">
		               			<label for="detalleFicha.intNumSodio" class="form-label">Sodio</label>
		              				<s:textfield name="detalleFicha.intNumSodio" cssClass="form-control " tabindex="27" disabled="true" maxlength="30"  />
							</div>
							<div class="col-sm-2 " id="idCampDetalleFicha_NumBilirrubina">
		               			<label for="detalleFicha.intNumBilirrubina" class="form-label">Bilirrubina</label>
		              				<s:textfield name="detalleFicha.intNumBilirrubina" cssClass="form-control " tabindex="28" disabled="true" maxlength="30"  />
							</div>
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

