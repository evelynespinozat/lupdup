<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container-fluid" id="idDivPrincipalCita">
	<div class="row">
		<div class="grid simple">
			
			<div class="grid-title">
				<div class="row form-row">
					<div class="col-sm-12">
						<div class="botonera">
							<button class="btn btn-primary" type="button" id="idBtnNuevoCita" tabindex="10"><i class="fa fa-file-o"></i> Nuevo </button>
							<button class="btn btn-primary" type="button" id="idBtnSalirCita" tabindex="10"><i class="fa fa-power-off"></i> Salir </button>
						</div>
					</div>
				</div>
			</div>
			
			<div class="grid-body no-border">
				<form class="" method="POST" id="idFormBuscarCita" name="formBuscarCita" novalidate="novalidate">
					
					<div class="row ">
						<div class="col-sm-12">
							<h4 class="semi-bold"><span class="light">Listado de</span> <span class="semi-bold">Cita</span><br>
							</h4>
							<div class="row form-row">
								<div class="col-sm-6">
					    			<label for="buscar_dteFecCita" class="form-label">Fec Cita</label>
					    			<s:textfield name="buscar_dteFecCita" cssClass="form-control datepicker" tabindex="1" size="40" maxlength="30"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strHorCita" class="form-label">Hor Cita</label>
		                			<s:textfield name="buscar_strHorCita" cssClass="form-control" tabindex="2" size="40" maxlength="6"/>
								</div>
							</div>


						</div>
					</div>
					
					<div class="row form-row">
						<div class="col-sm-12">
							<div class="botonera">
								<button class="btn btn-primary" type="button" id="idBtnConsultarCita" tabindex="10"><i class="fa fa-filter"></i> Filtrar </button>
								<button class="btn btn-primary" type="button" id="idBtnMostrarTodosCita" tabindex="10"><i class="fa fa-file-o"></i> Mostrar todos </button>
							</div>
						</div>
					</div>
					
				</form>
			</div>
			

			<div class="grid-body no-border" >      
				<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered table-hover" id="tableDefaultCita" >
					<thead>     
						<tr>
							<th width="20%">Hor Cita</th>
							<th style="width: 6%;">Detalle</th>
						</tr>
					</thead>
				</table>
				<br>
			</div>
		</div>
	</div>
</div>
<div id="idDivEditarCita"></div>
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
