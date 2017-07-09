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
import pmp.lupdup.business.core.administrador.dto.CuestionarioDto;
import pmp.lupdup.business.core.administrador.service.CuestionarioService;
import pmp.lupdup.dao.administrador.domain.Cuestionario;
import pmp.lupdup.business.core.administrador.dto.CatalogoDto;
import pmp.lupdup.business.core.administrador.service.CatalogoService;
import pmp.lupdup.dao.administrador.domain.Catalogo;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Cuestionario
 * 
 * @author Jober Mena
 * 
 */

public class CuestionarioAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private CuestionarioService cuestionarioService;
	
	@Autowired
	private CatalogoService catalogoService;
	
	private String buscar_srlIdCuestionario;
	private String buscar_strDesCuestionario;
	private String buscar_intIndTipo;
	
	private String[] buscar_seleccion_id;
	
	private CuestionarioDto edicion_cuestionarioDto;
	
	private List<Cuestionario> listCuestionario;
	

	
	
	public CuestionarioAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		catalogoCargar();
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			CuestionarioDto cuestionarioDto		= new CuestionarioDto();
			if(buscar_strDesCuestionario != null && !buscar_strDesCuestionario.equals("")) {
				cuestionarioDto.setStrDesCuestionario(CadenaUtil.getStr(buscar_strDesCuestionario));
			}
			if(buscar_intIndTipo != null) {
				cuestionarioDto.setIntIndTipo(CadenaUtil.getInte(buscar_intIndTipo));
			}
			
			listCuestionario = cuestionarioService.buscar(cuestionarioDto);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		CuestionarioDto cuestionarioDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				cuestionarioDto	= new CuestionarioDto();
				cuestionarioDto.setSrlIdCuestionario(CadenaUtil.getInte(buscar_seleccion_id[i]));
				cuestionarioService.eliminar(cuestionarioDto);
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
			CuestionarioDto cuestionarioDto		= new CuestionarioDto();
			cuestionarioDto.setSrlIdCuestionario(CadenaUtil.getInte(buscar_seleccion_id[0]));
			Cuestionario cuestionario				= cuestionarioService.buscarById(cuestionarioDto);
			if(cuestionario != null) {
				this.edicion_cuestionarioDto		= new CuestionarioDto();
				BeanUtils.copyProperties(cuestionario, this.edicion_cuestionarioDto);
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
		this.edicion_cuestionarioDto		= new CuestionarioDto();
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
			
			cuestionarioService.guardar(this.edicion_cuestionarioDto);
			
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
	
	public String catalogoCargar() {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			CatalogoDto catalogoDto = new CatalogoDto();
			catalogoDto.setIntCodIndicador(5);

			List<Catalogo> list		= catalogoService.buscar(catalogoDto);
			session.put("listCatalogo", list);
		} catch(Exception ex) {
			ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public String getBuscar_srlIdCuestionario() {
		return buscar_srlIdCuestionario;
	}
	
	public void setBuscar_srlIdCuestionario(String buscar_srlIdCuestionario) {
		this.buscar_srlIdCuestionario = buscar_srlIdCuestionario;
	}
	public String getBuscar_strDesCuestionario() {
		return buscar_strDesCuestionario;
	}
	
	public void setBuscar_strDesCuestionario(String buscar_strDesCuestionario) {
		this.buscar_strDesCuestionario = buscar_strDesCuestionario;
	}
	public String getBuscar_intIndTipo() {
		return buscar_intIndTipo;
	}
	
	public void setBuscar_intIndTipo(String buscar_intIndTipo) {
		this.buscar_intIndTipo = buscar_intIndTipo;
	}
	
	public CuestionarioDto getEdicion_cuestionarioDto() {
		return edicion_cuestionarioDto;
	}
	
	public void setEdicion_cuestionarioDto(
			CuestionarioDto edicion_cuestionarioDto) {
		this.edicion_cuestionarioDto = edicion_cuestionarioDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<Cuestionario> getListCuestionario() {
		return listCuestionario;
	}
	
	public void setListCuestionario(List<Cuestionario> listCuestionario) {
		this.listCuestionario = listCuestionario;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}