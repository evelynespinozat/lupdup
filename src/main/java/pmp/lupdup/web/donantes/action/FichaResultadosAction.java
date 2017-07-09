package pmp.lupdup.web.donantes.action;

import java.util.List;
import java.util.Collection;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import pmp.lupdup.general.action.BaseAction;
import pmp.lupdup.general.util.CadenaUtil;
import pmp.lupdup.business.core.administrador.service.ImagenService;
import pmp.lupdup.business.core.donantes.dto.DetalleFichaDto;
import pmp.lupdup.business.core.donantes.dto.FichaResultadosDto;
import pmp.lupdup.business.core.donantes.service.DetalleFichaService;
import pmp.lupdup.business.core.donantes.service.FichaResultadosService;
import pmp.lupdup.dao.donantes.domain.DetalleFicha;
import pmp.lupdup.dao.donantes.domain.FichaResultados;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Resultados
 * 
 * @author Jober Mena
 * 
 */

public class FichaResultadosAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	
	@Autowired
	private FichaResultadosService fichaResultadosService;
	
	@Autowired
	private DetalleFichaService detalleFichaService;
	
	private List<FichaResultados> listFichaResultados;
	private FichaResultados fichaResultados;
	private DetalleFicha detalleFicha;
	
	public FichaResultadosAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			FichaResultadosDto fichaResultadosDto		= new FichaResultadosDto();
			fichaResultadosDto.setIntIdDonante(getUsuarioSession().getIntIdDonante());
			listFichaResultados = fichaResultadosService.buscar(fichaResultadosDto);
			if(listFichaResultados.size() > 0) {
				this.fichaResultados	= listFichaResultados.get(0);
			}
			
			if(this.fichaResultados != null) {
				DetalleFichaDto detalleFichaDto		= new DetalleFichaDto();
				detalleFichaDto.setIntIdFicha(this.fichaResultados.getSrlIdFicha());
				List<DetalleFicha> listDetalleFicha = detalleFichaService.buscar(detalleFichaDto);
				if(listDetalleFicha.size() > 0) {
					this.detalleFicha	= listDetalleFicha.get(0);
				}
			}
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}

	//////////////////////////////////////////////////////////////////////////////////////
	
	public List<FichaResultados> getListFichaResultados() {
		return listFichaResultados;
	}
	
	public void setListFichaResultados(List<FichaResultados> listFichaResultados) {
		this.listFichaResultados = listFichaResultados;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}

	public FichaResultados getFichaResultados() {
		return fichaResultados;
	}

	public void setFichaResultados(FichaResultados fichaResultados) {
		this.fichaResultados = fichaResultados;
	}

	public DetalleFicha getDetalleFicha() {
		return detalleFicha;
	}

	public void setDetalleFicha(DetalleFicha detalleFicha) {
		this.detalleFicha = detalleFicha;
	}

}