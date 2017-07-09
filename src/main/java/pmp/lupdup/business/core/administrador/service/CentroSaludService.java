package pmp.lupdup.business.core.administrador.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.administrador.dto.CentroSaludDto;
import pmp.lupdup.dao.administrador.domain.CentroSalud;

@Service
public interface CentroSaludService {
	
	public List<CentroSalud> buscar(CentroSaludDto centroSaludDto) throws Exception;
	public CentroSalud buscarById(CentroSaludDto centroSaludDto) throws Exception;
	public Integer guardar(CentroSaludDto centroSaludDto) throws Exception;
	public Integer eliminar(CentroSaludDto centroSaludDto) throws Exception;
	
}
