package pmp.lupdup.business.core.administrador.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.administrador.dto.SedeSaludDto;
import pmp.lupdup.business.core.administrador.service.SedeSaludService;
import pmp.lupdup.dao.administrador.domain.SedeSalud;
import pmp.lupdup.dao.administrador.domain.SedeSaludParamDef;
import pmp.lupdup.dao.administrador.domain.SedeSaludParamDef.Criteria;
import pmp.lupdup.dao.administrador.mapper.SedeSaludMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class SedeSaludServiceImpl implements SedeSaludService {
	@Autowired
	private SedeSaludMapper sedeSaludMapper;
	public List<SedeSalud> buscar(SedeSaludDto sedeSaludDto) throws Exception {
		SedeSaludParamDef sedeSaludParamDef		= new SedeSaludParamDef();
		
		Criteria criteria		= sedeSaludParamDef.createCriteria();
		if(sedeSaludDto != null) {
			if(CadenaUtil.getStrNull(sedeSaludDto.getStrNomNombre()) != null) {
				criteria.andStrNomNombreLike(sedeSaludDto.getStrNomNombre());
			}
			if(CadenaUtil.getStrNull(sedeSaludDto.getStrDesDireccion()) != null) {
				criteria.andStrDesDireccionLike(sedeSaludDto.getStrDesDireccion());
			}
			if(CadenaUtil.getStrNull(sedeSaludDto.getStrNumTelefono()) != null) {
				criteria.andStrNumTelefonoLike(sedeSaludDto.getStrNumTelefono());
			}
			if(CadenaUtil.getStrNull(sedeSaludDto.getStrNumCelular()) != null) {
				criteria.andStrNumCelularLike(sedeSaludDto.getStrNumCelular());
			}
			if(CadenaUtil.getInteNull(sedeSaludDto.getIntIdCentrosalud()) != null) {
				criteria.andIntIdCentrosaludEqualTo(sedeSaludDto.getIntIdCentrosalud());
			}
		}
		criteria.andStrIndEstadoEqualTo("A");
		sedeSaludParamDef.setOrderByClause("1");
		List<SedeSalud>	 list	= sedeSaludMapper.selectByDefaultParameter(sedeSaludParamDef);
		return list;
	}
	
	public SedeSalud buscarById(SedeSaludDto sedeSaludDto) throws Exception {
		SedeSalud sedeSalud		= new SedeSalud();
		BeanUtils.copyProperties(sedeSaludDto, sedeSalud);
		return sedeSaludMapper.selectByPrimaryKey(sedeSalud);
	}
	
	@Transactional
	public Integer guardar(SedeSaludDto sedeSaludDto) throws Exception {
		SedeSalud sedeSalud		= new SedeSalud();
		BeanUtils.copyProperties(sedeSaludDto, sedeSalud);
		int rs	= 0;
		SedeSalud exiteSedeSalud		= sedeSaludMapper.selectByPrimaryKey(sedeSalud);
		if(exiteSedeSalud != null) {
			rs	= sedeSaludMapper.updateByPrimaryKeySelective(sedeSalud);
		} else {
			sedeSalud.setStrIndEstado("A");
			rs	= sedeSaludMapper.insertSelective(sedeSalud);
			Integer srlIdSedesalud	= sedeSaludMapper.lastSequence();
			sedeSaludDto.setSrlIdSedesalud(srlIdSedesalud);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(SedeSaludDto sedeSaludDto) throws Exception {
		SedeSalud sedeSalud		= new SedeSalud();
		BeanUtils.copyProperties(sedeSaludDto, sedeSalud);
		SedeSalud exiteSedeSalud		= sedeSaludMapper.selectByPrimaryKey(sedeSalud);
		exiteSedeSalud.setStrIndEstado("E");
		Integer rs	= sedeSaludMapper.updateByPrimaryKeySelective(exiteSedeSalud);
		return rs;
	}
	
}
