package pmp.lupdup.business.core.donantes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pmp.lupdup.business.core.donantes.dto.CuestionarioRptaDto;
import pmp.lupdup.dao.donantes.domain.CuestionarioRpta;

@Service
public interface CuestionarioRptaService {
	
	public List<CuestionarioRpta> buscar(CuestionarioRptaDto cuestionarioRptaDto) throws Exception;
	public CuestionarioRpta buscarById(CuestionarioRptaDto cuestionarioRptaDto) throws Exception;
	public List<CuestionarioRpta> selectCuestionarioRptaByDonante(CuestionarioRptaDto cuestionarioRptaDto) throws Exception;
	public Integer guardar(CuestionarioRptaDto cuestionarioRptaDto) throws Exception;
	public Integer guardarNuevo(CuestionarioRptaDto cuestionarioRptaDto) throws Exception;
	public Integer eliminar(CuestionarioRptaDto cuestionarioRptaDto) throws Exception;
	
}
