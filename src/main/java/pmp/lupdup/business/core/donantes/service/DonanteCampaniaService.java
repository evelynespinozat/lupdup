package pmp.lupdup.business.core.donantes.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.donantes.dto.DonanteCampaniaDto;
import pmp.lupdup.dao.donantes.domain.DonanteCampania;

@Service
public interface DonanteCampaniaService {
	
	public List<DonanteCampania> buscar(DonanteCampaniaDto donanteCampaniaDto) throws Exception;
	public DonanteCampania buscarById(DonanteCampaniaDto donanteCampaniaDto) throws Exception;
	public Integer guardar(DonanteCampaniaDto donanteCampaniaDto) throws Exception;
	public Integer eliminar(DonanteCampaniaDto donanteCampaniaDto) throws Exception;
	
}
