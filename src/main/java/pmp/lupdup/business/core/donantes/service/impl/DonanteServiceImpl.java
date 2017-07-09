package pmp.lupdup.business.core.donantes.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.donantes.dto.DonanteDto;
import pmp.lupdup.business.core.donantes.service.DonanteService;
import pmp.lupdup.dao.donantes.domain.Donante;
import pmp.lupdup.dao.donantes.domain.DonanteParamDef;
import pmp.lupdup.dao.donantes.domain.DonanteParamDef.Criteria;
import pmp.lupdup.dao.donantes.mapper.DonanteMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class DonanteServiceImpl implements DonanteService {
	@Autowired
	private DonanteMapper donanteMapper;
	public List<Donante> buscar(DonanteDto donanteDto) throws Exception {
		DonanteParamDef donanteParamDef		= new DonanteParamDef();
		
		Criteria criteria		= donanteParamDef.createCriteria();
		if(donanteDto != null) {
			if(CadenaUtil.getStrNull(donanteDto.getStrNomNombre()) != null) {
				criteria.andStrNomNombreLike(donanteDto.getStrNomNombre());
			}
			if(CadenaUtil.getStrNull(donanteDto.getStrNomAppaterno()) != null) {
				criteria.andStrNomAppaternoLike(donanteDto.getStrNomAppaterno());
			}
			if(CadenaUtil.getStrNull(donanteDto.getStrNomApmaterno()) != null) {
				criteria.andStrNomApmaternoLike(donanteDto.getStrNomApmaterno());
			}
			if(donanteDto.getDteFecNacimiento() != null) {
				criteria.andDteFecNacimientoEqualTo(donanteDto.getDteFecNacimiento());
			}
			if(CadenaUtil.getInteNull(donanteDto.getIntIndEstadocivil()) != null) {
				criteria.andIntIndEstadocivilEqualTo(donanteDto.getIntIndEstadocivil());
			}
			if(CadenaUtil.getInteNull(donanteDto.getIntIndSexo()) != null) {
				criteria.andIntIndSexoEqualTo(donanteDto.getIntIndSexo());
			}
			if(CadenaUtil.getInteNull(donanteDto.getIntDesGradoinstruc()) != null) {
				criteria.andIntDesGradoinstrucEqualTo(donanteDto.getIntDesGradoinstruc());
			}
			if(CadenaUtil.getStrNull(donanteDto.getStrDesOcupacion()) != null) {
				criteria.andStrDesOcupacionLike(donanteDto.getStrDesOcupacion());
			}
			if(CadenaUtil.getInteNull(donanteDto.getIntIndDonante()) != null) {
				criteria.andIntIndDonanteEqualTo(donanteDto.getIntIndDonante());
			}
			if(CadenaUtil.getStrNull(donanteDto.getStrNumCelular()) != null) {
				criteria.andStrNumCelularLike(donanteDto.getStrNumCelular());
			}
			if(CadenaUtil.getStrNull(donanteDto.getStrNumCelular2()) != null) {
				criteria.andStrNumCelular2Like(donanteDto.getStrNumCelular2());
			}
			if(CadenaUtil.getStrNull(donanteDto.getStrNumTelefono()) != null) {
				criteria.andStrNumTelefonoLike(donanteDto.getStrNumTelefono());
			}
			if(CadenaUtil.getStrNull(donanteDto.getStrDesCorreo()) != null) {
				criteria.andStrDesCorreoLike(donanteDto.getStrDesCorreo());
			}
			if(CadenaUtil.getStrNull(donanteDto.getStrDesDireccion()) != null) {
				criteria.andStrDesDireccionLike(donanteDto.getStrDesDireccion());
			}
			if(CadenaUtil.getInteNull(donanteDto.getIntCntPuntos()) != null) {
				criteria.andIntCntPuntosEqualTo(donanteDto.getIntCntPuntos());
			}
			if(CadenaUtil.getInteNull(donanteDto.getIntIndTipo()) != null) {
				criteria.andIntIndTipoEqualTo(donanteDto.getIntIndTipo());
			}
		}
		criteria.andStrIndActivoEqualTo("S");
		donanteParamDef.setOrderByClause("1");
		List<Donante>	 list	= donanteMapper.selectByDefaultParameter(donanteParamDef);
		return list;
	}
	
	public Donante buscarById(DonanteDto donanteDto) throws Exception {
		Donante donante		= new Donante();
		BeanUtils.copyProperties(donanteDto, donante);
		return donanteMapper.selectByPrimaryKey(donante);
	}
	
	@Transactional
	public Integer guardar(DonanteDto donanteDto) throws Exception {
		Donante donante		= new Donante();
		BeanUtils.copyProperties(donanteDto, donante);
		int rs	= 0;
		Donante exiteDonante		= donanteMapper.selectByPrimaryKey(donante);
		if(exiteDonante != null) {
			rs	= donanteMapper.updateByPrimaryKeySelective(donante);
		} else {
			rs	= donanteMapper.insertSelective(donante);
			
			Integer srlIdDonante	= donanteMapper.lastSequence();
			donanteDto.setSrlIdDonante(srlIdDonante);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(DonanteDto donanteDto) throws Exception {
		Donante donante		= new Donante();
		BeanUtils.copyProperties(donanteDto, donante);
		Integer rs	= donanteMapper.deleteByPrimaryKey(donante);
		return rs;
	}
	
}
