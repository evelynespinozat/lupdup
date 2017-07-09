package pmp.lupdup.web.donantes.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collection;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import pmp.lupdup.general.action.BaseAction;
import pmp.lupdup.general.util.CadenaUtil;
import pmp.lupdup.general.util.ConfiguracionProperties;
import pmp.lupdup.business.core.administrador.dto.SedeSaludDto;
import pmp.lupdup.business.core.administrador.service.SedeSaludService;
import pmp.lupdup.business.core.donantes.dto.CitaDto;
import pmp.lupdup.business.core.donantes.dto.DonanteDto;
import pmp.lupdup.business.core.donantes.service.CitaService;
import pmp.lupdup.business.core.donantes.service.DonanteService;
import pmp.lupdup.dao.administrador.domain.SedeSalud;
import pmp.lupdup.dao.donantes.domain.Cita;
import pmp.lupdup.dao.donantes.domain.Donante;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Cita
 * 
 * @author Jober Mena
 * 
 */

public class CitaAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private CitaService citaService;
	
	@Autowired
	private SedeSaludService sedeSaludService;
	
	@Autowired
	private DonanteService donanteService;
	
	private String buscar_srlIdCita;
	private String buscar_intIdSede;
	private String buscar_intIdDonante;
	private String buscar_dteFecCita;
	private String buscar_strHorCita;
	
	private String filtrar_strHoraDesde;
	private String filtrar_strHoraHasta;
	
	private String[] buscar_seleccion_id;
	
	private CitaDto edicion_citaDto;
	private String cita_sin_login;
	
	private List<Cita> listCita;
	
	public CitaAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		
		try {
			formatoHoraCargar();
			
			SedeSaludDto sedeSaludDto		= new SedeSaludDto();
			List<SedeSalud> listSedeSalud		= sedeSaludService.buscar(sedeSaludDto);
			session.put("listSedeSalud", listSedeSalud);
			
			SedeSalud sedeSalud		= new SedeSalud();
			session.put("sedeSalud", sedeSalud);
			
			if(getUsuarioSession() != null) {
				DonanteDto donanteDto			= new DonanteDto();
				donanteDto.setSrlIdDonante(getUsuarioSession().getIntIdDonante());
				Donante donante					= donanteService.buscarById(donanteDto);
				session.put("donante", donante);
				this.edicion_citaDto		= new CitaDto();
				this.edicion_citaDto.setIntIdDonante(getUsuarioSession().getIntIdDonante());
				
				CitaDto citaDto		= new CitaDto();
				citaDto.setIntIdDonante(getUsuarioSession().getIntIdDonante());
				citaDto.setIntIdEstado(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_ESTADO_CITA_DONANTE_PROGRAMADO));
				List<Cita> listCita	= citaService.buscar(citaDto);
				if(listCita.size() > 0) {
					this.edicion_citaDto		= new CitaDto();
					BeanUtils.copyProperties(listCita.get(0), this.edicion_citaDto);
					
					sedeSaludDto		= new SedeSaludDto();
					sedeSaludDto.setSrlIdSedesalud(this.edicion_citaDto.getIntIdSede());
					sedeSalud			= sedeSaludService.buscarById(sedeSaludDto);
					session.put("sedeSalud", sedeSalud);
				} else {
					this.edicion_citaDto		= new CitaDto();
					this.edicion_citaDto.setIntIdDonante(getUsuarioSession().getIntIdDonante());
				}
			}
			
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}

	public String inicioHome() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		
		try {
			formatoHoraCargar();
			session.remove("cita_preprogramada");
			
			SedeSaludDto sedeSaludDto		= new SedeSaludDto();
			List<SedeSalud> listSedeSalud		= sedeSaludService.buscar(sedeSaludDto);
			session.put("listSedeSalud", listSedeSalud);
			
			SedeSalud sedeSalud		= new SedeSalud();
			session.put("sedeSalud", sedeSalud);
			
			if(getUsuarioSession() != null) {
				DonanteDto donanteDto			= new DonanteDto();
				donanteDto.setSrlIdDonante(getUsuarioSession().getIntIdDonante());
				Donante donante					= donanteService.buscarById(donanteDto);
				session.put("donante", donante);
				this.edicion_citaDto		= new CitaDto();
				this.edicion_citaDto.setIntIdDonante(getUsuarioSession().getIntIdDonante());
				
				CitaDto citaDto		= new CitaDto();
				citaDto.setIntIdDonante(getUsuarioSession().getIntIdDonante());
				citaDto.setIntIdEstado(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_ESTADO_CITA_DONANTE_PROGRAMADO));
				List<Cita> listCita	= citaService.buscar(citaDto);
				if(listCita.size() > 0) {
					this.edicion_citaDto		= new CitaDto();
					BeanUtils.copyProperties(listCita.get(0), this.edicion_citaDto);
					
					sedeSaludDto		= new SedeSaludDto();
					sedeSaludDto.setSrlIdSedesalud(this.edicion_citaDto.getIntIdSede());
					sedeSalud			= sedeSaludService.buscarById(sedeSaludDto);
					session.put("sedeSalud", sedeSalud);
				} else {
					this.edicion_citaDto		= new CitaDto();
					this.edicion_citaDto.setIntIdDonante(getUsuarioSession().getIntIdDonante());
				}
				return "successAuth";
			} else {
				return SUCCESS;
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
			CitaDto citaDto		= new CitaDto();
			if(buscar_dteFecCita != null && !buscar_dteFecCita.equals("")) {
				citaDto.setDteFecCita(CadenaUtil.getDateFromStr(buscar_dteFecCita));
			}
			if(buscar_strHorCita != null && !buscar_strHorCita.equals("")) {
				citaDto.setStrHorCita(CadenaUtil.getStr(buscar_strHorCita));
			}
			
			listCita = citaService.buscar(citaDto);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		CitaDto citaDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				citaDto	= new CitaDto();
				citaDto.setSrlIdCita(CadenaUtil.getInte(buscar_seleccion_id[i]));
				citaService.eliminar(citaDto);
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
			formatoHoraCargar();
			CitaDto citaDto		= new CitaDto();
			citaDto.setSrlIdCita(CadenaUtil.getInte(buscar_seleccion_id[0]));
			Cita cita				= citaService.buscarById(citaDto);
			if(cita != null) {
				this.edicion_citaDto		= new CitaDto();
				BeanUtils.copyProperties(cita, this.edicion_citaDto);
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
		formatoHoraCargar();
		this.edicion_citaDto		= new CitaDto();
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
				this.edicion_citaDto.setIntIdDonante(getUsuarioSession().getIntIdDonante());
				this.edicion_citaDto.setIntIdEstado(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_ESTADO_CITA_DONANTE_PROGRAMADO));
				citaService.guardar(this.edicion_citaDto);
			} else {
				this.edicion_citaDto.setIntIdEstado(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_ESTADO_CITA_DONANTE_PROGRAMADO));
				session.put("cita_preprogramada", this.edicion_citaDto);
				cita_sin_login	= "true";
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
//	public static void main(String[] args) {new CitaAction().formatoHoraCargar();}
	public String formatoHoraCargar() {
		String strHoraDesde	= "00:00";
		String strHoraHasta	= "23:59";
		if(!CadenaUtil.getStr(filtrar_strHoraDesde).equals("")) {
			strHoraDesde	= filtrar_strHoraDesde;
		}
		if(!CadenaUtil.getStr(filtrar_strHoraHasta).equals("")) {
			strHoraHasta	= filtrar_strHoraHasta;
		}
		String[] arrHoraDesde	= strHoraDesde.split(":");
		int intHoraDesde		= CadenaUtil.getInte(arrHoraDesde[0]);
		int intMinDesde			= CadenaUtil.getInte(arrHoraDesde[1]);
		String[] arrHoraHasta	= strHoraHasta.split(":");
		int intHoraHasta		= CadenaUtil.getInte(arrHoraHasta[0]);
		int intMinHasta			= CadenaUtil.getInte(arrHoraHasta[1]);
		boolean minDesde		= false;
		boolean minHasta		= false;
		Map<String, Object> session		= ActionContext.getContext().getSession();
		List<Map> listHora	= new ArrayList<Map>();
		Map map	= new HashMap();
		for(int i = 0;i < 24;i++) {
			if(i >= intHoraDesde && i <= intHoraHasta) {
				for(int j = 0;j < 46;j+=15) {
					if(!minDesde) {
						if(j >= intMinDesde) {
							minDesde	= true;
							//escribre
						} else {
							continue;
						}
					}
					if(i == intHoraHasta) {
						if(!minHasta) {
							if(j <= intMinHasta) {
								//escribre
							} else {
								minHasta	= true;
								continue;
							}
						} else {
							minHasta	= true;
							continue;
						}
					}
					map	= new HashMap();
					map.put("id", CadenaUtil.llenarPorIzquierda(""+i, 2, "0")+":"+CadenaUtil.llenarPorIzquierda(""+j, 2, "0"));
					map.put("desc", CadenaUtil.llenarPorIzquierda(""+i, 2, "0")+":"+CadenaUtil.llenarPorIzquierda(""+j, 2, "0"));
//					System.out.println("map = " + map);
					listHora.add(map);
				}
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
	
	public CitaDto getEdicion_citaDto() {
		return edicion_citaDto;
	}
	public void setEdicion_citaDto(
			CitaDto edicion_citaDto) {
		this.edicion_citaDto = edicion_citaDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<Cita> getListCita() {
		return listCita;
	}
	public void setListCita(List<Cita> listCita) {
		this.listCita = listCita;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}

	public String getCita_sin_login() {
		return cita_sin_login;
	}

	public void setCita_sin_login(String cita_sin_login) {
		this.cita_sin_login = cita_sin_login;
	}

	public String getFiltrar_strHoraDesde() {
		return filtrar_strHoraDesde;
	}

	public void setFiltrar_strHoraDesde(String filtrar_strHoraDesde) {
		this.filtrar_strHoraDesde = filtrar_strHoraDesde;
	}

	public String getFiltrar_strHoraHasta() {
		return filtrar_strHoraHasta;
	}

	public void setFiltrar_strHoraHasta(String filtrar_strHoraHasta) {
		this.filtrar_strHoraHasta = filtrar_strHoraHasta;
	}
	
}