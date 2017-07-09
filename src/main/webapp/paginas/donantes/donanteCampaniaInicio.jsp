<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%--
<div class="container-fluid" id="idDivPrincipalDonanteCampania">
	<div class="row">
		
		<div class="col-sm-12">
			<div class="row ">
				<div class="col-sm-12">
					<h4 class="semi-bold"><span class="semi-bold">Por ser parte del Club de Donantes Voluntarios tiene acceso a los siguientes beneficios:</span><br>
					</h4>
				</div>
			</div>
		</div>
		
		<div class="col-lg-12" >
			
			<div class="row ">
			<s:iterator value="listDonanteCampania" var="donanteCampania">
				<div class="col-md-3" >
					<center>
						<img alt="" src="descargar.action?strNomCodigo=${donanteCampania.intIdImagen}" style="width: 225px;border: solid 1px black;"><br/>
						${donanteCampania.strDesCampania}<br/>
						Descuento del ${donanteCampania.intNumDescuento}%<br/>
						<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i><br/>
						<s:if test="%{#donanteCampania.intIdDonante==null}">
						<button class="btn btn-primary clsAplicar" 
							id-campania="${donanteCampania.intIdCampania}"
							num-descuento="${donanteCampania.intNumDescuento}"
							num-precio="${donanteCampania.dblNumPrecio}"
							num-precio-campania="${donanteCampania.dblNumPrecioPanpania}"
							des-comentario="${donanteCampania.strDesComentario}"
							><i class="fa fa-check"></i> Aplicar</button>
						</s:if>
						<s:if test="%{#donanteCampania.intIdDonante!=null}">
						<button class="btn btn-primary" id-campania="${donanteCampania.intIdCampania}" disabled="disabled"><i class="fa fa-check"></i> Aplicar</button>
						</s:if>
					</center>
				</div>
				<input type="hidden" name="srlIdDonantecuestionariorpta"/>
			</s:iterator>
			</div>
			
		</div>
		
	</div>
</div>
--%>










        
        <!--Products Section-->
        <section class="default-products-section" style="background-image:url(images/background/image-4.jpg);">
        	<div class="auto-container">
            	
                <!--Section Title-->
                <div class="section-title">
                	<h3>Salva una vida, salvate a ti</h3>
                    <h2>Club de LupDup</h2>
                    <div class="desc-text">Todo lo que tengo para disfrutar; cine, teatro, restaurantes, aventura, viajes, futbol, moda, accesorios y lo encuentro en LUPDUPP. </div>
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
                                        <button class="theme-btn btn-style-three clsAplicar" 
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
<%--
				<div class="col-md-3" >
					<center>
						<img alt="" src="descargar.action?strNomCodigo=${donanteCampania.intIdImagen}" style="width: 225px;border: solid 1px black;"><br/>
						${donanteCampania.strDesCampania}<br/>
						Descuento del ${donanteCampania.intNumDescuento}%<br/>
						<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i><br/>
						<s:if test="%{#donanteCampania.intIdDonante==null}">
						<button class="btn btn-primary clsAplicar" 
							id-campania="${donanteCampania.intIdCampania}"
							num-descuento="${donanteCampania.intNumDescuento}"
							num-precio="${donanteCampania.dblNumPrecio}"
							num-precio-campania="${donanteCampania.dblNumPrecioPanpania}"
							des-comentario="${donanteCampania.strDesComentario}"
							><i class="fa fa-check"></i> Aplicar</button>
						</s:if>
						<s:if test="%{#donanteCampania.intIdDonante!=null}">
						<button class="btn btn-primary" id-campania="${donanteCampania.intIdCampania}" disabled="disabled"><i class="fa fa-check"></i> Aplicar</button>
						</s:if>
					</center>
				</div>
--%>
				<input type="hidden" name="srlIdDonantecuestionariorpta"/>
				
				</s:iterator>
                    
                </div>
                
            </div>
        </section>























<div id="idDivEditarDonanteCampania"></div>

<div class="modal fade aplicar-info-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabelx1">
	<div class="modal-dialog modal-md">
		<div class="modal-content">
			<div class="modal-header">
				<!--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>-->
				<h4 class="modal-title" id="">Aviso</h4>
			</div>
			<div class="modal-body" id="idDivEliminar">
		    	<div class="row">
					<div class="col-sm-12">
				    	<p><strong>Estimado usuario le informamos que si no hace uso de la campa&ntilde;a a la que esta aplicando, perdera puntos</strong></p>
					</div>
				</div>
		    	<div class="row">
					<div class="col-sm-12">&nbsp;</div>
				</div>
		    	<div class="row">
					<div class="col-sm-12">
						<div class="pull-right">
							<button class="btn btn-primary" type="button" id="idBtnSi" tabindex="10"><i class="fa fa-trash-o"></i> Aceptar </button>
							<button class="btn btn-default" type="button" id="idBtnNo" tabindex="10"><i class="fa fa-reply"></i> Cancelar </button>
						</div>
					</div>
				</div>
				
			</div>
		</div>
	</div>
</div>

<s:form action="" name="form" id="form" namespace="/">
	<s:hidden name="buscar_seleccion_id" id="buscar_seleccion_id" />
</s:form>
