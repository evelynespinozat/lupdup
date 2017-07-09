package pmp.lupdup.business.core.donantes.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.donantes.dto.DonanteCampaniaDto;
import pmp.lupdup.business.core.donantes.service.DonanteCampaniaService;
import pmp.lupdup.dao.donantes.domain.DonanteCampania;
import pmp.lupdup.dao.donantes.domain.DonanteCampaniaParamDef;
import pmp.lupdup.dao.donantes.domain.DonanteCampaniaParamDef.Criteria;
import pmp.lupdup.dao.donantes.mapper.DonanteCampaniaMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class DonanteCampaniaServiceImpl implements DonanteCampaniaService {
	@Autowired
	private DonanteCampaniaMapper donanteCampaniaMapper;
	public List<DonanteCampania> buscar(DonanteCampaniaDto donanteCampaniaDto) throws Exception {
		DonanteCampaniaParamDef donanteCampaniaParamDef		= new DonanteCampaniaParamDef();
		
		Criteria criteria		= donanteCampaniaParamDef.createCriteria();
		if(donanteCampaniaDto != null) {
			if(CadenaUtil.getInteNull(donanteCampaniaDto.getIntIndEstado()) != null) {
				criteria.andIntIndEstadoEqualTo(donanteCampaniaDto.getIntIndEstado());
			}
			if(CadenaUtil.getStrNull(donanteCampaniaDto.getStrDesDocumento()) != null) {
				criteria.andStrDesDocumentoLike(donanteCampaniaDto.getStrDesDocumento());
			}
			if(CadenaUtil.getStrNull(donanteCampaniaDto.getStrDesComentario()) != null) {
				criteria.andStrDesComentarioLike(donanteCampaniaDto.getStrDesComentario());
			}
		}
		
		donanteCampaniaParamDef.setOrderByClause("1");
		List<DonanteCampania>	 list	= donanteCampaniaMapper.selectByDefaultParameter(donanteCampaniaParamDef);
		return list;
	}
	
	public DonanteCampania buscarById(DonanteCampaniaDto donanteCampaniaDto) throws Exception {
		DonanteCampania donanteCampania		= new DonanteCampania();
		BeanUtils.copyProperties(donanteCampaniaDto, donanteCampania);
		return donanteCampaniaMapper.selectByPrimaryKey(donanteCampania);
	}
	
	@Transactional
	public Integer guardar(DonanteCampaniaDto donanteCampaniaDto) throws Exception {
		DonanteCampania donanteCampania		= new DonanteCampania();
		BeanUtils.copyProperties(donanteCampaniaDto, donanteCampania);
		return donanteCampaniaMapper.insertSelective(donanteCampania);
	}
	
	@Transactional
	public Integer eliminar(DonanteCampaniaDto donanteCampaniaDto) throws Exception {
		DonanteCampania donanteCampania		= new DonanteCampania();
		BeanUtils.copyProperties(donanteCampaniaDto, donanteCampania);
		Integer rs	= donanteCampaniaMapper.deleteByPrimaryKey(donanteCampania);
		return rs;
	}
	
}
