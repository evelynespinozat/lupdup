package pmp.lupdup.business.core.administrador.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.administrador.dto.CatalogoDto;
import pmp.lupdup.dao.administrador.domain.Catalogo;

@Service
public interface CatalogoService {
	
	public List<Catalogo> buscar(CatalogoDto catalogoDto) throws Exception;
	public Catalogo buscarById(CatalogoDto catalogoDto) throws Exception;
	public Integer guardar(CatalogoDto catalogoDto) throws Exception;
	public Integer eliminar(CatalogoDto catalogoDto) throws Exception;
	
}
