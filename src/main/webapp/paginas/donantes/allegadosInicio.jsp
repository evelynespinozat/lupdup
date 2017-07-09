<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container-fluid" id="idDivPrincipalAllegados">
	<div class="row">
		<div class="grid simple">
			
			<div class="grid-title">
				<div class="row form-row">
					<div class="col-sm-12">
						<div class="botonera">
							<input type="hidden" name="permiteModificarAllegados" value="${sessionScope.permiteModificarAllegados}"/>
							<button class="btn btn-primary" type="button" id="idBtnNuevoAllegados" tabindex="10" ><i class="fa fa-file-o" ></i> Agregar </button>
						</div>
					</div>
				</div>
			</div>
			
			<div class="grid-body no-border" >      
				<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered table-hover" id="tableDefaultAllegados" >
					<thead>     
						<tr>
							<th width="20%">Nombre</th>
							<th width="20%">Ap. paterno</th>
							<th width="20%">Ap. materno</th>
							<th width="20%">Celular</th>
							<th width="20%">Telefono</th>
							<th width="20%">Correo electronico</th>
							<th width="20%">DNI</th>
							<th width="20%">Tipo parentesco</th>
							<th style="width: 6%;">Detalle</th>
						</tr>
					</thead>
				</table>
				<br>
			</div>
		</div>
	</div>
</div>
<div id="idDivEditarAllegados"></div>
<div id="dialog-info-eliminar" hidden="true">
    <br>  <p> <strong>&iquest;EST&Aacute; SEGURO QUE DESEA ELIMINAR EL REGISTRO&#63;</strong></p>
</div>

<s:form action="" name="form" id="form" namespace="/">
	<s:hidden name="buscar_seleccion_id" id="buscar_seleccion_id" />
</s:form>
