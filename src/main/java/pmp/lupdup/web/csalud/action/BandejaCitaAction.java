package pmp.lupdup.web.csalud.action;

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
import pmp.lupdup.business.core.administrador.service.CentroSaludService;
import pmp.lupdup.business.core.administrador.service.SedeSaludService;
import pmp.lupdup.business.core.csalud.dto.BandejaCitaDto;
import pmp.lupdup.business.core.csalud.service.BandejaCitaService;
import pmp.lupdup.business.core.donantes.dto.DetalleFichaDto;
import pmp.lupdup.business.core.donantes.dto.FichaResultadosDto;
import pmp.lupdup.business.core.donantes.service.DetalleFichaService;
import pmp.lupdup.business.core.donantes.service.FichaResultadosService;
import pmp.lupdup.dao.administrador.domain.CentroSalud;
import pmp.lupdup.dao.administrador.domain.SedeSalud;
import pmp.lupdup.dao.csalud.domain.BandejaCita;
import pmp.lupdup.dao.donantes.domain.DetalleFicha;
import pmp.lupdup.dao.donantes.domain.FichaResultados;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Bandeja citas
 * 
 * @author Jober Mena
 * 
 */

public class BandejaCitaAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private BandejaCitaService bandejaCitaService;
	
	@Autowired
	private FichaResultadosService fichaResultadosService;

	@Autowired
	private DetalleFichaService detalleFichaService;

	@Autowired
	private CentroSaludService centroSaludService;

	@Autowired
	private SedeSaludService sedeSaludService;
	
	private String buscar_srlIdCita;
	private String buscar_intIdSede;
	private String buscar_intIdDonante;
	private String buscar_dteFecCita;
	private String buscar_strHorCita;
	private String buscar_dteFecCitaDesde;
	private String buscar_dteFecCitaHasta;

	private String buscar_strNomNombre;
	private String buscar_strNomAppaterno;
	private String buscar_strNomApmaterno;
	private String buscar_strNumDni;
	private String buscar_intIdCentroSalud;
	private String buscar_intIdSedeCentroSalud;
	
	private String[] buscar_seleccion_id;
	
	private BandejaCitaDto edicion_bandejaCitaDto;
	private FichaResultadosDto edicion_fichaResultadosDto;

	private DetalleFichaDto edicion_detalleFichaDto;
	
	private List<BandejaCita> listBandejaCita;
	
	public BandejaCitaAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		this.buscar_intIdCentroSalud		= CadenaUtil.getStr(getUsuarioSession().getIntIdCentrosalud());
		this.buscar_intIdSedeCentroSalud	= CadenaUtil.getStr(getUsuarioSession().getIntIdSedeCentrosalud());
		centroSaludCargar();
		sedeCentroSaludCargar();
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			BandejaCitaDto bandejaCitaDto		= new BandejaCitaDto();
			if(buscar_dteFecCitaHasta != null && !buscar_dteFecCitaHasta.equals("")) {
				bandejaCitaDto.setDteFecCitaHasta(CadenaUtil.getDateFromStr(buscar_dteFecCitaHasta));
			}
			if(buscar_dteFecCitaDesde != null && !buscar_dteFecCitaDesde.equals("")) {
				bandejaCitaDto.setDteFecCitaDesde(CadenaUtil.getDateFromStr(buscar_dteFecCitaDesde));
			}
			if(buscar_strNomNombre != null && !buscar_strNomNombre.equals("")) {
				bandejaCitaDto.setStrNomNombre(CadenaUtil.getStr(buscar_strNomNombre));
			}
			if(buscar_strNomAppaterno != null && !buscar_strNomAppaterno.equals("")) {
				bandejaCitaDto.setStrNomAppaterno(CadenaUtil.getStr(buscar_strNomAppaterno));
			}
			if(buscar_strNomApmaterno != null && !buscar_strNomApmaterno.equals("")) {
				bandejaCitaDto.setStrNomApmaterno(CadenaUtil.getStr(buscar_strNomApmaterno));
			}
			if(buscar_strNumDni != null && !buscar_strNumDni.equals("")) {
				bandejaCitaDto.setStrNumDni(CadenaUtil.getStr(buscar_strNumDni));
			}
			if(getUsuarioSession().getIntIdSedeCentrosalud() != null) {
				bandejaCitaDto.setIntIdSede(getUsuarioSession().getIntIdSedeCentrosalud());
			} else {
				if(buscar_intIdSedeCentroSalud != null && !buscar_intIdSedeCentroSalud.equals("")) {
					bandejaCitaDto.setIntIdSede(CadenaUtil.getInte(buscar_intIdSedeCentroSalud));
				}
			}

			listBandejaCita = bandejaCitaService.buscar(bandejaCitaDto);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		BandejaCitaDto bandejaCitaDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				bandejaCitaDto	= new BandejaCitaDto();
				bandejaCitaDto.setSrlIdCita(CadenaUtil.getInte(buscar_seleccion_id[i]));
				bandejaCitaService.eliminar(bandejaCitaDto);
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
			BandejaCitaDto bandejaCitaDto		= new BandejaCitaDto();
			bandejaCitaDto.setSrlIdCita(CadenaUtil.getInte(buscar_seleccion_id[0]));
			BandejaCita bandejaCita				= bandejaCitaService.buscarById(bandejaCitaDto);
			if(bandejaCita != null) {
				this.edicion_bandejaCitaDto		= new BandejaCitaDto();
				BeanUtils.copyProperties(bandejaCita, this.edicion_bandejaCitaDto);
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
		this.edicion_bandejaCitaDto		= new BandejaCitaDto();
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
			BandejaCitaDto bandejaCitaDto		= new BandejaCitaDto();
			bandejaCitaDto.setSrlIdCita(CadenaUtil.getInte(buscar_seleccion_id[0]));
			BandejaCita bandejaCita				= bandejaCitaService.buscarById(bandejaCitaDto);
			if(bandejaCita != null) {
				this.edicion_bandejaCitaDto		= new BandejaCitaDto();
				BeanUtils.copyProperties(bandejaCita, this.edicion_bandejaCitaDto);
			}
			this.edicion_bandejaCitaDto.setIntIdEstado(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_ESTADO_CITA_DONANTE_ASISTIO));
			bandejaCitaService.guardar(this.edicion_bandejaCitaDto);
			
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
	
	public String editarFicha() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			formatoHoraCargar();
			if(CadenaUtil.getInteNull(request.getParameter("intIdDonante")) != null && CadenaUtil.getInteNull(request.getParameter("intIdCentrosalud")) != null) {
				FichaResultadosDto fichaResultadosDto		= new FichaResultadosDto();
				fichaResultadosDto.setIntIdDonante(CadenaUtil.getInte(request.getParameter("intIdDonante")));
				fichaResultadosDto.setIntIdCentrosalud(CadenaUtil.getInte(request.getParameter("intIdCentrosalud")));
				List<FichaResultados> listFichaResultados	= fichaResultadosService.buscar(fichaResultadosDto);
				if(listFichaResultados != null && listFichaResultados.size() > 0) {
					this.edicion_fichaResultadosDto		= new FichaResultadosDto();
					BeanUtils.copyProperties(listFichaResultados.get(0), this.edicion_fichaResultadosDto);
					
					if(CadenaUtil.getInteNull(this.edicion_fichaResultadosDto.getIntIdCita()) == null) {
						this.edicion_fichaResultadosDto.setIntIdCita(CadenaUtil.getInte(request.getParameter("intIdCita")));
					}
					
					DetalleFichaDto detalleFichaDto			= new DetalleFichaDto();
					detalleFichaDto.setIntIdFicha(this.edicion_fichaResultadosDto.getSrlIdFicha());
					List<DetalleFicha> listDetaleFicha		= detalleFichaService.buscar(detalleFichaDto);
					if(listDetaleFicha != null && listDetaleFicha.size() > 0) {
						this.edicion_detalleFichaDto		= new DetalleFichaDto();
						BeanUtils.copyProperties(listDetaleFicha.get(0), this.edicion_detalleFichaDto);
					}
				} else {
					this.edicion_fichaResultadosDto		= new FichaResultadosDto();
					this.edicion_fichaResultadosDto.setIntIdDonante(CadenaUtil.getInte(request.getParameter("intIdDonante")));
					this.edicion_fichaResultadosDto.setIntIdCentrosalud(CadenaUtil.getInte(request.getParameter("intIdCentrosalud")));
					this.edicion_fichaResultadosDto.setIntIdCita(CadenaUtil.getInte(request.getParameter("intIdCita")));
					this.edicion_detalleFichaDto		= new DetalleFichaDto();
				}
			} else {
				this.edicion_fichaResultadosDto		= new FichaResultadosDto();
				this.edicion_detalleFichaDto		= new DetalleFichaDto();
			}
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String guardarFicha() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		boolean error	= false;
		try {
			if(error) {
				throw new Exception("");
			}
			
			bandejaCitaService.guardarFicha(this.edicion_fichaResultadosDto, this.edicion_detalleFichaDto);

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

	public String sedeCentroSaludCargar() {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			SedeSaludDto sedeSaludDto = new SedeSaludDto();
			Integer srlIdCentrosalud		= CadenaUtil.getInte(buscar_intIdCentroSalud);
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
	
	public String getBuscar_srlIdCita() {
		return buscar_srlIdCita;
	}
	
	public void setBuscar_srlIdCita(String buscar_srlIdCita) {
		this.buscar_srlIdCita = buscar_srlIdCita;
	}
	public String getBuscar_intIdSede() {
		return buscar_intIdSede;
	}
	
	public void setBuscar_intIdSede(String buscar_intIdSede) {
		this.buscar_intIdSede = buscar_intIdSede;
	}
	public String getBuscar_intIdDonante() {
		return buscar_intIdDonante;
	}
	
	public void setBuscar_intIdDonante(String buscar_intIdDonante) {
		this.buscar_intIdDonante = buscar_intIdDonante;
	}
	public String getBuscar_dteFecCita() {
		return buscar_dteFecCita;
	}
	
	public void setBuscar_dteFecCita(String buscar_dteFecCita) {
		this.buscar_dteFecCita = buscar_dteFecCita;
	}
	public String getBuscar_strHorCita() {
		return buscar_strHorCita;
	}
	
	public void setBuscar_strHorCita(String buscar_strHorCita) {
		this.buscar_strHorCita = buscar_strHorCita;
	}
	
	public BandejaCitaDto getEdicion_bandejaCitaDto() {
		return edicion_bandejaCitaDto;
	}
	
	public void setEdicion_bandejaCitaDto(
			BandejaCitaDto edicion_bandejaCitaDto) {
		this.edicion_bandejaCitaDto = edicion_bandejaCitaDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<BandejaCita> getListBandejaCita() {
		return listBandejaCita;
	}
	
	public void setListBandejaCita(List<BandejaCita> listBandejaCita) {
		this.listBandejaCita = listBandejaCita;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
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

	public String getBuscar_strNumDni() {
		return buscar_strNumDni;
	}

	public void setBuscar_strNumDni(String buscar_strNumDni) {
		this.buscar_strNumDni = buscar_strNumDni;
	}

	public String getBuscar_dteFecCitaDesde() {
		return buscar_dteFecCitaDesde;
	}

	public void setBuscar_dteFecCitaDesde(String buscar_dteFecCitaDesde) {
		this.buscar_dteFecCitaDesde = buscar_dteFecCitaDesde;
	}

	public String getBuscar_dteFecCitaHasta() {
		return buscar_dteFecCitaHasta;
	}

	public void setBuscar_dteFecCitaHasta(String buscar_dteFecCitaHasta) {
		this.buscar_dteFecCitaHasta = buscar_dteFecCitaHasta;
	}

	public FichaResultadosDto getEdicion_fichaResultadosDto() {
		return edicion_fichaResultadosDto;
	}

	public void setEdicion_fichaResultadosDto(
			FichaResultadosDto edicion_fichaResultadosDto) {
		this.edicion_fichaResultadosDto = edicion_fichaResultadosDto;
	}

	public DetalleFichaDto getEdicion_detalleFichaDto() {
		return edicion_detalleFichaDto;
	}

	public void setEdicion_detalleFichaDto(DetalleFichaDto edicion_detalleFichaDto) {
		this.edicion_detalleFichaDto = edicion_detalleFichaDto;
	}

	public String getBuscar_intIdCentroSalud() {
		return buscar_intIdCentroSalud;
	}

	public void setBuscar_intIdCentroSalud(String buscar_intIdCentroSalud) {
		this.buscar_intIdCentroSalud = buscar_intIdCentroSalud;
	}

	public String getBuscar_intIdSedeCentroSalud() {
		return buscar_intIdSedeCentroSalud;
	}

	public void setBuscar_intIdSedeCentroSalud(String buscar_intIdSedeCentroSalud) {
		this.buscar_intIdSedeCentroSalud = buscar_intIdSedeCentroSalud;
	}
	
}