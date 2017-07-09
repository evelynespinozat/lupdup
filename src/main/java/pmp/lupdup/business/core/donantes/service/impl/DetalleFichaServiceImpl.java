package pmp.lupdup.business.core.donantes.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.donantes.dto.DetalleFichaDto;
import pmp.lupdup.business.core.donantes.service.DetalleFichaService;
import pmp.lupdup.dao.donantes.domain.DetalleFicha;
import pmp.lupdup.dao.donantes.domain.DetalleFichaParamDef;
import pmp.lupdup.dao.donantes.domain.DetalleFichaParamDef.Criteria;
import pmp.lupdup.dao.donantes.mapper.DetalleFichaMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class DetalleFichaServiceImpl implements DetalleFichaService {
	@Autowired
	private DetalleFichaMapper detalleFichaMapper;
	public List<DetalleFicha> buscar(DetalleFichaDto detalleFichaDto) throws Exception {
		DetalleFichaParamDef detalleFichaParamDef		= new DetalleFichaParamDef();
		
		Criteria criteria		= detalleFichaParamDef.createCriteria();
		if(detalleFichaDto != null) {
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntIdFicha()) != null) {
				criteria.andIntIdFichaEqualTo(detalleFichaDto.getIntIdFicha());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumHematies()) != null) {
				criteria.andIntNumHematiesEqualTo(detalleFichaDto.getIntNumHematies());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumHemoglobina()) != null) {
				criteria.andIntNumHemoglobinaEqualTo(detalleFichaDto.getIntNumHemoglobina());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumHematocrito()) != null) {
				criteria.andIntNumHematocritoEqualTo(detalleFichaDto.getIntNumHematocrito());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumVcm()) != null) {
				criteria.andIntNumVcmEqualTo(detalleFichaDto.getIntNumVcm());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumChm()) != null) {
				criteria.andIntNumChmEqualTo(detalleFichaDto.getIntNumChm());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumLinfocitos()) != null) {
				criteria.andIntNumLinfocitosEqualTo(detalleFichaDto.getIntNumLinfocitos());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumPlaquetas()) != null) {
				criteria.andIntNumPlaquetasEqualTo(detalleFichaDto.getIntNumPlaquetas());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumLeucocitos()) != null) {
				criteria.andIntNumLeucocitosEqualTo(detalleFichaDto.getIntNumLeucocitos());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumNeutrofilos()) != null) {
				criteria.andIntNumNeutrofilosEqualTo(detalleFichaDto.getIntNumNeutrofilos());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumEosinofilos()) != null) {
				criteria.andIntNumEosinofilosEqualTo(detalleFichaDto.getIntNumEosinofilos());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumVsg()) != null) {
				criteria.andIntNumVsgEqualTo(detalleFichaDto.getIntNumVsg());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumGlucosa()) != null) {
				criteria.andIntNumGlucosaEqualTo(detalleFichaDto.getIntNumGlucosa());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumUrea()) != null) {
				criteria.andIntNumUreaEqualTo(detalleFichaDto.getIntNumUrea());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumAcisourico()) != null) {
				criteria.andIntNumAcisouricoEqualTo(detalleFichaDto.getIntNumAcisourico());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumCreatinina()) != null) {
				criteria.andIntNumCreatininaEqualTo(detalleFichaDto.getIntNumCreatinina());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumColesterol()) != null) {
				criteria.andIntNumColesterolEqualTo(detalleFichaDto.getIntNumColesterol());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumHdl()) != null) {
				criteria.andIntNumHdlEqualTo(detalleFichaDto.getIntNumHdl());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumLdl()) != null) {
				criteria.andIntNumLdlEqualTo(detalleFichaDto.getIntNumLdl());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumTrigliceridos()) != null) {
				criteria.andIntNumTrigliceridosEqualTo(detalleFichaDto.getIntNumTrigliceridos());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumTransaminasaGot()) != null) {
				criteria.andIntNumTransaminasaGotEqualTo(detalleFichaDto.getIntNumTransaminasaGot());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumTransaminasaGpt()) != null) {
				criteria.andIntNumTransaminasaGptEqualTo(detalleFichaDto.getIntNumTransaminasaGpt());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumTransaminasaGgt()) != null) {
				criteria.andIntNumTransaminasaGgtEqualTo(detalleFichaDto.getIntNumTransaminasaGgt());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumFosfatasaAlcalina()) != null) {
				criteria.andIntNumFosfatasaAlcalinaEqualTo(detalleFichaDto.getIntNumFosfatasaAlcalina());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumCalcio()) != null) {
				criteria.andIntNumCalcioEqualTo(detalleFichaDto.getIntNumCalcio());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumHierro()) != null) {
				criteria.andIntNumHierroEqualTo(detalleFichaDto.getIntNumHierro());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumPotacio()) != null) {
				criteria.andIntNumPotacioEqualTo(detalleFichaDto.getIntNumPotacio());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumSodio()) != null) {
				criteria.andIntNumSodioEqualTo(detalleFichaDto.getIntNumSodio());
			}
			if(CadenaUtil.getInteNull(detalleFichaDto.getIntNumBilirrubina()) != null) {
				criteria.andIntNumBilirrubinaEqualTo(detalleFichaDto.getIntNumBilirrubina());
			}
		}
		
		detalleFichaParamDef.setOrderByClause("1");
		List<DetalleFicha>	 list	= detalleFichaMapper.selectByDefaultParameter(detalleFichaParamDef);
		return list;
	}
	
	public DetalleFicha buscarById(DetalleFichaDto detalleFichaDto) throws Exception {
		DetalleFicha detalleFicha		= new DetalleFicha();
		BeanUtils.copyProperties(detalleFichaDto, detalleFicha);
		return detalleFichaMapper.selectByPrimaryKey(detalleFicha);
	}
	
	@Transactional
	public Integer guardar(DetalleFichaDto detalleFichaDto) throws Exception {
		DetalleFicha detalleFicha		= new DetalleFicha();
		BeanUtils.copyProperties(detalleFichaDto, detalleFicha);
		int rs	= 0;
		DetalleFicha exiteDetalleFicha		= detalleFichaMapper.selectByPrimaryKey(detalleFicha);
		if(exiteDetalleFicha != null) {
			rs	= detalleFichaMapper.updateByPrimaryKeySelective(detalleFicha);
		} else {
			rs	= detalleFichaMapper.insertSelective(detalleFicha);
			
			Integer srlIdDetalleficha	= detalleFichaMapper.lastSequence();
			detalleFichaDto.setSrlIdDetalleficha(srlIdDetalleficha);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(DetalleFichaDto detalleFichaDto) throws Exception {
		DetalleFicha detalleFicha		= new DetalleFicha();
		BeanUtils.copyProperties(detalleFichaDto, detalleFicha);
		Integer rs	= detalleFichaMapper.deleteByPrimaryKey(detalleFicha);
		return rs;
	}
	
}
