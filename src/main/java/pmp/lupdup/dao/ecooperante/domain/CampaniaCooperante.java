package pmp.lupdup.dao.ecooperante.domain;

import java.util.Date;
import java.util.List;
import pmp.lupdup.general.util.CadenaUtil;

public class CampaniaCooperante extends CampaniaCooperanteKey {
	
	private Integer intIdEntidadcolaboradora;
	private String strDesCampania;
	private Integer intCntAsignada;
	private Integer intCntDisponible;
	private Date dteFecInicio;
	private Date dteFecFin;
	private String intIndActivoDesc;
	private Integer intIndActivo;
	private Integer intNumDescuento;
	private String strDesRegalo;
	private Integer intCntMinpuntos;
	private Integer intCntGusta;
	private String strNomDescripcion;
	private Integer intIdImagen;
	
	public String getDteFecInicioFecha() {
		return CadenaUtil.getStrDate(dteFecInicio);
	}
	public void setDteFecInicioFecha(String dteFecInicio) {
		this.dteFecInicio = CadenaUtil.getDateFromStr(dteFecInicio);
	}
	public String getDteFecFinFecha() {
		return CadenaUtil.getStrDate(dteFecFin);
	}
	public void setDteFecFinFecha(String dteFecFin) {
		this.dteFecFin = CadenaUtil.getDateFromStr(dteFecFin);
	}
	public String getIntIndActivoDesc() {
		return intIndActivoDesc;
	}
	public void setIntIndActivoDesc(String intIndActivoDesc) {
		this.intIndActivoDesc = intIndActivoDesc;
	}
	public String getStrNomDescripcion() {
		return strNomDescripcion;
	}
	public void setStrNomDescripcion(String strNomDescripcion) {
		this.strNomDescripcion = strNomDescripcion;
	}
	public Integer getIntIdEntidadcolaboradora() {
		return intIdEntidadcolaboradora;
	}
	public void setIntIdEntidadcolaboradora(Integer intIdEntidadcolaboradora) {
		this.intIdEntidadcolaboradora = intIdEntidadcolaboradora;
	}
	public String getStrDesCampania() {
		return strDesCampania;
	}
	public void setStrDesCampania(String strDesCampania) {
		this.strDesCampania = strDesCampania;
	}
	public Integer getIntCntAsignada() {
		return intCntAsignada;
	}
	public void setIntCntAsignada(Integer intCntAsignada) {
		this.intCntAsignada = intCntAsignada;
	}
	public Integer getIntCntDisponible() {
		return intCntDisponible;
	}
	public void setIntCntDisponible(Integer intCntDisponible) {
		this.intCntDisponible = intCntDisponible;
	}
	public Date getDteFecInicio() {
		return dteFecInicio;
	}
	public void setDteFecInicio(Date dteFecInicio) {
		this.dteFecInicio = dteFecInicio;
	}
	public Date getDteFecFin() {
		return dteFecFin;
	}
	public void setDteFecFin(Date dteFecFin) {
		this.dteFecFin = dteFecFin;
	}
	public Integer getIntIndActivo() {
		return intIndActivo;
	}
	public void setIntIndActivo(Integer intIndActivo) {
		this.intIndActivo = intIndActivo;
	}
	public Integer getIntNumDescuento() {
		return intNumDescuento;
	}
	public void setIntNumDescuento(Integer intNumDescuento) {
		this.intNumDescuento = intNumDescuento;
	}
	public String getStrDesRegalo() {
		return strDesRegalo;
	}
	public void setStrDesRegalo(String strDesRegalo) {
		this.strDesRegalo = strDesRegalo;
	}
	public Integer getIntCntMinpuntos() {
		return intCntMinpuntos;
	}
	public void setIntCntMinpuntos(Integer intCntMinpuntos) {
		this.intCntMinpuntos = intCntMinpuntos;
	}
	public Integer getIntCntGusta() {
		return intCntGusta;
	}
	public void setIntCntGusta(Integer intCntGusta) {
		this.intCntGusta = intCntGusta;
	}
	public Integer getIntIdImagen() {
		return intIdImagen;
	}
	public void setIntIdImagen(Integer intIdImagen) {
		this.intIdImagen = intIdImagen;
	}
	
}
