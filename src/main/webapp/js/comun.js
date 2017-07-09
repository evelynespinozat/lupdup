String.prototype.pxToInt = function () {
	varPx	= this;
	if(varPx.indexOf("px") != -1) {
		varPx	= varPx.substring(0, varPx.indexOf("px"));
	}
	return parseInt(varPx);
};

$(function() {
	$('input,form').attr('autocomplete','off');
	$(".solonumeros").each(function() {
		$(this).unbind("keypress");
		$(this).keypress(function(event) {
			return solonumeros(event);
		});
	});
});

/*
 * Mensaje informativo sobre la libreria de de validaciones generales
*/
/*
$(function() {
	$("#divModalmsg").dialog({
		autoOpen: false,
	    height: 'auto',
	    width: 'auto',
	    title: 'Mensaje: ',
	    modal: true,
	    buttons: {
	      Aceptar: function() {
	        $( this ).dialog( "close" );
	      },
	    }
	});
});
*/

function mostrarMensajesErrorStruts(arrayMsgs, idObjMsg) {
	var actionMsg	= '';
	actionMsg	+= '<div id="idDivMsg" class="errormsg">';
	actionMsg	+= '<ul type="disk">';
	var sinerror	= true;
	if(arrayMsgs) {
		for(var i = 0;i < arrayMsgs.length;i++) {
			actionMsg	+= "<li>";
			actionMsg	+= arrayMsgs[i];
			actionMsg	+= "</li>";
			sinerror	= false;
		}
	}
	actionMsg	+= '</ul>';		    				
	actionMsg	+= '</div>';

	if(idObjMsg) {
		idObjMsg.html(actionMsg);
	} else {
		/*
		$("#divModalmsg").html(actionMsg);
		$('.msg-confirm-modal').modal('show');
		setTimeout(function() {
			$('.msg-confirm-modal').modal("hide");
		}, 5000);
		*/
		$.blockUI({
			fadeIn : 0,
	        fadeOut : 0,
	        message : actionMsg});
		
		setTimeout(function() {
			$.unblockUI();
		}, 5000);
	}
	return sinerror;
}
function mostrarMensajesStruts(arrayMsgs, idObjMsg) {
	var actionMsg	= '';
	actionMsg	+= '<div id="idDivMsg" class="exitomsg">';
	actionMsg	+= '<ul type="none">';
	var sinerror	= true;
	if(arrayMsgs) {
		for(var i = 0;i < arrayMsgs.length;i++) {
			actionMsg	+= "<li>";
			actionMsg	+= arrayMsgs[i];
			actionMsg	+= "</li>";
			sinerror	= false;
		}
	}
	actionMsg	+= '</ul>';		    				
	actionMsg	+= '</div>';

	if(idObjMsg) {
		idObjMsg.html(actionMsg);
	} else {
		$.blockUI({
			fadeIn : 0,
	        fadeOut : 0,
	        message : actionMsg});
		
		setTimeout(function() {
			$.unblockUI();
		}, 1000);
	}
	return sinerror;
}
/*
function mostrarMensajesErrorStruts(arrayMsgs, idObjMsg) {
	var actionMsg	= '<div id="msgIsertsuccess"><ul id="msgIsertsuccess" class="errormsg" style="display: block;">';
	actionMsg	+= "<ul type = disk>";
	var sinerror	= true;
	if(arrayMsgs) {
		for(var i = 0;i < arrayMsgs.length;i++) {
			actionMsg	+= "<li>";
			actionMsg	+= arrayMsgs[i];
			actionMsg	+= "</li>";
			sinerror	= false;
		}
	}
	actionMsg	+= '</ul></div>';		    				
	if(idObjMsg) {
		idObjMsg.html(actionMsg);
	} else {
		$("#divModalmsg").html(actionMsg);
		$("#divModalmsg").dialog("open");
		setTimeout(function() {
			$("#divModalmsg").dialog("close");
		}, 3000);
	}
	return sinerror;
}
function mostrarMensajesStruts(arrayMsgs, idObjMsg) {
	var actionMsg	= '<div id="msgIsertsuccess"><ul id="msgIsertsuccess" class="exitomsg" style="display: block;">';
	actionMsg	+= "<ul type = disk>";
	var sinerror	= true;
	if(arrayMsgs) {
		for(var i = 0;i < arrayMsgs.length;i++) {
			actionMsg	+= "<li>";
			actionMsg	+= arrayMsgs[i];
			actionMsg	+= "</li>";
			sinerror	= false;
		}
	}
	actionMsg	+= '</ul></div>';		    				
	if(idObjMsg) {
		idObjMsg.html(actionMsg);
	} else {
		$("#divModalmsg").html(actionMsg);
		$("#divModalmsg").dialog("open");
		setTimeout(function() {
			$("#divModalmsg").dialog("close");
		}, 500);
	}
	return sinerror;
}
*/
function seleccionarTodosCheckbox() {
	var nodoList	= getNodosList();
	var total		= getTotal();
	var nodos		= nodoList.split(',');
	var blnTodos	= true;
	for(var i = 0;i < nodos.length;i++) {
		blnTodos	= blnTodos & document.getElementById("id_editar_carpeta_"+nodos[i]).checked;
	}
	for(var i = 0;i < nodos.length;i++) {
		document.getElementById("id_editar_carpeta_"+nodos[i]).checked = !blnTodos;
	}
}
function deseleccionarTodosCheckbox() {
	var nodoList	= getNodosList();
	var total		= getTotal();
	var nodos		= nodoList.split(',');
	for(var i = 0;i < nodos.length;i++) {
		document.getElementById("id_editar_carpeta_"+nodos[i]).checked = false;
	}
	return false;
}
function seleccionarCheckbox(idExpeSele) {
	var nodoList	= getNodosList();
	var total		= getTotal();
	var td			= "idTd" + idExpeSele;
	if(idExpeSele != null && idExpeSele != '' && idExpeSele != 'null') {
		var tdExp		= document.getElementById(td);
		if(tdExp.title != null && tdExp.title != 'null') {
			expandir(tdExp.title);
		}
		document.getElementById("id_editar_carpeta_"+idExpeSele).checked = true;
	}
}
function expandirContraer(idExpediente) {
	//alert('E');
	var tr		= "idTr" + idExpediente;
	var img		= "idImg" + idExpediente;
	if(document.getElementById(tr).style.display == 'table-row') {
		document.getElementById(tr).style.display = 'none';
		document.getElementById(img).src = "img/folder-close.jpg";
	} else {
		document.getElementById(tr).style.display	= 'table-row';
		document.getElementById(img).src			= "img/folder-open.jpg";
	}
}
function obtenerIdPadre(idExpediente) {
	var tdExp	= document.getElementById("idTd" + idExpediente); 
	if(tdExp != null && tdExp.title != null && tdExp.title != "" && tdExp.title != "null") {
		return tdExp.title;
	} else {
		return null;
	}
}
function expandir(idExpediente) {
	var tr		= "idTr" + idExpediente;
	var img		= "idImg" + idExpediente;
	if(idExpediente != null && idExpediente != '' && idExpediente != 'null') {
		if(document.getElementById(tr) != null) {
			document.getElementById(tr).style.display	= 'table-row';
			document.getElementById(img).src			= "img/folder-open.jpg";
			var tdExp	= document.getElementById("idTd" + idExpediente); 
			if(tdExp.title != null && tdExp.title != "" && tdExp.title != "null") {
				expandir(tdExp.title);
			}
		} else {
			var tdExp	= document.getElementById("idTd" + idExpediente); 
			if(tdExp != null && tdExp.title != null && tdExp.title != "" && tdExp.title != "null") {
				expandir(tdExp.title);
			}
		}
	}
}
function contraerTodosNodos() {
	var nodoPad		= getIdPadre();
	var nodoList	= getNodosList();
	var total		= getTotal();
	var nodos		= nodoList.split(',');
	for(var i = 0;i < nodos.length;i++) {
		//if(nodoPad != nodos[i]) {
		var tr		= "idTr" + nodos[i];
		var img		= "idImg" + nodos[i];
		if(document.getElementById(tr)) {
			document.getElementById(tr).style.display = 'none';
			document.getElementById(img).src = "img/folder-close.jpg";
		}
		//}
	}
	return false;
}
function expandirTodosNodos() {
	var nodoList	= getNodosList();
	var total		= getTotal();
	var nodos		= nodoList.split(',');
	for(var i = 0;i < nodos.length;i++) {
		var tr		= "idTr" + nodos[i];
		var img		= "idImg" + nodos[i];
		if(document.getElementById(tr)) {
			document.getElementById(tr).style.display	= 'table-row';
			document.getElementById(img).src			= "img/folder-open.jpg";
		}
	}
	return false;
}
var idExpe = "";
function getIdExpe() {
	return idExpe;
}
function setIdExpe(idEx) {
	idExpe = idEx;
}
function getRuta(idExpeSele) {
	var td		= "idTd" + idExpeSele;
	var tdExp	= document.getElementById(td); 
	if(tdExp.title != null && tdExp.title != 'null') {
		var newRuta = getRuta(tdExp.title);
		if(newRuta != null && newRuta != '') {
			return tdExp.title + "," + newRuta;
		} else {
			return tdExp.title;
		}
	} else {
		return "";
	}
}
function elegirExpedientePerm(idExpediente, perCrea, perElim) {
	 $("#idBtnNuevoDoc").css("display","none");
	 $("#idBtnNuevoExp").css("display","none");
	 $("#idBtnEliminar").css("display","none");
	 $("#idBtnEditarDoc").css("display","none");
	 $("#idBtnEditarExp").css("display","none");
	if(perCrea == '1' && perElim == '1') {
		 $("#idBtnNuevoDoc").css("display","block");
		 $("#idBtnNuevoExp").css("display","block");
		 $("#idBtnEliminar").css("display","block");
		 $("#idBtnEditarExp").css("display","block");
	} else if(perCrea == '1') {
		 $("#idBtnNuevoDoc").css("display","block");
		 $("#idBtnNuevoExp").css("display","block");
		 $("#idBtnEditarExp").css("display","block");
	} else if(perElim == '1') {
		 $("#idBtnEliminar").css("display","block");
	}
	elegirExpediente(idExpediente);
}
function elegirExpediente(idExpediente) {
	mostrarMensajesStruts([], $("#idMspError"));
	mostrarMensajesStruts([], $("#idMspInfo"));
	elegirTdDina(idExpediente, getNodosList(), getTotal(), 'true');
}
function elegirExpedienteSinDocumentos(idExpediente) {
	elegirTdDina(idExpediente, getNodosList(), getTotal(), 'false');
}
function liberarExpediente(idExpediente) {
	liberarTdDina(idExpediente, getNodosList(), getTotal());
}
function liberarTdDina() {
	var nodoList =getNodosList();
	var nodos	= nodoList.split(',');
	for(var i = 0;i < nodos.length;i++) {
		document.getElementById('idTd'+nodos[i]).style.color = '';
		document.getElementById('idTd'+nodos[i]).style.fontWeight = '';
	}
	liberarDocumento();
}
function elegirTdDina(idExpeSele, nodoList, total, documentos) {
	var nodos	= nodoList.split(',');
	for(var i = 0;i < nodos.length;i++) {
		$("#idTd"+nodos[i]).removeAttr("style");
		document.getElementById('idTd'+nodos[i]).style.fontWeight = '';
	}
	var td		= "idTd" + idExpeSele;
	$("#"+td).css({"background-color": "#AAAAFF"});
	var tdExp	= document.getElementById(td); 
//	tdExp.style.color		= '#1100FF';
	tdExp.style.fontWeight	= 'bold';
	if(tdExp.title != null && tdExp.title != 'null') {
		expandir(tdExp.title);
	}
	idExpe					= idExpeSele;
	setIdDocumento("");
	var ruta = getRuta(idExpeSele);
	//alert("ruta="+ruta);
	if(documentos == 'true') {
		elegirDocumento(idExpeSele, ruta);
	}
}
//////////////////////////////////////////////////////////////////////////////
///////////////////////////////ZONA EXPLORACION///////////////////////////////
//////////////////////////////////////////////////////////////////////////////
var idDocumento		= "";
function getIdDocumento() {
	return idDocumento;
}
function setIdDocumento(idDo) {
	idDocumento = idDo;
}
function seleccinarDocExp(id) {
	idDocumento		= id;
//	var eleme		= getElementosList();
//	var elementos	= eleme.split(',');
	var eleSegu		= getElementosSeguridadList();
	//alert("eleSegu="+eleSegu);
	 $("#idBtnNuevoDoc").css("display","none");
	 $("#idBtnNuevoExp").css("display","none");
	 $("#idBtnEliminar").css("display","none");
	 $("#idBtnEditarDoc").css("display","none");
	 $("#idBtnEditarExp").css("display","none");
	for(var i = 0;i < eleSegu.length;i++) {
		$("#idDivDraggable_"+eleSegu[i][0]).css({"background-color": ""});
		if(eleSegu[i][0] == id && eleSegu[i][2] == 'Carpeta') {
			if(eleSegu[i][1] == 'creaelim') {
				 $("#idBtnNuevoDoc").css("display","block");
				 $("#idBtnNuevoExp").css("display","block");
				 $("#idBtnEliminar").css("display","block");
				 $("#idBtnEditarExp").css("display","block");
			} else if(eleSegu[i][1] == 'crea') {
				 $("#idBtnNuevoDoc").css("display","block");
				 $("#idBtnNuevoExp").css("display","block");
				 $("#idBtnEditarExp").css("display","block");
			} else if(eleSegu[i][1] == 'elim') {
				 $("#idBtnEliminar").css("display","block");
			} else if(eleSegu[i][1] == 'comun') {
			}
		} else if(eleSegu[i][0] == id && eleSegu[i][2] == 'Documento') {
			if(eleSegu[i][1] == 'creaelim') {
				$("#idBtnEditarDoc").css("display","block");
				 $("#idBtnEliminar").css("display","block");
			} else if(eleSegu[i][1] == 'crea') {
				$("#idBtnEditarDoc").css("display","block");
			} else if(eleSegu[i][1] == 'elim') {
				 $("#idBtnEliminar").css("display","block");
			} else if(eleSegu[i][1] == 'comun') {
			}
		}
	}
	$("#idDivDraggable_"+id).css({"background-color": "#AAAAFF"});
	$('#idMspError').html("#idDivDraggable_"+id);
	
}
function sessionFinalizoJson(datos) {
	//alert("datos="+datos.sessionTimeOut);
	if(datos && datos.sessionTimeOut && datos.sessionTimeOut == 'sessionTimeOut') {
		document.location.href = "salir.action";
		return false;
	}
	return true;
}
function sessionFinalizo(datos) {
	//alert("datos="+datos);
	if(datos.indexOf('sessionTimeOut') != -1) {
		document.location.href = "salir.action";
		return false;
	}
	return true;
}

