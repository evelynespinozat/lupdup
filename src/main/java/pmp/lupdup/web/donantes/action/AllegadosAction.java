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
import pmp.lupdup.business.core.donantes.dto.AllegadosDto;
import pmp.lupdup.business.core.donantes.service.AllegadosService;
import pmp.lupdup.dao.donantes.domain.Allegados;
import pmp.lupdup.business.core.administrador.dto.CatalogoDto;
import pmp.lupdup.business.core.administrador.service.CatalogoService;
import pmp.lupdup.dao.administrador.domain.Catalogo;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Allegados
 * 
 * @author Jober Mena
 * 
 */

public class AllegadosAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private AllegadosService allegadosService;
	
	@Autowired
	private CatalogoService catalogoService;
	
	private String buscar_srlIdAllegados;
	private String buscar_intIdDonante;
	private String buscar_dteFecUltimaModificacion;
	private String buscar_strNomNombre;
	private String buscar_strNomAppaterno;
	private String buscar_strNomApmaterno;
	private String buscar_dteFecNacimiento;
	private String buscar_strNumCelular;
	private String buscar_strNumTelefono;
	private String buscar_strDesCorreoelectronico;
	private String buscar_strNumDni;
	private String buscar_intIdTipopariente;
	
	private String[] buscar_seleccion_id;
	
	private AllegadosDto edicion_allegadosDto;
	
	private List<Allegados> listAllegados;
	

	
	
	public AllegadosAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			catalogoCargar();
			session.put("permiteModificarAllegados", allegadosService.permiteModificar());
		} catch(Exception ex) {
			//ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			AllegadosDto allegadosDto		= new AllegadosDto();
			if(buscar_intIdDonante != null) {
				allegadosDto.setIntIdDonante(CadenaUtil.getInte(buscar_intIdDonante));
			}
			if(buscar_strNomNombre != null && !buscar_strNomNombre.equals("")) {
				allegadosDto.setStrNomNombre(CadenaUtil.getStr(buscar_strNomNombre));
			}
			if(buscar_strNomAppaterno != null && !buscar_strNomAppaterno.equals("")) {
				allegadosDto.setStrNomAppaterno(CadenaUtil.getStr(buscar_strNomAppaterno));
			}
			if(buscar_strNomApmaterno != null && !buscar_strNomApmaterno.equals("")) {
				allegadosDto.setStrNomApmaterno(CadenaUtil.getStr(buscar_strNomApmaterno));
			}
			if(buscar_dteFecNacimiento != null && !buscar_dteFecNacimiento.equals("")) {
				allegadosDto.setDteFecNacimiento(CadenaUtil.getDateFromStr(buscar_dteFecNacimiento));
			}
			if(buscar_strNumCelular != null && !buscar_strNumCelular.equals("")) {
				allegadosDto.setStrNumCelular(CadenaUtil.getStr(buscar_strNumCelular));
			}
			if(buscar_strNumTelefono != null && !buscar_strNumTelefono.equals("")) {
				allegadosDto.setStrNumTelefono(CadenaUtil.getStr(buscar_strNumTelefono));
			}
			if(buscar_strDesCorreoelectronico != null && !buscar_strDesCorreoelectronico.equals("")) {
				allegadosDto.setStrDesCorreoelectronico(CadenaUtil.getStr(buscar_strDesCorreoelectronico));
			}
			if(buscar_strNumDni != null && !buscar_strNumDni.equals("")) {
				allegadosDto.setStrNumDni(CadenaUtil.getStr(buscar_strNumDni));
			}
			if(buscar_intIdTipopariente != null) {
				allegadosDto.setIntIdTipopariente(CadenaUtil.getInte(buscar_intIdTipopariente));
			}
			
			if(getUsuarioSession() != null) {
				allegadosDto.setIntIdDonante(getUsuarioSession().getIntIdDonante());
			}
			
			listAllegados = allegadosService.buscar(allegadosDto);
		} catch(Exception ex) {
			//ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		AllegadosDto allegadosDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				allegadosDto	= new AllegadosDto();
				allegadosDto.setSrlIdAllegados(CadenaUtil.getInte(buscar_seleccion_id[i]));
				allegadosService.eliminar(allegadosDto);
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
			AllegadosDto allegadosDto		= new AllegadosDto();
			allegadosDto.setSrlIdAllegados(CadenaUtil.getInte(buscar_seleccion_id[0]));
			Allegados allegados				= allegadosService.buscarById(allegadosDto);
			if(allegados != null) {
				this.edicion_allegadosDto		= new AllegadosDto();
				BeanUtils.copyProperties(allegados, this.edicion_allegadosDto);
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
		this.edicion_allegadosDto		= new AllegadosDto();
		if(getUsuarioSession() != null) {
			this.edicion_allegadosDto.setIntIdDonante(getUsuarioSession().getIntIdDonante());
		}
		this.edicion_allegadosDto.setDteFecUltimaModificacion(new Date());
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
			if(getUsuarioSession() != null) {
				this.edicion_allegadosDto.setIntIdDonante(getUsuarioSession().getIntIdDonante());
			}
			this.edicion_allegadosDto.setDteFecUltimaModificacion(new Date());
			allegadosService.guardar(this.edicion_allegadosDto);
			
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
	
	public String catalogoCargar() {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			CatalogoDto catalogoDto = new CatalogoDto();
			catalogoDto.setIntCodIndicador(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_TIPO_ALLEGADO));

			List<Catalogo> list		= catalogoService.buscar(catalogoDto);
			session.put("listCatalogo", list);
		} catch(Exception ex) {
			//ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public String getBuscar_srlIdAllegados() {
		return buscar_srlIdAllegados;
	}
	
	public void setBuscar_srlIdAllegados(String buscar_srlIdAllegados) {
		this.buscar_srlIdAllegados = buscar_srlIdAllegados;
	}
	public String getBuscar_intIdDonante() {
		return buscar_intIdDonante;
	}
	
	public void setBuscar_intIdDonante(String buscar_intIdDonante) {
		this.buscar_intIdDonante = buscar_intIdDonante;
	}
	public String getBuscar_dteFecUltimaModificacion() {
		return buscar_dteFecUltimaModificacion;
	}
	
	public void setBuscar_dteFecUltimaModificacion(String buscar_dteFecUltimaModificacion) {
		this.buscar_dteFecUltimaModificacion = buscar_dteFecUltimaModificacion;
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
	public String getBuscar_strNumCelular() {
		return buscar_strNumCelular;
	}
	
	public void setBuscar_strNumCelular(String buscar_strNumCelular) {
		this.buscar_strNumCelular = buscar_strNumCelular;
	}
	public String getBuscar_strNumTelefono() {
		return buscar_strNumTelefono;
	}
	
	public void setBuscar_strNumTelefono(String buscar_strNumTelefono) {
		this.buscar_strNumTelefono = buscar_strNumTelefono;
	}
	public String getBuscar_strDesCorreoelectronico() {
		return buscar_strDesCorreoelectronico;
	}
	
	public void setBuscar_strDesCorreoelectronico(String buscar_strDesCorreoelectronico) {
		this.buscar_strDesCorreoelectronico = buscar_strDesCorreoelectronico;
	}
	public String getBuscar_strNumDni() {
		return buscar_strNumDni;
	}
	
	public void setBuscar_strNumDni(String buscar_strNumDni) {
		this.buscar_strNumDni = buscar_strNumDni;
	}
	public String getBuscar_intIdTipopariente() {
		return buscar_intIdTipopariente;
	}
	
	public void setBuscar_intIdTipopariente(String buscar_intIdTipopariente) {
		this.buscar_intIdTipopariente = buscar_intIdTipopariente;
	}
	
	public AllegadosDto getEdicion_allegadosDto() {
		return edicion_allegadosDto;
	}
	
	public void setEdicion_allegadosDto(
			AllegadosDto edicion_allegadosDto) {
		this.edicion_allegadosDto = edicion_allegadosDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<Allegados> getListAllegados() {
		return listAllegados;
	}
	
	public void setListAllegados(List<Allegados> listAllegados) {
		this.listAllegados = listAllegados;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}