package pmp.lupdup.dao.donantes.domain;

import java.util.Date;
import java.util.List;
import pmp.lupdup.general.util.CadenaUtil;

public class Allegados extends AllegadosKey {
	
	private Integer intIdDonante;
	private Date dteFecUltimaModificacion;
	private String strNomNombre;
	private String strNomAppaterno;
	private String strNomApmaterno;
	private Date dteFecNacimiento;
	private String strNumCelular;
	private String strNumTelefono;
	private String strDesCorreoelectronico;
	private String strNumDni;
	private String intIdTipoparienteDesc;
	private Integer intIdTipopariente;
	
	public String getDteFecNacimientoFecha() {
		return CadenaUtil.getStrDate(dteFecNacimiento);
	}
	public void setDteFecNacimientoFecha(String dteFecNacimiento) {
		this.dteFecNacimiento = CadenaUtil.getDateFromStr(dteFecNacimiento);
	}
	public String getIntIdTipoparienteDesc() {
		return intIdTipoparienteDesc;
	}
	public void setIntIdTipoparienteDesc(String intIdTipoparienteDesc) {
		this.intIdTipoparienteDesc = intIdTipoparienteDesc;
	}
	public Integer getIntIdDonante() {
		return intIdDonante;
	}
	public void setIntIdDonante(Integer intIdDonante) {
		this.intIdDonante = intIdDonante;
	}
	public Date getDteFecUltimaModificacion() {
		return dteFecUltimaModificacion;
	}
	public void setDteFecUltimaModificacion(Date dteFecUltimaModificacion) {
		this.dteFecUltimaModificacion = dteFecUltimaModificacion;
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
	public Date getDteFecNacimiento() {
		return dteFecNacimiento;
	}
	public void setDteFecNacimiento(Date dteFecNacimiento) {
		this.dteFecNacimiento = dteFecNacimiento;
	}
	public String getStrNumCelular() {
		return strNumCelular;
	}
	public void setStrNumCelular(String strNumCelular) {
		this.strNumCelular = strNumCelular;
	}
	public String getStrNumTelefono() {
		return strNumTelefono;
	}
	public void setStrNumTelefono(String strNumTelefono) {
		this.strNumTelefono = strNumTelefono;
	}
	public String getStrDesCorreoelectronico() {
		return strDesCorreoelectronico;
	}
	public void setStrDesCorreoelectronico(String strDesCorreoelectronico) {
		this.strDesCorreoelectronico = strDesCorreoelectronico;
	}
	public String getStrNumDni() {
		return strNumDni;
	}
	public void setStrNumDni(String strNumDni) {
		this.strNumDni = strNumDni;
	}
	public Integer getIntIdTipopariente() {
		return intIdTipopariente;
	}
	public void setIntIdTipopariente(Integer intIdTipopariente) {
		this.intIdTipopariente = intIdTipopariente;
	}
	
}
