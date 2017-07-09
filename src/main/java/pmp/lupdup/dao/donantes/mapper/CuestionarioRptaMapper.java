package pmp.lupdup.dao.donantes.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.donantes.domain.CuestionarioRpta;
import pmp.lupdup.dao.donantes.domain.CuestionarioRptaKey;
import pmp.lupdup.dao.donantes.domain.CuestionarioRptaParamDef;

@Service
public interface CuestionarioRptaMapper {
	
	public List<CuestionarioRpta> selectByDefaultParameter(CuestionarioRptaParamDef cuestionarioRptaParamDef);
	public CuestionarioRpta selectByPrimaryKey(CuestionarioRptaKey cuestionarioRptaKey);
	public int insertSelective(CuestionarioRpta cuestionarioRpta);
	public int updateByPrimaryKeySelective(CuestionarioRpta cuestionarioRpta);
	public int deleteByPrimaryKey(CuestionarioRptaKey cuestionarioRptaKey);
	public int lastSequence();
	public List<CuestionarioRpta> selectCuestionarioRptaByDonante(CuestionarioRpta cuestionarioRpta);
	
}
