package pmp.lupdup.business.core.administrador.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.administrador.dto.EntidadColaboradoraDto;
import pmp.lupdup.dao.administrador.domain.EntidadColaboradora;

@Service
public interface EntidadColaboradoraService {
	
	public List<EntidadColaboradora> buscar(EntidadColaboradoraDto entidadColaboradoraDto) throws Exception;
	public EntidadColaboradora buscarById(EntidadColaboradoraDto entidadColaboradoraDto) throws Exception;
	public Integer guardar(EntidadColaboradoraDto entidadColaboradoraDto) throws Exception;
	public Integer eliminar(EntidadColaboradoraDto entidadColaboradoraDto) throws Exception;
	
}
