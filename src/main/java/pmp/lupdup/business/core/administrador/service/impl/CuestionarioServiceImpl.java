package pmp.lupdup.business.core.administrador.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.administrador.dto.CuestionarioDto;
import pmp.lupdup.business.core.administrador.service.CuestionarioService;
import pmp.lupdup.dao.administrador.domain.Cuestionario;
import pmp.lupdup.dao.administrador.domain.CuestionarioParamDef;
import pmp.lupdup.dao.administrador.domain.CuestionarioParamDef.Criteria;
import pmp.lupdup.dao.administrador.mapper.CuestionarioMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class CuestionarioServiceImpl implements CuestionarioService {
	@Autowired
	private CuestionarioMapper cuestionarioMapper;
	public List<Cuestionario> buscar(CuestionarioDto cuestionarioDto) throws Exception {
		CuestionarioParamDef cuestionarioParamDef		= new CuestionarioParamDef();
		
		Criteria criteria		= cuestionarioParamDef.createCriteria();
		if(cuestionarioDto != null) {
			if(CadenaUtil.getStrNull(cuestionarioDto.getStrDesCuestionario()) != null) {
				criteria.andStrDesCuestionarioLike(cuestionarioDto.getStrDesCuestionario());
			}
			if(CadenaUtil.getInteNull(cuestionarioDto.getIntIndTipo()) != null) {
				criteria.andIntIndTipoEqualTo(cuestionarioDto.getIntIndTipo());
			}
		}
		
		cuestionarioParamDef.setOrderByClause("1");
		List<Cuestionario>	 list	= cuestionarioMapper.selectByDefaultParameter(cuestionarioParamDef);
		return list;
	}
	
	public Cuestionario buscarById(CuestionarioDto cuestionarioDto) throws Exception {
		Cuestionario cuestionario		= new Cuestionario();
		BeanUtils.copyProperties(cuestionarioDto, cuestionario);
		return cuestionarioMapper.selectByPrimaryKey(cuestionario);
	}
	
	@Transactional
	public Integer guardar(CuestionarioDto cuestionarioDto) throws Exception {
		Cuestionario cuestionario		= new Cuestionario();
		BeanUtils.copyProperties(cuestionarioDto, cuestionario);
		int rs	= 0;
		Cuestionario exiteCuestionario		= cuestionarioMapper.selectByPrimaryKey(cuestionario);
		if(exiteCuestionario != null) {
			rs	= cuestionarioMapper.updateByPrimaryKeySelective(cuestionario);
		} else {
			rs	= cuestionarioMapper.insertSelective(cuestionario);
			
			Integer srlIdCuestionario	= cuestionarioMapper.lastSequence();
			cuestionarioDto.setSrlIdCuestionario(srlIdCuestionario);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(CuestionarioDto cuestionarioDto) throws Exception {
		Cuestionario cuestionario		= new Cuestionario();
		BeanUtils.copyProperties(cuestionarioDto, cuestionario);
		Integer rs	= cuestionarioMapper.deleteByPrimaryKey(cuestionario);
		return rs;
	}
	
}
