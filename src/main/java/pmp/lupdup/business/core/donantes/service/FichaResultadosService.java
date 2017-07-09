package pmp.lupdup.business.core.donantes.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.donantes.dto.FichaResultadosDto;
import pmp.lupdup.dao.donantes.domain.FichaResultados;

@Service
public interface FichaResultadosService {
	
	public List<FichaResultados> buscar(FichaResultadosDto fichaResultadosDto) throws Exception;
	public FichaResultados buscarById(FichaResultadosDto fichaResultadosDto) throws Exception;
	public Integer guardar(FichaResultadosDto fichaResultadosDto) throws Exception;
	public Integer eliminar(FichaResultadosDto fichaResultadosDto) throws Exception;
	
}
