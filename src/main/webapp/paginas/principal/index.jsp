<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
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
/* .vertical-green-bar { */
/* 	margin-top: inherit; */
/* } */
/* .become-volunteer-outer { */
/* 	padding: 0px 0px 0px; */
/* }  */
-->
</style>
        <!--Main Slider-->
        <c:import url="/paginas/principal/main-slider.jsp"></c:import>
        
        
        <!--Normal Section-->
        <section class="normal-section">
        	<div class="auto-container">
            	<div class="row clearfix">
                	
                    <div class="col-md-4 col-sm-12 col-xs-12">
                    	<!--Vertical Green Bar-->
                        <div class="vertical-green-bar">
                        	<!--Upper Part-->
                        	<div class="upper-part">
                            	<h2>LUPDUP <!-- <br><span class="big-text">Login</span> <br><span class="white-text">So Far!</span> --></h2>
                                <div class="desc-text">Da vida a otra vida y de esta manera estaremos dando una segunda oportunidad de vivir no a uno sino a varias personas m&aacute;s</div>
                                
                                <!--Donation Box-->
                                <div class="donation-box">
<!--                                 	<div class="title-text"><a href="donante.action" class="raised-info">Quiero registrarme</a></div> -->
<!--                                     <div class="needed-amount">391,020</div> -->
                                    
<!--                                     <div class="donation-bar-outer"> -->
                                    	
<!--                                         <div class="raised-percent">75%</div> -->
<!--                                     	<div class="donation-bar"> -->
<!--                                         	<div class="bar-fill" style="width:75%;"></div> -->
<!--                                         </div> -->
<!--                                     </div> -->
                                    
<!--                                     <div class="raised-info"> -->
<!--                                     	Raised: <span class="raised-amount">$293,265</span> -->
<!--                                     </div> -->
                                </div>
                                
								<form class="" method="POST" id="idFormAutenticacion" name="formAutenticacion" novalidate="novalidate">
									
									<div class="row ">
										<div class="col-sm-12 autenticacion-cuerpo" >
											<div class="row"><div class="col-sm-12">&nbsp;</div></div>
											<div class="row">
												<div class="col-xs-12">
													<div class="compomente-control">
														<div class="row">
															<div class="col-xs-2">
																<i class="fa fa-2x fa-user"></i>
															</div>
															<div class="col-xs-10">
									                			<s:textfield name="autentica_strUsuario" cssClass="form-control loginaction" tabindex="1" maxlength="100" value=""/>
															</div>
														</div>
													</div>
												</div>
											</div>
											<div class="row"><div class="col-sm-12">&nbsp;</div></div>
											<div class="row">
												<div class="col-sm-12">
													<div class="compomente-control">
														<div class="row">
															<div class="col-xs-2">
																<i class="fa fa-2x fa-lock"></i>
															</div>
															<div class="col-xs-10">
						                						<s:password name="autentica_strPassword" cssClass="form-control loginaction" tabindex="2" maxlength="100" value="123456"/>
															</div>
														</div>
						                			</div>
												</div>
											</div>
											<div class="row"><div class="col-sm-12">&nbsp;</div></div>
											<div class="row">
												<div class="col-sm-12 ">
													<span id="idMspErrorBuscar" class="error_en_campo"><s:actionerror/></span>
													<span id="idMspInfoBuscar" class="info_en_campo"><s:actionmessage/></span>
												</div>
											</div>
										</div>
									</div>
									
								</form>
								
                                
                                
                            </div>
                            
                            <!--Donate Link Box-->
                            <div class="donate-link-box" style="background-image:url(tools/html_template/images/background/green-bar-bg.jpg);">
                            	<a id="idBtnIngresar" class="theme-btn">Entrar</a>
