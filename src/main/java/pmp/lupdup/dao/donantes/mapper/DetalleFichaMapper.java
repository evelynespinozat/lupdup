package pmp.lupdup.dao.donantes.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.donantes.domain.DetalleFicha;
import pmp.lupdup.dao.donantes.domain.DetalleFichaKey;
import pmp.lupdup.dao.donantes.domain.DetalleFichaParamDef;

@Service
public interface DetalleFichaMapper {
	
	public List<DetalleFicha> selectByDefaultParameter(DetalleFichaParamDef detalleFichaParamDef);
	public DetalleFicha selectByPrimaryKey(DetalleFichaKey detalleFichaKey);
	public int insertSelective(DetalleFicha detalleFicha);
	public int updateByPrimaryKeySelective(DetalleFicha detalleFicha);
	public int deleteByPrimaryKey(DetalleFichaKey detalleFichaKey);
	
	public int lastSequence();

	
}
