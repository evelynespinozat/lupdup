package pmp.lupdup.business.core.administrador.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.administrador.dto.SedeEntidadColaboradoraDto;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradora;

@Service
public interface SedeEntidadColaboradoraService {
	
	public List<SedeEntidadColaboradora> buscar(SedeEntidadColaboradoraDto sedeEntidadColaboradoraDto) throws Exception;
	public SedeEntidadColaboradora buscarById(SedeEntidadColaboradoraDto sedeEntidadColaboradoraDto) throws Exception;
	public Integer guardar(SedeEntidadColaboradoraDto sedeEntidadColaboradoraDto) throws Exception;
	public Integer eliminar(SedeEntidadColaboradoraDto sedeEntidadColaboradoraDto) throws Exception;
	
}
