package pmp.lupdup.dao.administrador.domain;

import java.util.Date;
import java.util.List;

import pmp.lupdup.general.util.CadenaUtil;

public class UsuarioCentroSalud extends UsuarioCentroSaludKey {
	
	private Integer intIdDonante;
	private String intIdPerfilDesc;
	private Integer intIdPerfil;
	private String strNomUsuario;
	private String strClvUsuario;
	private String strNomResponsable;
	private String strNomAppaterno;
	private String strNomApmaterno;
	private String strDesTelefono;
	private String strDesCorreo;
	private String strDesCelular;
	private Integer intIdCentrosalud;
	private Integer intIdSedeCentrosalud;
	private Integer intIdSedeEntidadcolaboradora;
	public String getIntIdPerfilDesc() {
		return intIdPerfilDesc;
	}
	public void setIntIdPerfilDesc(String intIdPerfilDesc) {
		this.intIdPerfilDesc = intIdPerfilDesc;
	}
	public Integer getIntIdDonante() {
		return intIdDonante;
	}
	public void setIntIdDonante(Integer intIdDonante) {
		this.intIdDonante = intIdDonante;
	}
	public Integer getIntIdPerfil() {
		return intIdPerfil;
	}
	public void setIntIdPerfil(Integer intIdPerfil) {
		this.intIdPerfil = intIdPerfil;
	}
	public String getStrNomUsuario() {
		return strNomUsuario;
	}
	public void setStrNomUsuario(String strNomUsuario) {
		this.strNomUsuario = strNomUsuario;
	}
	public String getStrClvUsuario() {
		return strClvUsuario;
	}
	public void setStrClvUsuario(String strClvUsuario) {
		this.strClvUsuario = strClvUsuario;
	}
	public String getStrNomResponsable() {
		return strNomResponsable;
	}
	public void setStrNomResponsable(String strNomResponsable) {
		this.strNomResponsable = strNomResponsable;
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
	public String getStrDesTelefono() {
		return strDesTelefono;
	}
	public void setStrDesTelefono(String strDesTelefono) {
		this.strDesTelefono = strDesTelefono;
	}
	public String getStrDesCorreo() {
		return strDesCorreo;
	}
	public void setStrDesCorreo(String strDesCorreo) {
		this.strDesCorreo = strDesCorreo;
	}
	public String getStrDesCelular() {
		return strDesCelular;
	}
	public void setStrDesCelular(String strDesCelular) {
		this.strDesCelular = strDesCelular;
	}
	public Integer getIntIdSedeCentrosalud() {
		return intIdSedeCentrosalud;
	}
	public void setIntIdSedeCentrosalud(Integer intIdSedeCentrosalud) {
		this.intIdSedeCentrosalud = intIdSedeCentrosalud;
	}
	public Integer getIntIdSedeEntidadcolaboradora() {
		return intIdSedeEntidadcolaboradora;
	}
	public void setIntIdSedeEntidadcolaboradora(Integer intIdSedeEntidadcolaboradora) {
		this.intIdSedeEntidadcolaboradora = intIdSedeEntidadcolaboradora;
	}
	public Integer getIntIdCentrosalud() {
		return intIdCentrosalud;
	}
	public void setIntIdCentrosalud(Integer intIdCentrosalud) {
		this.intIdCentrosalud = intIdCentrosalud;
	}
	
}
