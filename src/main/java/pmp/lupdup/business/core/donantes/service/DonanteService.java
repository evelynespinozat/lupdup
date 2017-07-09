package pmp.lupdup.business.core.donantes.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.donantes.dto.DonanteDto;
import pmp.lupdup.dao.donantes.domain.Donante;

@Service
public interface DonanteService {
	
	public List<Donante> buscar(DonanteDto donanteDto) throws Exception;
	public Donante buscarById(DonanteDto donanteDto) throws Exception;
	public Integer guardar(DonanteDto donanteDto) throws Exception;
	public Integer eliminar(DonanteDto donanteDto) throws Exception;
	
}