<!-- 								<button class="btn compomente-boton" type="submit" id="idBtnIngresar" tabindex="10"> Ingresar </button> -->
                            </div>
                                
                        </div>
                    </div>
                    
                    
					<div id="idDivListSedeSalud" style="display: none;"><s:iterator value="%{#session.listSedeSalud}" var="sedeSalud" >${sedeSalud.srlIdSedesalud}|${sedeSalud.strIndUbicacion}|${sedeSalud.strNomNombre}|${sedeSalud.strDesDireccion}|${sedeSalud.strDesHospital}|${sedeSalud.dteIndHoraDesdeHastaString};</s:iterator></div>
                    <!--Become Volunteer-->
                    <div class="col-md-8 col-sm-12 col-xs-12">
                    	<!--Outer-->
                        <div class="become-volunteer-outer wow fadeInRight" data-wow-delay="0ms" data-wow-duration="1500ms">
                        	<div class="become-volunteer-column" style="background-image:url(tools/html_template/images/background/image-1.jpg);">
                            	<div class="inner-box">
                                	<div class="overlay-box">
                                        <div class="content-box">
                                        	
											<div id="map" style="height: 400px;"></div>
											<div class="desc-text">Programa tu cita y visita el centro de salud mas cercano a tu ubicación.</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <%--
                    	<!--Outer-->
                        <div class="become-volunteer-outer wow fadeInRight" data-wow-delay="0ms" data-wow-duration="1500ms">
                        	<div class="become-volunteer-column" style="background-image:url(tools/html_template/images/background/image-1.jpg);">
                            	<div class="inner-box">
                                	<div class="overlay-box">
                                        <div class="content-box">
                                            <h3 class="text-center">We Need You! And Your Help</h3>
                                            <h2 class="text-center">Become <span class="theme_color">Volunteer</span></h2>
                                            <div class="lower-content">
                                            	<div class="desc-text">Pellentesque eu malesuada nisi as et condimen tum lorem ipsem vitae arcu eget lobortis cursus.</div>
                                                <a href="cita.action" class="theme-btn btn-style-one apply-btn">Apply Now</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        --%>
                    </div>

                </div>
            </div>
        </section>
        
        
        <!--Recent Causes Section-->
        <section class="recent-causes-section">
        	<div class="auto-container">
            	<!--Section Title-->
                <div class="section-title">
                    <h2>BENEFICIOS</h2>
                    <div class="desc-text">Si estas suscrito a LUPDUP, tendras acceso a los siguientes beneficios. </div>
                </div>
                
            	<div class="row clearfix">
       				
                    <!--Column-->
                    <div class="column col-md-4 col-sm-6 col-xs-12">
                    	<!--Default Cause Column-->
                        <div class="default-cause-column wow fadeInUp" data-wow-delay="0ms" data-wow-duration="1500ms">
                        	<div class="inner-box text-center">
                            	<!--Image Box-->
                            	<figure class="image-box">
                                    <img src="image/resource/1.jpg" alt="">
                                    <!--Overlay Box-->
                                    <div class="overlay-box">
                                        <div class="content">
                                            <p><span class="raised-money">1.</span> Si en algun momento tú o algun familiar necesita donación de sangre, tendras prioridad de atención en donación de sangre. </p>
                                            <a href="donante.action" class="theme-btn btn-style-two">Registrarme</a>
                                        </div>
                                    </div>
                                    <!--Over Title-->
                                    <div class="cause-over-title"><span class="raised-money">1.</span>  Prioridad de atención en donación de sangre a futuro, al donante voluntario y familiares </div>
                                </figure>
                                
								<!--Donation Bar-->
                               
                                <h3 class="cause-title"><a href="#">Atención prioritaria</a></h3>
								
                            </div>
                        </div>
                    </div>
                    
                    <!--Column-->
                    <div class="column col-md-4 col-sm-6 col-xs-12">
                    	<!--Default Cause Column-->
                        <div class="default-cause-column wow fadeInUp" data-wow-delay="300ms" data-wow-duration="1500ms">
                        	<div class="inner-box text-center">
                            	<!--Image Box-->
                            	<figure class="image-box">
                                    <img src="image/resource/2.jpg" alt="">
                                    <!--Overlay Box-->
                                    <div class="overlay-box">
                                        <div class="content">
                                            <p><span class="raised-money">1.</span>  La sangre que donas, pasa por un examen de sangre y los resultados te enviamos a tu correo. </p>
                                            <a href="donante.action" class="theme-btn btn-style-two">Registrarme</a>
                                        </div>
                                    </div>
                                    <!--Over Title-->
                                    <div class="cause-over-title"><span class="raised-money">2.</span> Identificación preventiva de enfermedades a través de análisis de sangre del donante.</div>
                                </figure>
                                
                                <!--Donation Bar-->
                               
                                <h3 class="cause-title"><a href="#">Examen de sangre por correo</a></h3>
                                
                            </div>
                        </div>
                    </div>
                    
                    <!--Column-->
                    <div class="column col-md-4 col-sm-6 col-xs-12">
                    	<!--Default Cause Column-->
                        <div class="default-cause-column wow fadeInUp" data-wow-delay="600ms" data-wow-duration="1500ms">
                        	<div class="inner-box text-center">
                            	<!--Image Box-->
                            	<figure class="image-box">
                                    <img src="image/resource/3.jpg" alt="">
                                    <!--Overlay Box-->
                                    <div class="overlay-box">
                                        <div class="content">
                                            <p><span class="raised-money">3.</span> Si estas suscrito a LupDup y donas sangre, tienes acceso descuentos y promociones ofertadas por nuestras empresas colaboradoras </p>
                                            <a href="donante.action" class="theme-btn btn-style-two">Registrarme</a>
                                        </div>
                                    </div>
                                    <!--Over Title-->
                                    <div class="cause-over-title"><span class="raised-money">3.</span> Pertenecer al Club de Donantes de Sangre Voluntarios</div>
                                </figure>
                                
                                <!--Donation Bar-->
                                
                                <h3 class="cause-title"><a href="#">Club de donantes</a></h3>
                                
                            </div>
                        </div>
                    </div>
                    
       			</div>
        	</div>
        </section>
        
        

        <!--Products Section-->
        <section class="default-products-section" style="background-image:url(images/background/image-4.jpg);">
        	<div class="auto-container">
            	
                <!--Section Title-->
                <div class="section-title">
                	<h3>Bienvenido</h3>
                    <h2>Club LupDup</h2>
                    <div class="desc-text">Todo lo que tengo para disfrutar; cine, teatro, restaurantes, aventura, viajes, futbol, moda, accesorios y lo encuentro en LUPDUP. </div>
                </div>
                
            	<div class="row clearfix">
            	
            	
            	
				<s:iterator value="listDonanteCampania" var="donanteCampania">
                    <!--Default Product Column-->
                    <div class="default-product-column col-md-6 col-sm-6 col-xs-12">
                        <div class="inner-box text-center">
                            <div class="clearfix">
                                <div class="column col-md-6 col-sm-12 col-xs-12">
                                    <div class="image-box wow fadeInDown" data-wow-delay="0ms" data-wow-duration="1500ms">
                                        <figure><a href="descargar.action?strNomCodigo=${donanteCampania.intIdImagen}" title="Ladies 4 Packet" class="lightbox-image"><img src="descargar.action?strNomCodigo=${donanteCampania.intIdImagen}" alt=""></a></figure>
                                        <div class="overlay-box"><div class="info"><span class="price">Descuento del ${donanteCampania.intNumDescuento}%</span><!--<span class="actual-price">$42.00</span>--></div></div>
                                    </div>
                                </div>
                                <div class="column col-md-6 col-sm-12 col-xs-12">
                                    <div class="content-box">
                                        <h3 class="prod-title"><a href="#">Promoci&oacute;n</a></h3>
                                        <div class="prod-rating"><span class="fa fa-star full"></span> <span class="fa fa-star full"></span> <span class="fa fa-star full"></span> <span class="fa fa-star-o empty"></span> <span class="fa fa-star-o empty"></span></div>
                                        <div class="desc-text">${donanteCampania.strDesCampania}</div>
