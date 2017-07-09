package pmp.lupdup.dao.administrador.domain;

import java.util.Date;
import java.util.List;
import pmp.lupdup.general.util.CadenaUtil;

public class Imagen extends ImagenKey {
	
	private String strNomDescripcion;
	private String strNomExtension;
	private Long lngNomFechaUltimaMod;
	private String strNomHash;
	private String strNomCodigo;
	private Long lngNumTamanio;
	
	public String getStrNomDescripcion() {
		return strNomDescripcion;
	}
	public void setStrNomDescripcion(String strNomDescripcion) {
		this.strNomDescripcion = strNomDescripcion;
	}
	public String getStrNomExtension() {
		return strNomExtension;
	}
	public void setStrNomExtension(String strNomExtension) {
		this.strNomExtension = strNomExtension;
	}
	public Long getLngNomFechaUltimaMod() {
		return lngNomFechaUltimaMod;
	}
	public void setLngNomFechaUltimaMod(Long lngNomFechaUltimaMod) {
		this.lngNomFechaUltimaMod = lngNomFechaUltimaMod;
	}
	public String getStrNomHash() {
		return strNomHash;
	}
	public void setStrNomHash(String strNomHash) {
		this.strNomHash = strNomHash;
	}
	public String getStrNomCodigo() {
		return strNomCodigo;
	}
	public void setStrNomCodigo(String strNomCodigo) {
		this.strNomCodigo = strNomCodigo;
	}
	public Long getLngNumTamanio() {
		return lngNumTamanio;
	}
	public void setLngNumTamanio(Long lngNumTamanio) {
		this.lngNumTamanio = lngNumTamanio;
	}
	
}
