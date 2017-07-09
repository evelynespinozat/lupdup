<%@ page import="pmp.lupdup.general.util.CadenaUtil"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<%
String strFecha	= CadenaUtil.getStrDateHoraMinutos(new Date());
String strTimeDay	= CadenaUtil.getDateHoraMinutosFromStr(strFecha).getTime() + "";
request.setAttribute("CURR_DAY", strTimeDay);
%>

<head>
	<meta charset="utf-8">
	<title><tiles:insertAttribute name="title" /></title>
	<!-- Stylesheets -->
	<link href="tools/html_template/css/bootstrap.css" rel="stylesheet">
	<link href="tools/html_template/css/style.css" rel="stylesheet">
	<!-- Responsive -->
	<link rel="shortcut icon" href="tools/html_template/images/favicon.ico" type="image/x-icon">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<link href="tools/html_template/css/responsive.css" rel="stylesheet">
	<!--[if lt IE 9]><script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
	<!--[if lt IE 9]><script src="tools/html_template/js/respond.js"></script><![endif]-->

	<script src="tools/jquery-ui-1.10.4.custom_cupertino/js/jquery-1.10.2.js"></script>
<%-- <script src="tools/html_template/js/jquery.js"></script>  --%>
	<script src="tools/jquery-ui-1.10.4.custom_cupertino/js/jquery-ui-1.10.4.custom.js"></script>
	<link rel="stylesheet" href="tools/jquery-ui-1.10.4.custom_cupertino/css/cupertino/jquery-ui-1.10.4.custom.css">
	<link rel="stylesheet" href="css/comun.css" type="text/css">
	<script src="tools/jquer-utils/jquery.blockUI.js"></script>
	<script src="tools/jquer-utils/jquery.form.js"></script>
	<script	src="tools/bootstrap-datatables/js/jquery.datatables.1.10.0.js" type="text/javascript"></script>
	<script	src="tools/bootstrap-datatables/js/datatables.bootstrap.js" type="text/javascript"></script>
	<script src="tools/bootstrap-datatables/js/datatables-responsive.js" type="text/javascript"></script>
	<link href="tools/bootstrap-datatables/css/datatables.bootstrap.css" rel="stylesheet" type="text/css">
	<link href="tools/bootstrap-datatables/css/datatables-responsive.css" rel="stylesheet" type="text/css">
	<link href="css/configuracion/configuracionLayout.css?day=${CURR_DAY}" rel="stylesheet" type="text/css">
	
<script src="tools/html_template/js/bootstrap.min.js"></script>
<script src="tools/html_template/js/jquery.fancybox.pack.js"></script>
<script src="tools/html_template/js/jquery.fancybox-media.js"></script>
<script src="tools/html_template/js/validate.js"></script>
<script src="tools/html_template/js/jquery.mCustomScrollbar.concat.min.js"></script>
<script src="tools/html_template/js/owl.js"></script>
<%-- <script src="http://maps.google.com/maps/api/js"></script> --%>
<%-- <script src="tools/html_template/js/googlemaps.js"></script> --%>
<script src="tools/html_template/js/wow.js"></script>


	<tiles:useAttribute id="css" name="styles" classname="java.util.List" />
	<c:forEach var="item" items="${css}">
		<link rel="stylesheet" href="${item}?day=${CURR_DAY}" type="text/css" />
	</c:forEach>
	
	<!-- LISTA JAVSCR -->
	<tiles:useAttribute id="js_list" name="javscr"
		classname="java.util.List" />
	<c:forEach var="item" items="${js_list}">
		<script src="${item}?day=${CURR_DAY}" type="text/javascript"></script>
	</c:forEach>

</head>

