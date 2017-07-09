package pmp.lupdup.web.donantes.action;

import java.util.List;
import java.util.Collection;
import java.util.Map;

import javax.security.auth.callback.ConfirmationCallback;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import pmp.lupdup.general.util.CadenaUtil;
import pmp.lupdup.general.util.ConfiguracionProperties;
import pmp.lupdup.business.core.donantes.dto.CitaDto;
import pmp.lupdup.business.core.donantes.dto.DonanteDto;
import pmp.lupdup.business.core.donantes.service.CitaService;
import pmp.lupdup.business.core.donantes.service.DonanteService;
import pmp.lupdup.dao.donantes.domain.Donante;
import pmp.lupdup.business.core.administrador.dto.CatalogoDto;
import pmp.lupdup.business.core.administrador.dto.UbigeoDto;
import pmp.lupdup.business.core.administrador.dto.UsuarioDto;
import pmp.lupdup.business.core.administrador.service.CatalogoService;
import pmp.lupdup.business.core.administrador.service.UbigeoService;
import pmp.lupdup.business.core.administrador.service.UsuarioService;
import pmp.lupdup.dao.administrador.domain.Catalogo;
import pmp.lupdup.dao.administrador.domain.Ubigeo;
import pmp.lupdup.dao.administrador.domain.Usuario;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Donante
 * 
 * @author Jober Mena
 * 
 */

