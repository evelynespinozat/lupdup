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
import pmp.lupdup.business.core.administrador.dto.EntidadColaboradoraDto;
import pmp.lupdup.business.core.administrador.service.EntidadColaboradoraService;
import pmp.lupdup.dao.administrador.domain.EntidadColaboradora;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Entidad Colaboradora
 * 
 * @author Jober Mena
 * 
 */

public class EntidadColaboradoraAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private EntidadColaboradoraService entidadColaboradoraService;
	
	private String buscar_srlIdEntidadcolaboradora;
	private String buscar_strNomNombre;
	
	private String[] buscar_seleccion_id;
	
	private EntidadColaboradoraDto edicion_entidadColaboradoraDto;
	
	private List<EntidadColaboradora> listEntidadColaboradora;
	

	
	
	public EntidadColaboradoraAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			EntidadColaboradoraDto entidadColaboradoraDto		= new EntidadColaboradoraDto();
			if(buscar_strNomNombre != null && !buscar_strNomNombre.equals("")) {
				entidadColaboradoraDto.setStrNomNombre(CadenaUtil.getStr(buscar_strNomNombre));
			}
			
			listEntidadColaboradora = entidadColaboradoraService.buscar(entidadColaboradoraDto);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		EntidadColaboradoraDto entidadColaboradoraDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				entidadColaboradoraDto	= new EntidadColaboradoraDto();
				entidadColaboradoraDto.setSrlIdEntidadcolaboradora(CadenaUtil.getInte(buscar_seleccion_id[i]));
				entidadColaboradoraService.eliminar(entidadColaboradoraDto);
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
			EntidadColaboradoraDto entidadColaboradoraDto		= new EntidadColaboradoraDto();
			entidadColaboradoraDto.setSrlIdEntidadcolaboradora(CadenaUtil.getInte(buscar_seleccion_id[0]));
			EntidadColaboradora entidadColaboradora				= entidadColaboradoraService.buscarById(entidadColaboradoraDto);
			if(entidadColaboradora != null) {
				this.edicion_entidadColaboradoraDto		= new EntidadColaboradoraDto();
				BeanUtils.copyProperties(entidadColaboradora, this.edicion_entidadColaboradoraDto);
				session.put("EntidadColaboradoraDto_SrlIdEntidadcolaboradora", this.edicion_entidadColaboradoraDto.getSrlIdEntidadcolaboradora());
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
		this.edicion_entidadColaboradoraDto		= new EntidadColaboradoraDto();
		try {
			entidadColaboradoraService.guardar(this.edicion_entidadColaboradoraDto);
			session.put("EntidadColaboradoraDto_SrlIdEntidadcolaboradora", this.edicion_entidadColaboradoraDto.getSrlIdEntidadcolaboradora());
		} catch(Exception ex) {
			ex.printStackTrace();
			if(!CadenaUtil.getStr(ex.getMessage()).equals("")) {
				addActionError("Ocurrio un error:" + ex.getMessage());
			}
			return ERROR;
		}
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
			
			entidadColaboradoraService.guardar(this.edicion_entidadColaboradoraDto);
			
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
	
	public String getBuscar_srlIdEntidadcolaboradora() {
		return buscar_srlIdEntidadcolaboradora;
	}
	
	public void setBuscar_srlIdEntidadcolaboradora(String buscar_srlIdEntidadcolaboradora) {
		this.buscar_srlIdEntidadcolaboradora = buscar_srlIdEntidadcolaboradora;
	}
	public String getBuscar_strNomNombre() {
		return buscar_strNomNombre;
	}
	
	public void setBuscar_strNomNombre(String buscar_strNomNombre) {
		this.buscar_strNomNombre = buscar_strNomNombre;
	}
	
	public EntidadColaboradoraDto getEdicion_entidadColaboradoraDto() {
		return edicion_entidadColaboradoraDto;
	}
	
	public void setEdicion_entidadColaboradoraDto(
			EntidadColaboradoraDto edicion_entidadColaboradoraDto) {
		this.edicion_entidadColaboradoraDto = edicion_entidadColaboradoraDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<EntidadColaboradora> getListEntidadColaboradora() {
		return listEntidadColaboradora;
	}
	
	public void setListEntidadColaboradora(List<EntidadColaboradora> listEntidadColaboradora) {
		this.listEntidadColaboradora = listEntidadColaboradora;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}