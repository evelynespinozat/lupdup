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
import pmp.lupdup.business.core.administrador.dto.SedeEntidadColaboradoraDto;
import pmp.lupdup.business.core.administrador.service.SedeEntidadColaboradoraService;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradora;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Sede Entidad Colaboradora
 * 
 * @author Jober Mena
 * 
 */

public class SedeEntidadColaboradoraAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private SedeEntidadColaboradoraService sedeEntidadColaboradoraService;
	
	private String buscar_srlIdSedeentidad;
	private String buscar_intIdEntidadcolaboradora;
	private String buscar_strNomNombre;
	private String buscar_strDesDireccion;
	private String buscar_strNumTelefono;
	private String buscar_strNumCelular;
	private String buscar_intIdUbigeo;
	
	private String[] buscar_seleccion_id;
	
	private SedeEntidadColaboradoraDto edicion_sedeEntidadColaboradoraDto;
	
	private List<SedeEntidadColaboradora> listSedeEntidadColaboradora;
	

	
	
	public SedeEntidadColaboradoraAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			SedeEntidadColaboradoraDto sedeEntidadColaboradoraDto		= new SedeEntidadColaboradoraDto();
			if(buscar_intIdEntidadcolaboradora != null) {
				sedeEntidadColaboradoraDto.setIntIdEntidadcolaboradora(CadenaUtil.getInte(buscar_intIdEntidadcolaboradora));
			}
			if(buscar_strNomNombre != null && !buscar_strNomNombre.equals("")) {
				sedeEntidadColaboradoraDto.setStrNomNombre(CadenaUtil.getStr(buscar_strNomNombre));
			}
			if(buscar_strDesDireccion != null && !buscar_strDesDireccion.equals("")) {
				sedeEntidadColaboradoraDto.setStrDesDireccion(CadenaUtil.getStr(buscar_strDesDireccion));
			}
			if(buscar_strNumTelefono != null && !buscar_strNumTelefono.equals("")) {
				sedeEntidadColaboradoraDto.setStrNumTelefono(CadenaUtil.getStr(buscar_strNumTelefono));
			}
			if(buscar_strNumCelular != null && !buscar_strNumCelular.equals("")) {
				sedeEntidadColaboradoraDto.setStrNumCelular(CadenaUtil.getStr(buscar_strNumCelular));
			}
			if(buscar_intIdUbigeo != null) {
				sedeEntidadColaboradoraDto.setIntIdUbigeo(CadenaUtil.getInte(buscar_intIdUbigeo));
			}
			
		Integer entidadColaboradoraDto_SrlIdEntidadcolaboradora	= (Integer)session.get("EntidadColaboradoraDto_SrlIdEntidadcolaboradora");
		if(entidadColaboradoraDto_SrlIdEntidadcolaboradora != null) {
			sedeEntidadColaboradoraDto.setIntIdEntidadcolaboradora(entidadColaboradoraDto_SrlIdEntidadcolaboradora);
		}
			listSedeEntidadColaboradora = sedeEntidadColaboradoraService.buscar(sedeEntidadColaboradoraDto);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		SedeEntidadColaboradoraDto sedeEntidadColaboradoraDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				sedeEntidadColaboradoraDto	= new SedeEntidadColaboradoraDto();
				sedeEntidadColaboradoraDto.setSrlIdSedeentidad(CadenaUtil.getInte(buscar_seleccion_id[i]));
				sedeEntidadColaboradoraService.eliminar(sedeEntidadColaboradoraDto);
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
			inicio();
			SedeEntidadColaboradoraDto sedeEntidadColaboradoraDto		= new SedeEntidadColaboradoraDto();
			sedeEntidadColaboradoraDto.setSrlIdSedeentidad(CadenaUtil.getInte(buscar_seleccion_id[0]));
			SedeEntidadColaboradora sedeEntidadColaboradora				= sedeEntidadColaboradoraService.buscarById(sedeEntidadColaboradoraDto);
			if(sedeEntidadColaboradora != null) {
				this.edicion_sedeEntidadColaboradoraDto		= new SedeEntidadColaboradoraDto();
				BeanUtils.copyProperties(sedeEntidadColaboradora, this.edicion_sedeEntidadColaboradoraDto);
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
		inicio();
		this.edicion_sedeEntidadColaboradoraDto		= new SedeEntidadColaboradoraDto();
		Integer entidadColaboradoraDto_SrlIdEntidadcolaboradora	= (Integer)session.get("EntidadColaboradoraDto_SrlIdEntidadcolaboradora");
		if(entidadColaboradoraDto_SrlIdEntidadcolaboradora != null) {
			this.edicion_sedeEntidadColaboradoraDto.setIntIdEntidadcolaboradora(entidadColaboradoraDto_SrlIdEntidadcolaboradora);
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
			
			sedeEntidadColaboradoraService.guardar(this.edicion_sedeEntidadColaboradoraDto);
			
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
	
	public String getBuscar_srlIdSedeentidad() {
		return buscar_srlIdSedeentidad;
	}
	
	public void setBuscar_srlIdSedeentidad(String buscar_srlIdSedeentidad) {
		this.buscar_srlIdSedeentidad = buscar_srlIdSedeentidad;
	}
	public String getBuscar_intIdEntidadcolaboradora() {
		return buscar_intIdEntidadcolaboradora;
	}
	
	public void setBuscar_intIdEntidadcolaboradora(String buscar_intIdEntidadcolaboradora) {
		this.buscar_intIdEntidadcolaboradora = buscar_intIdEntidadcolaboradora;
	}
	public String getBuscar_strNomNombre() {
		return buscar_strNomNombre;
	}
	
	public void setBuscar_strNomNombre(String buscar_strNomNombre) {
		this.buscar_strNomNombre = buscar_strNomNombre;
	}
	public String getBuscar_strDesDireccion() {
		return buscar_strDesDireccion;
	}
	
	public void setBuscar_strDesDireccion(String buscar_strDesDireccion) {
		this.buscar_strDesDireccion = buscar_strDesDireccion;
	}
	public String getBuscar_strNumTelefono() {
		return buscar_strNumTelefono;
	}
	
	public void setBuscar_strNumTelefono(String buscar_strNumTelefono) {
		this.buscar_strNumTelefono = buscar_strNumTelefono;
	}
	public String getBuscar_strNumCelular() {
		return buscar_strNumCelular;
	}
	
	public void setBuscar_strNumCelular(String buscar_strNumCelular) {
		this.buscar_strNumCelular = buscar_strNumCelular;
	}
	public String getBuscar_intIdUbigeo() {
		return buscar_intIdUbigeo;
	}
	
	public void setBuscar_intIdUbigeo(String buscar_intIdUbigeo) {
		this.buscar_intIdUbigeo = buscar_intIdUbigeo;
	}
	
	public SedeEntidadColaboradoraDto getEdicion_sedeEntidadColaboradoraDto() {
		return edicion_sedeEntidadColaboradoraDto;
	}
	
	public void setEdicion_sedeEntidadColaboradoraDto(
			SedeEntidadColaboradoraDto edicion_sedeEntidadColaboradoraDto) {
		this.edicion_sedeEntidadColaboradoraDto = edicion_sedeEntidadColaboradoraDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<SedeEntidadColaboradora> getListSedeEntidadColaboradora() {
		return listSedeEntidadColaboradora;
	}
	
	public void setListSedeEntidadColaboradora(List<SedeEntidadColaboradora> listSedeEntidadColaboradora) {
		this.listSedeEntidadColaboradora = listSedeEntidadColaboradora;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}