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

import pmp.lupdup.general.util.CadenaUtil;
import pmp.lupdup.general.util.ConfiguracionProperties;
import pmp.lupdup.business.core.donantes.dto.HistorialPuntosDto;
import pmp.lupdup.business.core.donantes.service.HistorialPuntosService;
import pmp.lupdup.dao.donantes.domain.HistorialPuntos;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Historial Puntos
 * 
 * @author Jober Mena
 * 
 */

public class HistorialPuntosAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private HistorialPuntosService historialPuntosService;
	
	public HistorialPuntosAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			List<HistorialPuntos> listHistorialPuntos;
			int intTotalHistorialPuntos				= 0;
			int intTotalHistorialPuntosGanados		= 0;
			int intTotalHistorialPuntosPerdidos		= 0;
			HistorialPuntosDto historialPuntosDto		= new HistorialPuntosDto();
			historialPuntosDto.setIntIndTipopunto(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_TIPO_HISTORIAL_PUNTOS_GANADOS));
			listHistorialPuntos = historialPuntosService.buscar(historialPuntosDto);
			session.put("listHistorialPuntosGanados", listHistorialPuntos);
			for(HistorialPuntos historialPuntos:listHistorialPuntos) {
				intTotalHistorialPuntosGanados		+= historialPuntos.getIntCntPuntoganado();
			}
			historialPuntosDto		= new HistorialPuntosDto();
			historialPuntosDto.setIntIndTipopunto(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_TIPO_HISTORIAL_PUNTOS_PERDIDOS));
			listHistorialPuntos = historialPuntosService.buscar(historialPuntosDto);
			session.put("listHistorialPuntosPerdidos", listHistorialPuntos);
			for(HistorialPuntos historialPuntos:listHistorialPuntos) {
				intTotalHistorialPuntosPerdidos		+= historialPuntos.getIntCntPuntoperdido();
			}
			
			intTotalHistorialPuntos		= (int)(intTotalHistorialPuntosGanados - intTotalHistorialPuntosPerdidos);
			session.put("intTotalHistorialPuntos", intTotalHistorialPuntos);
			session.put("intTotalHistorialPuntosGanados", intTotalHistorialPuntosGanados);
			session.put("intTotalHistorialPuntosPerdidos", intTotalHistorialPuntosPerdidos);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String estadistica() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			List<HistorialPuntos> listHistorialPuntos;
			int intTotalHistorialPuntos				= 0;
			double intTotalHistorialPuntosGanados	= 0;
			double intTotalHistorialPuntosPerdidos	= 0;
			HistorialPuntosDto historialPuntosDto	= new HistorialPuntosDto();
			historialPuntosDto.setIntIndTipopunto(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_TIPO_HISTORIAL_PUNTOS_GANADOS));
			listHistorialPuntos = historialPuntosService.buscar(historialPuntosDto);
			session.put("listHistorialPuntosGanados", listHistorialPuntos);
			for(HistorialPuntos historialPuntos:listHistorialPuntos) {
				intTotalHistorialPuntosGanados		+= historialPuntos.getIntCntPuntoganado();
			}
			for(HistorialPuntos historialPuntos:listHistorialPuntos) {
				historialPuntos.setDblCntPuntoganadoPorciento(100d * (((double)historialPuntos.getIntCntPuntoganado()) / intTotalHistorialPuntosGanados));
			}
//			private Double dblCntPuntoganadoPorciento;
//			private Double dblCntPuntoperdidoPorciento;

			historialPuntosDto		= new HistorialPuntosDto();
			historialPuntosDto.setIntIndTipopunto(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_TIPO_HISTORIAL_PUNTOS_PERDIDOS));
			listHistorialPuntos = historialPuntosService.buscar(historialPuntosDto);
			session.put("listHistorialPuntosPerdidos", listHistorialPuntos);
			for(HistorialPuntos historialPuntos:listHistorialPuntos) {
				intTotalHistorialPuntosPerdidos		+= historialPuntos.getIntCntPuntoperdido();
			}
			for(HistorialPuntos historialPuntos:listHistorialPuntos) {
				historialPuntos.setDblCntPuntoperdidoPorciento(100d * (((double)historialPuntos.getIntCntPuntoperdido()) / intTotalHistorialPuntosPerdidos));
			}
			intTotalHistorialPuntos		= (int)(intTotalHistorialPuntosGanados - intTotalHistorialPuntosPerdidos);
			session.put("intTotalHistorialPuntosGanados", intTotalHistorialPuntosGanados);
			session.put("intTotalHistorialPuntosPerdidos", intTotalHistorialPuntosPerdidos);
			session.put("intTotalHistorialPuntos", intTotalHistorialPuntos);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}