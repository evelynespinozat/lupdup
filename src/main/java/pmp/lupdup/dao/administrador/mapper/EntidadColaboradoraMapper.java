package pmp.lupdup.dao.administrador.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.administrador.domain.EntidadColaboradora;
import pmp.lupdup.dao.administrador.domain.EntidadColaboradoraKey;
import pmp.lupdup.dao.administrador.domain.EntidadColaboradoraParamDef;

@Service
public interface EntidadColaboradoraMapper {
	
	public List<EntidadColaboradora> selectByDefaultParameter(EntidadColaboradoraParamDef entidadColaboradoraParamDef);
	public EntidadColaboradora selectByPrimaryKey(EntidadColaboradoraKey entidadColaboradoraKey);
	public int insertSelective(EntidadColaboradora entidadColaboradora);
	public int updateByPrimaryKeySelective(EntidadColaboradora entidadColaboradora);
	public int deleteByPrimaryKey(EntidadColaboradoraKey entidadColaboradoraKey);
	
	public int lastSequence();

	
}
