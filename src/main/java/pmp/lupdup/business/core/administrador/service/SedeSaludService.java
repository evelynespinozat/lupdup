package pmp.lupdup.business.core.administrador.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.administrador.dto.SedeSaludDto;
import pmp.lupdup.dao.administrador.domain.SedeSalud;

@Service
public interface SedeSaludService {
	
	public List<SedeSalud> buscar(SedeSaludDto sedeSaludDto) throws Exception;
	public SedeSalud buscarById(SedeSaludDto sedeSaludDto) throws Exception;
	public Integer guardar(SedeSaludDto sedeSaludDto) throws Exception;
	public Integer eliminar(SedeSaludDto sedeSaludDto) throws Exception;
	
}
