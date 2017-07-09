package pmp.lupdup.business.core.csalud.dto;

import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class BandejaCitaDto {
	private Integer srlIdCita;
	private Integer intIdSede;
	private Integer intIdCentrosalud;
	private Integer intIdDonante;
	private Date dteFecCitaDesde;
	private Date dteFecCitaHasta;
	private Date dteFecCita;
	private String strHorCita;
	private Integer intIdEstado;
	private String intIdEstadoDesc;
	
	private String strNumDni;
	private String strNomNombre;
	private String strNomAppaterno;
	private String strNomApmaterno;
	private String strDesCorreo;
	
	public String getDteFecCitaFecha() {
		return CadenaUtil.getStrDate(dteFecCita);
	}
	public void setDteFecCitaFecha(String dteFecCita) {
		this.dteFecCita = CadenaUtil.getDateFromStr(dteFecCita);
	}
	public Integer getSrlIdCita() {
		return srlIdCita;
	}
	public void setSrlIdCita(Integer srlIdCita) {
		this.srlIdCita = srlIdCita;
	}
	public Integer getIntIdSede() {
		return intIdSede;
	}
	public void setIntIdSede(Integer intIdSede) {
		this.intIdSede = intIdSede;
	}
	public Integer getIntIdDonante() {
		return intIdDonante;
	}
	public void setIntIdDonante(Integer intIdDonante) {
		this.intIdDonante = intIdDonante;
	}
	public Date getDteFecCita() {
		return dteFecCita;
	}
	public void setDteFecCita(Date dteFecCita) {
		this.dteFecCita = dteFecCita;
	}
	public String getStrHorCita() {
		return strHorCita;
	}
	public void setStrHorCita(String strHorCita) {
		this.strHorCita = strHorCita;
	}
	public String getStrNumDni() {
		return strNumDni;
	}
	public void setStrNumDni(String strNumDni) {
		this.strNumDni = strNumDni;
	}
	public String getStrNomNombre() {
		return strNomNombre;
	}
	public void setStrNomNombre(String strNomNombre) {
		this.strNomNombre = strNomNombre;
	}
	public String getStrNomAppaterno() {
		return strNomAppaterno;
	}
	public void setStrNomAppaterno(String strNomAppaterno) {
		this.strNomAppaterno = strNomAppaterno;
	}
	public String getStrNomApmaterno() {
		return strNomApmaterno;
	}
	public void setStrNomApmaterno(String strNomApmaterno) {
		this.strNomApmaterno = strNomApmaterno;
	}
	public Date getDteFecCitaDesde() {
		return dteFecCitaDesde;
	}
	public void setDteFecCitaDesde(Date dteFecCitaDesde) {
		this.dteFecCitaDesde = dteFecCitaDesde;
	}
	public Date getDteFecCitaHasta() {
		return dteFecCitaHasta;
	}
	public void setDteFecCitaHasta(Date dteFecCitaHasta) {
		this.dteFecCitaHasta = dteFecCitaHasta;
	}
	public Integer getIntIdEstado() {
		return intIdEstado;
	}
	public void setIntIdEstado(Integer intIdEstado) {
		this.intIdEstado = intIdEstado;
	}
	public String getIntIdEstadoDesc() {
		return intIdEstadoDesc;
	}
	public void setIntIdEstadoDesc(String intIdEstadoDesc) {
		this.intIdEstadoDesc = intIdEstadoDesc;
	}
	public Integer getIntIdCentrosalud() {
		return intIdCentrosalud;
	}
	public void setIntIdCentrosalud(Integer intIdCentrosalud) {
		this.intIdCentrosalud = intIdCentrosalud;
	}
	public String getStrDesCorreo() {
		return strDesCorreo;
	}
	public void setStrDesCorreo(String strDesCorreo) {
		this.strDesCorreo = strDesCorreo;
	}
	
}
