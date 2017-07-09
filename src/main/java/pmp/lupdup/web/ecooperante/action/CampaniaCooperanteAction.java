package pmp.lupdup.web.ecooperante.action;

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
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import org.apache.commons.io.FileUtils;
import pmp.lupdup.general.util.GeneraIdInternoAdjunto;
import pmp.lupdup.general.util.ConfiguracionProperties;
import pmp.lupdup.business.core.administrador.dto.ImagenDto;
import pmp.lupdup.business.core.administrador.service.ImagenService;
import pmp.lupdup.dao.administrador.domain.Imagen;
import pmp.lupdup.general.util.CadenaUtil;
import pmp.lupdup.business.core.ecooperante.dto.CampaniaCooperanteDto;
import pmp.lupdup.business.core.ecooperante.service.CampaniaCooperanteService;
import pmp.lupdup.dao.ecooperante.domain.CampaniaCooperante;
import pmp.lupdup.business.core.administrador.dto.CatalogoDto;
import pmp.lupdup.business.core.administrador.service.CatalogoService;
import pmp.lupdup.dao.administrador.domain.Catalogo;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Campania
 * 
 * @author Jober Mena
 * 
 */

public class CampaniaCooperanteAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private CampaniaCooperanteService campaniaCooperanteService;
	
	@Autowired
	private CatalogoService catalogoService;
	
	@Autowired
	private ImagenService imagenService;
	private String buscar_srlIdCampania;
	private String buscar_intIdEntidadcolaboradora;
	private String buscar_strDesCampania;
	private String buscar_intCntAsignada;
	private String buscar_intCntDisponible;
	private String buscar_dteFecInicio;
	private String buscar_dteFecFin;
	private String buscar_intIndActivo;
	private String buscar_intNumDescuento;
	private String buscar_strDesRegalo;
	private String buscar_intCntMinpuntos;
	private String buscar_intCntGusta;
	private String buscar_intIdImagen;
	
	private String[] buscar_seleccion_id;
	
	private CampaniaCooperanteDto edicion_campaniaCooperanteDto;
	
	private List<CampaniaCooperante> listCampaniaCooperante;
	
	private File edicion_campania_cooperante_intIdImagen;
	private String edicion_campania_cooperante_intIdImagenContentType;
	private String edicion_campania_cooperante_intIdImagenFileName;
	private String edicion_campania_cooperante_intIdImagenCaption;
//	private String strNomCodigo;
	
