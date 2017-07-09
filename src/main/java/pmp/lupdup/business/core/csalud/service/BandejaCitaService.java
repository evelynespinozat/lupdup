package pmp.lupdup.business.core.csalud.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.csalud.dto.BandejaCitaDto;
import pmp.lupdup.business.core.donantes.dto.DetalleFichaDto;
import pmp.lupdup.business.core.donantes.dto.FichaResultadosDto;
import pmp.lupdup.dao.csalud.domain.BandejaCita;

@Service
public interface BandejaCitaService {
	
	public List<BandejaCita> buscar(BandejaCitaDto bandejaCitaDto) throws Exception;
	public BandejaCita buscarById(BandejaCitaDto bandejaCitaDto) throws Exception;
	public Integer guardar(BandejaCitaDto bandejaCitaDto) throws Exception;
	public Integer guardarFicha(FichaResultadosDto edicion_fichaResultadosDto, DetalleFichaDto edicion_detalleFichaDto) throws Exception;
	public Integer eliminar(BandejaCitaDto bandejaCitaDto) throws Exception;
	public void enviarNotificacionCorreo() throws Exception;
	
}
