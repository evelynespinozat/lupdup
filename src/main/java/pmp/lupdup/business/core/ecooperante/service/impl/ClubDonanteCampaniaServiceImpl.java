package pmp.lupdup.business.core.ecooperante.service.impl;

import java.util.List;
import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pmp.lupdup.business.core.donantes.dto.HistorialPuntosDto;
import pmp.lupdup.business.core.donantes.service.HistorialPuntosService;
import pmp.lupdup.business.core.ecooperante.dto.ClubDonanteCampaniaDto;
import pmp.lupdup.business.core.ecooperante.service.ClubDonanteCampaniaService;
import pmp.lupdup.dao.ecooperante.domain.ClubDonanteCampania;
import pmp.lupdup.dao.ecooperante.domain.ClubDonanteCampaniaParamDef;
import pmp.lupdup.dao.ecooperante.domain.ClubDonanteCampaniaParamDef.Criteria;
import pmp.lupdup.dao.ecooperante.mapper.ClubDonanteCampaniaMapper;
import pmp.lupdup.general.util.CadenaUtil;
import pmp.lupdup.general.util.ConfiguracionProperties;

@Service
public class ClubDonanteCampaniaServiceImpl implements ClubDonanteCampaniaService {
	@Autowired
	private ClubDonanteCampaniaMapper clubDonanteCampaniaMapper;
	
	@Autowired
	private HistorialPuntosService historialPuntosService;
	
	public List<ClubDonanteCampania> buscar(ClubDonanteCampaniaDto clubDonanteCampaniaDto) throws Exception {
		ClubDonanteCampaniaParamDef clubDonanteCampaniaParamDef		= new ClubDonanteCampaniaParamDef();
		
		Criteria criteria		= clubDonanteCampaniaParamDef.createCriteria();
		if(clubDonanteCampaniaDto != null) {
			if(CadenaUtil.getInteNull(clubDonanteCampaniaDto.getIntIndEstado()) != null) {
				criteria.andIntIndEstadoEqualTo(clubDonanteCampaniaDto.getIntIndEstado());
			}
			if(CadenaUtil.getStrNull(clubDonanteCampaniaDto.getStrDesDocumento()) != null) {
				criteria.andStrDesDocumentoLike(clubDonanteCampaniaDto.getStrDesDocumento());
			}
			if(CadenaUtil.getStrNull(clubDonanteCampaniaDto.getStrDesComentario()) != null) {
				criteria.andStrDesComentarioLike(clubDonanteCampaniaDto.getStrDesComentario());
			}
		}
		
		clubDonanteCampaniaParamDef.setOrderByClause("1");
		List<ClubDonanteCampania>	 list	= clubDonanteCampaniaMapper.selectByDefaultParameter(clubDonanteCampaniaParamDef);
		return list;
	}
	
	public ClubDonanteCampania buscarById(ClubDonanteCampaniaDto clubDonanteCampaniaDto) throws Exception {
		ClubDonanteCampania clubDonanteCampania		= new ClubDonanteCampania();
		BeanUtils.copyProperties(clubDonanteCampaniaDto, clubDonanteCampania);
		return clubDonanteCampaniaMapper.selectByPrimaryKey(clubDonanteCampania);
	}
	
	@Transactional
	public Integer guardar(ClubDonanteCampaniaDto clubDonanteCampaniaDto) throws Exception {
		ClubDonanteCampania clubDonanteCampania		= new ClubDonanteCampania();
		BeanUtils.copyProperties(clubDonanteCampaniaDto, clubDonanteCampania);
		int rs	= 0;
		ClubDonanteCampania exiteClubDonanteCampania		= clubDonanteCampaniaMapper.selectByPrimaryKey(clubDonanteCampania);
		if(exiteClubDonanteCampania != null) {
			rs	= clubDonanteCampaniaMapper.updateByPrimaryKeySelective(clubDonanteCampania);
		} else {
			rs	= clubDonanteCampaniaMapper.insertSelective(clubDonanteCampania);
		}
		
		HistorialPuntosDto historialPuntosDto	= new HistorialPuntosDto();
		historialPuntosDto.setIntIdDonante(clubDonanteCampania.getIntIdDonante());
		historialPuntosDto.setDteFecPunto(new Date());
		historialPuntosDto.setIntCntPuntoganado(0);
		historialPuntosDto.setIntCntPuntoperdido(10);
		historialPuntosDto.setIntIndTipopunto(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_TIPO_HISTORIAL_PUNTOS_PERDIDOS));
		historialPuntosService.guardar(historialPuntosDto);
		
		return rs;
	}
	
	@Transactional
	public Integer eliminar(ClubDonanteCampaniaDto clubDonanteCampaniaDto) throws Exception {
		ClubDonanteCampania clubDonanteCampania		= new ClubDonanteCampania();
		BeanUtils.copyProperties(clubDonanteCampaniaDto, clubDonanteCampania);
		Integer rs	= clubDonanteCampaniaMapper.deleteByPrimaryKey(clubDonanteCampania);
		return rs;
	}
	
}
