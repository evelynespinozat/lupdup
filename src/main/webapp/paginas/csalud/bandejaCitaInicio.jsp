<%@page import="pmp.lupdup.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container-fluid" id="idDivPrincipalBandejaCita">
	<div class="row">
		<div class="grid simple">
			
			<div class="grid-title">
				<div class="row form-row">
					<div class="col-sm-12">
						<div class="botonera">
<!-- 							<button class="btn btn-primary" type="button" id="idBtnNuevoBandejaCita" tabindex="10"><i class="fa fa-file-o"></i> Nuevo </button> -->
							<button class="btn btn-primary" type="button" id="idBtnSalirBandejaCita" tabindex="10"><i class="fa fa-power-off"></i> Salir </button>
						</div>
					</div>
				</div>
			</div>
			
			<div class="grid-body no-border">
				<form class="" method="POST" id="idFormBuscarBandejaCita" name="formBuscarBandejaCita" novalidate="novalidate">
					
					<div class="row ">
						<div class="col-sm-12">
							<input type="hidden" name="catalogo_estado_cita_donante_programado" value="<%=ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CATALOGO_ESTADO_CITA_DONANTE_PROGRAMADO)%>"/>
							<input type="hidden" name="catalogo_estado_cita_donante_asistio" value="<%=ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CATALOGO_ESTADO_CITA_DONANTE_ASISTIO)%>"/>
							<input type="hidden" name="catalogo_estado_cita_donante_resultado" value="<%=ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CATALOGO_ESTADO_CITA_DONANTE_RESULTADO)%>"/>
							<input type="hidden" name="catalogo_estado_cita_donante_correo" value="<%=ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CATALOGO_ESTADO_CITA_DONANTE_CORREO)%>"/>
							
<%-- 							<h4 class="semi-bold"><span class="light">Listado de</span> <span class="semi-bold">Bandeja citas</span><br> </h4> --%>
							<div class="row form-row">
								<div class="col-sm-3">
					    			<label for="buscar_strNumDni" class="form-label">DNI</label><br/>
					    			<s:textfield name="buscar_strNumDni" cssClass="form-control" tabindex="1" size="12" maxlength="12"/>
								</div>
								<div class="col-sm-3">
		                			<label for="buscar_strNomNombre" class="form-label">Nombres completos</label>
		                			<s:textfield name="buscar_strNomNombre" cssClass="form-control" tabindex="2" size="40"/>
								</div>
								<div class="col-sm-3">
		                			<label for="buscar_strNomAppaterno" class="form-label">Apellido paterno</label>
		                			<s:textfield name="buscar_strNomAppaterno" cssClass="form-control" tabindex="2" size="40"/>
								</div>
								<div class="col-sm-3">
		                			<label for="buscar_strNomApmaterno" class="form-label">Apellido materno</label>
		                			<s:textfield name="buscar_strNomApmaterno" cssClass="form-control" tabindex="2" size="40"/>
								</div>
							</div>
							
							<div class="row form-row">
								<div class="col-sm-3">
					    			<label for="buscar_dteFecCitaDesde" class="form-label">Fecha de inicio</label><br/>
					    			<s:textfield name="buscar_dteFecCitaDesde" cssClass="form-control datepicker" tabindex="3" size="10"/>
								</div>
								<div class="col-sm-3">
					    			<label for="buscar_dteFecCitaHasta" class="form-label">Fecha de fin</label><br/>
					    			<s:textfield name="buscar_dteFecCitaHasta" cssClass="form-control datepicker" tabindex="3" size="10"/>
								</div>
								<div class="col-sm-3">
					    			<label for="buscar_dteFecCitaDesde" class="form-label">C. salud</label><br/>
					    			<s:if test="%{#session.USUARIO_ACTUAL.perfilAdministrador}">
					    				<s:select name="buscar_intIdCentroSalud" cssClass="form-control " tabindex="5" list="#session.listCentroSalud" headerKey="" headerValue="-Seleccionar-" listValue="strNomNombre" listKey="srlIdCentrosalud"></s:select>
					    			</s:if>
					    			<s:else>
					    				<s:select name="buscar_intIdCentroSalud" cssClass="form-control " tabindex="5" list="#session.listCentroSalud" headerKey="" headerValue="-Seleccionar-" listValue="strNomNombre" listKey="srlIdCentrosalud" disabled="true"></s:select>
					    			</s:else>
								</div>
								<div class="col-sm-3">
					    			<label for="buscar_dteFecCitaHasta" class="form-label">Sede salud</label><br/>
					    			<s:if test="%{#session.USUARIO_ACTUAL.perfilAdministrador}">
					    				<div id="idDivSelectSedeCentroSalud"><s:select name="buscar_intIdSedeCentroSalud" cssClass="form-control " tabindex="5" list="#session.listSedeSalud" headerKey="" headerValue="-Seleccionar-" listValue="strNomNombre" listKey="srlIdSedesalud"></s:select></div>
					    			</s:if>
					    			<s:else>
					    				<div id="idDivSelectSedeCentroSalud"><s:select name="buscar_intIdSedeCentroSalud" cssClass="form-control " tabindex="5" list="#session.listSedeSalud" headerKey="" headerValue="-Seleccionar-" listValue="strNomNombre" listKey="srlIdSedesalud" disabled="true"></s:select></div>
					    			</s:else>
								</div>
							</div>
							
						</div>
					</div>
					
					<div class="row form-row">
						<div class="col-sm-12">
							<div class="botonera">
								<button class="btn btn-primary" type="button" id="idBtnConsultarBandejaCita" tabindex="10"><i class="fa fa-filter"></i> Filtrar </button>
								<button class="btn btn-primary" type="button" id="idBtnMostrarTodosBandejaCita" tabindex="10"><i class="fa fa-file-o"></i> Mostrar todos </button>
							</div>
						</div>
					</div>
					
				</form>
			</div>
			

			<div class="grid-body no-border" >      
				<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered table-hover" id="tableDefaultBandejaCita" >
					<thead>     
						<tr>
							<th width="10%">DNI</th>
							<th width="24%">Nombres</th>
							<th width="15%">Ap. paterno</th>
							<th width="15%">Ap. materno</th>
							<th width="10%">Fecha donaci&oacute;n</th>
							<th width="10%">Hora donaci&oacute;n</th>
							<th width="10%">Estado</th>
							<th style="width: 6%;">Detalle</th>
						</tr>
					</thead>
				</table>
				<br>
			</div>
		</div>
	</div>
</div>
<div id="idDivEditarBandejaCita"></div>
<div class="modal fade asistencia-info-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabelx1">
	<div class="modal-dialog modal-md">
		<div class="modal-content">
			<div class="modal-header">
				<!--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>-->
				<h4 class="modal-title" id="">Asistencia</h4>
			</div>
			<div class="modal-body" id="idDivEliminar">
		    	<div class="row">
					<div class="col-sm-12">
				    	<p><strong>Donante asiste a donar sangre</strong></p>
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
<div class="modal fade editar-ficha-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabelx1">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">
			<div class="modal-header">
				<!--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>-->
				<h4 class="modal-title" id="">Editar ficha de resultados</h4>
			</div>
			<div class="modal-body" id="idDivEditarFichaBandejaCita">
				
			</div>
		</div>
	</div>
</div>

<s:form action="" name="form" id="form" namespace="/">
	<s:hidden name="buscar_seleccion_id" id="buscar_seleccion_id" />
</s:form>
