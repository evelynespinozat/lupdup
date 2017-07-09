package pmp.lupdup.business.core.donantes.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.donantes.dto.CuestionarioRptaDto;
import pmp.lupdup.business.core.donantes.service.CuestionarioRptaService;
import pmp.lupdup.dao.donantes.domain.CuestionarioRpta;
import pmp.lupdup.dao.donantes.domain.CuestionarioRptaParamDef;
import pmp.lupdup.dao.donantes.domain.CuestionarioRptaParamDef.Criteria;
import pmp.lupdup.dao.donantes.mapper.CuestionarioRptaMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class CuestionarioRptaServiceImpl implements CuestionarioRptaService {
	@Autowired
	private CuestionarioRptaMapper cuestionarioRptaMapper;
	public List<CuestionarioRpta> buscar(CuestionarioRptaDto cuestionarioRptaDto) throws Exception {
		CuestionarioRptaParamDef cuestionarioRptaParamDef		= new CuestionarioRptaParamDef();
		
		Criteria criteria		= cuestionarioRptaParamDef.createCriteria();
		if(cuestionarioRptaDto != null) {
			if(CadenaUtil.getStrNull(cuestionarioRptaDto.getStrEsCheck()) != null) {
				criteria.andStrEsCheckLike(cuestionarioRptaDto.getStrEsCheck());
			}
			if(CadenaUtil.getStrNull(cuestionarioRptaDto.getStrDesRespuesta()) != null) {
				criteria.andStrDesRespuestaLike(cuestionarioRptaDto.getStrDesRespuesta());
			}
		}
		
		cuestionarioRptaParamDef.setOrderByClause("1");
		List<CuestionarioRpta>	 list	= cuestionarioRptaMapper.selectByDefaultParameter(cuestionarioRptaParamDef);
		return list;
	}
	
	public CuestionarioRpta buscarById(CuestionarioRptaDto cuestionarioRptaDto) throws Exception {
		CuestionarioRpta cuestionarioRpta		= new CuestionarioRpta();
		BeanUtils.copyProperties(cuestionarioRptaDto, cuestionarioRpta);
		return cuestionarioRptaMapper.selectByPrimaryKey(cuestionarioRpta);
	}
	
	public List<CuestionarioRpta> selectCuestionarioRptaByDonante(CuestionarioRptaDto cuestionarioRptaDto) throws Exception {
		CuestionarioRpta cuestionarioRpta		= new CuestionarioRpta();
		BeanUtils.copyProperties(cuestionarioRptaDto, cuestionarioRpta);
		
		List<CuestionarioRpta>	 list	= cuestionarioRptaMapper.selectCuestionarioRptaByDonante(cuestionarioRpta);
		return list;
	}

	@Transactional
	public Integer guardar(CuestionarioRptaDto cuestionarioRptaDto) throws Exception {
		CuestionarioRpta cuestionarioRpta		= new CuestionarioRpta();
		BeanUtils.copyProperties(cuestionarioRptaDto, cuestionarioRpta);
		int rs	= 0;
		CuestionarioRpta exiteCuestionarioRpta		= cuestionarioRptaMapper.selectByPrimaryKey(cuestionarioRpta);
		if(exiteCuestionarioRpta != null) {
			rs	= cuestionarioRptaMapper.updateByPrimaryKeySelective(cuestionarioRpta);
		} else {
			rs	= cuestionarioRptaMapper.insertSelective(cuestionarioRpta);
			
			Integer srlIdDonantecuestionariorpta	= cuestionarioRptaMapper.lastSequence();
			cuestionarioRptaDto.setSrlIdDonantecuestionariorpta(srlIdDonantecuestionariorpta);

		}
		return rs;
	}

	@Transactional
	public Integer guardarNuevo(CuestionarioRptaDto cuestionarioRptaDto) throws Exception {
		CuestionarioRpta cuestionarioRpta		= new CuestionarioRpta();
		BeanUtils.copyProperties(cuestionarioRptaDto, cuestionarioRpta);
		int rs	= 0;
		
		rs	= cuestionarioRptaMapper.insertSelective(cuestionarioRpta);
		
		Integer srlIdDonantecuestionariorpta	= cuestionarioRptaMapper.lastSequence();
		cuestionarioRptaDto.setSrlIdDonantecuestionariorpta(srlIdDonantecuestionariorpta);
		
		return rs;
	}
	
	@Transactional
	public Integer eliminar(CuestionarioRptaDto cuestionarioRptaDto) throws Exception {
		CuestionarioRpta cuestionarioRpta		= new CuestionarioRpta();
		BeanUtils.copyProperties(cuestionarioRptaDto, cuestionarioRpta);
		Integer rs	= cuestionarioRptaMapper.deleteByPrimaryKey(cuestionarioRpta);
		return rs;
	}
	
}
