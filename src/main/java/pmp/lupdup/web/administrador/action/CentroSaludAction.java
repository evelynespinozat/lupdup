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
import pmp.lupdup.business.core.administrador.dto.CentroSaludDto;
import pmp.lupdup.business.core.administrador.service.CentroSaludService;
import pmp.lupdup.dao.administrador.domain.CentroSalud;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Centro Salud
 * 
 * @author Jober Mena
 * 
 */

public class CentroSaludAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private CentroSaludService centroSaludService;
	
	private String buscar_srlIdCentrosalud;
	private String buscar_strNomNombre;
	private String buscar_intIndTipoentidad;
	
	private String[] buscar_seleccion_id;
	
	private CentroSaludDto edicion_centroSaludDto;
	
	private List<CentroSalud> listCentroSalud;
	

	
	
	public CentroSaludAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			CentroSaludDto centroSaludDto		= new CentroSaludDto();
			if(buscar_strNomNombre != null && !buscar_strNomNombre.equals("")) {
				centroSaludDto.setStrNomNombre(CadenaUtil.getStr(buscar_strNomNombre));
			}
			if(buscar_intIndTipoentidad != null) {
				centroSaludDto.setIntIndTipoentidad(CadenaUtil.getInte(buscar_intIndTipoentidad));
			}
			
			listCentroSalud = centroSaludService.buscar(centroSaludDto);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		CentroSaludDto centroSaludDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				centroSaludDto	= new CentroSaludDto();
				centroSaludDto.setSrlIdCentrosalud(CadenaUtil.getInte(buscar_seleccion_id[i]));
				centroSaludService.eliminar(centroSaludDto);
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
			CentroSaludDto centroSaludDto		= new CentroSaludDto();
			centroSaludDto.setSrlIdCentrosalud(CadenaUtil.getInte(buscar_seleccion_id[0]));
			CentroSalud centroSalud				= centroSaludService.buscarById(centroSaludDto);
			if(centroSalud != null) {
				this.edicion_centroSaludDto		= new CentroSaludDto();
				BeanUtils.copyProperties(centroSalud, this.edicion_centroSaludDto);
				session.put("CentroSaludDto_SrlIdCentrosalud", this.edicion_centroSaludDto.getSrlIdCentrosalud());
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
		this.edicion_centroSaludDto		= new CentroSaludDto();
		try {
			centroSaludService.guardar(this.edicion_centroSaludDto);
			session.put("CentroSaludDto_SrlIdCentrosalud", this.edicion_centroSaludDto.getSrlIdCentrosalud());
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
			
			centroSaludService.guardar(this.edicion_centroSaludDto);
			
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
	
	public String getBuscar_srlIdCentrosalud() {
		return buscar_srlIdCentrosalud;
	}
	
	public void setBuscar_srlIdCentrosalud(String buscar_srlIdCentrosalud) {
		this.buscar_srlIdCentrosalud = buscar_srlIdCentrosalud;
	}
	public String getBuscar_strNomNombre() {
		return buscar_strNomNombre;
	}
	
	public void setBuscar_strNomNombre(String buscar_strNomNombre) {
		this.buscar_strNomNombre = buscar_strNomNombre;
	}
	public String getBuscar_intIndTipoentidad() {
		return buscar_intIndTipoentidad;
	}
	
	public void setBuscar_intIndTipoentidad(String buscar_intIndTipoentidad) {
		this.buscar_intIndTipoentidad = buscar_intIndTipoentidad;
	}
	
	public CentroSaludDto getEdicion_centroSaludDto() {
		return edicion_centroSaludDto;
	}
	
	public void setEdicion_centroSaludDto(
			CentroSaludDto edicion_centroSaludDto) {
		this.edicion_centroSaludDto = edicion_centroSaludDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<CentroSalud> getListCentroSalud() {
		return listCentroSalud;
	}
	
	public void setListCentroSalud(List<CentroSalud> listCentroSalud) {
		this.listCentroSalud = listCentroSalud;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}