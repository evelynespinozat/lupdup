package pmp.lupdup.business.core.administrador.dto;

public class EntidadColaboradoraDto {
	private Integer srlIdEntidadcolaboradora;
	private String strNomNombre;
	private String strIndEstado="A";
	
	public Integer getSrlIdEntidadcolaboradora() {
		return srlIdEntidadcolaboradora;
	}
	public void setSrlIdEntidadcolaboradora(Integer srlIdEntidadcolaboradora) {
		this.srlIdEntidadcolaboradora = srlIdEntidadcolaboradora;
	}
	public String getStrNomNombre() {
		return strNomNombre;
	}
	public void setStrNomNombre(String strNomNombre) {
		this.strNomNombre = strNomNombre;
	}
	public String getStrIndEstado() {
		return strIndEstado;
	}
	public void setStrIndEstado(String strIndEstado) {
		this.strIndEstado = strIndEstado;
	}
	
}