<!--Use "boxed-layout" class with body to See Boxed View-->
<body>
<div class="page-outer-container">
	<div class="page-wrapper">
		
        <!-- Preloader -->
        <div class="preloader"></div>
		
        <!-- Main Header -->
        <header class="main-header">
            <!-- Top Bar -->
            
            <!-- Lower Section -->
            <div class="lower-section">
                <div class="auto-container">
                    
                    <!--Outer Box-->
                    <div class="outer-box clearfix">
                    	
                        <!-- Logo -->
                        <div class="logo">
                            <a href="index.html"><img src="image/img-portada/lupdup.png" alt="Alone" title="Alone"></a>
                        </div>
                        
                        <div class="clearfix hidden"></div>
                        
                        <!-- Hidden Nav Toggler -->
                        <div class="nav-toggler">
                        <button class="hidden-bar-opener"><span class="icon fa fa-bars"></span></button>
                        </div><!-- / Hidden Nav Toggler -->
                        
                        <div class="cart-box">
						<s:if test="%{#session.USUARIO_ACTUAL != null}">
							<div class="pull-right">
								<ul class="orange nav navbar-nav ">
									<li class="dropdown user-dropdown text-right">
										<a href="#" class="dropdown-toggle orange clsLoginBlue" data-toggle="dropdown">
											<i class="fa fa-user"></i>
											${sessionScope.USUARIO_ACTUAL.strNomResponsable}
											<b class="caret"></b>
										</a>
										<ul class="dropdown-menu pull-right">
											<s:if test="%{#session.USUARIO_ACTUAL.perfilAdministrador||#session.USUARIO_ACTUAL.perfilCentroSalud||#session.USUARIO_ACTUAL.perfilEntidadCooperante}">
											<li><a href="donante.action"><i class="fa fa-gear"></i> Donante</a></li>
											<s:if test="%{#session.USUARIO_ACTUAL.perfilAdministrador}">
											<li><a href="bandejaCita.action"><i class="fa fa-gear"></i> C. Salud</a></li>
											</s:if>
											<s:if test="%{#session.USUARIO_ACTUAL.perfilAdministrador}">
											<li><a href="campaniaCooperante.action"><i class="fa fa-gear"></i> E. Cooperante</a></li>
											</s:if>
											<s:if test="%{#session.USUARIO_ACTUAL.perfilAdministrador}">
											<li><a href="centroSalud.action"><i class="fa fa-gear"></i> Administrador</a></li>
											</s:if>
											<li class="divider"></li>
											</s:if>
											<li><a href="salir.action"><i class="fa fa-sign-out"></i> Cerrar Sesión</a></li>
										</ul>
									</li>
								</ul>
							</div>
						</s:if>
						<s:else>
							<div class="pull-right " style="margin-top: 15px;margin-right: 15px;">
								<a href="home.action" class="clsLogin"><i class="fa fa-lg fa-sign-in"></i> Login</a> 
							</div>
						</s:else>
						</div>
						
                        <!--Cart Box-->
                        
                        <!-- Main Menu -->
                        <tiles:insertAttribute name="header" />
                        <!-- Main Menu End-->
                        
                    </div>
                </div>
            </div><!-- Lower Section End-->
            
        </header><!--End Main Header -->
        
        
        <!-- Hidden Bar -->
        <tiles:insertAttribute name="header_hide" />
        <!-- / Hidden Bar -->
        
<div class="container-fluid container-header">
	<tiles:insertAttribute name="content" />
