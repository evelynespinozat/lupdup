package pmp.lupdup.dao.administrador.domain;

import java.util.Date;
import java.util.List;

import pmp.lupdup.general.util.CadenaUtil;

public class EntidadColaboradora extends EntidadColaboradoraKey {
	
	private String strNomNombre;
	private String strIndEstado="A";
	
	public String getStrNomNombre() {
		return strNomNombre;
	}
	public void setStrNomNombre(String strNomNombre) {
		this.strNomNombre = strNomNombre;
	}
	public String getStrIndEstado() {
		return strIndEstado;
	}
	public void setStrIndEstado(String strIndEstado) {
		this.strIndEstado = strIndEstado;
	}
	
}
