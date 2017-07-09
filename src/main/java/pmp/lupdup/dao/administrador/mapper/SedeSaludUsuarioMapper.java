package pmp.lupdup.dao.administrador.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.administrador.domain.SedeSaludUsuario;
import pmp.lupdup.dao.administrador.domain.SedeSaludUsuarioKey;
import pmp.lupdup.dao.administrador.domain.SedeSaludUsuarioParamDef;

@Service
public interface SedeSaludUsuarioMapper {
	
	public List<SedeSaludUsuario> selectByDefaultParameter(SedeSaludUsuarioParamDef sedeSaludUsuarioParamDef);
	public SedeSaludUsuario selectByPrimaryKey(SedeSaludUsuarioKey sedeSaludUsuarioKey);
	public int insertSelective(SedeSaludUsuario sedeSaludUsuario);
	public int updateByPrimaryKeySelective(SedeSaludUsuario sedeSaludUsuario);
	public int deleteByPrimaryKey(SedeSaludUsuarioKey sedeSaludUsuarioKey);
	
	
}
