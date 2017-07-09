package pmp.lupdup.business.core.administrador.dto;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import pmp.lupdup.general.util.CadenaUtil;

public class SedeSaludDto {
	private Integer srlIdSedesalud;
	private String strNomNombre;
	private String strDesDireccion;
	private String strNumTelefono;
	private String strNumCelular;
	private Integer intIdCentrosalud;
	private String strIndUbicacion;
	private Integer intIndZoom;
	private String strDesHospital;
	private Time dteIndHoraDesde;
	private Time dteIndHoraHasta;
	private String strIndEstado="A";
	
	public Integer getSrlIdSedesalud() {
		return srlIdSedesalud;
	}
	public void setSrlIdSedesalud(Integer srlIdSedesalud) {
		this.srlIdSedesalud = srlIdSedesalud;
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
	public Integer getIntIdCentrosalud() {
		return intIdCentrosalud;
	}
	public void setIntIdCentrosalud(Integer intIdCentrosalud) {
		this.intIdCentrosalud = intIdCentrosalud;
	}
	public String getStrIndUbicacion() {
		return strIndUbicacion;
	}
	public void setStrIndUbicacion(String strIndUbicacion) {
		this.strIndUbicacion = strIndUbicacion;
	}
	public Integer getIntIndZoom() {
		return intIndZoom;
	}
	public void setIntIndZoom(Integer intIndZoom) {
		this.intIndZoom = intIndZoom;
	}
	public String getStrDesHospital() {
		return strDesHospital;
	}
	public void setStrDesHospital(String strDesHospital) {
		this.strDesHospital = strDesHospital;
	}

	public Time getDteIndHoraDesde() {
		return dteIndHoraDesde;
	}
	public void setDteIndHoraDesde(Time dteIndHoraDesde) {
		this.dteIndHoraDesde = dteIndHoraDesde;
	}
	public Time getDteIndHoraHasta() {
		return dteIndHoraHasta;
	}
	public void setDteIndHoraHasta(Time dteIndHoraHasta) {
		this.dteIndHoraHasta = dteIndHoraHasta;
	}
	
	public String getDteIndHoraDesdeString() {
		return CadenaUtil.getStrHoraMinutos(dteIndHoraDesde);
	}
	public void setDteIndHoraDesdeString(String dteIndHoraDesde) {
		if(CadenaUtil.getStrNull(dteIndHoraDesde)!=null) {
			this.dteIndHoraDesde = new Time(CadenaUtil.getHoraMinutosFromStr(dteIndHoraDesde).getTime());
		}
	}
	public String getDteIndHoraHastaString() {
		return CadenaUtil.getStrHoraMinutos(dteIndHoraHasta);
	}
	public void setDteIndHoraHastaString(String dteIndHoraHasta) {
		if(CadenaUtil.getStrNull(dteIndHoraHasta)!=null) {
			this.dteIndHoraHasta = new Time(CadenaUtil.getHoraMinutosFromStr(dteIndHoraHasta).getTime());
		}
	}
	
	public String getDteIndHoraDesdeHastaString() {
		return CadenaUtil.getStrHoraMinutosAMPM(dteIndHoraDesde) + " a " + CadenaUtil.getStrHoraMinutosAMPM(dteIndHoraHasta);
	}
	public String getStrIndEstado() {
		return strIndEstado;
	}
	public void setStrIndEstado(String strIndEstado) {
		this.strIndEstado = strIndEstado;
	}
	
}
