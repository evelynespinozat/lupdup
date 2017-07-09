package pmp.lupdup.business.core.administrador.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.administrador.dto.UsuarioDto;
import pmp.lupdup.dao.administrador.domain.Usuario;

@Service
public interface UsuarioService {
	
	public List<Usuario> buscar(UsuarioDto usuarioDto) throws Exception;
	public Usuario buscarById(UsuarioDto usuarioDto) throws Exception;
	public Integer guardar(UsuarioDto usuarioDto) throws Exception;
	public Integer eliminar(UsuarioDto usuarioDto) throws Exception;
	
}
