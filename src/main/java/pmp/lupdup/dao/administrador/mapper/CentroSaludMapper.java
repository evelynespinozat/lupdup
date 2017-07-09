package pmp.lupdup.dao.administrador.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.administrador.domain.CentroSalud;
import pmp.lupdup.dao.administrador.domain.CentroSaludKey;
import pmp.lupdup.dao.administrador.domain.CentroSaludParamDef;

@Service
public interface CentroSaludMapper {
	
	public List<CentroSalud> selectByDefaultParameter(CentroSaludParamDef centroSaludParamDef);
	public CentroSalud selectByPrimaryKey(CentroSaludKey centroSaludKey);
	public int insertSelective(CentroSalud centroSalud);
	public int updateByPrimaryKeySelective(CentroSalud centroSalud);
	public int deleteByPrimaryKey(CentroSaludKey centroSaludKey);
	
	public int lastSequence();

	
}
