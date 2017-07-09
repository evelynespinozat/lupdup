package pmp.lupdup.web.donantes.action;

import java.util.List;
import java.util.Collection;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pmp.lupdup.general.action.BaseAction;
import pmp.lupdup.general.util.ConfiguracionProperties;
import pmp.lupdup.business.core.administrador.dto.SedeSaludDto;
import pmp.lupdup.business.core.administrador.service.SedeSaludService;
import pmp.lupdup.business.core.donantes.dto.CitaDto;
import pmp.lupdup.business.core.donantes.dto.DonanteCampaniaDto;
import pmp.lupdup.business.core.donantes.dto.DonanteDto;
import pmp.lupdup.business.core.donantes.service.CitaService;
import pmp.lupdup.business.core.donantes.service.DonanteCampaniaService;
import pmp.lupdup.business.core.donantes.service.DonanteService;
import pmp.lupdup.dao.administrador.domain.SedeSalud;
import pmp.lupdup.dao.donantes.domain.Cita;
import pmp.lupdup.dao.donantes.domain.Donante;
import pmp.lupdup.dao.donantes.domain.DonanteCampania;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Cita
 * 
 * @author Jober Mena
 * 
 */

public class HomeAction extends BaseAction {
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
	
	@Autowired
	private DonanteCampaniaService donanteCampaniaService;
	
	private CitaDto edicion_citaDto;
	private List<DonanteCampania> listDonanteCampania;
	
	public HomeAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		
		try {
			session.remove("cita_preprogramada");
			
			SedeSaludDto sedeSaludDto		= new SedeSaludDto();
			List<SedeSalud> listSedeSalud		= sedeSaludService.buscar(sedeSaludDto);
			session.put("listSedeSalud", listSedeSalud);
			
			SedeSalud sedeSalud		= new SedeSalud();
			session.put("sedeSalud", sedeSalud);
			{
				DonanteCampaniaDto donanteCampaniaDto		= new DonanteCampaniaDto();
				listDonanteCampania = donanteCampaniaService.buscar(donanteCampaniaDto);
			}
			
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
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public CitaDto getEdicion_citaDto() {
		return edicion_citaDto;
	}
	public void setEdicion_citaDto(
			CitaDto edicion_citaDto) {
		this.edicion_citaDto = edicion_citaDto;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}

	public List<DonanteCampania> getListDonanteCampania() {
		return listDonanteCampania;
	}

	public void setListDonanteCampania(List<DonanteCampania> listDonanteCampania) {
		this.listDonanteCampania = listDonanteCampania;
	}
	
}