package pmp.lupdup.business.core.administrador.service.impl;

import java.util.List;
import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pmp.lupdup.business.core.administrador.dto.CentroSaludDto;
import pmp.lupdup.business.core.administrador.dto.SedeSaludDto;
import pmp.lupdup.business.core.administrador.service.CentroSaludService;
import pmp.lupdup.business.core.administrador.service.SedeSaludService;
import pmp.lupdup.dao.administrador.domain.CentroSalud;
import pmp.lupdup.dao.administrador.domain.CentroSaludParamDef;
import pmp.lupdup.dao.administrador.domain.CentroSaludParamDef.Criteria;
import pmp.lupdup.dao.administrador.domain.SedeSalud;
import pmp.lupdup.dao.administrador.mapper.CentroSaludMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class CentroSaludServiceImpl implements CentroSaludService {
	@Autowired
	private CentroSaludMapper centroSaludMapper;
	
	@Autowired
	private SedeSaludService sedeSaludService;
	
	public List<CentroSalud> buscar(CentroSaludDto centroSaludDto) throws Exception {
		CentroSaludParamDef centroSaludParamDef		= new CentroSaludParamDef();
		
		Criteria criteria		= centroSaludParamDef.createCriteria();
		if(centroSaludDto != null) {
			if(CadenaUtil.getStrNull(centroSaludDto.getStrNomNombre()) != null) {
				criteria.andStrNomNombreLike(centroSaludDto.getStrNomNombre());
			}
			if(CadenaUtil.getInteNull(centroSaludDto.getIntIndTipoentidad()) != null) {
				criteria.andIntIndTipoentidadEqualTo(centroSaludDto.getIntIndTipoentidad());
			}
		}
		criteria.andStrIndEstadoEqualTo("A");

		centroSaludParamDef.setOrderByClause("1");
		List<CentroSalud>	 list	= centroSaludMapper.selectByDefaultParameter(centroSaludParamDef);
		return list;
	}
	
	public CentroSalud buscarById(CentroSaludDto centroSaludDto) throws Exception {
		CentroSalud centroSalud		= new CentroSalud();
		BeanUtils.copyProperties(centroSaludDto, centroSalud);
		return centroSaludMapper.selectByPrimaryKey(centroSalud);
	}
	
	@Transactional
	public Integer guardar(CentroSaludDto centroSaludDto) throws Exception {
		CentroSalud centroSalud		= new CentroSalud();
		BeanUtils.copyProperties(centroSaludDto, centroSalud);
		int rs	= 0;
		CentroSalud exiteCentroSalud		= centroSaludMapper.selectByPrimaryKey(centroSalud);
		if(exiteCentroSalud != null) {
			rs	= centroSaludMapper.updateByPrimaryKeySelective(centroSalud);
		} else {
			centroSalud.setStrIndEstado("A");
			rs	= centroSaludMapper.insertSelective(centroSalud);
			
			Integer srlIdCentrosalud	= centroSaludMapper.lastSequence();
			centroSaludDto.setSrlIdCentrosalud(srlIdCentrosalud);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(CentroSaludDto centroSaludDto) throws Exception {
		CentroSalud centroSalud		= new CentroSalud();
		BeanUtils.copyProperties(centroSaludDto, centroSalud);
		CentroSalud exiteCentroSalud		= centroSaludMapper.selectByPrimaryKey(centroSalud);

		SedeSaludDto sedeSaludDto	= new SedeSaludDto();
		sedeSaludDto.setIntIdCentrosalud(centroSalud.getSrlIdCentrosalud());
		List<SedeSalud> listSedeSalud	= sedeSaludService.buscar(sedeSaludDto);
		for(SedeSalud sedeSalud:listSedeSalud) {
			sedeSaludDto		= new SedeSaludDto();
			BeanUtils.copyProperties(sedeSalud, sedeSaludDto);
			sedeSaludDto.setStrIndEstado("E");
			sedeSaludService.guardar(sedeSaludDto);
		}
		exiteCentroSalud.setStrIndEstado("E");
		Integer rs	= centroSaludMapper.updateByPrimaryKeySelective(exiteCentroSalud);
		return rs;
	}
	
}
