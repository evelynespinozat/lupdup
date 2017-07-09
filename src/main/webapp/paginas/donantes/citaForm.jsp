<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<style type="text/css">
<!--
.become-volunteer-column .overlay-box {
	position:relative;
	padding:0px;
	background:rgba(0,0,0,0.70);
}

.become-volunteer-column .content-box {
	max-width: inherit;
	margin:0 auto;
	color:#e2e2e2;
	
}
.vertical-green-bar {
	margin-top: inherit;
}
.become-volunteer-outer {
	padding: 0px 0px 0px;
} 
-->
</style>

        <!--Main Slider-->
<%--         <c:import url="/paginas/principal/main-slider.jsp"></c:import> --%>

        
        <!--Normal Section-->
        <section class="normal-section">
        	<div class="auto-container">
            	<div class="row clearfix">
                	
                    <div class="col-md-4 col-sm-12 col-xs-12">
                    	<!--Vertical Green Bar-->
                        <!-- <div class="vertical-white-bar">  -->
                        	<!--Upper Part-->
                        	<div class="upper-part">
								
								<form class="" method="POST" id="idFormEditarCita" name="formEditarCita" novalidate="novalidate">
								<s:hidden name="edicion_citaDto.srlIdCita"></s:hidden>
								<s:hidden name="edicion_citaDto.intIdSede"></s:hidden>
								<s:hidden name="edicion_citaDto.intIdDonante"></s:hidden>
								<div id="idDivListSedeSalud" style="display: none;"><s:iterator value="%{#session.listSedeSalud}" var="sedeSalud" >${sedeSalud.srlIdSedesalud}|${sedeSalud.strIndUbicacion}|${sedeSalud.strNomNombre}|${sedeSalud.strDesDireccion}|${sedeSalud.strDesHospital}|${sedeSalud.dteIndHoraDesdeHastaString}|${sedeSalud.dteIndHoraDesdeString}|${sedeSalud.dteIndHoraHastaString};</s:iterator></div>
								<div id="idDivUbiDonante" style="display: none;">${sessionScope.donante.strIndUbicacion}</div>
								<div id="idDivZoom" style="display: none;">${sessionScope.donante.strIndUbicacion}</div>
								<div class="container-fluid">
								
									<div class="row form-row">
										<div class="col-sm-12">
											<fieldset>
												<legend>Origen y destino</legend>
												<div class="container-fluid">
													<div class="row form-row">
														<div class="col-sm-12 " id="idCampCita_FecCita">
															<label class="form-label">Te encuentras ubicado en:</label>
															<div>${sessionScope.donante.strDesDireccion}</div>
														</div>
													</div>
													<div class="row form-row"><div class="col-sm-12">&nbsp;</div></div>
													<div class="row form-row">
														<div class="col-sm-12 " id="idCampCita_HorCita">
									               			<label class="form-label">Centro de salud m&aacute;s cercano:</label>
															<div>
																<span id="idSpanHospital">${sessionScope.sedeSalud.strDesHospital}</span><br/>
																<span id="idSpanDireccionSede">${sessionScope.sedeSalud.strDesDireccion}</span><br/>
																<span id="idSpanHorario">Horario de atenci&oacute;n: ${sessionScope.sedeSalud.dteIndHoraDesdeHastaString}</span><br/>
															</div>
														</div>
													</div>
												</div>
											</fieldset>
										</div>
									</div>
									<div class="row form-row">
										<div class="col-sm-12">
											<fieldset>
												<legend>Programar cita</legend>
												<div class="container-fluid">
													<div class="row form-row">
														<div class="col-sm-6" id="idCampCita_FecCita">
															<label for="edicion_citaDto.dteFecCita" class="form-label">Programar cita:</label>
															<div><s:textfield name="edicion_citaDto.dteFecCitaFecha" cssClass="form-control datepicker" tabindex="1" size="40" maxlength="30" /></div>
														</div>
													</div>
													<div class="row form-row">
														<div class="col-sm-6" id="idCampCita_HorCita">
									               			<label for="edicion_citaDto.strHorCita" class="form-label">Hora</label>
															<div id="idDivHoraCita"><s:select name="edicion_citaDto.strHorCita" cssClass="form-control " tabindex="2" list="#session.listHora" headerKey="" headerValue="-Seleccionar-" listKey="id" listValue="desc"></s:select>
														</div>
													</div>
													<div class="row form-row"><div class="col-sm-12">&nbsp;</div></div>
												</div>
											</fieldset>
										</div>
									</div>
								</div>
								</form>
								
                            </div>
                            
                            <!--Donate Link Box-->
