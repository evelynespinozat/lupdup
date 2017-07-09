package pmp.lupdup.business.core.administrador.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.administrador.dto.SedeEntidadColaboradoraDto;
import pmp.lupdup.business.core.administrador.service.SedeEntidadColaboradoraService;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradora;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradoraParamDef;
import pmp.lupdup.dao.administrador.domain.SedeEntidadColaboradoraParamDef.Criteria;
import pmp.lupdup.dao.administrador.mapper.SedeEntidadColaboradoraMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class SedeEntidadColaboradoraServiceImpl implements SedeEntidadColaboradoraService {
	@Autowired
	private SedeEntidadColaboradoraMapper sedeEntidadColaboradoraMapper;
	public List<SedeEntidadColaboradora> buscar(SedeEntidadColaboradoraDto sedeEntidadColaboradoraDto) throws Exception {
		SedeEntidadColaboradoraParamDef sedeEntidadColaboradoraParamDef		= new SedeEntidadColaboradoraParamDef();
		
		Criteria criteria		= sedeEntidadColaboradoraParamDef.createCriteria();
		if(sedeEntidadColaboradoraDto != null) {
			if(CadenaUtil.getInteNull(sedeEntidadColaboradoraDto.getIntIdEntidadcolaboradora()) != null) {
				criteria.andIntIdEntidadcolaboradoraEqualTo(sedeEntidadColaboradoraDto.getIntIdEntidadcolaboradora());
			}
			if(CadenaUtil.getStrNull(sedeEntidadColaboradoraDto.getStrNomNombre()) != null) {
				criteria.andStrNomNombreLike(sedeEntidadColaboradoraDto.getStrNomNombre());
			}
			if(CadenaUtil.getStrNull(sedeEntidadColaboradoraDto.getStrDesDireccion()) != null) {
				criteria.andStrDesDireccionLike(sedeEntidadColaboradoraDto.getStrDesDireccion());
			}
			if(CadenaUtil.getStrNull(sedeEntidadColaboradoraDto.getStrNumTelefono()) != null) {
				criteria.andStrNumTelefonoLike(sedeEntidadColaboradoraDto.getStrNumTelefono());
			}
			if(CadenaUtil.getStrNull(sedeEntidadColaboradoraDto.getStrNumCelular()) != null) {
				criteria.andStrNumCelularLike(sedeEntidadColaboradoraDto.getStrNumCelular());
			}
			if(CadenaUtil.getInteNull(sedeEntidadColaboradoraDto.getIntIdUbigeo()) != null) {
				criteria.andIntIdUbigeoEqualTo(sedeEntidadColaboradoraDto.getIntIdUbigeo());
			}
		}
		criteria.andStrIndEstadoEqualTo("A");
		sedeEntidadColaboradoraParamDef.setOrderByClause("1");
		List<SedeEntidadColaboradora>	 list	= sedeEntidadColaboradoraMapper.selectByDefaultParameter(sedeEntidadColaboradoraParamDef);
		return list;
	}
	
	public SedeEntidadColaboradora buscarById(SedeEntidadColaboradoraDto sedeEntidadColaboradoraDto) throws Exception {
		SedeEntidadColaboradora sedeEntidadColaboradora		= new SedeEntidadColaboradora();
		BeanUtils.copyProperties(sedeEntidadColaboradoraDto, sedeEntidadColaboradora);
		return sedeEntidadColaboradoraMapper.selectByPrimaryKey(sedeEntidadColaboradora);
	}
	
	@Transactional
	public Integer guardar(SedeEntidadColaboradoraDto sedeEntidadColaboradoraDto) throws Exception {
		SedeEntidadColaboradora sedeEntidadColaboradora		= new SedeEntidadColaboradora();
		BeanUtils.copyProperties(sedeEntidadColaboradoraDto, sedeEntidadColaboradora);
		int rs	= 0;
		SedeEntidadColaboradora exiteSedeEntidadColaboradora		= sedeEntidadColaboradoraMapper.selectByPrimaryKey(sedeEntidadColaboradora);
		if(exiteSedeEntidadColaboradora != null) {
			rs	= sedeEntidadColaboradoraMapper.updateByPrimaryKeySelective(sedeEntidadColaboradora);
		} else {
			sedeEntidadColaboradora.setStrIndEstado("A");
			rs	= sedeEntidadColaboradoraMapper.insertSelective(sedeEntidadColaboradora);
			
			Integer srlIdSedeentidad	= sedeEntidadColaboradoraMapper.lastSequence();
			sedeEntidadColaboradoraDto.setSrlIdSedeentidad(srlIdSedeentidad);
		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(SedeEntidadColaboradoraDto sedeEntidadColaboradoraDto) throws Exception {
		SedeEntidadColaboradora sedeEntidadColaboradora		= new SedeEntidadColaboradora();
		BeanUtils.copyProperties(sedeEntidadColaboradoraDto, sedeEntidadColaboradora);
		
		SedeEntidadColaboradora exiteSedeEntidadColaboradora		= sedeEntidadColaboradoraMapper.selectByPrimaryKey(sedeEntidadColaboradora);
		exiteSedeEntidadColaboradora.setStrIndEstado("E");
		Integer rs	= sedeEntidadColaboradoraMapper.updateByPrimaryKeySelective(exiteSedeEntidadColaboradora);
		
		return rs;
	}
	
}
