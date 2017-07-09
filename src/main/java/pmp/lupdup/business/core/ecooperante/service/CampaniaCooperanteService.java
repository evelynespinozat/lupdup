package pmp.lupdup.business.core.ecooperante.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.ecooperante.dto.CampaniaCooperanteDto;
import pmp.lupdup.dao.ecooperante.domain.CampaniaCooperante;

@Service
public interface CampaniaCooperanteService {
	
	public List<CampaniaCooperante> buscar(CampaniaCooperanteDto campaniaCooperanteDto) throws Exception;
	public CampaniaCooperante buscarById(CampaniaCooperanteDto campaniaCooperanteDto) throws Exception;
	public Integer guardar(CampaniaCooperanteDto campaniaCooperanteDto) throws Exception;
	public Integer eliminar(CampaniaCooperanteDto campaniaCooperanteDto) throws Exception;
	
}
