package pmp.lupdup.dao.administrador.domain;

import java.util.Date;
import java.util.List;
import pmp.lupdup.general.util.CadenaUtil;

public class SedeEntidadColaboradoraUsuario extends SedeEntidadColaboradoraUsuarioKey {
	
	private Integer intIdUsuario;
	private Integer intIdSedeentidad;
	
	public Integer getIntIdUsuario() {
		return intIdUsuario;
	}
	public void setIntIdUsuario(Integer intIdUsuario) {
		this.intIdUsuario = intIdUsuario;
	}
	public Integer getIntIdSedeentidad() {
		return intIdSedeentidad;
	}
	public void setIntIdSedeentidad(Integer intIdSedeentidad) {
		this.intIdSedeentidad = intIdSedeentidad;
	}
	
}
