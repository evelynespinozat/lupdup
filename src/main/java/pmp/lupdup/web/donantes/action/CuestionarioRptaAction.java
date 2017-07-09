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
import pmp.lupdup.business.core.administrador.dto.CuestionarioDto;
import pmp.lupdup.business.core.administrador.service.CuestionarioService;
import pmp.lupdup.business.core.donantes.dto.CuestionarioRptaDto;
import pmp.lupdup.business.core.donantes.service.CuestionarioRptaService;
import pmp.lupdup.dao.administrador.domain.Cuestionario;
import pmp.lupdup.dao.donantes.domain.CuestionarioRpta;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Cuestionario
 * 
 * @author Jober Mena
 * 
 */

public class CuestionarioRptaAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private CuestionarioRptaService cuestionarioRptaService;
	
	@Autowired
	private CuestionarioService cuestionarioService;
	
	private String buscar_srlIdDonantecuestionariorpta;
	private String buscar_intIdCuestionario;
	private String buscar_intIdDonante;
	private String buscar_strEsCheck;
	private String buscar_strDesRespuesta;
	
	private String[] buscar_seleccion_id;
	
	private CuestionarioRptaDto edicion_cuestionarioRptaDto;
	
	private List<CuestionarioRpta> listCuestionarioRpta;
	private List<CuestionarioRpta> listCuestionario;
	
	public CuestionarioRptaAction() {
	}
	
	public String inicio() {
		Map<String, Object> session			= ActionContext.getContext().getSession();
		HttpServletRequest request			= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		try {
			CuestionarioRptaDto cuestionarioRptaDto	= new CuestionarioRptaDto();
			cuestionarioRptaDto.setIntIdDonante(getUsuarioSession().getIntIdDonante());
			this.listCuestionarioRpta		= cuestionarioRptaService.buscar(cuestionarioRptaDto);
			this.listCuestionario			= cuestionarioRptaService.selectCuestionarioRptaByDonante(cuestionarioRptaDto);

//			if(this.listCuestionarioRpta.size() > 0) {
//				CuestionarioDto cuestionarioDto			= new CuestionarioDto();
//				cuestionarioDto.setIntIndTipo(17);//Tipo cuestionario para donantes nuevos
//				this.listCuestionario					= cuestionarioService.buscar(cuestionarioDto);
//			} else {
//				CuestionarioDto cuestionarioDto			= new CuestionarioDto();
//				cuestionarioDto.setIntIndTipo(18);//Tipo cuestionario para donantes frecuentes
//				this.listCuestionario					= cuestionarioService.buscar(cuestionarioDto);
//			}
			session.put("listCuestionario", listCuestionario);
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
			CuestionarioRptaDto cuestionarioRptaDto		= new CuestionarioRptaDto();
			if(buscar_strEsCheck != null && !buscar_strEsCheck.equals("")) {
				cuestionarioRptaDto.setStrEsCheck(CadenaUtil.getStr(buscar_strEsCheck));
			}
			if(buscar_strDesRespuesta != null && !buscar_strDesRespuesta.equals("")) {
				cuestionarioRptaDto.setStrDesRespuesta(CadenaUtil.getStr(buscar_strDesRespuesta));
			}
			
			listCuestionarioRpta = cuestionarioRptaService.buscar(cuestionarioRptaDto);
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		CuestionarioRptaDto cuestionarioRptaDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				cuestionarioRptaDto	= new CuestionarioRptaDto();
				cuestionarioRptaDto.setSrlIdDonantecuestionariorpta(CadenaUtil.getInte(buscar_seleccion_id[i]));
				cuestionarioRptaService.eliminar(cuestionarioRptaDto);
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
			CuestionarioRptaDto cuestionarioRptaDto		= new CuestionarioRptaDto();
			cuestionarioRptaDto.setSrlIdDonantecuestionariorpta(CadenaUtil.getInte(buscar_seleccion_id[0]));
			CuestionarioRpta cuestionarioRpta				= cuestionarioRptaService.buscarById(cuestionarioRptaDto);
			if(cuestionarioRpta != null) {
				this.edicion_cuestionarioRptaDto		= new CuestionarioRptaDto();
				BeanUtils.copyProperties(cuestionarioRpta, this.edicion_cuestionarioRptaDto);
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
		this.edicion_cuestionarioRptaDto		= new CuestionarioRptaDto();
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
			
			listCuestionario	= (List<CuestionarioRpta>)session.get("listCuestionario");
			for(CuestionarioRpta cuestionario:listCuestionario) {
				String strRptaCuestionario			= request.getParameter("cuestionario_rpta_"+cuestionario.getIntIdCuestionario());
				String strRptaCuestionarioTxt		= request.getParameter("cuestionario_rpta_txt_"+cuestionario.getIntIdCuestionario());
				this.edicion_cuestionarioRptaDto	= new CuestionarioRptaDto();
				//this.edicion_cuestionarioRptaDto.setSrlIdDonantecuestionariorpta(5);
				this.edicion_cuestionarioRptaDto.setIntIdDonante(getUsuarioSession().getIntIdDonante());
				this.edicion_cuestionarioRptaDto.setIntIdCuestionario(cuestionario.getIntIdCuestionario());
				this.edicion_cuestionarioRptaDto.setStrDesRespuesta(CadenaUtil.getStr(strRptaCuestionarioTxt));
				this.edicion_cuestionarioRptaDto.setStrEsCheckBoolean(CadenaUtil.getStr(strRptaCuestionario).equals("SI"));
				cuestionarioRptaService.guardar(this.edicion_cuestionarioRptaDto);
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
	
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public String getBuscar_srlIdDonantecuestionariorpta() {
		return buscar_srlIdDonantecuestionariorpta;
	}
	
	public void setBuscar_srlIdDonantecuestionariorpta(String buscar_srlIdDonantecuestionariorpta) {
		this.buscar_srlIdDonantecuestionariorpta = buscar_srlIdDonantecuestionariorpta;
	}
	public String getBuscar_intIdCuestionario() {
		return buscar_intIdCuestionario;
	}
	
	public void setBuscar_intIdCuestionario(String buscar_intIdCuestionario) {
		this.buscar_intIdCuestionario = buscar_intIdCuestionario;
	}
	public String getBuscar_intIdDonante() {
		return buscar_intIdDonante;
	}
	
	public void setBuscar_intIdDonante(String buscar_intIdDonante) {
		this.buscar_intIdDonante = buscar_intIdDonante;
	}
	public String getBuscar_strEsCheck() {
		return buscar_strEsCheck;
	}
	
	public void setBuscar_strEsCheck(String buscar_strEsCheck) {
		this.buscar_strEsCheck = buscar_strEsCheck;
	}
	public String getBuscar_strDesRespuesta() {
		return buscar_strDesRespuesta;
	}
	
	public void setBuscar_strDesRespuesta(String buscar_strDesRespuesta) {
		this.buscar_strDesRespuesta = buscar_strDesRespuesta;
	}
	
	public CuestionarioRptaDto getEdicion_cuestionarioRptaDto() {
		return edicion_cuestionarioRptaDto;
	}
	
	public void setEdicion_cuestionarioRptaDto(
			CuestionarioRptaDto edicion_cuestionarioRptaDto) {
		this.edicion_cuestionarioRptaDto = edicion_cuestionarioRptaDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<CuestionarioRpta> getListCuestionarioRpta() {
		return listCuestionarioRpta;
	}
	
	public void setListCuestionarioRpta(List<CuestionarioRpta> listCuestionarioRpta) {
		this.listCuestionarioRpta = listCuestionarioRpta;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}

	public List<CuestionarioRpta> getListCuestionario() {
		return listCuestionario;
	}

	public void setListCuestionario(List<CuestionarioRpta> listCuestionario) {
		this.listCuestionario = listCuestionario;
	}

	
}