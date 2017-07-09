package pmp.lupdup.business.core.administrador.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.business.core.administrador.dto.UsuarioEntidadColaboradoraDto;
import pmp.lupdup.dao.administrador.domain.UsuarioEntidadColaboradora;

@Service
public interface UsuarioEntidadColaboradoraService {
	
	public List<UsuarioEntidadColaboradora> buscar(UsuarioEntidadColaboradoraDto usuarioEntidadColaboradoraDto) throws Exception;
	public UsuarioEntidadColaboradora buscarById(UsuarioEntidadColaboradoraDto usuarioEntidadColaboradoraDto) throws Exception;
	public Integer guardar(UsuarioEntidadColaboradoraDto usuarioEntidadColaboradoraDto) throws Exception;
	public Integer eliminar(UsuarioEntidadColaboradoraDto usuarioEntidadColaboradoraDto) throws Exception;
	
}
