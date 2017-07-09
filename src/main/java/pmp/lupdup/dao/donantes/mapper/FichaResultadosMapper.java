package pmp.lupdup.dao.donantes.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.donantes.domain.FichaResultados;
import pmp.lupdup.dao.donantes.domain.FichaResultadosKey;
import pmp.lupdup.dao.donantes.domain.FichaResultadosParamDef;

@Service
public interface FichaResultadosMapper {
	
	public List<FichaResultados> selectByDefaultParameter(FichaResultadosParamDef fichaResultadosParamDef);
	public FichaResultados selectByPrimaryKey(FichaResultadosKey fichaResultadosKey);
	public int insertSelective(FichaResultados fichaResultados);
	public int updateByPrimaryKeySelective(FichaResultados fichaResultados);
	public int deleteByPrimaryKey(FichaResultadosKey fichaResultadosKey);
	
	public int lastSequence();

	
}
