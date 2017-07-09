package pmp.lupdup.business.core.administrador.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.administrador.dto.SedeSaludUsuarioDto;
import pmp.lupdup.business.core.administrador.service.SedeSaludUsuarioService;
import pmp.lupdup.dao.administrador.domain.SedeSaludUsuario;
import pmp.lupdup.dao.administrador.domain.SedeSaludUsuarioParamDef;
import pmp.lupdup.dao.administrador.domain.SedeSaludUsuarioParamDef.Criteria;
import pmp.lupdup.dao.administrador.mapper.SedeSaludUsuarioMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class SedeSaludUsuarioServiceImpl implements SedeSaludUsuarioService {
	@Autowired
	private SedeSaludUsuarioMapper sedeSaludUsuarioMapper;
	public List<SedeSaludUsuario> buscar(SedeSaludUsuarioDto sedeSaludUsuarioDto) throws Exception {
		SedeSaludUsuarioParamDef sedeSaludUsuarioParamDef		= new SedeSaludUsuarioParamDef();
		
		Criteria criteria		= sedeSaludUsuarioParamDef.createCriteria();
		if(sedeSaludUsuarioDto != null) {
		}
		
		sedeSaludUsuarioParamDef.setOrderByClause("1");
		List<SedeSaludUsuario>	 list	= sedeSaludUsuarioMapper.selectByDefaultParameter(sedeSaludUsuarioParamDef);
		return list;
	}
	
	public SedeSaludUsuario buscarById(SedeSaludUsuarioDto sedeSaludUsuarioDto) throws Exception {
		SedeSaludUsuario sedeSaludUsuario		= new SedeSaludUsuario();
		BeanUtils.copyProperties(sedeSaludUsuarioDto, sedeSaludUsuario);
		return sedeSaludUsuarioMapper.selectByPrimaryKey(sedeSaludUsuario);
	}
	
	@Transactional
	public Integer guardar(SedeSaludUsuarioDto sedeSaludUsuarioDto) throws Exception {
		SedeSaludUsuario sedeSaludUsuario		= new SedeSaludUsuario();
		BeanUtils.copyProperties(sedeSaludUsuarioDto, sedeSaludUsuario);
		int rs	= 0;
		SedeSaludUsuario exiteSedeSaludUsuario		= sedeSaludUsuarioMapper.selectByPrimaryKey(sedeSaludUsuario);
		if(exiteSedeSaludUsuario != null) {
			rs	= sedeSaludUsuarioMapper.updateByPrimaryKeySelective(sedeSaludUsuario);
		} else {
			rs	= sedeSaludUsuarioMapper.insertSelective(sedeSaludUsuario);
			

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(SedeSaludUsuarioDto sedeSaludUsuarioDto) throws Exception {
		SedeSaludUsuario sedeSaludUsuario		= new SedeSaludUsuario();
		BeanUtils.copyProperties(sedeSaludUsuarioDto, sedeSaludUsuario);
		Integer rs	= sedeSaludUsuarioMapper.deleteByPrimaryKey(sedeSaludUsuario);
		return rs;
	}
	
}
