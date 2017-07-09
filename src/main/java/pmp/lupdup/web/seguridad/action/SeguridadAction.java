package pmp.lupdup.web.seguridad.action;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import pmp.lupdup.business.core.administrador.dto.UsuarioDto;
import pmp.lupdup.business.core.administrador.service.UsuarioService;
import pmp.lupdup.business.core.donantes.dto.CitaDto;
import pmp.lupdup.business.core.donantes.service.CitaService;
import pmp.lupdup.dao.administrador.domain.Usuario;
import pmp.lupdup.dao.donantes.domain.Cita;
import pmp.lupdup.general.action.BaseAction;
import pmp.lupdup.general.util.CadenaUtil;
import pmp.lupdup.general.util.ConfiguracionProperties;

import com.opensymphony.xwork2.ActionContext;

/**
 * Clase Action que se usa para la gestion de autenticacion automatica del sistema 
 * 
 * @author Jober Mena
 * 
 */

public class SeguridadAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	
	private String autentica_strPassword;
	private String autentica_strUsuario;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private CitaService citaService;
	
	public String inicio() {
		return SUCCESS;
	}
	
	public String home() {
		if(getUsuarioSession() != null) {
			return "successAuth";
		} else {
			return "success";
		}
	}
	
	/**
	 * Permite validar si una autenticacion es valida
	 * @return
	 */
	public String autenticar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			session.put("ha_donado", false);
			UsuarioDto usuarioDto	= new UsuarioDto();
			Usuario usuario;
			if(CadenaUtil.getStrNull(autentica_strUsuario) != null && CadenaUtil.getStrNull(autentica_strPassword) != null) {
				usuarioDto.setStrNomUsuario(CadenaUtil.getStr(autentica_strUsuario));
				usuarioDto.setStrClvUsuario(CadenaUtil.getStr(autentica_strPassword));
				List<Usuario> listCuentaUsuario	= usuarioService.buscar(usuarioDto);
				if(listCuentaUsuario.size() > 0 && listCuentaUsuario.size() == 1) {
					usuario	= listCuentaUsuario.get(0);
//					if(!usuario.getStrEsActivoBoolean()) {
//						addActionError("La cuenta de usuario no se encuentra activa");
//						return ERROR;
//					}
					usuarioDto	= new UsuarioDto();
					BeanUtils.copyProperties(usuario, usuarioDto);
					session.put("USUARIO_ACTUAL", usuarioDto);
					
					if(usuarioDto.getIntIdDonante() != null) {
						CitaDto citaDto			= new CitaDto();
						citaDto.setIntIdDonante(usuarioDto.getIntIdDonante());
						citaDto.setIntIdEstadoList(Arrays.asList(new Integer[]{
								ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_ESTADO_CITA_DONANTE_ASISTIO),
								ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_ESTADO_CITA_DONANTE_RESULTADO),
								ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_ESTADO_CITA_DONANTE_CORREO)
								}));
						List<Cita> citaList		= citaService.buscar(citaDto);
						if(citaList.size() > 0) {
							session.put("ha_donado", true);
						}
					}
					
					if(usuarioDto.getIntIdPerfil().intValue() == ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.PERFIL_ADMINISTRADOR)) {
						return "successAdmin";
					} else if(usuarioDto.getIntIdPerfil().intValue() == ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.PERFIL_CENTRO_SALUD)) {
						return "successCsalud";
					} else if(usuarioDto.getIntIdPerfil().intValue() == ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.PERFIL_ENTIDAD_COOPERANTE)) {
						return "successEcolab";
					} else {
						return SUCCESS;
					}
				} else {
					addActionError("Error usuario y/o clave invalidad");
					return ERROR;
				}
			} else {
				addActionError("Error debe ingresar su usuario y/o password");
				return ERROR;
			}
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return ERROR;
	}
	
	/**
	 * Finaliza la session de usuario
	 * @return
	 */
	public String salir() {
		try {
			HttpSession session		= ServletActionContext.getRequest().getSession();
			session.invalidate();
		} catch(Exception ex) {
			ex.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	@Override
	public void addActionError(String anErrorMessage) {
		super.addActionError(anErrorMessage);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
	public String getAutentica_strPassword() {
		return autentica_strPassword;
	}
	
	public void setAutentica_strPassword(String autentica_strPassword) {
		this.autentica_strPassword = autentica_strPassword;
	}
	
	public String getAutentica_strUsuario() {
		return autentica_strUsuario;
	}
	
	public void setAutentica_strUsuario(String autentica_strUsuario) {
		this.autentica_strUsuario = autentica_strUsuario;
	}
	
}