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

import pmp.lupdup.general.action.BaseAction;
import pmp.lupdup.general.util.CadenaUtil;
import pmp.lupdup.general.util.ConfiguracionProperties;
import pmp.lupdup.business.core.administrador.dto.CentroSaludDto;
import pmp.lupdup.business.core.administrador.dto.SedeSaludDto;
import pmp.lupdup.business.core.administrador.dto.UsuarioCentroSaludDto;
import pmp.lupdup.business.core.administrador.service.CentroSaludService;
import pmp.lupdup.business.core.administrador.service.SedeSaludService;
import pmp.lupdup.business.core.administrador.service.UsuarioCentroSaludService;
import pmp.lupdup.dao.administrador.domain.CentroSalud;
import pmp.lupdup.dao.administrador.domain.SedeSalud;
import pmp.lupdup.dao.administrador.domain.UsuarioCentroSalud;
import pmp.lupdup.business.core.administrador.dto.PerfilDto;
import pmp.lupdup.business.core.administrador.service.PerfilService;
import pmp.lupdup.dao.administrador.domain.Perfil;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Usuario
 * 
 * @author Jober Mena
 * 
 */

public class UsuarioCentroSaludAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private UsuarioCentroSaludService usuarioCentroSaludService;

	@Autowired
	private PerfilService perfilService;

	@Autowired
	private CentroSaludService centroSaludService;

	@Autowired
	private SedeSaludService sedeSaludService;
	
	private String buscar_srlIdUsuario;
	private String buscar_intIdDonante;
	private String buscar_intIdPerfil;
	private String buscar_strNomUsuario;
	private String buscar_strClvUsuario;
	private String buscar_strNomResponsable;
	private String buscar_strNomAppaterno;
	private String buscar_strNomApmaterno;
	private String buscar_strDesTelefono;
	private String buscar_strDesCorreo;
	private String buscar_strDesCelular;