<!--                                         <a href="#" class="theme-btn btn-style-three">Atrapar</a> -->
										<s:if test="%{#donanteCampania.intIdDonante==null}">
                                        <button class="theme-btn btn-style-three" 
											id-campania="${donanteCampania.intIdCampania}"
											num-descuento="${donanteCampania.intNumDescuento}"
											num-precio="${donanteCampania.dblNumPrecio}"
											num-precio-campania="${donanteCampania.dblNumPrecioPanpania}"
											des-comentario="${donanteCampania.strDesComentario}"
											><i class="fa fa-check"></i> Aplicar</button>
										</s:if>
										<s:if test="%{#donanteCampania.intIdDonante!=null}">
										<button class="theme-btn btn-style-three" id-campania="${donanteCampania.intIdCampania}" disabled="disabled"><i class="fa fa-check"></i> Aplicar</button>
										</s:if>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
				<input type="hidden" name="srlIdDonantecuestionariorpta"/>
				
				</s:iterator>
                    
                </div>
                
            </div>
        </section>
        
        
         <!--Sponsors Section-->
        <section class="sponsors-section" style="background-image:url(images/background/bg-sponsors.jpg);">
            <div class="auto-container">
                <div class="sponsors-outer">
                    <!--Sponsors Slider-->
                    <ul class="sponsors-slider">
                        <li><a href="#"><img src="image/sponsors/1.jpg" alt=""></a></li>
                        <li><a href="#"><img src="image/sponsors/2.jpg" alt=""></a></li>
                        <li><a href="#"><img src="image/sponsors/3.jpg" alt=""></a></li>
                        <li><a href="#"><img src="image/sponsors/4.jpg" alt=""></a></li>
                        <li><a href="#"><img src="image/sponsors/5.jpg" alt=""></a></li>
                    </ul>
                </div>
            </div>
        </section>
        
	    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA6tsJfr_VUkdPoJWxKtWWS_5WcNw95Oow&signed_in=true&callback=initMap" async defer></script>