//	protected InputStream archivo;
//	protected String archivoNombre;
//	protected String archivoTamanio;
	
	public CampaniaCooperanteAction() {
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
			CampaniaCooperanteDto campaniaCooperanteDto		= new CampaniaCooperanteDto();
			if(buscar_strDesCampania != null && !buscar_strDesCampania.equals("")) {
				campaniaCooperanteDto.setStrDesCampania(CadenaUtil.getStr(buscar_strDesCampania));
			}
			if(buscar_intCntAsignada != null) {
				campaniaCooperanteDto.setIntCntAsignada(CadenaUtil.getInte(buscar_intCntAsignada));
			}
			if(buscar_intCntDisponible != null) {
				campaniaCooperanteDto.setIntCntDisponible(CadenaUtil.getInte(buscar_intCntDisponible));
			}
			if(buscar_dteFecInicio != null && !buscar_dteFecInicio.equals("")) {
				campaniaCooperanteDto.setDteFecInicio(CadenaUtil.getDateFromStr(buscar_dteFecInicio));
			}
			if(buscar_dteFecFin != null && !buscar_dteFecFin.equals("")) {
				campaniaCooperanteDto.setDteFecFin(CadenaUtil.getDateFromStr(buscar_dteFecFin));
			}
			if(buscar_intIndActivo != null) {
				campaniaCooperanteDto.setIntIndActivo(CadenaUtil.getInte(buscar_intIndActivo));
			}
			if(buscar_intNumDescuento != null) {
				campaniaCooperanteDto.setIntNumDescuento(CadenaUtil.getInte(buscar_intNumDescuento));
			}
			if(buscar_strDesRegalo != null && !buscar_strDesRegalo.equals("")) {
				campaniaCooperanteDto.setStrDesRegalo(CadenaUtil.getStr(buscar_strDesRegalo));
			}
			if(buscar_intCntMinpuntos != null) {
				campaniaCooperanteDto.setIntCntMinpuntos(CadenaUtil.getInte(buscar_intCntMinpuntos));
			}
			if(buscar_intCntGusta != null) {
				campaniaCooperanteDto.setIntCntGusta(CadenaUtil.getInte(buscar_intCntGusta));
			}
			
			listCampaniaCooperante = campaniaCooperanteService.buscar(campaniaCooperanteDto);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		CampaniaCooperanteDto campaniaCooperanteDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				campaniaCooperanteDto	= new CampaniaCooperanteDto();
				campaniaCooperanteDto.setSrlIdCampania(CadenaUtil.getInte(buscar_seleccion_id[i]));
				campaniaCooperanteService.eliminar(campaniaCooperanteDto);
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
			CampaniaCooperanteDto campaniaCooperanteDto		= new CampaniaCooperanteDto();
			campaniaCooperanteDto.setSrlIdCampania(CadenaUtil.getInte(buscar_seleccion_id[0]));
			CampaniaCooperante campaniaCooperante				= campaniaCooperanteService.buscarById(campaniaCooperanteDto);
			if(campaniaCooperante != null) {
				this.edicion_campaniaCooperanteDto		= new CampaniaCooperanteDto();
				BeanUtils.copyProperties(campaniaCooperante, this.edicion_campaniaCooperanteDto);
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
		this.edicion_campaniaCooperanteDto		= new CampaniaCooperanteDto();
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
			
			if(edicion_campania_cooperante_intIdImagen != null) {
				String strExtension				= CadenaUtil.getStr(CadenaUtil.ultimaCadena(edicion_campania_cooperante_intIdImagenFileName, '.')).toLowerCase();
				String strRepositorioTemporal	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.RUTA_BASE_REPOSITORIO);
				String strNombreFileTemporal	= GeneraIdInternoAdjunto.generaId() + "." + strExtension;
				File fileTemporal				= new File(strRepositorioTemporal, strNombreFileTemporal);
				FileUtils.copyFile(edicion_campania_cooperante_intIdImagen, fileTemporal);
				
				ImagenDto imagenDto = new ImagenDto();
				imagenDto.setStrNomCodigo(strNombreFileTemporal);
				imagenDto.setStrNomDescripcion(edicion_campania_cooperante_intIdImagenFileName);
				imagenDto.setLngNumTamanio(fileTemporal.length());
				imagenDto.setLngNomFechaUltimaMod(fileTemporal.lastModified());
				imagenDto.setStrNomExtension(strExtension);
				
				imagenService.guardar(imagenDto);
				
				this.edicion_campaniaCooperanteDto.setIntIdImagen(
					imagenDto.getSrlIdImagen());
			}
			campaniaCooperanteService.guardar(this.edicion_campaniaCooperanteDto);
			
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
			CatalogoDto catalogoDto			= new CatalogoDto();
			catalogoDto.setIntCodIndicador(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_SI_NO));
			List<Catalogo> list		= catalogoService.buscar(catalogoDto);
			session.put("listCatalogo", list);
		} catch(Exception ex) {
			ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public String getBuscar_srlIdCampania() {
		return buscar_srlIdCampania;
	}
	public void setBuscar_srlIdCampania(String buscar_srlIdCampania) {
		this.buscar_srlIdCampania = buscar_srlIdCampania;
	}
	
	public String getBuscar_intIdEntidadcolaboradora() {
		return buscar_intIdEntidadcolaboradora;
	}
	public void setBuscar_intIdEntidadcolaboradora(String buscar_intIdEntidadcolaboradora) {
		this.buscar_intIdEntidadcolaboradora = buscar_intIdEntidadcolaboradora;
	}
	
	public String getBuscar_strDesCampania() {
		return buscar_strDesCampania;
	}
	public void setBuscar_strDesCampania(String buscar_strDesCampania) {
		this.buscar_strDesCampania = buscar_strDesCampania;
	}
	
	public String getBuscar_intCntAsignada() {
		return buscar_intCntAsignada;
	}
	public void setBuscar_intCntAsignada(String buscar_intCntAsignada) {
		this.buscar_intCntAsignada = buscar_intCntAsignada;
	}
	
	public String getBuscar_intCntDisponible() {
		return buscar_intCntDisponible;
	}
	public void setBuscar_intCntDisponible(String buscar_intCntDisponible) {
		this.buscar_intCntDisponible = buscar_intCntDisponible;
	}
	
	public String getBuscar_dteFecInicio() {
		return buscar_dteFecInicio;
	}
	public void setBuscar_dteFecInicio(String buscar_dteFecInicio) {
		this.buscar_dteFecInicio = buscar_dteFecInicio;
	}
	
	public String getBuscar_dteFecFin() {
		return buscar_dteFecFin;
	}
	public void setBuscar_dteFecFin(String buscar_dteFecFin) {
		this.buscar_dteFecFin = buscar_dteFecFin;
	}
	
	public String getBuscar_intIndActivo() {
		return buscar_intIndActivo;
	}
	public void setBuscar_intIndActivo(String buscar_intIndActivo) {
		this.buscar_intIndActivo = buscar_intIndActivo;
	}
	
	public String getBuscar_intNumDescuento() {
		return buscar_intNumDescuento;
	}
	public void setBuscar_intNumDescuento(String buscar_intNumDescuento) {
		this.buscar_intNumDescuento = buscar_intNumDescuento;
	}
	
	public String getBuscar_strDesRegalo() {
		return buscar_strDesRegalo;
	}
	public void setBuscar_strDesRegalo(String buscar_strDesRegalo) {
		this.buscar_strDesRegalo = buscar_strDesRegalo;
	}
	
	public String getBuscar_intCntMinpuntos() {
		return buscar_intCntMinpuntos;
	}
	public void setBuscar_intCntMinpuntos(String buscar_intCntMinpuntos) {
		this.buscar_intCntMinpuntos = buscar_intCntMinpuntos;
	}
	
	public String getBuscar_intCntGusta() {
		return buscar_intCntGusta;
	}
	public void setBuscar_intCntGusta(String buscar_intCntGusta) {
		this.buscar_intCntGusta = buscar_intCntGusta;
	}
	
	public String getBuscar_intIdImagen() {
		return buscar_intIdImagen;
	}
	public void setBuscar_intIdImagen(String buscar_intIdImagen) {
		this.buscar_intIdImagen = buscar_intIdImagen;
	}
	
	public CampaniaCooperanteDto getEdicion_campaniaCooperanteDto() {
		return edicion_campaniaCooperanteDto;
	}
	public void setEdicion_campaniaCooperanteDto(
			CampaniaCooperanteDto edicion_campaniaCooperanteDto) {
		this.edicion_campaniaCooperanteDto = edicion_campaniaCooperanteDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<CampaniaCooperante> getListCampaniaCooperante() {
		return listCampaniaCooperante;
	}
	public void setListCampaniaCooperante(List<CampaniaCooperante> listCampaniaCooperante) {
		this.listCampaniaCooperante = listCampaniaCooperante;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}

	public File getEdicion_campania_cooperante_intIdImagen() {
		return edicion_campania_cooperante_intIdImagen;
	}
	public void setEdicion_campania_cooperante_intIdImagen(
			File edicion_campania_cooperante_intIdImagen) {
		this.edicion_campania_cooperante_intIdImagen = edicion_campania_cooperante_intIdImagen;
	}

	public String getEdicion_campania_cooperante_intIdImagenContentType() {
		return edicion_campania_cooperante_intIdImagenContentType;
	}
	public void setEdicion_campania_cooperante_intIdImagenContentType(
			String edicion_campania_cooperante_intIdImagenContentType) {
		this.edicion_campania_cooperante_intIdImagenContentType = edicion_campania_cooperante_intIdImagenContentType;
	}

	public String getEdicion_campania_cooperante_intIdImagenFileName() {
		return edicion_campania_cooperante_intIdImagenFileName;
	}
	public void setEdicion_campania_cooperante_intIdImagenFileName(
			String edicion_campania_cooperante_intIdImagenFileName) {
		this.edicion_campania_cooperante_intIdImagenFileName = edicion_campania_cooperante_intIdImagenFileName;
	}

	public String getEdicion_campania_cooperante_intIdImagenCaption() {
		return edicion_campania_cooperante_intIdImagenCaption;
	}
	public void setEdicion_campania_cooperante_intIdImagenCaption(
			String edicion_campania_cooperante_intIdImagenCaption) {
		this.edicion_campania_cooperante_intIdImagenCaption = edicion_campania_cooperante_intIdImagenCaption;
	}

}