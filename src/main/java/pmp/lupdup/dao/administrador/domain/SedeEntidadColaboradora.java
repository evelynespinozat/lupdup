package pmp.lupdup.dao.administrador.domain;

import java.util.Date;
import java.util.List;

import pmp.lupdup.general.util.CadenaUtil;

public class SedeEntidadColaboradora extends SedeEntidadColaboradoraKey {
	
	private Integer intIdEntidadcolaboradora;
	private String strNomNombre;
	private String strDesDireccion;
	private String strNumTelefono;
	private String strNumCelular;
	private Integer intIdUbigeo;
	private String strIndEstado="A";
	
	public Integer getIntIdEntidadcolaboradora() {
		return intIdEntidadcolaboradora;
	}
	public void setIntIdEntidadcolaboradora(Integer intIdEntidadcolaboradora) {
		this.intIdEntidadcolaboradora = intIdEntidadcolaboradora;
	}
	public String getStrNomNombre() {
		return strNomNombre;
	}
	public void setStrNomNombre(String strNomNombre) {
		this.strNomNombre = strNomNombre;
	}
	public String getStrDesDireccion() {
		return strDesDireccion;
	}
	public void setStrDesDireccion(String strDesDireccion) {
		this.strDesDireccion = strDesDireccion;
	}
	public String getStrNumTelefono() {
		return strNumTelefono;
	}
	public void setStrNumTelefono(String strNumTelefono) {
		this.strNumTelefono = strNumTelefono;
	}
	public String getStrNumCelular() {
		return strNumCelular;
	}
	public void setStrNumCelular(String strNumCelular) {
		this.strNumCelular = strNumCelular;
	}
	public Integer getIntIdUbigeo() {
		return intIdUbigeo;
	}
	public void setIntIdUbigeo(Integer intIdUbigeo) {
		this.intIdUbigeo = intIdUbigeo;
	}
	public String getStrIndEstado() {
		return strIndEstado;
	}
	public void setStrIndEstado(String strIndEstado) {
		this.strIndEstado = strIndEstado;
	}
	
}
