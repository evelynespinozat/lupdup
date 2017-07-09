package pmp.lupdup.dao.administrador.domain;

import java.util.Date;
import java.util.List;
import pmp.lupdup.general.util.CadenaUtil;

public class Ubigeo extends UbigeoKey {
	
	private Integer intIdDepartamento;
	private Integer intIdProvincia;
	private Integer intIdDistrito;
	private String strDesUbigeo;
	
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
	public Integer getIntIdDistrito() {
		return intIdDistrito;
	}
	public void setIntIdDistrito(Integer intIdDistrito) {
		this.intIdDistrito = intIdDistrito;
	}
	public String getStrDesUbigeo() {
		return strDesUbigeo;
	}
	public void setStrDesUbigeo(String strDesUbigeo) {
		this.strDesUbigeo = strDesUbigeo;
	}
	
}
