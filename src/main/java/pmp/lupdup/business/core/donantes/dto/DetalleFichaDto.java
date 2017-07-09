package pmp.lupdup.business.core.donantes.dto;

import java.util.Date;
import java.util.List;
import pmp.lupdup.general.util.CadenaUtil;

public class DetalleFichaDto {
	private Integer srlIdDetalleficha;
	private Integer intIdFicha;
	private Integer intNumHematies;
	private Integer intNumHemoglobina;
	private Integer intNumHematocrito;
	private Integer intNumVcm;
	private Integer intNumChm;
	private Integer intNumLinfocitos;
	private Integer intNumPlaquetas;
	private Integer intNumLeucocitos;
	private Integer intNumNeutrofilos;
	private Integer intNumEosinofilos;
	private Integer intNumVsg;
	private Integer intNumGlucosa;
	private Integer intNumUrea;
	private Integer intNumAcisourico;
	private Integer intNumCreatinina;
	private Integer intNumColesterol;
	private Integer intNumHdl;
	private Integer intNumLdl;
	private Integer intNumTrigliceridos;
	private Integer intNumTransaminasaGot;
	private Integer intNumTransaminasaGpt;
	private Integer intNumTransaminasaGgt;
	private Integer intNumFosfatasaAlcalina;
	private Integer intNumCalcio;
	private Integer intNumHierro;
	private Integer intNumPotacio;
	private Integer intNumSodio;
	private Integer intNumBilirrubina;
	public Integer getSrlIdDetalleficha() {
		return srlIdDetalleficha;
	}
	public void setSrlIdDetalleficha(Integer srlIdDetalleficha) {
		this.srlIdDetalleficha = srlIdDetalleficha;
	}
	public Integer getIntIdFicha() {
		return intIdFicha;
	}
	public void setIntIdFicha(Integer intIdFicha) {
		this.intIdFicha = intIdFicha;
	}
	public Integer getIntNumHematies() {
		return intNumHematies;
	}
	public void setIntNumHematies(Integer intNumHematies) {
		this.intNumHematies = intNumHematies;
	}
	public Integer getIntNumHemoglobina() {
		return intNumHemoglobina;
	}
	public void setIntNumHemoglobina(Integer intNumHemoglobina) {
		this.intNumHemoglobina = intNumHemoglobina;
	}
	public Integer getIntNumHematocrito() {
		return intNumHematocrito;
	}
	public void setIntNumHematocrito(Integer intNumHematocrito) {
		this.intNumHematocrito = intNumHematocrito;
	}
	public Integer getIntNumVcm() {
		return intNumVcm;
	}
	public void setIntNumVcm(Integer intNumVcm) {
		this.intNumVcm = intNumVcm;
	}
	public Integer getIntNumChm() {
		return intNumChm;
	}
	public void setIntNumChm(Integer intNumChm) {
		this.intNumChm = intNumChm;
	}
	public Integer getIntNumLinfocitos() {
		return intNumLinfocitos;
	}
	public void setIntNumLinfocitos(Integer intNumLinfocitos) {
		this.intNumLinfocitos = intNumLinfocitos;
	}
	public Integer getIntNumPlaquetas() {
		return intNumPlaquetas;
	}
	public void setIntNumPlaquetas(Integer intNumPlaquetas) {
		this.intNumPlaquetas = intNumPlaquetas;
	}
	public Integer getIntNumLeucocitos() {
		return intNumLeucocitos;
	}
	public void setIntNumLeucocitos(Integer intNumLeucocitos) {
		this.intNumLeucocitos = intNumLeucocitos;
	}
	public Integer getIntNumNeutrofilos() {
		return intNumNeutrofilos;
	}
	public void setIntNumNeutrofilos(Integer intNumNeutrofilos) {
		this.intNumNeutrofilos = intNumNeutrofilos;
	}
	public Integer getIntNumEosinofilos() {
		return intNumEosinofilos;
	}
	public void setIntNumEosinofilos(Integer intNumEosinofilos) {
		this.intNumEosinofilos = intNumEosinofilos;
	}
	public Integer getIntNumVsg() {
		return intNumVsg;
	}
	public void setIntNumVsg(Integer intNumVsg) {
		this.intNumVsg = intNumVsg;
	}
	public Integer getIntNumGlucosa() {
		return intNumGlucosa;
	}
	public void setIntNumGlucosa(Integer intNumGlucosa) {
		this.intNumGlucosa = intNumGlucosa;
	}
	public Integer getIntNumUrea() {
		return intNumUrea;
	}
	public void setIntNumUrea(Integer intNumUrea) {
		this.intNumUrea = intNumUrea;
	}
	public Integer getIntNumAcisourico() {
		return intNumAcisourico;
	}
	public void setIntNumAcisourico(Integer intNumAcisourico) {
		this.intNumAcisourico = intNumAcisourico;
	}
	public Integer getIntNumCreatinina() {
		return intNumCreatinina;
	}
	public void setIntNumCreatinina(Integer intNumCreatinina) {
		this.intNumCreatinina = intNumCreatinina;
	}
	public Integer getIntNumColesterol() {
		return intNumColesterol;
	}
	public void setIntNumColesterol(Integer intNumColesterol) {
		this.intNumColesterol = intNumColesterol;
	}
	public Integer getIntNumHdl() {
		return intNumHdl;
	}
	public void setIntNumHdl(Integer intNumHdl) {
		this.intNumHdl = intNumHdl;
	}
	public Integer getIntNumLdl() {
		return intNumLdl;
	}
	public void setIntNumLdl(Integer intNumLdl) {
		this.intNumLdl = intNumLdl;
	}
	public Integer getIntNumTrigliceridos() {
		return intNumTrigliceridos;
	}
	public void setIntNumTrigliceridos(Integer intNumTrigliceridos) {
		this.intNumTrigliceridos = intNumTrigliceridos;
	}
	public Integer getIntNumTransaminasaGot() {
		return intNumTransaminasaGot;
	}
	public void setIntNumTransaminasaGot(Integer intNumTransaminasaGot) {
		this.intNumTransaminasaGot = intNumTransaminasaGot;
	}
	public Integer getIntNumTransaminasaGpt() {
		return intNumTransaminasaGpt;
	}
	public void setIntNumTransaminasaGpt(Integer intNumTransaminasaGpt) {
		this.intNumTransaminasaGpt = intNumTransaminasaGpt;
	}
	public Integer getIntNumTransaminasaGgt() {
		return intNumTransaminasaGgt;
	}
	public void setIntNumTransaminasaGgt(Integer intNumTransaminasaGgt) {
		this.intNumTransaminasaGgt = intNumTransaminasaGgt;
	}
	public Integer getIntNumFosfatasaAlcalina() {
		return intNumFosfatasaAlcalina;
	}
	public void setIntNumFosfatasaAlcalina(Integer intNumFosfatasaAlcalina) {
		this.intNumFosfatasaAlcalina = intNumFosfatasaAlcalina;
	}
	public Integer getIntNumCalcio() {
		return intNumCalcio;
	}
	public void setIntNumCalcio(Integer intNumCalcio) {
		this.intNumCalcio = intNumCalcio;
	}
	public Integer getIntNumHierro() {
		return intNumHierro;
	}
	public void setIntNumHierro(Integer intNumHierro) {
		this.intNumHierro = intNumHierro;
	}
	public Integer getIntNumPotacio() {
		return intNumPotacio;
	}
	public void setIntNumPotacio(Integer intNumPotacio) {
		this.intNumPotacio = intNumPotacio;
	}
	public Integer getIntNumSodio() {
		return intNumSodio;
	}
	public void setIntNumSodio(Integer intNumSodio) {
		this.intNumSodio = intNumSodio;
	}
	public Integer getIntNumBilirrubina() {
		return intNumBilirrubina;
	}
	public void setIntNumBilirrubina(Integer intNumBilirrubina) {
		this.intNumBilirrubina = intNumBilirrubina;
	}
	
}
