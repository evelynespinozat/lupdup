package pmp.lupdup.business.core.donantes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pmp.lupdup.business.core.donantes.dto.AllegadosDto;
import pmp.lupdup.dao.donantes.domain.Allegados;

@Service
public interface AllegadosService {
	
	public List<Allegados> buscar(AllegadosDto allegadosDto) throws Exception;
	public Allegados buscarById(AllegadosDto allegadosDto) throws Exception;
	public Integer guardar(AllegadosDto allegadosDto) throws Exception;
	public Integer eliminar(AllegadosDto allegadosDto) throws Exception;
	public boolean permiteModificar() throws Exception;
	
}
