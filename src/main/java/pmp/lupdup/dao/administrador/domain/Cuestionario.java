package pmp.lupdup.dao.administrador.domain;

import java.util.Date;
import java.util.List;
import pmp.lupdup.general.util.CadenaUtil;

public class Cuestionario extends CuestionarioKey {
	
	private String strDesCuestionario;
	private String intIndTipoDesc;
	private Integer intIndTipo;
	
	public String getIntIndTipoDesc() {
		return intIndTipoDesc;
	}
	public void setIntIndTipoDesc(String intIndTipoDesc) {
		this.intIndTipoDesc = intIndTipoDesc;
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
