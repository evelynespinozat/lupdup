package pmp.lupdup.business.core.donantes.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.donantes.dto.AllegadosDto;
import pmp.lupdup.business.core.donantes.service.AllegadosService;
import pmp.lupdup.dao.donantes.domain.Allegados;
import pmp.lupdup.dao.donantes.domain.AllegadosParamDef;
import pmp.lupdup.dao.donantes.domain.AllegadosParamDef.Criteria;
import pmp.lupdup.dao.donantes.mapper.AllegadosMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class AllegadosServiceImpl implements AllegadosService {
	@Autowired
	private AllegadosMapper allegadosMapper;
	public List<Allegados> buscar(AllegadosDto allegadosDto) throws Exception {
		AllegadosParamDef allegadosParamDef		= new AllegadosParamDef();
		
		Criteria criteria		= allegadosParamDef.createCriteria();
		if(allegadosDto != null) {
			if(CadenaUtil.getInteNull(allegadosDto.getIntIdDonante()) != null) {
				criteria.andIntIdDonanteEqualTo(allegadosDto.getIntIdDonante());
			}
			if(CadenaUtil.getStrNull(allegadosDto.getStrNomNombre()) != null) {
				criteria.andStrNomNombreLike(allegadosDto.getStrNomNombre());
			}
			if(CadenaUtil.getStrNull(allegadosDto.getStrNomAppaterno()) != null) {
				criteria.andStrNomAppaternoLike(allegadosDto.getStrNomAppaterno());
			}
			if(CadenaUtil.getStrNull(allegadosDto.getStrNomApmaterno()) != null) {
				criteria.andStrNomApmaternoLike(allegadosDto.getStrNomApmaterno());
			}
			if(allegadosDto.getDteFecNacimiento() != null) {
				criteria.andDteFecNacimientoEqualTo(allegadosDto.getDteFecNacimiento());
			}
			if(CadenaUtil.getStrNull(allegadosDto.getStrNumCelular()) != null) {
				criteria.andStrNumCelularLike(allegadosDto.getStrNumCelular());
			}
			if(CadenaUtil.getStrNull(allegadosDto.getStrNumTelefono()) != null) {
				criteria.andStrNumTelefonoLike(allegadosDto.getStrNumTelefono());
			}
			if(CadenaUtil.getStrNull(allegadosDto.getStrDesCorreoelectronico()) != null) {
				criteria.andStrDesCorreoelectronicoLike(allegadosDto.getStrDesCorreoelectronico());
			}
			if(CadenaUtil.getStrNull(allegadosDto.getStrNumDni()) != null) {
				criteria.andStrNumDniLike(allegadosDto.getStrNumDni());
			}
			if(CadenaUtil.getInteNull(allegadosDto.getIntIdTipopariente()) != null) {
				criteria.andIntIdTipoparienteEqualTo(allegadosDto.getIntIdTipopariente());
			}
		}
		
		allegadosParamDef.setOrderByClause("1");
		List<Allegados>	 list	= allegadosMapper.selectByDefaultParameter(allegadosParamDef);
		return list;
	}
	
	public Allegados buscarById(AllegadosDto allegadosDto) throws Exception {
		Allegados allegados		= new Allegados();
		BeanUtils.copyProperties(allegadosDto, allegados);
		return allegadosMapper.selectByPrimaryKey(allegados);
	}
	
	@Transactional
	public Integer guardar(AllegadosDto allegadosDto) throws Exception {
		Allegados allegados		= new Allegados();
		BeanUtils.copyProperties(allegadosDto, allegados);
		int rs	= 0;
		Allegados exiteAllegados		= allegadosMapper.selectByPrimaryKey(allegados);
		if(exiteAllegados != null) {
			rs	= allegadosMapper.updateByPrimaryKeySelective(allegados);
		} else {
			rs	= allegadosMapper.insertSelective(allegados);
			
			Integer srlIdAllegados	= allegadosMapper.lastSequence();
			allegadosDto.setSrlIdAllegados(srlIdAllegados);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(AllegadosDto allegadosDto) throws Exception {
		Allegados allegados		= new Allegados();
		BeanUtils.copyProperties(allegadosDto, allegados);
		Integer rs	= allegadosMapper.deleteByPrimaryKey(allegados);
		return rs;
	}
	
	public boolean permiteModificar() throws Exception {
		return allegadosMapper.permiteModificar() > 0;
	}
}
