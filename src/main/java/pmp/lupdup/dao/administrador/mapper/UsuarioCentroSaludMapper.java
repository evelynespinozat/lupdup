package pmp.lupdup.dao.administrador.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.administrador.domain.UsuarioCentroSalud;
import pmp.lupdup.dao.administrador.domain.UsuarioCentroSaludKey;
import pmp.lupdup.dao.administrador.domain.UsuarioCentroSaludParamDef;

@Service
public interface UsuarioCentroSaludMapper {
	
	public List<UsuarioCentroSalud> selectByDefaultParameter(UsuarioCentroSaludParamDef usuarioCentroSaludParamDef);
	public UsuarioCentroSalud selectByPrimaryKey(UsuarioCentroSaludKey usuarioCentroSaludKey);
	public int insertSelective(UsuarioCentroSalud usuarioCentroSalud);
	public int updateByPrimaryKeySelective(UsuarioCentroSalud usuarioCentroSalud);
	public int deleteByPrimaryKey(UsuarioCentroSaludKey usuarioCentroSaludKey);
	
	public int lastSequence();

	
}
