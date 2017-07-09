package pmp.lupdup.business.core.donantes.dto;

import java.util.Date;
import java.util.List;

import pmp.lupdup.general.util.CadenaUtil;

public class CitaDto {
	private Integer srlIdCita;
	private Integer intIdSede;
	private Integer intIdDonante;
	private Date dteFecCita;
	private String strHorCita;
	private Integer intIdEstado;
	private List<Integer> intIdEstadoList;
	private String intIdEstadoDesc;
	
	public String getDteFecCitaFecha() {
		return CadenaUtil.getStrDate(dteFecCita);
	}
	public void setDteFecCitaFecha(String dteFecCita) {
		this.dteFecCita = CadenaUtil.getDateFromStr(dteFecCita);
	}
	public Integer getSrlIdCita() {
		return srlIdCita;
	}
	public void setSrlIdCita(Integer srlIdCita) {
		this.srlIdCita = srlIdCita;
	}
	public Integer getIntIdSede() {
		return intIdSede;
	}
	public void setIntIdSede(Integer intIdSede) {
		this.intIdSede = intIdSede;
	}
	public Integer getIntIdDonante() {
		return intIdDonante;
	}
	public void setIntIdDonante(Integer intIdDonante) {
		this.intIdDonante = intIdDonante;
	}
	public Date getDteFecCita() {
		return dteFecCita;
	}
	public void setDteFecCita(Date dteFecCita) {
		this.dteFecCita = dteFecCita;
	}
	public String getStrHorCita() {
		return strHorCita;
	}
	public void setStrHorCita(String strHorCita) {
		this.strHorCita = strHorCita;
	}
	public Integer getIntIdEstado() {
		return intIdEstado;
	}
	public void setIntIdEstado(Integer intIdEstado) {
		this.intIdEstado = intIdEstado;
	}
	public String getIntIdEstadoDesc() {
		return intIdEstadoDesc;
	}
	public void setIntIdEstadoDesc(String intIdEstadoDesc) {
		this.intIdEstadoDesc = intIdEstadoDesc;
	}
	public List<Integer> getIntIdEstadoList() {
		return intIdEstadoList;
	}
	public void setIntIdEstadoList(List<Integer> intIdEstadoList) {
		this.intIdEstadoList = intIdEstadoList;
	}
	
}