//	private String buscar_intIdCentrosalud;
//	private String buscar_intIdEntidadcolaboradora;
	
	private String[] buscar_seleccion_id;
	
	private UsuarioCentroSaludDto edicion_usuarioCentroSaludDto;
	
	private List<UsuarioCentroSalud> listUsuarioCentroSalud;
	

	
	
	public UsuarioCentroSaludAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		perfilCargar();
		sedeCentroSaludCargar();
		centroSaludCargar();
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			UsuarioCentroSaludDto usuarioCentroSaludDto		= new UsuarioCentroSaludDto();
			if(buscar_intIdDonante != null) {
				usuarioCentroSaludDto.setIntIdDonante(CadenaUtil.getInte(buscar_intIdDonante));
			}
			if(buscar_intIdPerfil != null) {
				usuarioCentroSaludDto.setIntIdPerfil(CadenaUtil.getInte(buscar_intIdPerfil));
			}
			if(buscar_strNomUsuario != null && !buscar_strNomUsuario.equals("")) {
				usuarioCentroSaludDto.setStrNomUsuario(CadenaUtil.getStr(buscar_strNomUsuario));
			}
			if(buscar_strClvUsuario != null && !buscar_strClvUsuario.equals("")) {
				usuarioCentroSaludDto.setStrClvUsuario(CadenaUtil.getStr(buscar_strClvUsuario));
			}
			if(buscar_strNomResponsable != null && !buscar_strNomResponsable.equals("")) {
				usuarioCentroSaludDto.setStrNomResponsable(CadenaUtil.getStr(buscar_strNomResponsable));
			}
			if(buscar_strNomAppaterno != null && !buscar_strNomAppaterno.equals("")) {
				usuarioCentroSaludDto.setStrNomAppaterno(CadenaUtil.getStr(buscar_strNomAppaterno));
			}
			if(buscar_strNomApmaterno != null && !buscar_strNomApmaterno.equals("")) {
				usuarioCentroSaludDto.setStrNomApmaterno(CadenaUtil.getStr(buscar_strNomApmaterno));
			}
			if(buscar_strDesTelefono != null && !buscar_strDesTelefono.equals("")) {
				usuarioCentroSaludDto.setStrDesTelefono(CadenaUtil.getStr(buscar_strDesTelefono));
			}
			if(buscar_strDesCorreo != null && !buscar_strDesCorreo.equals("")) {
				usuarioCentroSaludDto.setStrDesCorreo(CadenaUtil.getStr(buscar_strDesCorreo));
			}
			if(buscar_strDesCelular != null && !buscar_strDesCelular.equals("")) {
				usuarioCentroSaludDto.setStrDesCelular(CadenaUtil.getStr(buscar_strDesCelular));
			}
			
			if(session.get("CentroSaludDto_SrlIdCentrosalud") != null) {
				usuarioCentroSaludDto.setIntIdCentrosalud(CadenaUtil.getInte(session.get("CentroSaludDto_SrlIdCentrosalud")));
			}
			
			listUsuarioCentroSalud = usuarioCentroSaludService.buscar(usuarioCentroSaludDto);
		} catch(Exception ex) {
			//ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		UsuarioCentroSaludDto usuarioCentroSaludDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				usuarioCentroSaludDto	= new UsuarioCentroSaludDto();
				usuarioCentroSaludDto.setSrlIdUsuario(CadenaUtil.getInte(buscar_seleccion_id[i]));
				usuarioCentroSaludService.eliminar(usuarioCentroSaludDto);
			}
			addActionMessage("Se elimin\u00f3 satisfactoriamente el registro");
		} catch(Exception ex) {
			//ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String editar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			inicio();
			UsuarioCentroSaludDto usuarioCentroSaludDto		= new UsuarioCentroSaludDto();
			usuarioCentroSaludDto.setSrlIdUsuario(CadenaUtil.getInte(buscar_seleccion_id[0]));
			UsuarioCentroSalud usuarioCentroSalud				= usuarioCentroSaludService.buscarById(usuarioCentroSaludDto);
			if(usuarioCentroSalud != null) {
				this.edicion_usuarioCentroSaludDto		= new UsuarioCentroSaludDto();
				BeanUtils.copyProperties(usuarioCentroSalud, this.edicion_usuarioCentroSaludDto);
			}
		} catch(Exception ex) {
			//ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String nuevo() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		inicio();
		this.edicion_usuarioCentroSaludDto		= new UsuarioCentroSaludDto();
		this.edicion_usuarioCentroSaludDto.setIntIdPerfil(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.PERFIL_CENTRO_SALUD));
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
			
			this.edicion_usuarioCentroSaludDto.setIntIdPerfil(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.PERFIL_CENTRO_SALUD));
			usuarioCentroSaludService.guardar(this.edicion_usuarioCentroSaludDto);
			
			addActionMessage("Se registro satisfactoriamente");
		} catch(Exception ex) {
			//ex.printStackTrace();
			if(!CadenaUtil.getStr(ex.getMessage()).equals("")) {
				addActionError("Ocurrio un error:" + ex.getMessage());
			}
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String perfilCargar() {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			PerfilDto perfilDto = new PerfilDto();

			List<Perfil> list		= perfilService.buscar(perfilDto);
			session.put("listPerfil", list);
		} catch(Exception ex) {
			//ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	public String sedeCentroSaludCargar() {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			SedeSaludDto sedeSaludDto = new SedeSaludDto();
			Integer srlIdCentrosalud		= CadenaUtil.getInte(session.get("CentroSaludDto_SrlIdCentrosalud"));
			if(srlIdCentrosalud > 0) {
				sedeSaludDto.setIntIdCentrosalud(srlIdCentrosalud);
			}
			List<SedeSalud> list		= sedeSaludService.buscar(sedeSaludDto);
			session.put("listSedeSalud", list);
		} catch(Exception ex) {
			//ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}

	public String centroSaludCargar() {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			CentroSaludDto centroSaludDto = new CentroSaludDto();
			List<CentroSalud> list		= centroSaludService.buscar(centroSaludDto);
			session.put("listCentroSalud", list);
		} catch(Exception ex) {
			//ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public String getBuscar_srlIdUsuario() {
		return buscar_srlIdUsuario;
	}
	
	public void setBuscar_srlIdUsuario(String buscar_srlIdUsuario) {
		this.buscar_srlIdUsuario = buscar_srlIdUsuario;
	}
	public String getBuscar_intIdDonante() {
		return buscar_intIdDonante;
	}
	
	public void setBuscar_intIdDonante(String buscar_intIdDonante) {
		this.buscar_intIdDonante = buscar_intIdDonante;
	}
	public String getBuscar_intIdPerfil() {
		return buscar_intIdPerfil;
	}
	
	public void setBuscar_intIdPerfil(String buscar_intIdPerfil) {
		this.buscar_intIdPerfil = buscar_intIdPerfil;
	}
	public String getBuscar_strNomUsuario() {
		return buscar_strNomUsuario;
	}
	
	public void setBuscar_strNomUsuario(String buscar_strNomUsuario) {
		this.buscar_strNomUsuario = buscar_strNomUsuario;
	}
	public String getBuscar_strClvUsuario() {
		return buscar_strClvUsuario;
	}
	
	public void setBuscar_strClvUsuario(String buscar_strClvUsuario) {
		this.buscar_strClvUsuario = buscar_strClvUsuario;
	}
	public String getBuscar_strNomResponsable() {
		return buscar_strNomResponsable;
	}
	
	public void setBuscar_strNomResponsable(String buscar_strNomResponsable) {
		this.buscar_strNomResponsable = buscar_strNomResponsable;
	}
	public String getBuscar_strNomAppaterno() {
		return buscar_strNomAppaterno;
	}
	
	public void setBuscar_strNomAppaterno(String buscar_strNomAppaterno) {
		this.buscar_strNomAppaterno = buscar_strNomAppaterno;
	}
	public String getBuscar_strNomApmaterno() {
		return buscar_strNomApmaterno;
	}
	
	public void setBuscar_strNomApmaterno(String buscar_strNomApmaterno) {
		this.buscar_strNomApmaterno = buscar_strNomApmaterno;
	}
	public String getBuscar_strDesTelefono() {
		return buscar_strDesTelefono;
	}
	
	public void setBuscar_strDesTelefono(String buscar_strDesTelefono) {
		this.buscar_strDesTelefono = buscar_strDesTelefono;
	}
	public String getBuscar_strDesCorreo() {
		return buscar_strDesCorreo;
	}
	
	public void setBuscar_strDesCorreo(String buscar_strDesCorreo) {
		this.buscar_strDesCorreo = buscar_strDesCorreo;
	}
	public String getBuscar_strDesCelular() {
		return buscar_strDesCelular;
	}
	
	public void setBuscar_strDesCelular(String buscar_strDesCelular) {
		this.buscar_strDesCelular = buscar_strDesCelular;
	}
	
	public UsuarioCentroSaludDto getEdicion_usuarioCentroSaludDto() {
		return edicion_usuarioCentroSaludDto;
	}
	
	public void setEdicion_usuarioCentroSaludDto(
			UsuarioCentroSaludDto edicion_usuarioCentroSaludDto) {
		this.edicion_usuarioCentroSaludDto = edicion_usuarioCentroSaludDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<UsuarioCentroSalud> getListUsuarioCentroSalud() {
		return listUsuarioCentroSalud;
	}
	
	public void setListUsuarioCentroSalud(List<UsuarioCentroSalud> listUsuarioCentroSalud) {
		this.listUsuarioCentroSalud = listUsuarioCentroSalud;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}