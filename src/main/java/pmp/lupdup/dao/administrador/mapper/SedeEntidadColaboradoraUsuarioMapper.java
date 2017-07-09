package pmp.lupdup.dao.administrador.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradoraUsuario;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradoraUsuarioKey;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradoraUsuarioParamDef;

@Service
public interface SedeEntidadColaboradoraUsuarioMapper {
	
	public List<SedeEntidadColaboradoraUsuario> selectByDefaultParameter(SedeEntidadColaboradoraUsuarioParamDef sedeEntidadColaboradoraUsuarioParamDef);
	public SedeEntidadColaboradoraUsuario selectByPrimaryKey(SedeEntidadColaboradoraUsuarioKey sedeEntidadColaboradoraUsuarioKey);
	public int insertSelective(SedeEntidadColaboradoraUsuario sedeEntidadColaboradoraUsuario);
	public int updateByPrimaryKeySelective(SedeEntidadColaboradoraUsuario sedeEntidadColaboradoraUsuario);
	public int deleteByPrimaryKey(SedeEntidadColaboradoraUsuarioKey sedeEntidadColaboradoraUsuarioKey);
	
	
}