var ctx = "${pageContext.request.contextPath}";

function ajaxRequest(path,tipoPeticion,tipoDatoRetorno,parametros){
	
	var request = $.ajax({
				        url: path,
				        type: tipoPeticion,
				        dataType:tipoDatoRetorno,
				        data:parametros,
				        async:false
				 });
	
	return request;
}

function ajaxRequest(path,tipoPeticion,tipoDatoRetorno,parametros,tipoContenido){
	
	var request = $.ajax({
				        url: path,
				        type: tipoPeticion,
				        dataType:tipoDatoRetorno,
				        data:parametros,
				        contentType:tipoContenido,
				        async:false
				 });
	
	return request;
}
function blockui() {
	$.blockUI({
		fadeIn : 0,
        fadeOut : 0,
        message : '<h3><img src="image/busy.gif" /> Espere un momento...</h3>'});
}

function unblockui() {
	$.unblockUI();
}


function solonumeros(evt) {
	var target	= null;
	if(evt.target) {
		target	= evt.target;
	} else {
		target	= evt.srcElement;
	}
	var key		= null;
	if(evt) {
		key		= (evt.which) ? evt.which : evt.keyCode;
	} else {
		key		= window.event.keyCode;
	}
	return (key <= 12 || (key >= 48 && key <= 57) || key == 0 || validarEsControlCursor(key));
}
function getKeypressEvent(evt) {
	var key		= null;
	if(evt) {
		key		= (evt.which) ? evt.which : evt.keyCode;
	} else {
		key		= window.event.keyCode;
	}
	return key;
}

