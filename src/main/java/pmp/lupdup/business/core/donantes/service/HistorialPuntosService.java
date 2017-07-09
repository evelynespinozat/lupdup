package pmp.lupdup.business.core.donantes.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.donantes.dto.HistorialPuntosDto;
import pmp.lupdup.dao.donantes.domain.HistorialPuntos;

@Service
public interface HistorialPuntosService {
	
	public List<HistorialPuntos> buscar(HistorialPuntosDto historialPuntosDto) throws Exception;
	public HistorialPuntos buscarById(HistorialPuntosDto historialPuntosDto) throws Exception;
	public Integer guardar(HistorialPuntosDto historialPuntosDto) throws Exception;
	public Integer eliminar(HistorialPuntosDto historialPuntosDto) throws Exception;
	
}
