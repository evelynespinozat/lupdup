package pmp.lupdup.business.core.administrador.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.administrador.dto.UsuarioCentroSaludDto;
import pmp.lupdup.business.core.administrador.service.UsuarioCentroSaludService;
import pmp.lupdup.dao.administrador.domain.UsuarioCentroSalud;
import pmp.lupdup.dao.administrador.domain.UsuarioCentroSaludParamDef;
import pmp.lupdup.dao.administrador.domain.UsuarioCentroSaludParamDef.Criteria;
import pmp.lupdup.dao.administrador.mapper.UsuarioCentroSaludMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class UsuarioCentroSaludServiceImpl implements UsuarioCentroSaludService {
	@Autowired
	private UsuarioCentroSaludMapper usuarioCentroSaludMapper;
	public List<UsuarioCentroSalud> buscar(UsuarioCentroSaludDto usuarioCentroSaludDto) throws Exception {
		UsuarioCentroSaludParamDef usuarioCentroSaludParamDef		= new UsuarioCentroSaludParamDef();
		
		Criteria criteria		= usuarioCentroSaludParamDef.createCriteria();
		if(usuarioCentroSaludDto != null) {
			if(CadenaUtil.getInteNull(usuarioCentroSaludDto.getIntIdDonante()) != null) {
				criteria.andIntIdDonanteEqualTo(usuarioCentroSaludDto.getIntIdDonante());
			}
			if(CadenaUtil.getInteNull(usuarioCentroSaludDto.getIntIdPerfil()) != null) {
				criteria.andIntIdPerfilEqualTo(usuarioCentroSaludDto.getIntIdPerfil());
			}
			if(CadenaUtil.getStrNull(usuarioCentroSaludDto.getStrNomUsuario()) != null) {
				criteria.andStrNomUsuarioLike(usuarioCentroSaludDto.getStrNomUsuario());
			}
			if(CadenaUtil.getStrNull(usuarioCentroSaludDto.getStrClvUsuario()) != null) {
				criteria.andStrClvUsuarioLike(usuarioCentroSaludDto.getStrClvUsuario());
			}
			if(CadenaUtil.getStrNull(usuarioCentroSaludDto.getStrNomResponsable()) != null) {
				criteria.andStrNomResponsableLike(usuarioCentroSaludDto.getStrNomResponsable());
			}
			if(CadenaUtil.getStrNull(usuarioCentroSaludDto.getStrNomAppaterno()) != null) {
				criteria.andStrNomAppaternoLike(usuarioCentroSaludDto.getStrNomAppaterno());
			}
			if(CadenaUtil.getStrNull(usuarioCentroSaludDto.getStrNomApmaterno()) != null) {
				criteria.andStrNomApmaternoLike(usuarioCentroSaludDto.getStrNomApmaterno());
			}
			if(CadenaUtil.getStrNull(usuarioCentroSaludDto.getStrDesTelefono()) != null) {
				criteria.andStrDesTelefonoLike(usuarioCentroSaludDto.getStrDesTelefono());
			}
			if(CadenaUtil.getStrNull(usuarioCentroSaludDto.getStrDesCorreo()) != null) {
				criteria.andStrDesCorreoLike(usuarioCentroSaludDto.getStrDesCorreo());
			}
			if(CadenaUtil.getStrNull(usuarioCentroSaludDto.getStrDesCelular()) != null) {
				criteria.andStrDesCelularLike(usuarioCentroSaludDto.getStrDesCelular());
			}
			if(CadenaUtil.getInteNull(usuarioCentroSaludDto.getIntIdCentrosalud()) != null) {
				criteria.andIntIdCentrosaludEqualTo(usuarioCentroSaludDto.getIntIdCentrosalud());
			}
			if(CadenaUtil.getInteNull(usuarioCentroSaludDto.getIntIdSedeCentrosalud()) != null) {
				criteria.andIntIdSedeCentrosaludEqualTo(usuarioCentroSaludDto.getIntIdSedeCentrosalud());
			}
		}
		
		usuarioCentroSaludParamDef.setOrderByClause("1");
		List<UsuarioCentroSalud>	 list	= usuarioCentroSaludMapper.selectByDefaultParameter(usuarioCentroSaludParamDef);
		return list;
	}
	
	public UsuarioCentroSalud buscarById(UsuarioCentroSaludDto usuarioCentroSaludDto) throws Exception {
		UsuarioCentroSalud usuarioCentroSalud		= new UsuarioCentroSalud();
		BeanUtils.copyProperties(usuarioCentroSaludDto, usuarioCentroSalud);
		return usuarioCentroSaludMapper.selectByPrimaryKey(usuarioCentroSalud);
	}
	
	@Transactional
	public Integer guardar(UsuarioCentroSaludDto usuarioCentroSaludDto) throws Exception {
		UsuarioCentroSalud usuarioCentroSalud		= new UsuarioCentroSalud();
		BeanUtils.copyProperties(usuarioCentroSaludDto, usuarioCentroSalud);
		int rs	= 0;
		UsuarioCentroSalud exiteUsuarioCentroSalud		= usuarioCentroSaludMapper.selectByPrimaryKey(usuarioCentroSalud);
		if(exiteUsuarioCentroSalud != null) {
			rs	= usuarioCentroSaludMapper.updateByPrimaryKeySelective(usuarioCentroSalud);
		} else {
			rs	= usuarioCentroSaludMapper.insertSelective(usuarioCentroSalud);
			
			Integer srlIdUsuario	= usuarioCentroSaludMapper.lastSequence();
			usuarioCentroSaludDto.setSrlIdUsuario(srlIdUsuario);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(UsuarioCentroSaludDto usuarioCentroSaludDto) throws Exception {
		UsuarioCentroSalud usuarioCentroSalud		= new UsuarioCentroSalud();
		BeanUtils.copyProperties(usuarioCentroSaludDto, usuarioCentroSalud);
		Integer rs	= usuarioCentroSaludMapper.deleteByPrimaryKey(usuarioCentroSalud);
		return rs;
	}
	
}
