package pmp.lupdup.business.core.administrador.service.impl;

import java.util.List;
import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pmp.lupdup.business.core.administrador.dto.EntidadColaboradoraDto;
import pmp.lupdup.business.core.administrador.dto.SedeEntidadColaboradoraDto;
import pmp.lupdup.business.core.administrador.dto.SedeSaludDto;
import pmp.lupdup.business.core.administrador.service.EntidadColaboradoraService;
import pmp.lupdup.business.core.administrador.service.SedeEntidadColaboradoraService;
import pmp.lupdup.dao.administrador.domain.EntidadColaboradora;
import pmp.lupdup.dao.administrador.domain.EntidadColaboradoraParamDef;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradora;
import pmp.lupdup.dao.administrador.domain.SedeSalud;
import pmp.lupdup.dao.administrador.domain.EntidadColaboradoraParamDef.Criteria;
import pmp.lupdup.dao.administrador.mapper.EntidadColaboradoraMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class EntidadColaboradoraServiceImpl implements EntidadColaboradoraService {
	@Autowired
	private EntidadColaboradoraMapper entidadColaboradoraMapper;
	
	@Autowired
	private SedeEntidadColaboradoraService sedeEntidadColaboradoraService;
	
	public List<EntidadColaboradora> buscar(EntidadColaboradoraDto entidadColaboradoraDto) throws Exception {
		EntidadColaboradoraParamDef entidadColaboradoraParamDef		= new EntidadColaboradoraParamDef();
		
		Criteria criteria		= entidadColaboradoraParamDef.createCriteria();
		if(entidadColaboradoraDto != null) {
			if(CadenaUtil.getStrNull(entidadColaboradoraDto.getStrNomNombre()) != null) {
				criteria.andStrNomNombreLike(entidadColaboradoraDto.getStrNomNombre());
			}
		}
		criteria.andStrIndEstadoEqualTo("A");
		
		entidadColaboradoraParamDef.setOrderByClause("1");
		List<EntidadColaboradora>	 list	= entidadColaboradoraMapper.selectByDefaultParameter(entidadColaboradoraParamDef);
		return list;
	}
	
	public EntidadColaboradora buscarById(EntidadColaboradoraDto entidadColaboradoraDto) throws Exception {
		EntidadColaboradora entidadColaboradora		= new EntidadColaboradora();
		BeanUtils.copyProperties(entidadColaboradoraDto, entidadColaboradora);
		return entidadColaboradoraMapper.selectByPrimaryKey(entidadColaboradora);
	}
	
	@Transactional
	public Integer guardar(EntidadColaboradoraDto entidadColaboradoraDto) throws Exception {
		EntidadColaboradora entidadColaboradora		= new EntidadColaboradora();
		BeanUtils.copyProperties(entidadColaboradoraDto, entidadColaboradora);
		int rs	= 0;
		EntidadColaboradora exiteEntidadColaboradora		= entidadColaboradoraMapper.selectByPrimaryKey(entidadColaboradora);
		if(exiteEntidadColaboradora != null) {
			rs	= entidadColaboradoraMapper.updateByPrimaryKeySelective(entidadColaboradora);
		} else {
			entidadColaboradora.setStrIndEstado("A");
			rs	= entidadColaboradoraMapper.insertSelective(entidadColaboradora);
			
			Integer srlIdEntidadcolaboradora	= entidadColaboradoraMapper.lastSequence();
			entidadColaboradoraDto.setSrlIdEntidadcolaboradora(srlIdEntidadcolaboradora);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(EntidadColaboradoraDto entidadColaboradoraDto) throws Exception {
		EntidadColaboradora entidadColaboradora				= new EntidadColaboradora();
		BeanUtils.copyProperties(entidadColaboradoraDto, entidadColaboradora);
		EntidadColaboradora exiteEntidadColaboradora		= entidadColaboradoraMapper.selectByPrimaryKey(entidadColaboradora);

		SedeEntidadColaboradoraDto sedeEntidadColaboradoraDto		= new SedeEntidadColaboradoraDto();
		sedeEntidadColaboradoraDto.setIntIdEntidadcolaboradora(entidadColaboradora.getSrlIdEntidadcolaboradora());
		List<SedeEntidadColaboradora> listSedeEntidadColaboradora	= sedeEntidadColaboradoraService.buscar(sedeEntidadColaboradoraDto);
		for(SedeEntidadColaboradora sedeEntidadColaboradora:listSedeEntidadColaboradora) {
			sedeEntidadColaboradoraDto		= new SedeEntidadColaboradoraDto();
			BeanUtils.copyProperties(sedeEntidadColaboradora, sedeEntidadColaboradoraDto);
			sedeEntidadColaboradoraDto.setStrIndEstado("E");
			sedeEntidadColaboradoraService.guardar(sedeEntidadColaboradoraDto);
		}
		exiteEntidadColaboradora.setStrIndEstado("E");
		Integer rs	= entidadColaboradoraMapper.updateByPrimaryKeySelective(exiteEntidadColaboradora);
		
		return rs;
	}
	
}
