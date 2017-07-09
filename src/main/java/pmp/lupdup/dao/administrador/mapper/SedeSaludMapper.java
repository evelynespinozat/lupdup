package pmp.lupdup.dao.administrador.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.administrador.domain.SedeSalud;
import pmp.lupdup.dao.administrador.domain.SedeSaludKey;
import pmp.lupdup.dao.administrador.domain.SedeSaludParamDef;

@Service
public interface SedeSaludMapper {
	
	public List<SedeSalud> selectByDefaultParameter(SedeSaludParamDef sedeSaludParamDef);
	public SedeSalud selectByPrimaryKey(SedeSaludKey sedeSaludKey);
	public int insertSelective(SedeSalud sedeSalud);
	public int updateByPrimaryKeySelective(SedeSalud sedeSalud);
	public int deleteByPrimaryKey(SedeSaludKey sedeSaludKey);
	
	public int lastSequence();

	
}
