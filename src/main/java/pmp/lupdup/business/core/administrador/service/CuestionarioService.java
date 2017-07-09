package pmp.lupdup.business.core.administrador.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.administrador.dto.CuestionarioDto;
import pmp.lupdup.dao.administrador.domain.Cuestionario;

@Service
public interface CuestionarioService {
	
	public List<Cuestionario> buscar(CuestionarioDto cuestionarioDto) throws Exception;
	public Cuestionario buscarById(CuestionarioDto cuestionarioDto) throws Exception;
	public Integer guardar(CuestionarioDto cuestionarioDto) throws Exception;
	public Integer eliminar(CuestionarioDto cuestionarioDto) throws Exception;
	
}
