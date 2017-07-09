package pmp.lupdup.business.core.administrador.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.administrador.dto.UsuarioDto;
import pmp.lupdup.business.core.administrador.service.UsuarioService;
import pmp.lupdup.dao.administrador.domain.Usuario;
import pmp.lupdup.dao.administrador.domain.UsuarioParamDef;
import pmp.lupdup.dao.administrador.domain.UsuarioParamDef.Criteria;
import pmp.lupdup.dao.administrador.mapper.UsuarioMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioMapper usuarioMapper;
	public List<Usuario> buscar(UsuarioDto usuarioDto) throws Exception {
		UsuarioParamDef usuarioParamDef		= new UsuarioParamDef();
		
		Criteria criteria		= usuarioParamDef.createCriteria();
		if(usuarioDto != null) {
			if(CadenaUtil.getInteNull(usuarioDto.getIntIdDonante()) != null) {
				criteria.andIntIdDonanteEqualTo(usuarioDto.getIntIdDonante());
			}
			if(CadenaUtil.getInteNull(usuarioDto.getIntIdPerfil()) != null) {
				criteria.andIntIdPerfilEqualTo(usuarioDto.getIntIdPerfil());
			}
			if(CadenaUtil.getStrNull(usuarioDto.getStrNomUsuario()) != null) {
				criteria.andStrNomUsuarioLike(usuarioDto.getStrNomUsuario());
			}
			if(CadenaUtil.getStrNull(usuarioDto.getStrClvUsuario()) != null) {
				criteria.andStrClvUsuarioLike(usuarioDto.getStrClvUsuario());
			}
			if(CadenaUtil.getStrNull(usuarioDto.getStrNomResponsable()) != null) {
				criteria.andStrNomResponsableLike(usuarioDto.getStrNomResponsable());
			}
			if(CadenaUtil.getStrNull(usuarioDto.getStrNomAppaterno()) != null) {
				criteria.andStrNomAppaternoLike(usuarioDto.getStrNomAppaterno());
			}
			if(CadenaUtil.getStrNull(usuarioDto.getStrNomApmaterno()) != null) {
				criteria.andStrNomApmaternoLike(usuarioDto.getStrNomApmaterno());
			}
			if(CadenaUtil.getStrNull(usuarioDto.getStrDesTelefono()) != null) {
				criteria.andStrDesTelefonoLike(usuarioDto.getStrDesTelefono());
			}
			if(CadenaUtil.getStrNull(usuarioDto.getStrDesCorreo()) != null) {
				criteria.andStrDesCorreoLike(usuarioDto.getStrDesCorreo());
			}
			if(CadenaUtil.getStrNull(usuarioDto.getStrDesCelular()) != null) {
				criteria.andStrDesCelularLike(usuarioDto.getStrDesCelular());
			}
		}
		criteria.andStrIndActivoEqualTo("S");
		usuarioParamDef.setOrderByClause("1");
		List<Usuario>	 list	= usuarioMapper.selectByDefaultParameter(usuarioParamDef);
		return list;
	}
	
	public Usuario buscarById(UsuarioDto usuarioDto) throws Exception {
		Usuario usuario		= new Usuario();
		BeanUtils.copyProperties(usuarioDto, usuario);
		return usuarioMapper.selectByPrimaryKey(usuario);
	}
	
	@Transactional
	public Integer guardar(UsuarioDto usuarioDto) throws Exception {
		Usuario usuario		= new Usuario();
		BeanUtils.copyProperties(usuarioDto, usuario);
		int rs	= 0;
		Usuario exiteUsuario		= usuarioMapper.selectByPrimaryKey(usuario);
		if(exiteUsuario != null) {
			usuario.setStrIndActivoBoolean(true);
			rs	= usuarioMapper.updateByPrimaryKeySelective(usuario);
		} else {
			rs	= usuarioMapper.insertSelective(usuario);
			
			Integer srlIdUsuario	= usuarioMapper.lastSequence();
			usuarioDto.setSrlIdUsuario(srlIdUsuario);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(UsuarioDto usuarioDto) throws Exception {
		Usuario usuario		= new Usuario();
		BeanUtils.copyProperties(usuarioDto, usuario);
		Usuario exiteUsuario		= usuarioMapper.selectByPrimaryKey(usuario);
		exiteUsuario.setStrIndActivoBoolean(false);
		Integer rs	= usuarioMapper.updateByPrimaryKeySelective(exiteUsuario);
		return rs;
	}
	
}