public class DonanteAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private DonanteService donanteService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private CatalogoService catalogoService;
	
	@Autowired
	private UbigeoService ubigeoService;
	
	@Autowired
	private CitaService citaService;
	
	private String buscar_srlIdDonante;
	private String buscar_intIdUsuario;
	private String buscar_strNomNombre;
	private String buscar_strNomAppaterno;
	private String buscar_strNomApmaterno;
	private String buscar_dteFecNacimiento;
	private String buscar_intIndEstadocivil;
	private String buscar_intIndSexo;
	private String buscar_intDesGradoinstruc;
	private String buscar_strDesOcupacion;
	private String buscar_intIndDonante;
	private String buscar_strNumCelular;
	private String buscar_strNumCelular2;
	private String buscar_strNumTelefono;
	private String buscar_strDesCorreo;
	private String buscar_strDesDireccion;
	private String buscar_intCntPuntos;
	private String buscar_intIndTipo;
	
	private String[] buscar_seleccion_id;
	
	private DonanteDto edicion_donanteDto;
	private UsuarioDto edicion_usuarioDto;
	
	private List<Donante> listDonante;
	
	public DonanteAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			catalogoSiNoCargar();
			catalogoGradoInstruccionCargar();
			catalogoSexoCargar();
			catalogoEstadoCivilCargar();
			ubigeoDepartamentoCargar();
			
			UsuarioDto usuarioDto	= (UsuarioDto)session.get("USUARIO_ACTUAL");
			Integer intIdDonante	= null;
			if(usuarioDto != null) {
				intIdDonante	= usuarioDto.getIntIdDonante();
			}
			if(CadenaUtil.getInteNull(intIdDonante) != null) {
				buscar_seleccion_id	= new String[]{""+intIdDonante};
				editar();
//				DonanteDto donanteDto		= new DonanteDto();
//				donanteDto.setSrlIdDonante(intIdDonante);
//				Donante donante				= donanteService.buscarById(donanteDto);
//				if(donante != null) {
//					this.edicion_donanteDto		= new DonanteDto();
//					BeanUtils.copyProperties(donante, this.edicion_donanteDto);
//					session.put("DonanteDto_SrlIdDonante", this.edicion_donanteDto.getSrlIdDonante());
//				}
			} else {
				nuevo();
			}
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
			DonanteDto donanteDto		= new DonanteDto();
			if(buscar_strNomNombre != null && !buscar_strNomNombre.equals("")) {
				donanteDto.setStrNomNombre(CadenaUtil.getStr(buscar_strNomNombre));
			}
			if(buscar_strNomAppaterno != null && !buscar_strNomAppaterno.equals("")) {
				donanteDto.setStrNomAppaterno(CadenaUtil.getStr(buscar_strNomAppaterno));
			}
			if(buscar_strNomApmaterno != null && !buscar_strNomApmaterno.equals("")) {
				donanteDto.setStrNomApmaterno(CadenaUtil.getStr(buscar_strNomApmaterno));
			}
			if(buscar_dteFecNacimiento != null && !buscar_dteFecNacimiento.equals("")) {
				donanteDto.setDteFecNacimiento(CadenaUtil.getDateFromStr(buscar_dteFecNacimiento));
			}
			if(buscar_intIndEstadocivil != null) {
				donanteDto.setIntIndEstadocivil(CadenaUtil.getInte(buscar_intIndEstadocivil));
			}
			if(buscar_intIndSexo != null) {
				donanteDto.setIntIndSexo(CadenaUtil.getInte(buscar_intIndSexo));
			}
			if(buscar_intDesGradoinstruc != null) {
				donanteDto.setIntDesGradoinstruc(CadenaUtil.getInte(buscar_intDesGradoinstruc));
			}
			if(buscar_strDesOcupacion != null && !buscar_strDesOcupacion.equals("")) {
				donanteDto.setStrDesOcupacion(CadenaUtil.getStr(buscar_strDesOcupacion));
			}
			if(buscar_intIndDonante != null) {
				donanteDto.setIntIndDonante(CadenaUtil.getInte(buscar_intIndDonante));
			}
			if(buscar_strNumCelular != null && !buscar_strNumCelular.equals("")) {
				donanteDto.setStrNumCelular(CadenaUtil.getStr(buscar_strNumCelular));
			}
			if(buscar_strNumCelular2 != null && !buscar_strNumCelular2.equals("")) {
				donanteDto.setStrNumCelular2(CadenaUtil.getStr(buscar_strNumCelular2));
			}
			if(buscar_strNumTelefono != null && !buscar_strNumTelefono.equals("")) {
				donanteDto.setStrNumTelefono(CadenaUtil.getStr(buscar_strNumTelefono));
			}
			if(buscar_strDesCorreo != null && !buscar_strDesCorreo.equals("")) {
				donanteDto.setStrDesCorreo(CadenaUtil.getStr(buscar_strDesCorreo));
			}
			if(buscar_strDesDireccion != null && !buscar_strDesDireccion.equals("")) {
				donanteDto.setStrDesDireccion(CadenaUtil.getStr(buscar_strDesDireccion));
			}
			if(buscar_intCntPuntos != null) {
				donanteDto.setIntCntPuntos(CadenaUtil.getInte(buscar_intCntPuntos));
			}
			if(buscar_intIndTipo != null) {
				donanteDto.setIntIndTipo(CadenaUtil.getInte(buscar_intIndTipo));
			}
			
			listDonante = donanteService.buscar(donanteDto);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		DonanteDto donanteDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				donanteDto	= new DonanteDto();
				donanteDto.setSrlIdDonante(CadenaUtil.getInte(buscar_seleccion_id[i]));
				Donante donante				= donanteService.buscarById(donanteDto);
				if(donante != null) {
					this.edicion_donanteDto		= new DonanteDto();
					BeanUtils.copyProperties(donante, this.edicion_donanteDto);
					this.edicion_donanteDto.setStrIndActivoBoolean(false);
					donanteService.guardar(this.edicion_donanteDto);

				}
