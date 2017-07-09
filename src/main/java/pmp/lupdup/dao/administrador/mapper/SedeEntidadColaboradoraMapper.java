package pmp.lupdup.dao.administrador.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradora;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradoraKey;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradoraParamDef;

@Service
public interface SedeEntidadColaboradoraMapper {
	
	public List<SedeEntidadColaboradora> selectByDefaultParameter(SedeEntidadColaboradoraParamDef sedeEntidadColaboradoraParamDef);
	public SedeEntidadColaboradora selectByPrimaryKey(SedeEntidadColaboradoraKey sedeEntidadColaboradoraKey);
	public int insertSelective(SedeEntidadColaboradora sedeEntidadColaboradora);
	public int updateByPrimaryKeySelective(SedeEntidadColaboradora sedeEntidadColaboradora);
	public int deleteByPrimaryKey(SedeEntidadColaboradoraKey sedeEntidadColaboradoraKey);
	
	public int lastSequence();

	
}
