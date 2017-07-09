package pmp.lupdup.dao.administrador.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.administrador.domain.Perfil;
import pmp.lupdup.dao.administrador.domain.PerfilKey;
import pmp.lupdup.dao.administrador.domain.PerfilParamDef;

@Service
public interface PerfilMapper {
	
	public List<Perfil> selectByDefaultParameter(PerfilParamDef perfilParamDef);
	public Perfil selectByPrimaryKey(PerfilKey perfilKey);
	public int insertSelective(Perfil perfil);
	public int updateByPrimaryKeySelective(Perfil perfil);
	public int deleteByPrimaryKey(PerfilKey perfilKey);
	
	public int lastSequence();

	
}