function validarEsControlCursor(charCode) {
	return charCode == 8 || charCode == 9 || charCode == 35 || charCode == 36 || charCode == 37 || charCode == 39 || charCode == 46;
}


function formatearNumeroEnCentimos(varNroIni, numDecimales) {
	return formatearNumeroAvd(varNroIni, 1, numDecimales);
}
function formatearNumero(numero, numDecimales) {
	return formatearNumeroAvd(numero, numDecimales, numDecimales);
}
function formatearNumeroAvd(numero, numDecimales, numDecFormato) {
	numero	= parseFloat(numero);
	var salida	= 1;
	var varNro	= "";
	var newNro	= "";
	for(var i = 0;i < numDecimales;i++) {
		salida	 = 10 * salida;
	}
	var resp		= numero * salida;
	var redondeo	= Math.round(resp);
	redondeo		= redondeo / salida;
	varNro			= ""+redondeo;

	var indexDot	= varNro.indexOf(".");
	if(indexDot != -1) {
		var parteDec	= varNro.substring((indexDot + 1), varNro.length);
		var parteEnt	= varNro.substring(0, indexDot);
		if(parteDec.length < numDecFormato) {
			for(var i = 0;i < (numDecFormato-parteDec.length);i++) {
				parteDec += "0";
			}
		}
		newNro	= (parteEnt + "." + parteDec);
	} else {
		newNro	= "" + varNro + ".";
		for(var i = 0;i < (numDecFormato);i++) {
			newNro += "0";
		}
	}
	//document.getElementById('idLblSalida').innerHTML	= newNro;
	return newNro;
}
function completarCerosIzquierda(str, nroDigitos) {
	str		= ""+str;
	if(str.length < nroDigitos) {
		var strNroCaract	= str.length;
		for(var i = 0;i < (nroDigitos-strNroCaract);i++) {
			str = "0" + str;
		}
	}
	return str;
}
/*
$(function(){
	evaluarSessionGeneral();
});
*/
var evaluarSessionGeneralTimeout	= null;
function evaluarSessionGeneral() {
	if(evaluarSessionGeneralTimeout) {
		clearTimeout(evaluarSessionGeneralTimeout);
	}
	evaluarSessionGeneralTimeout	= setTimeout(function() {
		evaluarSessionGeneralTimeout	= null;
		var d		= new Date();
		var fecha	= d.getDate()+"/"+(d.getMonth()+1)+"/"+d.getFullYear()+" "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();
		var reporte = {
		        opc:"validarSessionGeneral",
		        currDate:fecha
		    };
		$.ajax({
			data:reporte,
			url:'ajax/ajaxLogin.php',
			type:'post',
			beforeSend:function(){},
			success:function(response){
				$("#idSpanMarcadorSession").html(response);
				evaluarSessionGeneral();
			}
		});
	}, (1000*30));
}

