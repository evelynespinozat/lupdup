package pmp.lupdup.dao.administrador.domain;

import java.util.Date;
import java.util.List;

import pmp.lupdup.general.util.CadenaUtil;

public class CentroSalud extends CentroSaludKey {
	
	private String strNomNombre;
	private Integer intIndTipoentidad;
	private String strIndEstado="A";
	
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
