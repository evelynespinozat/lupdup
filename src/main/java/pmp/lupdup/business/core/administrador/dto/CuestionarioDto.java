package pmp.lupdup.business.core.administrador.dto;

import java.util.Date;
import java.util.List;
import pmp.lupdup.general.util.CadenaUtil;

public class CuestionarioDto {
	private Integer srlIdCuestionario;
	private String strDesCuestionario;
	private String intIndTipoDesc;
	private Integer intIndTipo;
	public String getIntIndTipoDesc() {
		return intIndTipoDesc;
	}
	public void setIntIndTipoDesc(String intIndTipoDesc) {
		this.intIndTipoDesc = intIndTipoDesc;
	}
	public Integer getSrlIdCuestionario() {
		return srlIdCuestionario;
	}
	public void setSrlIdCuestionario(Integer srlIdCuestionario) {
		this.srlIdCuestionario = srlIdCuestionario;
	}
	public String getStrDesCuestionario() {
		return strDesCuestionario;
	}
	public void setStrDesCuestionario(String strDesCuestionario) {
		this.strDesCuestionario = strDesCuestionario;
	}
	public Integer getIntIndTipo() {
		return intIndTipo;
	}
	public void setIntIndTipo(Integer intIndTipo) {
		this.intIndTipo = intIndTipo;
	}
	
}
