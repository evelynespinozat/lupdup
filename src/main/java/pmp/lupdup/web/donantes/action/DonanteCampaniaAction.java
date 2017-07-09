package pmp.lupdup.web.donantes.action;

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

import pmp.lupdup.general.action.BaseAction;
import pmp.lupdup.general.util.CadenaUtil;
import pmp.lupdup.general.util.ConfiguracionProperties;
import pmp.lupdup.business.core.donantes.dto.DonanteCampaniaDto;
import pmp.lupdup.business.core.donantes.service.DonanteCampaniaService;
import pmp.lupdup.dao.donantes.domain.DonanteCampania;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Club
 * 
 * @author Jober Mena
 * 
 */

public class DonanteCampaniaAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private DonanteCampaniaService donanteCampaniaService;
	
	private String buscar_intIdCampania;
	private String buscar_intIdDonante;
	private String buscar_intIndEstado;
	private String buscar_strDesDocumento;
	private String buscar_dblNumPrecio;
	private String buscar_dblNumPrecioPanpania;
	private String buscar_strDesComentario;
	
	private String[] buscar_seleccion_id;
	
	private DonanteCampaniaDto edicion_donanteCampaniaDto;
	
	private List<DonanteCampania> listDonanteCampania;
	

	
	
	public DonanteCampaniaAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			DonanteCampaniaDto donanteCampaniaDto		= new DonanteCampaniaDto();
			if(buscar_intIndEstado != null) {
				donanteCampaniaDto.setIntIndEstado(CadenaUtil.getInte(buscar_intIndEstado));
			}
			if(buscar_strDesDocumento != null && !buscar_strDesDocumento.equals("")) {
				donanteCampaniaDto.setStrDesDocumento(CadenaUtil.getStr(buscar_strDesDocumento));
			}
			if(buscar_strDesComentario != null && !buscar_strDesComentario.equals("")) {
				donanteCampaniaDto.setStrDesComentario(CadenaUtil.getStr(buscar_strDesComentario));
			}
			
			listDonanteCampania = donanteCampaniaService.buscar(donanteCampaniaDto);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			DonanteCampaniaDto donanteCampaniaDto		= new DonanteCampaniaDto();
			if(buscar_intIndEstado != null) {
				donanteCampaniaDto.setIntIndEstado(CadenaUtil.getInte(buscar_intIndEstado));
			}
			if(buscar_strDesDocumento != null && !buscar_strDesDocumento.equals("")) {
				donanteCampaniaDto.setStrDesDocumento(CadenaUtil.getStr(buscar_strDesDocumento));
			}
			if(buscar_strDesComentario != null && !buscar_strDesComentario.equals("")) {
				donanteCampaniaDto.setStrDesComentario(CadenaUtil.getStr(buscar_strDesComentario));
			}
			
			listDonanteCampania = donanteCampaniaService.buscar(donanteCampaniaDto);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		DonanteCampaniaDto donanteCampaniaDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				donanteCampaniaDto	= new DonanteCampaniaDto();
				donanteCampaniaService.eliminar(donanteCampaniaDto);
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
			DonanteCampaniaDto donanteCampaniaDto		= new DonanteCampaniaDto();
			DonanteCampania donanteCampania				= donanteCampaniaService.buscarById(donanteCampaniaDto);
			if(donanteCampania != null) {
				
				this.edicion_donanteCampaniaDto		= new DonanteCampaniaDto();
				BeanUtils.copyProperties(donanteCampania, this.edicion_donanteCampaniaDto);
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
		this.edicion_donanteCampaniaDto		= new DonanteCampaniaDto();
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
			Integer intIdDonante	= getUsuarioSession().getIntIdDonante();
			this.edicion_donanteCampaniaDto.setIntIdDonante(intIdDonante);
			this.edicion_donanteCampaniaDto.setIntIndEstado(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_ESTADO_DONANTE_CAMPANIA_SEPARADO));
			donanteCampaniaService.guardar(this.edicion_donanteCampaniaDto);
			
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
	
	public String getBuscar_intIdCampania() {
		return buscar_intIdCampania;
	}
	
	public void setBuscar_intIdCampania(String buscar_intIdCampania) {
		this.buscar_intIdCampania = buscar_intIdCampania;
	}
	public String getBuscar_intIdDonante() {
		return buscar_intIdDonante;
	}
	
	public void setBuscar_intIdDonante(String buscar_intIdDonante) {
		this.buscar_intIdDonante = buscar_intIdDonante;
	}
	public String getBuscar_intIndEstado() {
		return buscar_intIndEstado;
	}
	
	public void setBuscar_intIndEstado(String buscar_intIndEstado) {
		this.buscar_intIndEstado = buscar_intIndEstado;
	}
	public String getBuscar_strDesDocumento() {
		return buscar_strDesDocumento;
	}
	
	public void setBuscar_strDesDocumento(String buscar_strDesDocumento) {
		this.buscar_strDesDocumento = buscar_strDesDocumento;
	}
	public String getBuscar_dblNumPrecio() {
		return buscar_dblNumPrecio;
	}
	
	public void setBuscar_dblNumPrecio(String buscar_dblNumPrecio) {
		this.buscar_dblNumPrecio = buscar_dblNumPrecio;
	}
	public String getBuscar_dblNumPrecioPanpania() {
		return buscar_dblNumPrecioPanpania;
	}
	
	public void setBuscar_dblNumPrecioPanpania(String buscar_dblNumPrecioPanpania) {
		this.buscar_dblNumPrecioPanpania = buscar_dblNumPrecioPanpania;
	}
	public String getBuscar_strDesComentario() {
		return buscar_strDesComentario;
	}
	
	public void setBuscar_strDesComentario(String buscar_strDesComentario) {
		this.buscar_strDesComentario = buscar_strDesComentario;
	}
	
	public DonanteCampaniaDto getEdicion_donanteCampaniaDto() {
		return edicion_donanteCampaniaDto;
	}
	
	public void setEdicion_donanteCampaniaDto(
			DonanteCampaniaDto edicion_donanteCampaniaDto) {
		this.edicion_donanteCampaniaDto = edicion_donanteCampaniaDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<DonanteCampania> getListDonanteCampania() {
		return listDonanteCampania;
	}
	
	public void setListDonanteCampania(List<DonanteCampania> listDonanteCampania) {
		this.listDonanteCampania = listDonanteCampania;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}