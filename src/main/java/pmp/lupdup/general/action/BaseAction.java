package pmp.lupdup.general.action;

import java.util.HashMap;
import java.util.Map;

import pmp.lupdup.business.core.administrador.dto.UsuarioDto;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
	
	public UsuarioDto getUsuarioSession() {
		Map<String, Object> session	= ActionContext.getContext().getSession();
		UsuarioDto usuarioDto		= (UsuarioDto)session.get("USUARIO_ACTUAL");
		return usuarioDto;
	}
	/**/
	private Map<String, Object> edicion_incidenciasVO;
	public String nuevo() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		this.edicion_incidenciasVO		= new HashMap<String, Object>();
		this.edicion_incidenciasVO.put("timFecha", new java.util.Date());
		session.remove("listIncidenciasFoto");
		return SUCCESS;
	}

	
}
