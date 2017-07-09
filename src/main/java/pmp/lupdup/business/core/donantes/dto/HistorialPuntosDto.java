package pmp.lupdup.business.core.donantes.dto;

import java.util.Date;
import java.util.List;
import pmp.lupdup.general.util.CadenaUtil;

public class HistorialPuntosDto {
	private Integer srlIdHistorialpuntos;
	private Integer intCntPuntoganado;
	private Integer intCntPuntoperdido;
	private Date dteFecPunto;
	private Integer intIdDonante;
	private Integer intIndTipopunto;
	public String getDteFecPuntoFecha() {
		return CadenaUtil.getStrDate(dteFecPunto);
	}
	public void setDteFecPuntoFecha(String dteFecPunto) {
		this.dteFecPunto = CadenaUtil.getDateFromStr(dteFecPunto);
	}
	public Integer getSrlIdHistorialpuntos() {
		return srlIdHistorialpuntos;
	}
	public void setSrlIdHistorialpuntos(Integer srlIdHistorialpuntos) {
		this.srlIdHistorialpuntos = srlIdHistorialpuntos;
	}
	public Integer getIntCntPuntoganado() {
		return intCntPuntoganado;
	}
	public void setIntCntPuntoganado(Integer intCntPuntoganado) {
		this.intCntPuntoganado = intCntPuntoganado;
	}
	public Integer getIntCntPuntoperdido() {
		return intCntPuntoperdido;
	}
	public void setIntCntPuntoperdido(Integer intCntPuntoperdido) {
		this.intCntPuntoperdido = intCntPuntoperdido;
	}
	public Date getDteFecPunto() {
		return dteFecPunto;
	}
	public void setDteFecPunto(Date dteFecPunto) {
		this.dteFecPunto = dteFecPunto;
	}
	public Integer getIntIdDonante() {
		return intIdDonante;
	}
	public void setIntIdDonante(Integer intIdDonante) {
		this.intIdDonante = intIdDonante;
	}
	public Integer getIntIndTipopunto() {
		return intIndTipopunto;
	}
	public void setIntIndTipopunto(Integer intIndTipopunto) {
		this.intIndTipopunto = intIndTipopunto;
	}
	
}
