package pmp.lupdup.business.core.administrador.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.administrador.dto.UbigeoDto;
import pmp.lupdup.dao.administrador.domain.Ubigeo;

@Service
public interface UbigeoService {
	
	public List<Ubigeo> buscar(UbigeoDto ubigeoDto) throws Exception;
	public Ubigeo buscarById(UbigeoDto ubigeoDto) throws Exception;
	public Integer guardar(UbigeoDto ubigeoDto) throws Exception;
	public Integer eliminar(UbigeoDto ubigeoDto) throws Exception;
	
}
