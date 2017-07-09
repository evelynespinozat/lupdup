package pmp.lupdup.business.core.administrador.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.administrador.dto.UbigeoDto;
import pmp.lupdup.business.core.administrador.service.UbigeoService;
import pmp.lupdup.dao.administrador.domain.Ubigeo;
import pmp.lupdup.dao.administrador.domain.UbigeoParamDef;
import pmp.lupdup.dao.administrador.domain.UbigeoParamDef.Criteria;
import pmp.lupdup.dao.administrador.mapper.UbigeoMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class UbigeoServiceImpl implements UbigeoService {
	@Autowired
	private UbigeoMapper ubigeoMapper;
	public List<Ubigeo> buscar(UbigeoDto ubigeoDto) throws Exception {
		UbigeoParamDef ubigeoParamDef		= new UbigeoParamDef();
		
		Criteria criteria		= ubigeoParamDef.createCriteria();
		if(ubigeoDto != null) {
			if(ubigeoDto.getIntIdDepartamento() != null) {
				if(CadenaUtil.getInte(ubigeoDto.getIntIdDepartamento()) >= 0) {
					criteria.andIntIdDepartamentoEqualTo(ubigeoDto.getIntIdDepartamento());
				} else if(CadenaUtil.getInte(ubigeoDto.getIntIdDepartamento()) == Integer.MIN_VALUE) {
					criteria.andIntIdDepartamentoNotEqualTo(0);
				}
			}
			if(ubigeoDto.getIntIdProvincia() != null) {
				if(CadenaUtil.getInte(ubigeoDto.getIntIdProvincia()) >= 0) {
					criteria.andIntIdProvinciaEqualTo(ubigeoDto.getIntIdProvincia());
				} else if(CadenaUtil.getInte(ubigeoDto.getIntIdProvincia()) == Integer.MIN_VALUE) {
					criteria.andIntIdProvinciaNotEqualTo(0);
				}
			}
			if(ubigeoDto.getIntIdDistrito() != null) {
				if(CadenaUtil.getInte(ubigeoDto.getIntIdDistrito()) >= 0) {
					criteria.andIntIdDistritoEqualTo(ubigeoDto.getIntIdDistrito());
				} else if(CadenaUtil.getInte(ubigeoDto.getIntIdDistrito()) == Integer.MIN_VALUE) {
					criteria.andIntIdDistritoNotEqualTo(0);
				}
			}
			if(CadenaUtil.getStrNull(ubigeoDto.getStrDesUbigeo()) != null) {
				criteria.andStrDesUbigeoLike(ubigeoDto.getStrDesUbigeo());
			}
		}
		
		ubigeoParamDef.setOrderByClause("des_ubigeo");
		List<Ubigeo>	 list	= ubigeoMapper.selectByDefaultParameter(ubigeoParamDef);
		return list;
	}
	
	public Ubigeo buscarById(UbigeoDto ubigeoDto) throws Exception {
		Ubigeo ubigeo		= new Ubigeo();
		BeanUtils.copyProperties(ubigeoDto, ubigeo);
		return ubigeoMapper.selectByPrimaryKey(ubigeo);
	}
	
	@Transactional
	public Integer guardar(UbigeoDto ubigeoDto) throws Exception {
		Ubigeo ubigeo		= new Ubigeo();
		BeanUtils.copyProperties(ubigeoDto, ubigeo);
		int rs	= 0;
		Ubigeo exiteUbigeo		= ubigeoMapper.selectByPrimaryKey(ubigeo);
		if(exiteUbigeo != null) {
			rs	= ubigeoMapper.updateByPrimaryKeySelective(ubigeo);
		} else {
			rs	= ubigeoMapper.insertSelective(ubigeo);
			
			Integer srlIdUbigeo	= ubigeoMapper.lastSequence();
			ubigeoDto.setSrlIdUbigeo(srlIdUbigeo);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(UbigeoDto ubigeoDto) throws Exception {
		Ubigeo ubigeo		= new Ubigeo();
		BeanUtils.copyProperties(ubigeoDto, ubigeo);
		Integer rs	= ubigeoMapper.deleteByPrimaryKey(ubigeo);
		return rs;
	}
	
}
