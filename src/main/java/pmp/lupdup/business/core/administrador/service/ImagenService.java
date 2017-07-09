package pmp.lupdup.business.core.administrador.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.administrador.dto.ImagenDto;
import pmp.lupdup.dao.administrador.domain.Imagen;

@Service
public interface ImagenService {
	
	public List<Imagen> buscar(ImagenDto imagenDto) throws Exception;
	public Imagen buscarById(ImagenDto imagenDto) throws Exception;
	public Integer guardar(ImagenDto imagenDto) throws Exception;
	public Integer eliminar(ImagenDto imagenDto) throws Exception;
	
}
