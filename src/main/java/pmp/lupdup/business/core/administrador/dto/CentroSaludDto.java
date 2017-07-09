package pmp.lupdup.business.core.administrador.dto;

import java.util.Date;
import java.util.List;

import pmp.lupdup.general.util.CadenaUtil;

public class CentroSaludDto {
	private Integer srlIdCentrosalud;
	private String strNomNombre;
	private Integer intIndTipoentidad;
	private String strIndEstado="A";
	
	public Integer getSrlIdCentrosalud() {
		return srlIdCentrosalud;
	}
	public void setSrlIdCentrosalud(Integer srlIdCentrosalud) {
		this.srlIdCentrosalud = srlIdCentrosalud;
	}
	public String getStrNomNombre() {
		return strNomNombre;
	}
	public void setStrNomNombre(String strNomNombre) {
		this.strNomNombre = strNomNombre;
	}
	public Integer getIntIndTipoentidad() {
		return intIndTipoentidad;
	}
	public void setIntIndTipoentidad(Integer intIndTipoentidad) {
		this.intIndTipoentidad = intIndTipoentidad;
	}
	public String getStrIndEstado() {
		return strIndEstado;
	}
	public void setStrIndEstado(String strIndEstado) {
		this.strIndEstado = strIndEstado;
	}
	
}
