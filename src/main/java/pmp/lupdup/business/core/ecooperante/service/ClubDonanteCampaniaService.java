package pmp.lupdup.business.core.ecooperante.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.ecooperante.dto.ClubDonanteCampaniaDto;
import pmp.lupdup.dao.ecooperante.domain.ClubDonanteCampania;

@Service
public interface ClubDonanteCampaniaService {
	
	public List<ClubDonanteCampania> buscar(ClubDonanteCampaniaDto clubDonanteCampaniaDto) throws Exception;
	public ClubDonanteCampania buscarById(ClubDonanteCampaniaDto clubDonanteCampaniaDto) throws Exception;
	public Integer guardar(ClubDonanteCampaniaDto clubDonanteCampaniaDto) throws Exception;
	public Integer eliminar(ClubDonanteCampaniaDto clubDonanteCampaniaDto) throws Exception;
	
}
