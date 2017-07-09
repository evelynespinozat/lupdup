package pmp.lupdup.business.core.administrador.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.administrador.dto.SedeEntidadColaboradoraUsuarioDto;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradoraUsuario;

@Service
public interface SedeEntidadColaboradoraUsuarioService {
	
	public List<SedeEntidadColaboradoraUsuario> buscar(SedeEntidadColaboradoraUsuarioDto sedeEntidadColaboradoraUsuarioDto) throws Exception;
	public SedeEntidadColaboradoraUsuario buscarById(SedeEntidadColaboradoraUsuarioDto sedeEntidadColaboradoraUsuarioDto) throws Exception;
	public Integer guardar(SedeEntidadColaboradoraUsuarioDto sedeEntidadColaboradoraUsuarioDto) throws Exception;
	public Integer eliminar(SedeEntidadColaboradoraUsuarioDto sedeEntidadColaboradoraUsuarioDto) throws Exception;
	
}
