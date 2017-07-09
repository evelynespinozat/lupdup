package pmp.lupdup.web.ecooperante.action;

import java.util.Date;
import java.util.List;
import java.util.Collection;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import pmp.lupdup.general.util.CadenaUtil;
import pmp.lupdup.general.util.ConfiguracionProperties;
import pmp.lupdup.business.core.ecooperante.dto.ClubDonanteCampaniaDto;
import pmp.lupdup.business.core.ecooperante.service.ClubDonanteCampaniaService;
import pmp.lupdup.dao.ecooperante.domain.ClubDonanteCampania;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Donantes en campana
 * 
 * @author Jober Mena
 * 
 */

public class ClubDonanteCampaniaAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private ClubDonanteCampaniaService clubDonanteCampaniaService;
	
	private String buscar_intIdCampania;
	private String buscar_intIdDonante;
	private String buscar_intIndEstado;
	private String buscar_strDesDocumento;
	private String buscar_dblNumPrecio;
	private String buscar_dblNumPrecioPanpania;
	private String buscar_strDesComentario;
	
	private String[] buscar_seleccion_id;
	
	private ClubDonanteCampaniaDto edicion_clubDonanteCampaniaDto;
	
	private List<ClubDonanteCampania> listClubDonanteCampania;
	
	public ClubDonanteCampaniaAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			ClubDonanteCampaniaDto clubDonanteCampaniaDto		= new ClubDonanteCampaniaDto();
			if(buscar_intIndEstado != null) {
				clubDonanteCampaniaDto.setIntIndEstado(CadenaUtil.getInte(buscar_intIndEstado));
			}
			if(buscar_strDesDocumento != null && !buscar_strDesDocumento.equals("")) {
				clubDonanteCampaniaDto.setStrDesDocumento(CadenaUtil.getStr(buscar_strDesDocumento));
			}
			if(buscar_strDesComentario != null && !buscar_strDesComentario.equals("")) {
				clubDonanteCampaniaDto.setStrDesComentario(CadenaUtil.getStr(buscar_strDesComentario));
			}
			clubDonanteCampaniaDto.setIntIndEstado(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_ESTADO_DONANTE_CAMPANIA_SEPARADO));
			listClubDonanteCampania = clubDonanteCampaniaService.buscar(clubDonanteCampaniaDto);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		ClubDonanteCampaniaDto clubDonanteCampaniaDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				clubDonanteCampaniaDto	= new ClubDonanteCampaniaDto();
				clubDonanteCampaniaService.eliminar(clubDonanteCampaniaDto);
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
			ClubDonanteCampaniaDto clubDonanteCampaniaDto		= new ClubDonanteCampaniaDto();
			clubDonanteCampaniaDto.setIntIdCampania(CadenaUtil.getInte(request.getParameter("intIdCampania")));
			clubDonanteCampaniaDto.setIntIdDonante(CadenaUtil.getInte(request.getParameter("intIdDonante")));
			ClubDonanteCampania clubDonanteCampania				= clubDonanteCampaniaService.buscarById(clubDonanteCampaniaDto);
			if(clubDonanteCampania != null) {
				this.edicion_clubDonanteCampaniaDto		= new ClubDonanteCampaniaDto();
				BeanUtils.copyProperties(clubDonanteCampania, this.edicion_clubDonanteCampaniaDto);
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
		this.edicion_clubDonanteCampaniaDto		= new ClubDonanteCampaniaDto();
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
			
			this.edicion_clubDonanteCampaniaDto.setDteFecAsiste(new Date());
			this.edicion_clubDonanteCampaniaDto.setStrHorAsiste(CadenaUtil.getStrHoraMinutos(new Date()));
			
			this.edicion_clubDonanteCampaniaDto.setIntIndEstado(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_ESTADO_DONANTE_CAMPANIA_ATENDIDO));
			clubDonanteCampaniaService.guardar(this.edicion_clubDonanteCampaniaDto);
			
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
	
	public ClubDonanteCampaniaDto getEdicion_clubDonanteCampaniaDto() {
		return edicion_clubDonanteCampaniaDto;
	}
	public void setEdicion_clubDonanteCampaniaDto(
			ClubDonanteCampaniaDto edicion_clubDonanteCampaniaDto) {
		this.edicion_clubDonanteCampaniaDto = edicion_clubDonanteCampaniaDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<ClubDonanteCampania> getListClubDonanteCampania() {
		return listClubDonanteCampania;
	}
	public void setListClubDonanteCampania(List<ClubDonanteCampania> listClubDonanteCampania) {
		this.listClubDonanteCampania = listClubDonanteCampania;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}