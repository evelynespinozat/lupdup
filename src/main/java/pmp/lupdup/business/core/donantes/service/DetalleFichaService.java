package pmp.lupdup.business.core.donantes.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.donantes.dto.DetalleFichaDto;
import pmp.lupdup.dao.donantes.domain.DetalleFicha;

@Service
public interface DetalleFichaService {
	
	public List<DetalleFicha> buscar(DetalleFichaDto detalleFichaDto) throws Exception;
	public DetalleFicha buscarById(DetalleFichaDto detalleFichaDto) throws Exception;
	public Integer guardar(DetalleFichaDto detalleFichaDto) throws Exception;
	public Integer eliminar(DetalleFichaDto detalleFichaDto) throws Exception;
	
}
