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
import pmp.lupdup.business.core.administrador.dto.SedeSaludDto;
import pmp.lupdup.business.core.administrador.service.SedeSaludService;
import pmp.lupdup.dao.administrador.domain.SedeSalud;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Sede Salud
 * 
 * @author Jober Mena
 * 
 */

public class SedeSaludAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private SedeSaludService sedeSaludService;
	
	private String buscar_srlIdSedesalud;
	private String buscar_strNomNombre;
	private String buscar_strDesDireccion;
	private String buscar_strNumTelefono;
	private String buscar_strNumCelular;
	private String buscar_intIdCentrosalud;
	
	private String[] buscar_seleccion_id;
	
	private SedeSaludDto edicion_sedeSaludDto;
	
	private List<SedeSalud> listSedeSalud;
	

	
	
	public SedeSaludAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		formatoHoraCargar();
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			SedeSaludDto sedeSaludDto		= new SedeSaludDto();
			if(buscar_strNomNombre != null && !buscar_strNomNombre.equals("")) {
				sedeSaludDto.setStrNomNombre(CadenaUtil.getStr(buscar_strNomNombre));
			}
			if(buscar_strDesDireccion != null && !buscar_strDesDireccion.equals("")) {
				sedeSaludDto.setStrDesDireccion(CadenaUtil.getStr(buscar_strDesDireccion));
			}
			if(buscar_strNumTelefono != null && !buscar_strNumTelefono.equals("")) {
				sedeSaludDto.setStrNumTelefono(CadenaUtil.getStr(buscar_strNumTelefono));
			}
			if(buscar_strNumCelular != null && !buscar_strNumCelular.equals("")) {
				sedeSaludDto.setStrNumCelular(CadenaUtil.getStr(buscar_strNumCelular));
			}
			if(buscar_intIdCentrosalud != null) {
				sedeSaludDto.setIntIdCentrosalud(CadenaUtil.getInte(buscar_intIdCentrosalud));
			}
			
		Integer centroSaludDto_SrlIdCentrosalud	= (Integer)session.get("CentroSaludDto_SrlIdCentrosalud");
		if(centroSaludDto_SrlIdCentrosalud != null) {
			sedeSaludDto.setIntIdCentrosalud(centroSaludDto_SrlIdCentrosalud);
		}
			listSedeSalud = sedeSaludService.buscar(sedeSaludDto);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		SedeSaludDto sedeSaludDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				sedeSaludDto	= new SedeSaludDto();
				sedeSaludDto.setSrlIdSedesalud(CadenaUtil.getInte(buscar_seleccion_id[i]));
				sedeSaludService.eliminar(sedeSaludDto);
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
			SedeSaludDto sedeSaludDto		= new SedeSaludDto();
			sedeSaludDto.setSrlIdSedesalud(CadenaUtil.getInte(buscar_seleccion_id[0]));
			SedeSalud sedeSalud				= sedeSaludService.buscarById(sedeSaludDto);
			if(sedeSalud != null) {
				this.edicion_sedeSaludDto		= new SedeSaludDto();
				BeanUtils.copyProperties(sedeSalud, this.edicion_sedeSaludDto);
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
		this.edicion_sedeSaludDto		= new SedeSaludDto();
		Integer centroSaludDto_SrlIdCentrosalud	= (Integer)session.get("CentroSaludDto_SrlIdCentrosalud");
		if(centroSaludDto_SrlIdCentrosalud != null) {
			this.edicion_sedeSaludDto.setIntIdCentrosalud(centroSaludDto_SrlIdCentrosalud);
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
			
			sedeSaludService.guardar(this.edicion_sedeSaludDto);
			
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
	
	public String formatoHoraCargar() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		List<Map> listHora	= new ArrayList<Map>();
		Map map	= new HashMap();
		for(int i = 0;i < 24;i++) {
			for(int j = 0;j < 46;j+=15) {
				map	= new HashMap();
				map.put("id", CadenaUtil.llenarPorIzquierda(""+i, 2, "0")+":"+CadenaUtil.llenarPorIzquierda(""+j, 2, "0"));
				map.put("desc", CadenaUtil.llenarPorIzquierda(""+i, 2, "0")+":"+CadenaUtil.llenarPorIzquierda(""+j, 2, "0"));
				listHora.add(map);
			}
		}
		session.put("listHora", listHora);
		return SUCCESS;
	}
	//////////////////////////////////////////////////////////////////////////////////////
	
	public String getBuscar_srlIdSedesalud() {
		return buscar_srlIdSedesalud;
	}
	
	public void setBuscar_srlIdSedesalud(String buscar_srlIdSedesalud) {
		this.buscar_srlIdSedesalud = buscar_srlIdSedesalud;
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
	public String getBuscar_intIdCentrosalud() {
		return buscar_intIdCentrosalud;
	}
	
	public void setBuscar_intIdCentrosalud(String buscar_intIdCentrosalud) {
		this.buscar_intIdCentrosalud = buscar_intIdCentrosalud;
	}
	
	public SedeSaludDto getEdicion_sedeSaludDto() {
		return edicion_sedeSaludDto;
	}
	
	public void setEdicion_sedeSaludDto(
			SedeSaludDto edicion_sedeSaludDto) {
		this.edicion_sedeSaludDto = edicion_sedeSaludDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<SedeSalud> getListSedeSalud() {
		return listSedeSalud;
	}
	
	public void setListSedeSalud(List<SedeSalud> listSedeSalud) {
		this.listSedeSalud = listSedeSalud;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}