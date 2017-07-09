package pmp.lupdup.business.core.administrador.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.administrador.dto.SedeSaludUsuarioDto;
import pmp.lupdup.dao.administrador.domain.SedeSaludUsuario;

@Service
public interface SedeSaludUsuarioService {
	
	public List<SedeSaludUsuario> buscar(SedeSaludUsuarioDto sedeSaludUsuarioDto) throws Exception;
	public SedeSaludUsuario buscarById(SedeSaludUsuarioDto sedeSaludUsuarioDto) throws Exception;
	public Integer guardar(SedeSaludUsuarioDto sedeSaludUsuarioDto) throws Exception;
	public Integer eliminar(SedeSaludUsuarioDto sedeSaludUsuarioDto) throws Exception;
	
}
