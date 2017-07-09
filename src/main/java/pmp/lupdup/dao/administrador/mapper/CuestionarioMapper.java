package pmp.lupdup.dao.administrador.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.administrador.domain.Cuestionario;
import pmp.lupdup.dao.administrador.domain.CuestionarioKey;
import pmp.lupdup.dao.administrador.domain.CuestionarioParamDef;

@Service
public interface CuestionarioMapper {
	
	public List<Cuestionario> selectByDefaultParameter(CuestionarioParamDef cuestionarioParamDef);
	public Cuestionario selectByPrimaryKey(CuestionarioKey cuestionarioKey);
	public int insertSelective(Cuestionario cuestionario);
	public int updateByPrimaryKeySelective(Cuestionario cuestionario);
	public int deleteByPrimaryKey(CuestionarioKey cuestionarioKey);
	
	public int lastSequence();

	
}
