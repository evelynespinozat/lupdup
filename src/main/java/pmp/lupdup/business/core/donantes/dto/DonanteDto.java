package pmp.lupdup.business.core.donantes.dto;

import java.util.Date;
import java.util.List;

import pmp.lupdup.general.util.CadenaUtil;

public class DonanteDto {
	private Integer srlIdDonante;
	private Integer intIdUsuario;
	private String strNumDni;
	private String strNomNombre;
	private String strNomAppaterno;
	private String strNomApmaterno;
	private Date dteFecNacimiento;
	private String intIndEstadocivilDesc;
	private Integer intIndEstadocivil;
	private String intIndSexoDesc;
	private Integer intIndSexo;
	private String intDesGradoinstrucDesc;
	private Integer intDesGradoinstruc;
	private String strDesOcupacion;
	private String intIndDonanteDesc;
	private Integer intIndDonante;
	private String strNumCelular;
	private String strNumCelular2;
	private String strNumTelefono;
	private String strDesCorreo;
	private String strDesDireccion;
	private Integer intCntPuntos;
	private Integer intIndTipo;
	private Integer intIdUbigeo;
	private Integer intIdDepartamento;
	private Integer intIdProvincia;
	private String strIndActivo;
	private String strIndUbicacion;
	private Integer intIndZoom;
	
	public String getDteFecNacimientoFecha() {
		return CadenaUtil.getStrDate(dteFecNacimiento);
	}
	public void setDteFecNacimientoFecha(String dteFecNacimiento) {
		this.dteFecNacimiento = CadenaUtil.getDateFromStr(dteFecNacimiento);
	}
	public String getIntIndEstadocivilDesc() {
		return intIndEstadocivilDesc;
	}
	public void setIntIndEstadocivilDesc(String intIndEstadocivilDesc) {
		this.intIndEstadocivilDesc = intIndEstadocivilDesc;
	}
	public String getIntIndSexoDesc() {
		return intIndSexoDesc;
	}
	public void setIntIndSexoDesc(String intIndSexoDesc) {
		this.intIndSexoDesc = intIndSexoDesc;
	}
	public String getIntDesGradoinstrucDesc() {
		return intDesGradoinstrucDesc;
	}
	public void setIntDesGradoinstrucDesc(String intDesGradoinstrucDesc) {
		this.intDesGradoinstrucDesc = intDesGradoinstrucDesc;
	}
	public String getIntIndDonanteDesc() {
		return intIndDonanteDesc;
	}
	public void setIntIndDonanteDesc(String intIndDonanteDesc) {
		this.intIndDonanteDesc = intIndDonanteDesc;
	}
	public Integer getSrlIdDonante() {
		return srlIdDonante;
	}
	public void setSrlIdDonante(Integer srlIdDonante) {
		this.srlIdDonante = srlIdDonante;
	}
	public Integer getIntIdUsuario() {
		return intIdUsuario;
	}
	public void setIntIdUsuario(Integer intIdUsuario) {
		this.intIdUsuario = intIdUsuario;
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
	public Integer getIntIndEstadocivil() {
		return intIndEstadocivil;
	}
	public void setIntIndEstadocivil(Integer intIndEstadocivil) {
		this.intIndEstadocivil = intIndEstadocivil;
	}
	public Integer getIntIndSexo() {
		return intIndSexo;
	}
	public void setIntIndSexo(Integer intIndSexo) {
		this.intIndSexo = intIndSexo;
	}
	public Integer getIntDesGradoinstruc() {
		return intDesGradoinstruc;
	}
	public void setIntDesGradoinstruc(Integer intDesGradoinstruc) {
		this.intDesGradoinstruc = intDesGradoinstruc;
	}
	public String getStrDesOcupacion() {
		return strDesOcupacion;
	}
	public void setStrDesOcupacion(String strDesOcupacion) {
		this.strDesOcupacion = strDesOcupacion;
	}
	public Integer getIntIndDonante() {
		return intIndDonante;
	}
	public void setIntIndDonante(Integer intIndDonante) {
		this.intIndDonante = intIndDonante;
	}
	public String getStrNumCelular() {
		return strNumCelular;
	}
	public void setStrNumCelular(String strNumCelular) {
		this.strNumCelular = strNumCelular;
	}
	public String getStrNumCelular2() {
		return strNumCelular2;
	}
	public void setStrNumCelular2(String strNumCelular2) {
		this.strNumCelular2 = strNumCelular2;
	}
	public String getStrNumTelefono() {
		return strNumTelefono;
	}
	public void setStrNumTelefono(String strNumTelefono) {
		this.strNumTelefono = strNumTelefono;
	}
	public String getStrDesCorreo() {
		return strDesCorreo;
	}
	public void setStrDesCorreo(String strDesCorreo) {
		this.strDesCorreo = strDesCorreo;
	}
	public String getStrDesDireccion() {
		return strDesDireccion;
	}
	public void setStrDesDireccion(String strDesDireccion) {
		this.strDesDireccion = strDesDireccion;
	}
	public Integer getIntCntPuntos() {
		return intCntPuntos;
	}
	public void setIntCntPuntos(Integer intCntPuntos) {
		this.intCntPuntos = intCntPuntos;
	}
	public Integer getIntIndTipo() {
		return intIndTipo;
	}
	public void setIntIndTipo(Integer intIndTipo) {
		this.intIndTipo = intIndTipo;
	}
	public String getStrNumDni() {
		return strNumDni;
	}
	public void setStrNumDni(String strNumDni) {
		this.strNumDni = strNumDni;
	}
	public Integer getIntIdUbigeo() {
		return intIdUbigeo;
	}
	public void setIntIdUbigeo(Integer intIdUbigeo) {
		this.intIdUbigeo = intIdUbigeo;
	}
	public Integer getIntIdDepartamento() {
		return intIdDepartamento;
	}
	public void setIntIdDepartamento(Integer intIdDepartamento) {
		this.intIdDepartamento = intIdDepartamento;
	}
	public Integer getIntIdProvincia() {
		return intIdProvincia;
	}
	public void setIntIdProvincia(Integer intIdProvincia) {
		this.intIdProvincia = intIdProvincia;
	}
	public String getStrIndActivo() {
		return strIndActivo;
	}
	public void setStrIndActivo(String strIndActivo) {
		this.strIndActivo = strIndActivo;
	}
	public boolean getStrIndActivoBoolean() {
		return CadenaUtil.getStr(strIndActivo).equals("S");
	}
	public void setStrIndActivoBoolean(boolean blnIntEsActivo) {
		if(blnIntEsActivo) {
			this.strIndActivo = "S";
		} else {
			this.strIndActivo = "N";
		}
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
	
}
