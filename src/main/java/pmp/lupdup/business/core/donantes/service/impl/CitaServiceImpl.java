package pmp.lupdup.business.core.donantes.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.donantes.dto.CitaDto;
import pmp.lupdup.business.core.donantes.service.CitaService;
import pmp.lupdup.dao.donantes.domain.Cita;
import pmp.lupdup.dao.donantes.domain.CitaParamDef;
import pmp.lupdup.dao.donantes.domain.CitaParamDef.Criteria;
import pmp.lupdup.dao.donantes.mapper.CitaMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class CitaServiceImpl implements CitaService {
	@Autowired
	private CitaMapper citaMapper;
	public List<Cita> buscar(CitaDto citaDto) throws Exception {
		CitaParamDef citaParamDef		= new CitaParamDef();
		
		Criteria criteria		= citaParamDef.createCriteria();
		if(citaDto != null) {
			if(citaDto.getDteFecCita() != null) {
				criteria.andDteFecCitaEqualTo(citaDto.getDteFecCita());
			}
			if(CadenaUtil.getStrNull(citaDto.getStrHorCita()) != null) {
				criteria.andStrHorCitaLike(citaDto.getStrHorCita());
			}
			if(CadenaUtil.getStrNull(citaDto.getIntIdEstado()) != null) {
				criteria.andIntIdEstadoEqualsTo(citaDto.getIntIdEstado());
			}
			if(CadenaUtil.getStrNull(citaDto.getIntIdEstadoList()) != null) {
				criteria.andIntIdEstadoIn(citaDto.getIntIdEstadoList());
			}
		}
		
		citaParamDef.setOrderByClause("1");
		List<Cita>	 list	= citaMapper.selectByDefaultParameter(citaParamDef);
		return list;
	}
	
	public Cita buscarById(CitaDto citaDto) throws Exception {
		Cita cita		= new Cita();
		BeanUtils.copyProperties(citaDto, cita);
		return citaMapper.selectByPrimaryKey(cita);
	}
	
	@Transactional
	public Integer guardar(CitaDto citaDto) throws Exception {
		Cita cita		= new Cita();
		BeanUtils.copyProperties(citaDto, cita);
		int rs	= 0;
		Cita exiteCita		= citaMapper.selectByPrimaryKey(cita);
		if(exiteCita != null) {
			rs	= citaMapper.updateByPrimaryKeySelective(cita);
		} else {
			rs	= citaMapper.insertSelective(cita);
			
			Integer srlIdCita	= citaMapper.lastSequence();
			citaDto.setSrlIdCita(srlIdCita);
		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(CitaDto citaDto) throws Exception {
		Cita cita		= new Cita();
		BeanUtils.copyProperties(citaDto, cita);
		Integer rs	= citaMapper.deleteByPrimaryKey(cita);
		return rs;
	}
	
}
