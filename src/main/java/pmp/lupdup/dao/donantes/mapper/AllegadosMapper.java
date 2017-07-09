package pmp.lupdup.dao.donantes.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.donantes.domain.Allegados;
import pmp.lupdup.dao.donantes.domain.AllegadosKey;
import pmp.lupdup.dao.donantes.domain.AllegadosParamDef;

@Service
public interface AllegadosMapper {
	
	public List<Allegados> selectByDefaultParameter(AllegadosParamDef allegadosParamDef);
	public Allegados selectByPrimaryKey(AllegadosKey allegadosKey);
	public int insertSelective(Allegados allegados);
	public int updateByPrimaryKeySelective(Allegados allegados);
	public int deleteByPrimaryKey(AllegadosKey allegadosKey);
	
	public int lastSequence();
	public int permiteModificar();
	
}
