package pmp.lupdup.business.core.donantes.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.donantes.dto.FichaResultadosDto;
import pmp.lupdup.business.core.donantes.service.FichaResultadosService;
import pmp.lupdup.dao.donantes.domain.FichaResultados;
import pmp.lupdup.dao.donantes.domain.FichaResultadosParamDef;
import pmp.lupdup.dao.donantes.domain.FichaResultadosParamDef.Criteria;
import pmp.lupdup.dao.donantes.mapper.FichaResultadosMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class FichaResultadosServiceImpl implements FichaResultadosService {
	@Autowired
	private FichaResultadosMapper fichaResultadosMapper;
	public List<FichaResultados> buscar(FichaResultadosDto fichaResultadosDto) throws Exception {
		FichaResultadosParamDef fichaResultadosParamDef		= new FichaResultadosParamDef();
		
		Criteria criteria		= fichaResultadosParamDef.createCriteria();
		if(fichaResultadosDto != null) {
			if(fichaResultadosDto.getDteFecAnalisis() != null) {
				criteria.andDteFecAnalisisEqualTo(fichaResultadosDto.getDteFecAnalisis());
			}
			if(CadenaUtil.getStrNull(fichaResultadosDto.getStrHorAnalisis()) != null) {
				criteria.andStrHorAnalisisLike(fichaResultadosDto.getStrHorAnalisis());
			}
			if(CadenaUtil.getInteNull(fichaResultadosDto.getIntIndEstado()) != null) {
				criteria.andIntIndEstadoEqualTo(fichaResultadosDto.getIntIndEstado());
			}
			if(CadenaUtil.getInteNull(fichaResultadosDto.getIntIdDonante()) != null) {
				criteria.andIntIdDonanteEqualTo(fichaResultadosDto.getIntIdDonante());
			}
			if(CadenaUtil.getInteNull(fichaResultadosDto.getIntIdCita()) != null) {
				criteria.andIntIdCitaEqualTo(fichaResultadosDto.getIntIdCita());
			}
		}
		
		fichaResultadosParamDef.setOrderByClause("fec_analisis desc");
		List<FichaResultados>	 list	= fichaResultadosMapper.selectByDefaultParameter(fichaResultadosParamDef);
		return list;
	}
	
	public FichaResultados buscarById(FichaResultadosDto fichaResultadosDto) throws Exception {
		FichaResultados fichaResultados		= new FichaResultados();
		BeanUtils.copyProperties(fichaResultadosDto, fichaResultados);
		return fichaResultadosMapper.selectByPrimaryKey(fichaResultados);
	}
	
	@Transactional
	public Integer guardar(FichaResultadosDto fichaResultadosDto) throws Exception {
		FichaResultados fichaResultados		= new FichaResultados();
		BeanUtils.copyProperties(fichaResultadosDto, fichaResultados);
		int rs	= 0;
		FichaResultados exiteFichaResultados		= fichaResultadosMapper.selectByPrimaryKey(fichaResultados);
		if(exiteFichaResultados != null) {
			rs	= fichaResultadosMapper.updateByPrimaryKeySelective(fichaResultados);
		} else {
			rs	= fichaResultadosMapper.insertSelective(fichaResultados);
			
			Integer srlIdFicha	= fichaResultadosMapper.lastSequence();
			fichaResultadosDto.setSrlIdFicha(srlIdFicha);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(FichaResultadosDto fichaResultadosDto) throws Exception {
		FichaResultados fichaResultados		= new FichaResultados();
		BeanUtils.copyProperties(fichaResultadosDto, fichaResultados);
		Integer rs	= fichaResultadosMapper.deleteByPrimaryKey(fichaResultados);
		return rs;
	}
	
}
