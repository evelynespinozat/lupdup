package pmp.lupdup.dao.donantes.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.donantes.domain.Donante;
import pmp.lupdup.dao.donantes.domain.DonanteKey;
import pmp.lupdup.dao.donantes.domain.DonanteParamDef;

@Service
public interface DonanteMapper {
	
	public List<Donante> selectByDefaultParameter(DonanteParamDef donanteParamDef);
	public Donante selectByPrimaryKey(DonanteKey donanteKey);
	public int insertSelective(Donante donante);
	public int updateByPrimaryKeySelective(Donante donante);
	public int deleteByPrimaryKey(DonanteKey donanteKey);
	
	public int lastSequence();

	
}
