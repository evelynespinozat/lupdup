package pmp.lupdup.dao.ecooperante.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.ecooperante.domain.CampaniaCooperante;
import pmp.lupdup.dao.ecooperante.domain.CampaniaCooperanteKey;
import pmp.lupdup.dao.ecooperante.domain.CampaniaCooperanteParamDef;

@Service
public interface CampaniaCooperanteMapper {
	
	public List<CampaniaCooperante> selectByDefaultParameter(CampaniaCooperanteParamDef campaniaCooperanteParamDef);
	public CampaniaCooperante selectByPrimaryKey(CampaniaCooperanteKey campaniaCooperanteKey);
	public int insertSelective(CampaniaCooperante campaniaCooperante);
	public int updateByPrimaryKeySelective(CampaniaCooperante campaniaCooperante);
	public int deleteByPrimaryKey(CampaniaCooperanteKey campaniaCooperanteKey);
	
	public int lastSequence();

	
}
