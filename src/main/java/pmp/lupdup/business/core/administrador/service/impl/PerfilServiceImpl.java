package pmp.lupdup.business.core.administrador.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.administrador.dto.PerfilDto;
import pmp.lupdup.business.core.administrador.service.PerfilService;
import pmp.lupdup.dao.administrador.domain.Perfil;
import pmp.lupdup.dao.administrador.domain.PerfilParamDef;
import pmp.lupdup.dao.administrador.domain.PerfilParamDef.Criteria;
import pmp.lupdup.dao.administrador.mapper.PerfilMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class PerfilServiceImpl implements PerfilService {
	@Autowired
	private PerfilMapper perfilMapper;
	public List<Perfil> buscar(PerfilDto perfilDto) throws Exception {
		PerfilParamDef perfilParamDef		= new PerfilParamDef();
		
		Criteria criteria		= perfilParamDef.createCriteria();
		if(perfilDto != null) {
			if(CadenaUtil.getStrNull(perfilDto.getStrNomPerfil()) != null) {
				criteria.andStrNomPerfilLike(perfilDto.getStrNomPerfil());
			}
		}
		
		perfilParamDef.setOrderByClause("1");
		List<Perfil>	 list	= perfilMapper.selectByDefaultParameter(perfilParamDef);
		return list;
	}
	
	public Perfil buscarById(PerfilDto perfilDto) throws Exception {
		Perfil perfil		= new Perfil();
		BeanUtils.copyProperties(perfilDto, perfil);
		return perfilMapper.selectByPrimaryKey(perfil);
	}
	
	@Transactional
	public Integer guardar(PerfilDto perfilDto) throws Exception {
		Perfil perfil		= new Perfil();
		BeanUtils.copyProperties(perfilDto, perfil);
		int rs	= 0;
		Perfil exitePerfil		= perfilMapper.selectByPrimaryKey(perfil);
		if(exitePerfil != null) {
			rs	= perfilMapper.updateByPrimaryKeySelective(perfil);
		} else {
			rs	= perfilMapper.insertSelective(perfil);
			
			Integer srlIdPerfil	= perfilMapper.lastSequence();
			perfilDto.setSrlIdPerfil(srlIdPerfil);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(PerfilDto perfilDto) throws Exception {
		Perfil perfil		= new Perfil();
		BeanUtils.copyProperties(perfilDto, perfil);
		Integer rs	= perfilMapper.deleteByPrimaryKey(perfil);
		return rs;
	}
	
}
