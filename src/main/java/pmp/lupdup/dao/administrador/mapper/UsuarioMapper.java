package pmp.lupdup.dao.administrador.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.administrador.domain.Usuario;
import pmp.lupdup.dao.administrador.domain.UsuarioKey;
import pmp.lupdup.dao.administrador.domain.UsuarioParamDef;

@Service
public interface UsuarioMapper {
	
	public List<Usuario> selectByDefaultParameter(UsuarioParamDef usuarioParamDef);
	public Usuario selectByPrimaryKey(UsuarioKey usuarioKey);
	public int insertSelective(Usuario usuario);
	public int updateByPrimaryKeySelective(Usuario usuario);
	public int deleteByPrimaryKey(UsuarioKey usuarioKey);
	
	public int lastSequence();

	
}
