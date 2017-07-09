package pmp.lupdup.business.core.donantes.dto;

import java.util.Date;
import java.util.List;

import pmp.lupdup.general.util.CadenaUtil;

public class FichaResultadosDto {
	private Integer srlIdFicha;
	private Integer intIdDonante;
	private Integer intIdCentrosalud;
	private Integer intIdImagen;
	private Date dteFecAnalisis;
	private String strHorAnalisis;
	private Integer intIndEstado;
	private Integer intNumUnidades;
	private String strNombreCompletoDonante;
	private Integer intIdCita;

	public String getDteFecAnalisisFecha() {
		return CadenaUtil.getStrDate(dteFecAnalisis);
	}
	public void setDteFecAnalisisFecha(String dteFecAnalisis) {
		this.dteFecAnalisis = CadenaUtil.getDateFromStr(dteFecAnalisis);
	}
	public Integer getSrlIdFicha() {
		return srlIdFicha;
	}
	public void setSrlIdFicha(Integer srlIdFicha) {
		this.srlIdFicha = srlIdFicha;
	}
	public Integer getIntIdDonante() {
		return intIdDonante;
	}
	public void setIntIdDonante(Integer intIdDonante) {
		this.intIdDonante = intIdDonante;
	}
	public Integer getIntIdCentrosalud() {
		return intIdCentrosalud;
	}
	public void setIntIdCentrosalud(Integer intIdCentrosalud) {
		this.intIdCentrosalud = intIdCentrosalud;
	}
	public Integer getIntIdImagen() {
		return intIdImagen;
	}
	public void setIntIdImagen(Integer intIdImagen) {
		this.intIdImagen = intIdImagen;
	}
	public Date getDteFecAnalisis() {
		return dteFecAnalisis;
	}
	public void setDteFecAnalisis(Date dteFecAnalisis) {
		this.dteFecAnalisis = dteFecAnalisis;
	}
	public String getStrHorAnalisis() {
		return strHorAnalisis;
	}
	public void setStrHorAnalisis(String strHorAnalisis) {
		this.strHorAnalisis = strHorAnalisis;
	}
	public Integer getIntIndEstado() {
		return intIndEstado;
	}
	public void setIntIndEstado(Integer intIndEstado) {
		this.intIndEstado = intIndEstado;
	}
	public Integer getIntNumUnidades() {
		return intNumUnidades;
	}
	public void setIntNumUnidades(Integer intNumUnidades) {
		this.intNumUnidades = intNumUnidades;
	}
	public Integer getIntIdCita() {
		return intIdCita;
	}
	public void setIntIdCita(Integer intIdCita) {
		this.intIdCita = intIdCita;
	}
	public String getStrNombreCompletoDonante() {
		return strNombreCompletoDonante;
	}
	public void setStrNombreCompletoDonante(String strNombreCompletoDonante) {
		this.strNombreCompletoDonante = strNombreCompletoDonante;
	}
	
}
