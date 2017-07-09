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
import pmp.lupdup.business.core.administrador.dto.ImagenDto;
import pmp.lupdup.business.core.administrador.service.ImagenService;
import pmp.lupdup.dao.administrador.domain.Imagen;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Imagen
 * 
 * @author Jober Mena
 * 
 */

public class ImagenAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private ImagenService imagenService;
	
	private String buscar_srlIdImagen;
	private String buscar_strNomDescripcion;
	private String buscar_strNomExtension;
	private String buscar_lngNomFechaUltimaMod;
	private String buscar_strNomHash;
	private String buscar_strNomCodigo;
	private String buscar_lngNumTamanio;
	
	private String[] buscar_seleccion_id;
	
	private ImagenDto edicion_imagenDto;
	
	private List<Imagen> listImagen;
	

	
	
	public ImagenAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			ImagenDto imagenDto		= new ImagenDto();
			if(buscar_strNomDescripcion != null && !buscar_strNomDescripcion.equals("")) {
				imagenDto.setStrNomDescripcion(CadenaUtil.getStr(buscar_strNomDescripcion));
			}
			
			listImagen = imagenService.buscar(imagenDto);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		ImagenDto imagenDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				imagenDto	= new ImagenDto();
				imagenDto.setSrlIdImagen(CadenaUtil.getInte(buscar_seleccion_id[i]));
				imagenService.eliminar(imagenDto);
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
			ImagenDto imagenDto		= new ImagenDto();
			imagenDto.setSrlIdImagen(CadenaUtil.getInte(buscar_seleccion_id[0]));
			Imagen imagen				= imagenService.buscarById(imagenDto);
			if(imagen != null) {
				this.edicion_imagenDto		= new ImagenDto();
				BeanUtils.copyProperties(imagen, this.edicion_imagenDto);
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
		this.edicion_imagenDto		= new ImagenDto();
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
			
			imagenService.guardar(this.edicion_imagenDto);
			
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
	
	public String getBuscar_srlIdImagen() {
		return buscar_srlIdImagen;
	}
	
	public void setBuscar_srlIdImagen(String buscar_srlIdImagen) {
		this.buscar_srlIdImagen = buscar_srlIdImagen;
	}
	public String getBuscar_strNomDescripcion() {
		return buscar_strNomDescripcion;
	}
	
	public void setBuscar_strNomDescripcion(String buscar_strNomDescripcion) {
		this.buscar_strNomDescripcion = buscar_strNomDescripcion;
	}
	public String getBuscar_strNomExtension() {
		return buscar_strNomExtension;
	}
	
	public void setBuscar_strNomExtension(String buscar_strNomExtension) {
		this.buscar_strNomExtension = buscar_strNomExtension;
	}
	public String getBuscar_lngNomFechaUltimaMod() {
		return buscar_lngNomFechaUltimaMod;
	}
	
	public void setBuscar_lngNomFechaUltimaMod(String buscar_lngNomFechaUltimaMod) {
		this.buscar_lngNomFechaUltimaMod = buscar_lngNomFechaUltimaMod;
	}
	public String getBuscar_strNomHash() {
		return buscar_strNomHash;
	}
	
	public void setBuscar_strNomHash(String buscar_strNomHash) {
		this.buscar_strNomHash = buscar_strNomHash;
	}
	public String getBuscar_strNomCodigo() {
		return buscar_strNomCodigo;
	}
	
	public void setBuscar_strNomCodigo(String buscar_strNomCodigo) {
		this.buscar_strNomCodigo = buscar_strNomCodigo;
	}
	public String getBuscar_lngNumTamanio() {
		return buscar_lngNumTamanio;
	}
	
	public void setBuscar_lngNumTamanio(String buscar_lngNumTamanio) {
		this.buscar_lngNumTamanio = buscar_lngNumTamanio;
	}
	
	public ImagenDto getEdicion_imagenDto() {
		return edicion_imagenDto;
	}
	
	public void setEdicion_imagenDto(
			ImagenDto edicion_imagenDto) {
		this.edicion_imagenDto = edicion_imagenDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<Imagen> getListImagen() {
		return listImagen;
	}
	
	public void setListImagen(List<Imagen> listImagen) {
		this.listImagen = listImagen;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}