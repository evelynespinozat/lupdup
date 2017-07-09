package pmp.lupdup.dao.administrador.domain;

import java.util.Date;
import java.util.List;
import pmp.lupdup.general.util.CadenaUtil;

public class SedeSaludUsuario extends SedeSaludUsuarioKey {
	
	private Integer intIdUsuario;
	private Integer intIdSedesalud;
	
	public Integer getIntIdUsuario() {
		return intIdUsuario;
	}
	public void setIntIdUsuario(Integer intIdUsuario) {
		this.intIdUsuario = intIdUsuario;
	}
	public Integer getIntIdSedesalud() {
		return intIdSedesalud;
	}
	public void setIntIdSedesalud(Integer intIdSedesalud) {
		this.intIdSedesalud = intIdSedesalud;
	}
	
}
