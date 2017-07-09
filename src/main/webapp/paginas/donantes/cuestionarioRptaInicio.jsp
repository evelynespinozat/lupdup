<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container-fluid" id="idDivPrincipalCuestionarioRpta">
	<div class="row">
			
		<div class="col-sm-12">
			<div class="row ">
				<div class="col-sm-12">
					<h4 class="semi-bold"><span class="semi-bold">Cuestionario de pre-evaluaci&oacute;n para ser donante</span><br>
					</h4>
				</div>
			</div>
		</div>
		
		<div class="col-lg-12" >
			<form name="formCuestionarioRpta" id="idFormCuestionarioRpta">
			<s:iterator value="listCuestionario" var="cuestionario">
			<input type="hidden" name="srlIdDonantecuestionariorpta"/>
			<div class="row ">
				<div class="col-md-8">
					${cuestionario.strCuestionarioDesc}
				</div>
				<div class="col-md-2">
					<input type="radio" value="SI" name="cuestionario_rpta_${cuestionario.intIdCuestionario}" <s:if test='%{#cuestionario.strEsCheck == "S"}'>checked="checked"</s:if> /> Si&nbsp;&nbsp;&nbsp;
					<input type="radio" value="NO" name="cuestionario_rpta_${cuestionario.intIdCuestionario}" <s:if test='%{#cuestionario.strEsCheck == "N"}'>checked="checked"</s:if> /> No
				</div>
				<div class="col-md-2">
					<input type="text" class="form-control" name="cuestionario_rpta_txt_${cuestionario.intIdCuestionario}" value="${cuestionario.strDesRespuesta}"/>
				</div>
			</div>
			</s:iterator>
			</form>
		</div>
			
	</div>
	<div class="row">
		<div class="col-sm-12">
			<div class="pull-right">
				<button class="btn btn-primary" type="button" id="idBtnGuardarCuestionarioRpta" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
			</div>
		</div>
	</div>
</div>
<div id="idDivEditarCuestionarioRpta"></div>
<div class="modal fade eliminar-info-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabelx1">
	<div class="modal-dialog modal-md">
		<div class="modal-content">
			<div class="modal-header">
				<!--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>-->
				<h4 class="modal-title" id="">Eliminar</h4>
			</div>
			<div class="modal-body" id="idDivEliminar">
		    	<div class="row">
					<div class="col-sm-12">
				    	<p><strong>&iquest;EST&Aacute; SEGURO QUE DESEA ELIMINAR EL REGISTRO&#63;</strong></p>
					</div>
				</div>
		    	<div class="row">
					<div class="col-sm-12">&nbsp;</div>
				</div>
		    	<div class="row">
					<div class="col-sm-12">
						<div class="pull-right">
							<button class="btn btn-primary" type="button" id="idBtnSi" tabindex="10"><i class="fa fa-trash-o"></i> Si </button>
							<button class="btn btn-default" type="button" id="idBtnNo" tabindex="10"><i class="fa fa-reply"></i> No </button>
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
