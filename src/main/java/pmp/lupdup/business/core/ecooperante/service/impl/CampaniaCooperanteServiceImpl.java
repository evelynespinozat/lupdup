package pmp.lupdup.business.core.ecooperante.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.ecooperante.dto.CampaniaCooperanteDto;
import pmp.lupdup.business.core.ecooperante.service.CampaniaCooperanteService;
import pmp.lupdup.dao.ecooperante.domain.CampaniaCooperante;
import pmp.lupdup.dao.ecooperante.domain.CampaniaCooperanteParamDef;
import pmp.lupdup.dao.ecooperante.domain.CampaniaCooperanteParamDef.Criteria;
import pmp.lupdup.dao.ecooperante.mapper.CampaniaCooperanteMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class CampaniaCooperanteServiceImpl implements CampaniaCooperanteService {
	@Autowired
	private CampaniaCooperanteMapper campaniaCooperanteMapper;
	public List<CampaniaCooperante> buscar(CampaniaCooperanteDto campaniaCooperanteDto) throws Exception {
		CampaniaCooperanteParamDef campaniaCooperanteParamDef		= new CampaniaCooperanteParamDef();
		
		Criteria criteria		= campaniaCooperanteParamDef.createCriteria();
		if(campaniaCooperanteDto != null) {
			if(CadenaUtil.getStrNull(campaniaCooperanteDto.getStrDesCampania()) != null) {
				criteria.andStrDesCampaniaLike(campaniaCooperanteDto.getStrDesCampania());
			}
			if(CadenaUtil.getInteNull(campaniaCooperanteDto.getIntCntAsignada()) != null) {
				criteria.andIntCntAsignadaEqualTo(campaniaCooperanteDto.getIntCntAsignada());
			}
			if(CadenaUtil.getInteNull(campaniaCooperanteDto.getIntCntDisponible()) != null) {
				criteria.andIntCntDisponibleEqualTo(campaniaCooperanteDto.getIntCntDisponible());
			}
			if(campaniaCooperanteDto.getDteFecInicio() != null) {
				criteria.andDteFecInicioEqualTo(campaniaCooperanteDto.getDteFecInicio());
			}
			if(campaniaCooperanteDto.getDteFecFin() != null) {
				criteria.andDteFecFinEqualTo(campaniaCooperanteDto.getDteFecFin());
			}
			if(CadenaUtil.getInteNull(campaniaCooperanteDto.getIntIndActivo()) != null) {
				criteria.andIntIndActivoEqualTo(campaniaCooperanteDto.getIntIndActivo());
			}
			if(CadenaUtil.getInteNull(campaniaCooperanteDto.getIntNumDescuento()) != null) {
				criteria.andIntNumDescuentoEqualTo(campaniaCooperanteDto.getIntNumDescuento());
			}
			if(CadenaUtil.getStrNull(campaniaCooperanteDto.getStrDesRegalo()) != null) {
				criteria.andStrDesRegaloLike(campaniaCooperanteDto.getStrDesRegalo());
			}
			if(CadenaUtil.getInteNull(campaniaCooperanteDto.getIntCntMinpuntos()) != null) {
				criteria.andIntCntMinpuntosEqualTo(campaniaCooperanteDto.getIntCntMinpuntos());
			}
			if(CadenaUtil.getInteNull(campaniaCooperanteDto.getIntCntGusta()) != null) {
				criteria.andIntCntGustaEqualTo(campaniaCooperanteDto.getIntCntGusta());
			}
		}
		
		campaniaCooperanteParamDef.setOrderByClause("1");
		List<CampaniaCooperante>	 list	= campaniaCooperanteMapper.selectByDefaultParameter(campaniaCooperanteParamDef);
		return list;
	}
	
	public CampaniaCooperante buscarById(CampaniaCooperanteDto campaniaCooperanteDto) throws Exception {
		CampaniaCooperante campaniaCooperante		= new CampaniaCooperante();
		BeanUtils.copyProperties(campaniaCooperanteDto, campaniaCooperante);
		return campaniaCooperanteMapper.selectByPrimaryKey(campaniaCooperante);
	}
	
	@Transactional
	public Integer guardar(CampaniaCooperanteDto campaniaCooperanteDto) throws Exception {
		CampaniaCooperante campaniaCooperante		= new CampaniaCooperante();
		BeanUtils.copyProperties(campaniaCooperanteDto, campaniaCooperante);
		int rs	= 0;
		CampaniaCooperante exiteCampaniaCooperante		= campaniaCooperanteMapper.selectByPrimaryKey(campaniaCooperante);
		if(exiteCampaniaCooperante != null) {
			rs	= campaniaCooperanteMapper.updateByPrimaryKeySelective(campaniaCooperante);
		} else {
			rs	= campaniaCooperanteMapper.insertSelective(campaniaCooperante);
			
			Integer srlIdCampania	= campaniaCooperanteMapper.lastSequence();
			campaniaCooperanteDto.setSrlIdCampania(srlIdCampania);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(CampaniaCooperanteDto campaniaCooperanteDto) throws Exception {
		CampaniaCooperante campaniaCooperante		= new CampaniaCooperante();
		BeanUtils.copyProperties(campaniaCooperanteDto, campaniaCooperante);
		Integer rs	= campaniaCooperanteMapper.deleteByPrimaryKey(campaniaCooperante);
		return rs;
	}
	
}
