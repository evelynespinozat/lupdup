package pmp.lupdup.business.core.donantes.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.donantes.dto.HistorialPuntosDto;
import pmp.lupdup.business.core.donantes.service.HistorialPuntosService;
import pmp.lupdup.dao.donantes.domain.HistorialPuntos;
import pmp.lupdup.dao.donantes.domain.HistorialPuntosParamDef;
import pmp.lupdup.dao.donantes.domain.HistorialPuntosParamDef.Criteria;
import pmp.lupdup.dao.donantes.mapper.HistorialPuntosMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class HistorialPuntosServiceImpl implements HistorialPuntosService {
	@Autowired
	private HistorialPuntosMapper historialPuntosMapper;
	public List<HistorialPuntos> buscar(HistorialPuntosDto historialPuntosDto) throws Exception {
		HistorialPuntosParamDef historialPuntosParamDef		= new HistorialPuntosParamDef();
		
		Criteria criteria		= historialPuntosParamDef.createCriteria();
		if(historialPuntosDto != null) {
			if(CadenaUtil.getInteNull(historialPuntosDto.getIntCntPuntoganado()) != null) {
				criteria.andIntCntPuntoganadoEqualTo(historialPuntosDto.getIntCntPuntoganado());
			}
			if(CadenaUtil.getInteNull(historialPuntosDto.getIntCntPuntoperdido()) != null) {
				criteria.andIntCntPuntoperdidoEqualTo(historialPuntosDto.getIntCntPuntoperdido());
			}
			if(historialPuntosDto.getDteFecPunto() != null) {
				criteria.andDteFecPuntoEqualTo(historialPuntosDto.getDteFecPunto());
			}
			if(CadenaUtil.getInteNull(historialPuntosDto.getIntIndTipopunto()) != null) {
				criteria.andIntIndTipopuntoEqualTo(historialPuntosDto.getIntIndTipopunto());
			}
		}
		
		historialPuntosParamDef.setOrderByClause("fec_punto");
		List<HistorialPuntos>	 list	= historialPuntosMapper.selectByDefaultParameter(historialPuntosParamDef);
		return list;
	}
	
	public HistorialPuntos buscarById(HistorialPuntosDto historialPuntosDto) throws Exception {
		HistorialPuntos historialPuntos		= new HistorialPuntos();
		BeanUtils.copyProperties(historialPuntosDto, historialPuntos);
		return historialPuntosMapper.selectByPrimaryKey(historialPuntos);
	}
	
	@Transactional
	public Integer guardar(HistorialPuntosDto historialPuntosDto) throws Exception {
		HistorialPuntos historialPuntos		= new HistorialPuntos();
		BeanUtils.copyProperties(historialPuntosDto, historialPuntos);
		int rs	= 0;
		HistorialPuntos exiteHistorialPuntos		= historialPuntosMapper.selectByPrimaryKey(historialPuntos);
		if(exiteHistorialPuntos != null) {
			rs	= historialPuntosMapper.updateByPrimaryKeySelective(historialPuntos);
		} else {
			rs	= historialPuntosMapper.insertSelective(historialPuntos);
			
			Integer srlIdHistorialpuntos	= historialPuntosMapper.lastSequence();
			historialPuntosDto.setSrlIdHistorialpuntos(srlIdHistorialpuntos);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(HistorialPuntosDto historialPuntosDto) throws Exception {
		HistorialPuntos historialPuntos		= new HistorialPuntos();
		BeanUtils.copyProperties(historialPuntosDto, historialPuntos);
		Integer rs	= historialPuntosMapper.deleteByPrimaryKey(historialPuntos);
		return rs;
	}
	
}
