package pmp.lupdup.dao.administrador.domain;

import java.util.Date;
import java.util.List;
import pmp.lupdup.general.util.CadenaUtil;

public class Catalogo extends CatalogoKey {
	
	private String strDesIndicador;
	private String strNomIndicador;
	private String strNomAbreviatura;
	private Integer intNumValor;
	private Integer intCodIndicador;
	
	public String getIntCodIndicadorDesc() {
		if((""+this.intCodIndicador).equals("1")) {
			return "Estado civil";
		} else if((""+this.intCodIndicador).equals("2")) {
			return "Sexo";
		} else if((""+this.intCodIndicador).equals("3")) {
			return "Grado instruccion";
		} else if((""+this.intCodIndicador).equals("4")) {
			return "Si o no";
		} else {
			return "";
		}
	}
	public String getStrDesIndicador() {
		return strDesIndicador;
	}
	public void setStrDesIndicador(String strDesIndicador) {
		this.strDesIndicador = strDesIndicador;
	}
	public String getStrNomIndicador() {
		return strNomIndicador;
	}
	public void setStrNomIndicador(String strNomIndicador) {
		this.strNomIndicador = strNomIndicador;
	}
	public String getStrNomAbreviatura() {
		return strNomAbreviatura;
	}
	public void setStrNomAbreviatura(String strNomAbreviatura) {
		this.strNomAbreviatura = strNomAbreviatura;
	}
	public Integer getIntNumValor() {
		return intNumValor;
	}
	public void setIntNumValor(Integer intNumValor) {
		this.intNumValor = intNumValor;
	}
	public Integer getIntCodIndicador() {
		return intCodIndicador;
	}
	public void setIntCodIndicador(Integer intCodIndicador) {
		this.intCodIndicador = intCodIndicador;
	}
	
}
