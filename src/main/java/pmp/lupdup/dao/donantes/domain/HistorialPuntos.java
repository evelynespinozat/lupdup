package pmp.lupdup.dao.donantes.domain;

import java.util.Date;
import java.util.List;
import pmp.lupdup.general.util.CadenaUtil;

public class HistorialPuntos extends HistorialPuntosKey {
	
	private Integer intCntPuntoganado;
	private Integer intCntPuntoperdido;
	private Date dteFecPunto;
	private Integer intIdDonante;
	private Integer intIndTipopunto;
	
	private Double dblCntPuntoganadoPorciento;
	private Double dblCntPuntoperdidoPorciento;
	
	public String getDteFecPuntoFecha() {
		return CadenaUtil.getStrDate(dteFecPunto);
	}
	public void setDteFecPuntoFecha(String dteFecPunto) {
		this.dteFecPunto = CadenaUtil.getDateFromStr(dteFecPunto);
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
	public Double getDblCntPuntoganadoPorciento() {
		return dblCntPuntoganadoPorciento;
	}
	public void setDblCntPuntoganadoPorciento(Double dblCntPuntoganadoPorciento) {
		this.dblCntPuntoganadoPorciento = dblCntPuntoganadoPorciento;
	}
	public Double getDblCntPuntoperdidoPorciento() {
		return dblCntPuntoperdidoPorciento;
	}
	public void setDblCntPuntoperdidoPorciento(Double dblCntPuntoperdidoPorciento) {
		this.dblCntPuntoperdidoPorciento = dblCntPuntoperdidoPorciento;
	}
	
}
