package pmp.lupdup.business.core.administrador.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.administrador.dto.PerfilDto;
import pmp.lupdup.dao.administrador.domain.Perfil;

@Service
public interface PerfilService {
	
	public List<Perfil> buscar(PerfilDto perfilDto) throws Exception;
	public Perfil buscarById(PerfilDto perfilDto) throws Exception;
	public Integer guardar(PerfilDto perfilDto) throws Exception;
	public Integer eliminar(PerfilDto perfilDto) throws Exception;
	
}
