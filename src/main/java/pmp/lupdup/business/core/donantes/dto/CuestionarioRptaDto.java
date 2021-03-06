package pmp.lupdup.business.core.donantes.dto;

import java.util.Date;
import java.util.List;
import pmp.lupdup.general.util.CadenaUtil;

public class CuestionarioRptaDto {
	private Integer srlIdDonantecuestionariorpta;
	private Integer intIdCuestionario;
	private String strCuestionarioDesc;
	private Integer intIdDonante;
	private String strEsCheck;
	private String strDesRespuesta;
	
	public boolean getStrEsCheckBoolean() {
		if(strEsCheck == null) {
			strEsCheck = "N";
		}
		return strEsCheck != null && strEsCheck.equals("S");
	}
	public void setStrEsCheckBoolean(boolean strEsCheckBoolean) {
		this.strEsCheck = (strEsCheckBoolean ? "S" : "N");
	}
	public Integer getSrlIdDonantecuestionariorpta() {
		return srlIdDonantecuestionariorpta;
	}
	public void setSrlIdDonantecuestionariorpta(Integer srlIdDonantecuestionariorpta) {
		this.srlIdDonantecuestionariorpta = srlIdDonantecuestionariorpta;
	}
	public Integer getIntIdCuestionario() {
		return intIdCuestionario;
	}
	public void setIntIdCuestionario(Integer intIdCuestionario) {
		this.intIdCuestionario = intIdCuestionario;
	}
	public Integer getIntIdDonante() {
		return intIdDonante;
	}
	public void setIntIdDonante(Integer intIdDonante) {
		this.intIdDonante = intIdDonante;
	}
	public String getStrEsCheck() {
		return strEsCheck;
	}
	public void setStrEsCheck(String strEsCheck) {
		this.strEsCheck = strEsCheck;
	}
	public String getStrDesRespuesta() {
		return strDesRespuesta;
	}
	public void setStrDesRespuesta(String strDesRespuesta) {
		this.strDesRespuesta = strDesRespuesta;
	}
	public String getStrCuestionarioDesc() {
		return strCuestionarioDesc;
	}
	public void setStrCuestionarioDesc(String strCuestionarioDesc) {
		this.strCuestionarioDesc = strCuestionarioDesc;
	}
	
}
