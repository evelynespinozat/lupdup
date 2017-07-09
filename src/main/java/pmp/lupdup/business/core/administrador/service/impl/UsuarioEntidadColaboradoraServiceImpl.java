package pmp.lupdup.business.core.administrador.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.administrador.dto.UsuarioEntidadColaboradoraDto;
import pmp.lupdup.business.core.administrador.service.UsuarioEntidadColaboradoraService;
import pmp.lupdup.dao.administrador.domain.UsuarioEntidadColaboradora;
import pmp.lupdup.dao.administrador.domain.UsuarioEntidadColaboradoraParamDef;
import pmp.lupdup.dao.administrador.domain.UsuarioEntidadColaboradoraParamDef.Criteria;
import pmp.lupdup.dao.administrador.mapper.UsuarioEntidadColaboradoraMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class UsuarioEntidadColaboradoraServiceImpl implements UsuarioEntidadColaboradoraService {
	@Autowired
	private UsuarioEntidadColaboradoraMapper usuarioEntidadColaboradoraMapper;
	public List<UsuarioEntidadColaboradora> buscar(UsuarioEntidadColaboradoraDto usuarioEntidadColaboradoraDto) throws Exception {
		UsuarioEntidadColaboradoraParamDef usuarioEntidadColaboradoraParamDef		= new UsuarioEntidadColaboradoraParamDef();
		
		Criteria criteria		= usuarioEntidadColaboradoraParamDef.createCriteria();
		if(usuarioEntidadColaboradoraDto != null) {
			if(CadenaUtil.getInteNull(usuarioEntidadColaboradoraDto.getIntIdDonante()) != null) {
				criteria.andIntIdDonanteEqualTo(usuarioEntidadColaboradoraDto.getIntIdDonante());
			}
			if(CadenaUtil.getInteNull(usuarioEntidadColaboradoraDto.getIntIdPerfil()) != null) {
				criteria.andIntIdPerfilEqualTo(usuarioEntidadColaboradoraDto.getIntIdPerfil());
			}
			if(CadenaUtil.getStrNull(usuarioEntidadColaboradoraDto.getStrNomUsuario()) != null) {
				criteria.andStrNomUsuarioLike(usuarioEntidadColaboradoraDto.getStrNomUsuario());
			}
			if(CadenaUtil.getStrNull(usuarioEntidadColaboradoraDto.getStrClvUsuario()) != null) {
				criteria.andStrClvUsuarioLike(usuarioEntidadColaboradoraDto.getStrClvUsuario());
			}
			if(CadenaUtil.getStrNull(usuarioEntidadColaboradoraDto.getStrNomResponsable()) != null) {
				criteria.andStrNomResponsableLike(usuarioEntidadColaboradoraDto.getStrNomResponsable());
			}
			if(CadenaUtil.getStrNull(usuarioEntidadColaboradoraDto.getStrNomAppaterno()) != null) {
				criteria.andStrNomAppaternoLike(usuarioEntidadColaboradoraDto.getStrNomAppaterno());
			}
			if(CadenaUtil.getStrNull(usuarioEntidadColaboradoraDto.getStrNomApmaterno()) != null) {
				criteria.andStrNomApmaternoLike(usuarioEntidadColaboradoraDto.getStrNomApmaterno());
			}
			if(CadenaUtil.getStrNull(usuarioEntidadColaboradoraDto.getStrDesTelefono()) != null) {
				criteria.andStrDesTelefonoLike(usuarioEntidadColaboradoraDto.getStrDesTelefono());
			}
			if(CadenaUtil.getStrNull(usuarioEntidadColaboradoraDto.getStrDesCorreo()) != null) {
				criteria.andStrDesCorreoLike(usuarioEntidadColaboradoraDto.getStrDesCorreo());
			}
			if(CadenaUtil.getStrNull(usuarioEntidadColaboradoraDto.getStrDesCelular()) != null) {
				criteria.andStrDesCelularLike(usuarioEntidadColaboradoraDto.getStrDesCelular());
			}
			if(CadenaUtil.getInteNull(usuarioEntidadColaboradoraDto.getIntIdEntidadcolaboradora()) != null) {
				criteria.andIntIdEntidadcolaboradoraEqualTo(usuarioEntidadColaboradoraDto.getIntIdEntidadcolaboradora());
			}
		}
		
		usuarioEntidadColaboradoraParamDef.setOrderByClause("1");
		List<UsuarioEntidadColaboradora>	 list	= usuarioEntidadColaboradoraMapper.selectByDefaultParameter(usuarioEntidadColaboradoraParamDef);
		return list;
	}
	
	public UsuarioEntidadColaboradora buscarById(UsuarioEntidadColaboradoraDto usuarioEntidadColaboradoraDto) throws Exception {
		UsuarioEntidadColaboradora usuarioEntidadColaboradora		= new UsuarioEntidadColaboradora();
		BeanUtils.copyProperties(usuarioEntidadColaboradoraDto, usuarioEntidadColaboradora);
		return usuarioEntidadColaboradoraMapper.selectByPrimaryKey(usuarioEntidadColaboradora);
	}
	
	@Transactional
	public Integer guardar(UsuarioEntidadColaboradoraDto usuarioEntidadColaboradoraDto) throws Exception {
		UsuarioEntidadColaboradora usuarioEntidadColaboradora		= new UsuarioEntidadColaboradora();
		BeanUtils.copyProperties(usuarioEntidadColaboradoraDto, usuarioEntidadColaboradora);
		int rs	= 0;
		UsuarioEntidadColaboradora exiteUsuarioEntidadColaboradora		= usuarioEntidadColaboradoraMapper.selectByPrimaryKey(usuarioEntidadColaboradora);
		if(exiteUsuarioEntidadColaboradora != null) {
			rs	= usuarioEntidadColaboradoraMapper.updateByPrimaryKeySelective(usuarioEntidadColaboradora);
		} else {
			rs	= usuarioEntidadColaboradoraMapper.insertSelective(usuarioEntidadColaboradora);
			
			Integer srlIdUsuario	= usuarioEntidadColaboradoraMapper.lastSequence();
			usuarioEntidadColaboradoraDto.setSrlIdUsuario(srlIdUsuario);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(UsuarioEntidadColaboradoraDto usuarioEntidadColaboradoraDto) throws Exception {
		UsuarioEntidadColaboradora usuarioEntidadColaboradora		= new UsuarioEntidadColaboradora();
		BeanUtils.copyProperties(usuarioEntidadColaboradoraDto, usuarioEntidadColaboradora);
		Integer rs	= usuarioEntidadColaboradoraMapper.deleteByPrimaryKey(usuarioEntidadColaboradora);
		return rs;
	}
	
}