//				donanteService.eliminar(donanteDto);
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
			DonanteDto donanteDto		= new DonanteDto();
			donanteDto.setSrlIdDonante(CadenaUtil.getInte(buscar_seleccion_id[0]));
			Donante donante				= donanteService.buscarById(donanteDto);
			if(donante != null) {
				this.edicion_donanteDto		= new DonanteDto();
				BeanUtils.copyProperties(donante, this.edicion_donanteDto);
				session.put("DonanteDto_SrlIdDonante", this.edicion_donanteDto.getSrlIdDonante());
				
				UsuarioDto usuarioDto		= new UsuarioDto();
				usuarioDto.setSrlIdUsuario(this.edicion_donanteDto.getIntIdUsuario());
				Usuario usuario				= usuarioService.buscarById(usuarioDto);
				this.edicion_usuarioDto		= new UsuarioDto();
				BeanUtils.copyProperties(usuario, this.edicion_usuarioDto);
				
				ubigeoProvincia(donante.getIntIdDepartamento());
				ubigeoDistrito(donante.getIntIdDepartamento(), donante.getIntIdProvincia());
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
		this.edicion_donanteDto		= new DonanteDto();
		try {
			if(session.get("listCatalogoSiNo") == null) {
				catalogoSiNoCargar();
				catalogoGradoInstruccionCargar();
				catalogoSexoCargar();
				catalogoEstadoCivilCargar();
				ubigeoDepartamentoCargar();
			}
			
			this.edicion_usuarioDto		= new UsuarioDto();
			usuarioService.guardar(this.edicion_usuarioDto);
			
//			UsuarioDto usuarioDto	= (UsuarioDto)session.get("USUARIO_ACTUAL");
//			Integer intIdUsuario	= usuarioDto.getSrlIdUsuario();
//			this.edicion_donanteDto.setIntIdUsuario(intIdUsuario);
			
			this.edicion_donanteDto.setIntIdUsuario(this.edicion_usuarioDto.getSrlIdUsuario());
			donanteService.guardar(this.edicion_donanteDto);
			
			this.edicion_usuarioDto.setIntIdDonante(this.edicion_donanteDto.getSrlIdDonante());
			this.edicion_usuarioDto.setIntIdPerfil(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.PERFIL_DONANTE));
			
			session.put("DonanteDto_SrlIdDonante", this.edicion_donanteDto.getSrlIdDonante());
			
			ubigeoProvincia(null);
			ubigeoDistrito(null, null);
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
			if(CadenaUtil.getStrNull(this.edicion_donanteDto.getStrDesCorreo()) == null) {
				addActionError("El campo Correo electronico del donante es obligatorio.");
				error = true;
			}
			if(error) {
				throw new Exception("");
			}
			
			this.edicion_usuarioDto.setStrIndActivoBoolean(true);
			this.edicion_usuarioDto.setStrNomResponsable(this.edicion_donanteDto.getStrNomNombre());
			this.edicion_usuarioDto.setStrNomAppaterno(this.edicion_donanteDto.getStrNomAppaterno());
			this.edicion_usuarioDto.setStrNomApmaterno(this.edicion_donanteDto.getStrNomApmaterno());
			this.edicion_usuarioDto.setStrDesCorreo(this.edicion_donanteDto.getStrDesCorreo());
			this.edicion_usuarioDto.setStrDesCelular(this.edicion_donanteDto.getStrNumCelular());
			usuarioService.guardar(this.edicion_usuarioDto);
			
			Usuario cuentaUsuario	= usuarioService.buscarById(this.edicion_usuarioDto);
			if(cuentaUsuario != null) {
				this.edicion_usuarioDto	= new UsuarioDto();
				BeanUtils.copyProperties(cuentaUsuario, this.edicion_usuarioDto);
				session.put("USUARIO_ACTUAL", this.edicion_usuarioDto);
			}
			
			this.edicion_donanteDto.setStrIndActivoBoolean(true);
			donanteService.guardar(this.edicion_donanteDto);
			
			if(session.get("cita_preprogramada") != null) {
				CitaDto citaDto		= (CitaDto)session.get("cita_preprogramada");
				citaDto.setIntIdDonante(this.edicion_donanteDto.getSrlIdDonante());
				citaService.guardar(citaDto);
				session.remove("cita_preprogramada");
			}
			
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
	
	public String catalogoEstadoCivilCargar() {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			CatalogoDto catalogoDto = new CatalogoDto();
			catalogoDto.setIntCodIndicador(1);
			List<Catalogo> list		= catalogoService.buscar(catalogoDto);
			session.put("listCatalogoEstadoCivi", list);
		} catch(Exception ex) {
			ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	public String catalogoSexoCargar() {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			CatalogoDto catalogoDto = new CatalogoDto();
			catalogoDto.setIntCodIndicador(2);
			List<Catalogo> list		= catalogoService.buscar(catalogoDto);
			session.put("listCatalogoSexo", list);
		} catch(Exception ex) {
			ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	public String catalogoGradoInstruccionCargar() {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			CatalogoDto catalogoDto = new CatalogoDto();
			catalogoDto.setIntCodIndicador(3);
			List<Catalogo> list		= catalogoService.buscar(catalogoDto);
			session.put("listCatalogoGradoInstruccion", list);
		} catch(Exception ex) {
			ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	public String catalogoSiNoCargar() {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			CatalogoDto catalogoDto = new CatalogoDto();
			catalogoDto.setIntCodIndicador(4);
			List<Catalogo> list		= catalogoService.buscar(catalogoDto);
			session.put("listCatalogoSiNo", list);
		} catch(Exception ex) {
			ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	public String ubigeoDepartamentoCargar() {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			UbigeoDto ubigeoDto		= new UbigeoDto();
			ubigeoDto.setIntIdDistrito(0);
			ubigeoDto.setIntIdProvincia(0);
			List<Ubigeo> list		= ubigeoService.buscar(ubigeoDto);
			session.put("listUbigeoDepartamento", list);
		} catch(Exception ex) {
			ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	public String ubigeoProvinciaCargar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		return ubigeoProvincia(
				CadenaUtil.getInteNull(request.getParameter("intIdDepartamento")));
	}
	
	private String ubigeoProvincia(Integer intIdDepartamento) {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			UbigeoDto ubigeoDto		= new UbigeoDto();
			ubigeoDto.setIntIdDistrito(0);
			ubigeoDto.setIntIdProvincia(Integer.MIN_VALUE);
			if(intIdDepartamento != null) {
				ubigeoDto.setIntIdDepartamento(intIdDepartamento);
			} else {
				ubigeoDto.setIntIdDepartamento(Integer.MAX_VALUE);
			}
			List<Ubigeo> list		= ubigeoService.buscar(ubigeoDto);
			session.put("listUbigeoProvincia", list);
		} catch(Exception ex) {
			ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	public String ubigeoDistritoCargar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		return ubigeoDistrito(
				CadenaUtil.getInteNull(request.getParameter("intIdDepartamento")), 
				CadenaUtil.getInteNull(request.getParameter("intIdProvincia")));
	}
	
	private String ubigeoDistrito(Integer intIdDepartamento, Integer intIdProvincia) {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			UbigeoDto ubigeoDto		= new UbigeoDto();
			ubigeoDto.setIntIdDistrito(Integer.MIN_VALUE);
			if(intIdDepartamento != null) {
				ubigeoDto.setIntIdDepartamento(intIdDepartamento);
			} else {
				ubigeoDto.setIntIdDepartamento(Integer.MAX_VALUE);
			}
			if(intIdProvincia != null) {
				ubigeoDto.setIntIdProvincia(intIdProvincia);
			} else {
				ubigeoDto.setIntIdProvincia(Integer.MAX_VALUE);
			}
			List<Ubigeo> list		= ubigeoService.buscar(ubigeoDto);
			session.put("listUbigeoDistrito", list);
		} catch(Exception ex) {
			ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public String getBuscar_srlIdDonante() {
		return buscar_srlIdDonante;
	}
	
	public void setBuscar_srlIdDonante(String buscar_srlIdDonante) {
		this.buscar_srlIdDonante = buscar_srlIdDonante;
	}
	public String getBuscar_intIdUsuario() {
		return buscar_intIdUsuario;
	}
	
	public void setBuscar_intIdUsuario(String buscar_intIdUsuario) {
		this.buscar_intIdUsuario = buscar_intIdUsuario;
	}
	public String getBuscar_strNomNombre() {
		return buscar_strNomNombre;
	}
	
	public void setBuscar_strNomNombre(String buscar_strNomNombre) {
		this.buscar_strNomNombre = buscar_strNomNombre;
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
	public String getBuscar_dteFecNacimiento() {
		return buscar_dteFecNacimiento;
	}
	
	public void setBuscar_dteFecNacimiento(String buscar_dteFecNacimiento) {
		this.buscar_dteFecNacimiento = buscar_dteFecNacimiento;
	}
	public String getBuscar_intIndEstadocivil() {
		return buscar_intIndEstadocivil;
	}
	
	public void setBuscar_intIndEstadocivil(String buscar_intIndEstadocivil) {
		this.buscar_intIndEstadocivil = buscar_intIndEstadocivil;
	}
	public String getBuscar_intIndSexo() {
		return buscar_intIndSexo;
	}
	
	public void setBuscar_intIndSexo(String buscar_intIndSexo) {
		this.buscar_intIndSexo = buscar_intIndSexo;
	}
	public String getBuscar_intDesGradoinstruc() {
		return buscar_intDesGradoinstruc;
	}
	
	public void setBuscar_intDesGradoinstruc(String buscar_intDesGradoinstruc) {
		this.buscar_intDesGradoinstruc = buscar_intDesGradoinstruc;
	}
	public String getBuscar_strDesOcupacion() {
		return buscar_strDesOcupacion;
	}
	
	public void setBuscar_strDesOcupacion(String buscar_strDesOcupacion) {
		this.buscar_strDesOcupacion = buscar_strDesOcupacion;
	}
	public String getBuscar_intIndDonante() {
		return buscar_intIndDonante;
	}
	
	public void setBuscar_intIndDonante(String buscar_intIndDonante) {
		this.buscar_intIndDonante = buscar_intIndDonante;
	}
	public String getBuscar_strNumCelular() {
		return buscar_strNumCelular;
	}
	
	public void setBuscar_strNumCelular(String buscar_strNumCelular) {
		this.buscar_strNumCelular = buscar_strNumCelular;
	}
	public String getBuscar_strNumCelular2() {
		return buscar_strNumCelular2;
	}
	
	public void setBuscar_strNumCelular2(String buscar_strNumCelular2) {
		this.buscar_strNumCelular2 = buscar_strNumCelular2;
	}
	public String getBuscar_strNumTelefono() {
		return buscar_strNumTelefono;
	}
	
	public void setBuscar_strNumTelefono(String buscar_strNumTelefono) {
		this.buscar_strNumTelefono = buscar_strNumTelefono;
	}
	public String getBuscar_strDesCorreo() {
		return buscar_strDesCorreo;
	}
	
	public void setBuscar_strDesCorreo(String buscar_strDesCorreo) {
		this.buscar_strDesCorreo = buscar_strDesCorreo;
	}
	public String getBuscar_strDesDireccion() {
		return buscar_strDesDireccion;
	}
	
	public void setBuscar_strDesDireccion(String buscar_strDesDireccion) {
		this.buscar_strDesDireccion = buscar_strDesDireccion;
	}
	public String getBuscar_intCntPuntos() {
		return buscar_intCntPuntos;
	}
	
	public void setBuscar_intCntPuntos(String buscar_intCntPuntos) {
		this.buscar_intCntPuntos = buscar_intCntPuntos;
	}
	public String getBuscar_intIndTipo() {
		return buscar_intIndTipo;
	}
	
	public void setBuscar_intIndTipo(String buscar_intIndTipo) {
		this.buscar_intIndTipo = buscar_intIndTipo;
	}
	
	public DonanteDto getEdicion_donanteDto() {
		return edicion_donanteDto;
	}
	
	public void setEdicion_donanteDto(
			DonanteDto edicion_donanteDto) {
		this.edicion_donanteDto = edicion_donanteDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<Donante> getListDonante() {
		return listDonante;
	}
	
	public void setListDonante(List<Donante> listDonante) {
		this.listDonante = listDonante;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}

	public UsuarioDto getEdicion_usuarioDto() {
		return edicion_usuarioDto;
	}

	public void setEdicion_usuarioDto(UsuarioDto edicion_usuarioDto) {
		this.edicion_usuarioDto = edicion_usuarioDto;
	}
	
}