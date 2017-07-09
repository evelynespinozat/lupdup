<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container-fluid" id="idDivPrincipalClubDonanteCampania">
	<div class="row">
		<div class="grid simple">
			
			<div class="grid-title">
				<div class="row form-row">
					<div class="col-sm-12">
						<div class="botonera">
<!-- 							<button class="btn btn-primary" type="button" id="idBtnNuevoClubDonanteCampania" tabindex="10"><i class="fa fa-file-o"></i> Nuevo </button> -->
							<button class="btn btn-primary" type="button" id="idBtnSalirClubDonanteCampania" tabindex="10"><i class="fa fa-power-off"></i> Salir </button>
						</div>
					</div>
				</div>
			</div>
			
			<div class="grid-body no-border">
				<form class="" method="POST" id="idFormBuscarClubDonanteCampania" name="formBuscarClubDonanteCampania" novalidate="novalidate">
					
					<div class="row ">
						<div class="col-sm-12">
							<h4 class="semi-bold"><span class="light">Listado de</span> <span class="semi-bold">Donantes en campa&ntilde;a</span><br>
							</h4>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strDesDocumento" class="form-label">Documento</label>
		                			<s:textfield name="buscar_strDesDocumento" cssClass="form-control" tabindex="1" size="40" maxlength="300"/>
								</div>
							</div>
						</div>
					</div>
					
					<div class="row form-row">
						<div class="col-sm-12">
							<div class="botonera">
								<button class="btn btn-primary" type="button" id="idBtnConsultarClubDonanteCampania" tabindex="10"><i class="fa fa-filter"></i> Filtrar </button>
								<button class="btn btn-primary" type="button" id="idBtnMostrarTodosClubDonanteCampania" tabindex="10"><i class="fa fa-file-o"></i> Mostrar todos </button>
							</div>
						</div>
					</div>
					
				</form>
			</div>
			
			<div class="grid-body no-border" >      
				<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered table-hover" id="tableDefaultClubDonanteCampania" >
					<thead>     
						<tr>
							<th width="10%">DNI</th>
							<th width="20%">Nombres</th>
							<th width="20%">Ap. paterno</th>
							<th width="20%">Ap. materno</th>
							<th width="8%">Fecha asiste</th>
							<th width="8%">Hora asiste</th>
							<th width="8%">Estado</th>
							<th style="width: 6%;">Detalle</th>
						</tr>
					</thead>
				</table>
				<br>
			</div>
			
		</div>
	</div>
</div>

<div class="modal fade editar-info-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabelx1">
	<div class="modal-dialog modal-md">
		<div class="modal-content">
			<div class="modal-header">
				<!--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>-->
				<h4 class="modal-title" id="">Campa&ntilde;a</h4>
			</div>
			<div class="modal-body" id="idDivEditarClubDonanteCampania">
			</div>
		</div>
	</div>
</div>

<s:form action="" name="form" id="form" namespace="/">
	<s:hidden name="buscar_seleccion_id" id="buscar_seleccion_id" />
</s:form>
