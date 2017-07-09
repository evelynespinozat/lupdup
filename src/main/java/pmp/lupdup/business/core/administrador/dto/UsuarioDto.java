package pmp.lupdup.business.core.administrador.dto;

import java.util.Date;
import java.util.List;

import pmp.lupdup.general.util.CadenaUtil;
import pmp.lupdup.general.util.ConfiguracionProperties;

public class UsuarioDto {
	private Integer srlIdUsuario;
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
	private String strIndActivo;
	
	private Integer intIdCentrosalud;
	private Integer intIdEntidadcolaboradora;
	private Integer intIdSedeCentrosalud;
	private Integer intIdSedeEntidadcolaboradora;
	
	public boolean isPerfilAdministrador() {
		return intIdPerfil != null && intIdPerfil.intValue() == ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.PERFIL_ADMINISTRADOR);
	}
	public boolean isPerfilDonante() {
		return intIdPerfil != null && intIdPerfil.intValue() == ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.PERFIL_DONANTE);
	}
	public boolean isPerfilCentroSalud() {
		return intIdPerfil != null && intIdPerfil.intValue() == ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.PERFIL_CENTRO_SALUD);
	}
	public boolean isPerfilEntidadCooperante() {
		return intIdPerfil != null && intIdPerfil.intValue() == ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.PERFIL_ENTIDAD_COOPERANTE);
	}

	public String getIntIdPerfilDesc() {
		return intIdPerfilDesc;
	}
	public void setIntIdPerfilDesc(String intIdPerfilDesc) {
		this.intIdPerfilDesc = intIdPerfilDesc;
	}
	public Integer getSrlIdUsuario() {
		return srlIdUsuario;
	}
	public void setSrlIdUsuario(Integer srlIdUsuario) {
		this.srlIdUsuario = srlIdUsuario;
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
	public Integer getIntIdCentrosalud() {
		return intIdCentrosalud;
	}
	public void setIntIdCentrosalud(Integer intIdCentrosalud) {
		this.intIdCentrosalud = intIdCentrosalud;
	}
	public Integer getIntIdEntidadcolaboradora() {
		return intIdEntidadcolaboradora;
	}
	public void setIntIdEntidadcolaboradora(Integer intIdEntidadcolaboradora) {
		this.intIdEntidadcolaboradora = intIdEntidadcolaboradora;
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
	
}
