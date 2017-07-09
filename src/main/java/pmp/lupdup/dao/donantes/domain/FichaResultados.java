package pmp.lupdup.dao.donantes.domain;

import java.util.Date;
import java.util.List;
import pmp.lupdup.general.util.CadenaUtil;

public class FichaResultados extends FichaResultadosKey {
	
	private Integer intIdDonante;
	private Integer intIdCentrosalud;
	private String strNomDescripcion;
	private Integer intIdImagen;
	private Date dteFecAnalisis;
	private String strHorAnalisis;
	private Integer intIndEstado;
	private Integer intNumUnidades;
	private String strNombreCompletoDonante;
	private Integer intIdCita;
	
	public String getStrNomDescripcion() {
		return strNomDescripcion;
	}
	public void setStrNomDescripcion(String strNomDescripcion) {
		this.strNomDescripcion = strNomDescripcion;
	}
	public String getDteFecAnalisisFecha() {
		return CadenaUtil.getStrDate(dteFecAnalisis);
	}
	public void setDteFecAnalisisFecha(String dteFecAnalisis) {
		this.dteFecAnalisis = CadenaUtil.getDateFromStr(dteFecAnalisis);
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
	public String getStrNombreCompletoDonante() {
		return strNombreCompletoDonante;
	}
	public void setStrNombreCompletoDonante(String strNombreCompletoDonante) {
		this.strNombreCompletoDonante = strNombreCompletoDonante;
	}
	public Integer getIntIdCita() {
		return intIdCita;
	}
	public void setIntIdCita(Integer intIdCita) {
		this.intIdCita = intIdCita;
	}
	
}
