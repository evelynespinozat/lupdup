package pmp.lupdup.web.administrador.action;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collection;
import java.util.Map;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pmp.lupdup.general.util.CadenaUtil;
import pmp.lupdup.business.core.administrador.dto.UbigeoDto;
import pmp.lupdup.business.core.administrador.service.UbigeoService;
import pmp.lupdup.dao.administrador.domain.Ubigeo;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Ubigeo
 * 
 * @author Jober Mena
 * 
 */

public class UbigeoAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private UbigeoService ubigeoService;
	
	private String buscar_srlIdUbigeo;
	private String buscar_intIdDepartamento;
	private String buscar_intIdProvincia;
	private String buscar_intIdDistrito;
	private String buscar_strDesUbigeo;
	
	private String[] buscar_seleccion_id;
	
	private UbigeoDto edicion_ubigeoDto;
	
	private List<Ubigeo> listUbigeo;
	

	
	
	public UbigeoAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			UbigeoDto ubigeoDto		= new UbigeoDto();
			if(buscar_intIdDepartamento != null) {
				ubigeoDto.setIntIdDepartamento(CadenaUtil.getInte(buscar_intIdDepartamento));
			}
			if(buscar_intIdProvincia != null) {
				ubigeoDto.setIntIdProvincia(CadenaUtil.getInte(buscar_intIdProvincia));
			}
			if(buscar_intIdDistrito != null) {
				ubigeoDto.setIntIdDistrito(CadenaUtil.getInte(buscar_intIdDistrito));
			}
			if(buscar_strDesUbigeo != null && !buscar_strDesUbigeo.equals("")) {
				ubigeoDto.setStrDesUbigeo(CadenaUtil.getStr(buscar_strDesUbigeo));
			}
			
			listUbigeo = ubigeoService.buscar(ubigeoDto);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		UbigeoDto ubigeoDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				ubigeoDto	= new UbigeoDto();
				ubigeoDto.setSrlIdUbigeo(CadenaUtil.getInte(buscar_seleccion_id[i]));
				ubigeoService.eliminar(ubigeoDto);
			}
			addActionMessage("Se elimin\u00f3 satisfactoriamente el registro");
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String editar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			UbigeoDto ubigeoDto		= new UbigeoDto();
			ubigeoDto.setSrlIdUbigeo(CadenaUtil.getInte(buscar_seleccion_id[0]));
			Ubigeo ubigeo				= ubigeoService.buscarById(ubigeoDto);
			if(ubigeo != null) {
				this.edicion_ubigeoDto		= new UbigeoDto();
				BeanUtils.copyProperties(ubigeo, this.edicion_ubigeoDto);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String nuevo() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		this.edicion_ubigeoDto		= new UbigeoDto();
		return SUCCESS;
	}
	
	public String guardar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		boolean error	= false;
		try {
			if(error) {
				throw new Exception("");
			}
			
			ubigeoService.guardar(this.edicion_ubigeoDto);
			
			addActionMessage("Se registro satisfactoriamente");
		} catch(Exception ex) {
			ex.printStackTrace();
			if(!CadenaUtil.getStr(ex.getMessage()).equals("")) {
				addActionError("Ocurrio un error:" + ex.getMessage());
			}
			return ERROR;
		}
		return SUCCESS;
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public String getBuscar_srlIdUbigeo() {
		return buscar_srlIdUbigeo;
	}
	
	public void setBuscar_srlIdUbigeo(String buscar_srlIdUbigeo) {
		this.buscar_srlIdUbigeo = buscar_srlIdUbigeo;
	}
	public String getBuscar_intIdDepartamento() {
		return buscar_intIdDepartamento;
	}
	
	public void setBuscar_intIdDepartamento(String buscar_intIdDepartamento) {
		this.buscar_intIdDepartamento = buscar_intIdDepartamento;
	}
	public String getBuscar_intIdProvincia() {
		return buscar_intIdProvincia;
	}
	
	public void setBuscar_intIdProvincia(String buscar_intIdProvincia) {
		this.buscar_intIdProvincia = buscar_intIdProvincia;
	}
	public String getBuscar_intIdDistrito() {
		return buscar_intIdDistrito;
	}
	
	public void setBuscar_intIdDistrito(String buscar_intIdDistrito) {
		this.buscar_intIdDistrito = buscar_intIdDistrito;
	}
	public String getBuscar_strDesUbigeo() {
		return buscar_strDesUbigeo;
	}
	
	public void setBuscar_strDesUbigeo(String buscar_strDesUbigeo) {
		this.buscar_strDesUbigeo = buscar_strDesUbigeo;
	}
	
	public UbigeoDto getEdicion_ubigeoDto() {
		return edicion_ubigeoDto;
	}
	
	public void setEdicion_ubigeoDto(
			UbigeoDto edicion_ubigeoDto) {
		this.edicion_ubigeoDto = edicion_ubigeoDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<Ubigeo> getListUbigeo() {
		return listUbigeo;
	}
	
	public void setListUbigeo(List<Ubigeo> listUbigeo) {
		this.listUbigeo = listUbigeo;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}