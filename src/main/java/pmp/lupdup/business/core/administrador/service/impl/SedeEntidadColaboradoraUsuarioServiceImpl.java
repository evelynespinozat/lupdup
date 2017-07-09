package pmp.lupdup.business.core.administrador.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.administrador.dto.SedeEntidadColaboradoraUsuarioDto;
import pmp.lupdup.business.core.administrador.service.SedeEntidadColaboradoraUsuarioService;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradoraUsuario;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradoraUsuarioParamDef;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradoraUsuarioParamDef.Criteria;
import pmp.lupdup.dao.administrador.mapper.SedeEntidadColaboradoraUsuarioMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class SedeEntidadColaboradoraUsuarioServiceImpl implements SedeEntidadColaboradoraUsuarioService {
	@Autowired
	private SedeEntidadColaboradoraUsuarioMapper sedeEntidadColaboradoraUsuarioMapper;
	public List<SedeEntidadColaboradoraUsuario> buscar(SedeEntidadColaboradoraUsuarioDto sedeEntidadColaboradoraUsuarioDto) throws Exception {
		SedeEntidadColaboradoraUsuarioParamDef sedeEntidadColaboradoraUsuarioParamDef		= new SedeEntidadColaboradoraUsuarioParamDef();
		
		Criteria criteria		= sedeEntidadColaboradoraUsuarioParamDef.createCriteria();
		if(sedeEntidadColaboradoraUsuarioDto != null) {
		}
		
		sedeEntidadColaboradoraUsuarioParamDef.setOrderByClause("1");
		List<SedeEntidadColaboradoraUsuario>	 list	= sedeEntidadColaboradoraUsuarioMapper.selectByDefaultParameter(sedeEntidadColaboradoraUsuarioParamDef);
		return list;
	}
	
	public SedeEntidadColaboradoraUsuario buscarById(SedeEntidadColaboradoraUsuarioDto sedeEntidadColaboradoraUsuarioDto) throws Exception {
		SedeEntidadColaboradoraUsuario sedeEntidadColaboradoraUsuario		= new SedeEntidadColaboradoraUsuario();
		BeanUtils.copyProperties(sedeEntidadColaboradoraUsuarioDto, sedeEntidadColaboradoraUsuario);
		return sedeEntidadColaboradoraUsuarioMapper.selectByPrimaryKey(sedeEntidadColaboradoraUsuario);
	}
	
	@Transactional
	public Integer guardar(SedeEntidadColaboradoraUsuarioDto sedeEntidadColaboradoraUsuarioDto) throws Exception {
		SedeEntidadColaboradoraUsuario sedeEntidadColaboradoraUsuario		= new SedeEntidadColaboradoraUsuario();
		BeanUtils.copyProperties(sedeEntidadColaboradoraUsuarioDto, sedeEntidadColaboradoraUsuario);
		int rs	= 0;
		SedeEntidadColaboradoraUsuario exiteSedeEntidadColaboradoraUsuario		= sedeEntidadColaboradoraUsuarioMapper.selectByPrimaryKey(sedeEntidadColaboradoraUsuario);
		if(exiteSedeEntidadColaboradoraUsuario != null) {
			rs	= sedeEntidadColaboradoraUsuarioMapper.updateByPrimaryKeySelective(sedeEntidadColaboradoraUsuario);
		} else {
			rs	= sedeEntidadColaboradoraUsuarioMapper.insertSelective(sedeEntidadColaboradoraUsuario);
			

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(SedeEntidadColaboradoraUsuarioDto sedeEntidadColaboradoraUsuarioDto) throws Exception {
		SedeEntidadColaboradoraUsuario sedeEntidadColaboradoraUsuario		= new SedeEntidadColaboradoraUsuario();
		BeanUtils.copyProperties(sedeEntidadColaboradoraUsuarioDto, sedeEntidadColaboradoraUsuario);
		Integer rs	= sedeEntidadColaboradoraUsuarioMapper.deleteByPrimaryKey(sedeEntidadColaboradoraUsuario);
		return rs;
	}
	
}