<!--                             <div class="donate-link-box" style="background-image:url(tools/html_template/images/background/green-bar-bg.jpg);"> -->
<!--                             	<a id="idBtnGuardarCita" class="theme-btn">Programar</a> -->
<!--                             </div> -->
                            <button class="btn btn-primary" type="button" id="idBtnGuardarCita" tabindex="10"><i class="fa fa fa-save"></i> Programar </button>
                        <!--</div>-->
                    </div>
                    
                    <!--Become Volunteer-->
                    <div class="col-md-8 col-sm-12 col-xs-12">
                    	<!--Outer-->
                        <div class="become-volunteer-outer wow fadeInRight" data-wow-delay="0ms" data-wow-duration="1500ms">
                        	<div class="become-volunteer-column" style="background-image:url(tools/html_template/images/background/image-1.jpg);">
                            	<div class="inner-box">
                                	<div class="overlay-box">
                                        <div class="content-box">
                                        	
											<div id="map" style="height: 600px;"></div>
											
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                    </div>
                	
                </div>
            </div>
        </section>
        
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA6tsJfr_VUkdPoJWxKtWWS_5WcNw95Oow&signed_in=true&callback=initMap"></script>


<%--
<div class="container-fluid">
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA6tsJfr_VUkdPoJWxKtWWS_5WcNw95Oow&signed_in=true&callback=initMap" async defer></script>
	
	<form class="" method="POST" id="idFormEditarCita" name="formEditarCita" novalidate="novalidate">
		
		<div class="row">
			<div class="col-sm-12">
				<s:hidden name="edicion_citaDto.srlIdCita"></s:hidden>
				<s:hidden name="edicion_citaDto.intIdSede"></s:hidden>
				<s:hidden name="edicion_citaDto.intIdDonante"></s:hidden>
				<div id="idDivListSedeSalud" style="display: none;"><s:iterator value="%{#session.listSedeSalud}" var="sedeSalud" >${sedeSalud.srlIdSedesalud}|${sedeSalud.strIndUbicacion}|${sedeSalud.strNomNombre}|${sedeSalud.strDesDireccion}|${sedeSalud.strDesHospital}|${sedeSalud.dteIndHoraDesdeHastaString};</s:iterator></div>
				<div id="idDivUbiDonante" style="display: none;">${sessionScope.donante.strIndUbicacion}</div>
				<div id="idDivZoom" style="display: none;">${sessionScope.donante.strIndUbicacion}</div>
				<div class="row form-row">
					<div class="col-sm-8 " id="idCampDonante_Ubicacion" style="height: 500px;">
               			<label class="form-label">Ubicaci&oacute;n:</label>
						<div id="map" style="height: 100%;"></div>
					</div>
					<div class="col-sm-4 ">
						<div class="row form-row">
							<div class="col-sm-12">
								<fieldset>
									<legend>Origen y destino</legend>
									<div class="container-fluid">
										<div class="row form-row">
											<div class="col-sm-12 " id="idCampCita_FecCita">
												<label class="form-label">Te encuentras ubicado en:</label>
												<div>${sessionScope.donante.strDesDireccion}</div>
											</div>
										</div>
										<div class="row form-row"><div class="col-sm-12">&nbsp;</div></div>
										<div class="row form-row">
											<div class="col-sm-12 " id="idCampCita_HorCita">
						               			<label class="form-label">Centro de salud m&aacute;s cercano:</label>
												<div>
													<span id="idSpanHospital">${sessionScope.sedeSalud.strDesHospital}</span><br/>
													<span id="idSpanDireccionSede">${sessionScope.sedeSalud.strDesDireccion}</span><br/>
													<span id="idSpanHorario">Horario de atenci&oacute;n: ${sessionScope.sedeSalud.dteIndHoraDesdeHastaString}</span><br/>
												</div>
											</div>
										</div>
									</div>
								</fieldset>
							</div>
						</div>
						<div class="row form-row">
							<div class="col-sm-12">
								<fieldset>
									<legend>Programar cita</legend>
									<div class="container-fluid">
										<div class="row form-row">
											<div class="col-sm-12" id="idCampCita_FecCita">
												<label for="edicion_citaDto.dteFecCita" class="form-label">Programar cita:</label>
												<div><s:textfield name="edicion_citaDto.dteFecCitaFecha" cssClass="form-control datepicker" tabindex="1" size="40" maxlength="30" /></div>
											</div>
										</div>
										<div class="row form-row">
											<div class="col-sm-12" id="idCampCita_HorCita">
						               			<label for="edicion_citaDto.strHorCita" class="form-label">Hora</label>
						              			<s:textfield name="edicion_citaDto.strHorCita" cssClass="form-control " tabindex="2" size="40" maxlength="6"  />
											</div>
										</div>
										<div class="row form-row"><div class="col-sm-12">&nbsp;</div></div>
										<div class="row form-row">
											<div class="col-sm-12 text-center">
												<button id="idBtnGuardarCita" class="btn btn-primary" type="button"><i class="fa fa fa-save"></i> Programar </button>
												
											</div>
										</div>
									</div>
								</fieldset>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		
	</form>
	
</div>
--%>