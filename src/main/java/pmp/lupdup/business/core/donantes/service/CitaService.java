package pmp.lupdup.business.core.donantes.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.donantes.dto.CitaDto;
import pmp.lupdup.dao.donantes.domain.Cita;

@Service
public interface CitaService {
	
	public List<Cita> buscar(CitaDto citaDto) throws Exception;
	public Cita buscarById(CitaDto citaDto) throws Exception;
	public Integer guardar(CitaDto citaDto) throws Exception;
	public Integer eliminar(CitaDto citaDto) throws Exception;
	
}
