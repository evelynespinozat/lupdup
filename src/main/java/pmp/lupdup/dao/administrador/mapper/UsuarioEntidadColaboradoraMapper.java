package pmp.lupdup.dao.administrador.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.administrador.domain.UsuarioEntidadColaboradora;
import pmp.lupdup.dao.administrador.domain.UsuarioEntidadColaboradoraKey;
import pmp.lupdup.dao.administrador.domain.UsuarioEntidadColaboradoraParamDef;

@Service
public interface UsuarioEntidadColaboradoraMapper {
	
	public List<UsuarioEntidadColaboradora> selectByDefaultParameter(UsuarioEntidadColaboradoraParamDef usuarioEntidadColaboradoraParamDef);
	public UsuarioEntidadColaboradora selectByPrimaryKey(UsuarioEntidadColaboradoraKey usuarioEntidadColaboradoraKey);
	public int insertSelective(UsuarioEntidadColaboradora usuarioEntidadColaboradora);
	public int updateByPrimaryKeySelective(UsuarioEntidadColaboradora usuarioEntidadColaboradora);
	public int deleteByPrimaryKey(UsuarioEntidadColaboradoraKey usuarioEntidadColaboradoraKey);
	
	public int lastSequence();

	
}
