<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib 	uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib	prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core"%>

<nav class="navbar navbar-fixed-top " role="navigation" style="height: 20px; background-color: #FFFFFF">
	<div class="navbar-top">
		<div class="panel ">
			<div class="row">
				<div class="col-sm-10">
					<div class="btn btn-default">
						<a href="usuario.action">Usuario</a>
					</div>
					
					<div class="btn btn-default">
						<a href="usuarioPerfil.action">Usuario Perfil</a>
					</div>
					
					<div class="btn btn-default">
						<a href="usuarioSede.action">Usuario Sede</a>
					</div>
					
<!--
					<div class="btn-group">
						<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							Seguridad <span class="caret"></span>
						</button>
						<ul class="dropdown-menu">
							<li>
								<a href="usuario.action">Usuario</a>
							</li>
							<li>
								<a href="sede.action">Sede</a>
							</li>
						</ul>
					</div>
-->
				</div>
				<div class="col-sm-2">
					<s:if test="%{#session.USUARIO_ACTUAL != null}">
						<div class="pull-right">
							<ul class="orange nav navbar-nav ">
								<li class="dropdown user-dropdown text-right">
									<a href="#" class="dropdown-toggle orange clsLoginBlue" data-toggle="dropdown">
										<i class="fa fa-user"></i>
										${sessionScope.USUARIO_ACTUAL.strNomResponsable}
										${sessionScope.USUARIO_ACTUAL.strNomAppaterno}
										${sessionScope.USUARIO_ACTUAL.strNomApmaterno}
										<b class="caret"></b>
									</a>
									<ul class="dropdown-menu pull-right">
										<li><a href="cita.action"><i class="fa fa-gear"></i> Lupdup</a></li>
										<li><a href="campania.action"><i class="fa fa-gear"></i> Configuraci&oacute;n</a></li>
										<li class="divider"></li>
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
			</div>
		</div>
	</div>
</nav>
