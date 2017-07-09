package pmp.lupdup.business.core.administrador.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.administrador.dto.UsuarioCentroSaludDto;
import pmp.lupdup.dao.administrador.domain.UsuarioCentroSalud;

@Service
public interface UsuarioCentroSaludService {
	
	public List<UsuarioCentroSalud> buscar(UsuarioCentroSaludDto usuarioCentroSaludDto) throws Exception;
	public UsuarioCentroSalud buscarById(UsuarioCentroSaludDto usuarioCentroSaludDto) throws Exception;
	public Integer guardar(UsuarioCentroSaludDto usuarioCentroSaludDto) throws Exception;
	public Integer eliminar(UsuarioCentroSaludDto usuarioCentroSaludDto) throws Exception;
	
}