function createFromStrDate(strDate) {
	if(strDate != "") {
		var dia		= parseInt(strDate.substring(0,2));
		var mes		= parseInt(strDate.substring(3,5)) - 1;
		var anio	= parseInt(strDate.substring(6,10));
		var d		= new Date(anio, mes, dia, 0, 0, 0, 0);
		return d;
	}
	return null;
}
function formatFechaFromDate(date) {
	return completarCerosIzquierda(date.getDate(), 2)+"/"+completarCerosIzquierda((date.getMonth()+1), 2)+"/"+date.getFullYear();
}
function autoFormatoFecha() {
    $(".datepicker").keyup(function(){
        if ($(this).val().length == 2){
            $(this).val($(this).val() + "/");
        }else if ($(this).val().length == 5){
            $(this).val($(this).val() + "/");
        }
    });
}

var keydownshift	= false;
var formControlFirstTimeout	= null;
function iniciarKey(jquery_form) {
	autoFormatoFecha();
	$(".form-control").each(function() {
		$(this).unbind("keypress");
	});
	
	if (formControlFirstTimeout) {
		clearTimeout(formControlFirstTimeout);
	}
	formControlFirstTimeout = setTimeout(function() {
		formControlFirstTimeout = null;
		if(jquery_form) {
			jquery_form.find(".form-control:first").focus();
		} else {
			$(".form-control:first").focus();
		}
	}, 1000);
		
	$(".form-control").keyup(function(event) {
		var key	= getKeypressEvent(event);
		if(key == 16) {
			keydownshift	= false;
		}
		//console.log("keyup key="+key);
		return true;
	});
	$(".form-control").keydown(function(event) {
		var key	= getKeypressEvent(event);
		var nm	= $(this).attr("name");
		//console.log("keydown key="+key+" name="+nm);
		if(key == 16) {
			keydownshift	= true;
			return true;
		}
		if(key == 13 ||key == 9) {
			event.preventDefault();
			var paren	= buscarPadrekp($(this), "");
			if(paren) {
				var next	= false;
				var fin		= false;
				var prevObj	= null;
				var theObj	= null;
				paren.find(".form-control").each(function() {
					if(!fin) {
						theObj		= $(this);
						if(next) {
							theObj.focus();
							fin		= true;
							return true;
						}
						if(nm == $(this).attr("name")) {
							next	= true;
							if(keydownshift) {
								theObj		= prevObj;
								if(theObj == null) {
									theObj	= paren.find(".form-control:last");
								}
								theObj.focus();
								fin		= true;
							}
						}
						prevObj		= $(this);
					}
				});
				if(!fin) {
					paren.find(".form-control:first").focus();
				}
			} else {
				return true;
			}
		}
		return true;
	});
	
}
function buscarPadrekp(jquery_this, space) {
	var paren	= jquery_this.parent();
	if(paren) {
		//console.log(space+"- paren="+paren+" name="+paren.prop("tagName"));
		if(paren.prop("tagName") == "FORM") {
			return paren;
		} else {
			return buscarPadrekp(paren, space+" ");
		}
	} else {
		return null;
	}
}
function validarEmail(email) {
    expr = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    return expr.test(email);
}