</div>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        <!--Main Footer-->
        <footer class="main-footer" style="background-image:url(tools/html_template/images/background/footer-bg.jpg);">
            
            <!--Footer Upper-->        
            <div class="footer-upper">
                <div class="auto-container">
                    <div class="row clearfix">
                        
                        <!--Two 4th column-->
                        <div class="col-md-6 col-sm-12 col-xs-12">
                            <div class="row clearfix">
                                <div class="col-lg-6 col-sm-6 col-xs-12 column">
                                    <h2>Information</h2>
                                    <div class="footer-widget about-widget">
                                        <div class="text">
                                            <p>Lorem ipsum dolor sit amet, consecttur adipiscing egestas rhoncus Praesent Nunc pretium est placerat congue.</p>
                                        </div>
                                        
                                        <ul class="contact-info">
                                            <li><span class="icon fa fa-map-marker"></span> 777, Path to of America.</li>
                                            <li><span class="icon fa fa-envelope-o"></span> support@themexriver.com</li>
                                            <li><span class="icon fa fa-phone"></span> 1234 - 5678 - 9012</li>
                                            
                                        </ul>
                                        
                                    </div>
                                </div>
                                
                                <!--Footer Column-->
                                <div class="col-lg-6 col-sm-6 col-xs-12 column">
                                    <h2>flickr Photos</h2>
                                    <div class="footer-widget flickr-widget">
                                        
                                        <div class="thumbs-outer clearfix">
                                            <figure class="image-thumb"><a class="lightbox-image" href="tools/html_template/images/shop/image-1.jpg" title="Image title here"><img src="tools/html_template/images/gallery/flickr-thumb-1.png" alt=""></a></figure>
                                            <figure class="image-thumb"><a class="lightbox-image" href="tools/html_template/images/shop/image-2.jpg" title="Image title here"><img src="tools/html_template/images/gallery/flickr-thumb-2.png" alt=""></a></figure>
                                            <figure class="image-thumb"><a class="lightbox-image" href="tools/html_template/images/shop/image-3.jpg" title="Image title here"><img src="tools/html_template/images/gallery/flickr-thumb-3.png" alt=""></a></figure>
                                            <figure class="image-thumb"><a class="lightbox-image" href="tools/html_template/images/shop/image-4.jpg" title="Image title here"><img src="tools/html_template/images/gallery/flickr-thumb-4.png" alt=""></a></figure>
                                            <figure class="image-thumb"><a class="lightbox-image" href="tools/html_template/images/shop/image-1.jpg" title="Image title here"><img src="tools/html_template/images/gallery/flickr-thumb-5.png" alt=""></a></figure>
                                            <figure class="image-thumb"><a class="lightbox-image" href="tools/html_template/images/shop/image-2.jpg" title="Image title here"><img src="tools/html_template/images/gallery/flickr-thumb-6.png" alt=""></a></figure>
                                            <figure class="image-thumb"><a class="lightbox-image" href="tools/html_template/images/shop/image-3.jpg" title="Image title here"><img src="tools/html_template/images/gallery/flickr-thumb-7.png" alt=""></a></figure>
                                            <figure class="image-thumb"><a class="lightbox-image" href="tools/html_template/images/shop/image-4.jpg" title="Image title here"><img src="tools/html_template/images/gallery/flickr-thumb-8.png" alt=""></a></figure>
                                            <figure class="image-thumb"><a class="lightbox-image" href="tools/html_template/images/shop/image-1.jpg" title="Image title here"><img src="tools/html_template/images/gallery/flickr-thumb-9.png" alt=""></a></figure>
                                        </div>
            
                                    </div>
                                </div>
                            </div>
                        </div><!--Two 4th column End-->
                        
                        <!--Two 4th column-->
                        <div class="col-md-6 col-sm-12 col-xs-12">
                            <div class="row clearfix">
                                <!--Footer Column-->
                                <div class="col-lg-6 col-sm-6 col-xs-12 column">
                                    <h2>Latest Works</h2>
                                    <div class="footer-widget latest-work">
                                        
                                        <article class="work-block">
                                            <a href="#" class="link-box">
                                                <strong>Famous Quotes is Giving</strong>
                                                <div class="info"> July 29, 2015 &ensp;BY themexriver</div>
                                            </a>
                                        </article>
                                        
                                        <article class="work-block">
                                            <a href="#" class="link-box">
                                                <strong>Providing Pens For Kids</strong>
                                                <div class="info">  July 29, 2015 &ensp;BY themexriver</div>
                                            </a>
                                        </article>
                                        
                                        <article class="work-block">
                                            <a href="#" class="link-box">
                                                <strong>Competing with Clerky</strong>
                                                <div class="info">  July 29, 2015 &ensp;BY themexriver</div>
                                            </a>
                                        </article>
                                       
                                    </div>
                                </div>
                                
                                <!--Footer Column-->
                                <div class="col-lg-6 col-sm-6 col-xs-12 column">
                                    <div class="footer-widget twitter-widget">
                                        <h2>twitter feed</h2>
                                        
                                        <ul class="tweets-carousel single-item-carousel">
                                            <!--Tweet Item-->
                                            <li class="slide-item">
                                                <div class="text">
                                                    Have managed to checkout successfully? We can help,just let us know if you need  help via email (see our website)
                                                    <br>
                                                    <a href="#">http://t.co/1sH06fzrbf @themexriver</a>
                                                </div>
                                                <div class="info-box">
                                                    <div class="icon"><span class="fa fa-twitter"></span></div>
                                                    <strong>John Doe</strong>  <a href="#">@themexriver</a>
                                                    <div class="time theme_color">10 hours Ago</div>
                                                </div>
                                            </li>
                                            
                                            <!--Tweet Item-->
                                            <li class="slide-item">
                                                <div class="text">
                                                    Have managed to checkout successfully? We can help,just let us know if you need  help via email 
                                                    <br>
                                                    <a href="#">http://t.co/1sH06fzrbf @themexriver</a>
                                                </div>
                                                <div class="info-box">
                                                    <div class="icon"><span class="fa fa-twitter"></span></div>
                                                    <strong>John Doe</strong>  <a href="#">@themexriver</a>
                                                    <div class="time theme_color">12 hours Ago</div>
                                                </div>
                                            </li>
                                            
                                            <!--Tweet Item-->
                                            <li class="slide-item">
                                                <div class="text">
                                                    Have managed to checkout successfully? We can help,just let us know  (see our website)
                                                    <br>
                                                    <a href="#">http://t.co/1sH06fzrbf @themexriver</a>
                                                </div>
                                                <div class="info-box">
                                                    <div class="icon"><span class="fa fa-twitter"></span></div>
                                                    <strong>John Doe</strong>  <a href="#">@themexriver</a>
                                                    <div class="time theme_color">18 hours Ago</div>
                                                </div>
                                            </li>
                                            
                                            
                                        </ul>
            
                                    </div>
                                </div>
                            </div>
                        </div><!--Two 4th column End-->
                        
                    </div>
                    
                </div>
            </div>
            
            <!--Footer Bottom-->
            <div class="footer-bottom">
                <div class="auto-container clearfix">
                    <!--Copyright-->
                    <div class="copyright text-center"><span class="theme_color">Alone -</span> Copyright &copy; 2016. Developed by <a target="_blank" href="http://themeforest.net/user/themexriver/" class="theme_color">Themexriver</a></div>
                </div>
            </div>
            
        </footer>  
        
    
	</div><!--Page Wrapper End-->
</div>
<!--page-outer-container-->


<!--Scroll to top-->
<div class="scroll-to-top scroll-to-target" data-target=".main-header"><span class="fa fa-long-arrow-up"></span></div>

<script src="tools/html_template/js/script.js"></script>
</body>
</html>
