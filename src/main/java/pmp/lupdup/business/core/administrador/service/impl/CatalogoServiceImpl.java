package pmp.lupdup.business.core.administrador.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.administrador.dto.CatalogoDto;
import pmp.lupdup.business.core.administrador.service.CatalogoService;
import pmp.lupdup.dao.administrador.domain.Catalogo;
import pmp.lupdup.dao.administrador.domain.CatalogoParamDef;
import pmp.lupdup.dao.administrador.domain.CatalogoParamDef.Criteria;
import pmp.lupdup.dao.administrador.mapper.CatalogoMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class CatalogoServiceImpl implements CatalogoService {
	@Autowired
	private CatalogoMapper catalogoMapper;
	public List<Catalogo> buscar(CatalogoDto catalogoDto) throws Exception {
		CatalogoParamDef catalogoParamDef		= new CatalogoParamDef();
		
		Criteria criteria		= catalogoParamDef.createCriteria();
		if(catalogoDto != null) {
			if(CadenaUtil.getStrNull(catalogoDto.getStrDesIndicador()) != null) {
				criteria.andStrDesIndicadorLike(catalogoDto.getStrDesIndicador());
			}
			if(CadenaUtil.getStrNull(catalogoDto.getStrNomIndicador()) != null) {
				criteria.andStrNomIndicadorLike(catalogoDto.getStrNomIndicador());
			}
			if(CadenaUtil.getStrNull(catalogoDto.getStrNomAbreviatura()) != null) {
				criteria.andStrNomAbreviaturaLike(catalogoDto.getStrNomAbreviatura());
			}
			if(CadenaUtil.getInteNull(catalogoDto.getIntNumValor()) != null) {
				criteria.andIntNumValorEqualTo(catalogoDto.getIntNumValor());
			}
			if(CadenaUtil.getInteNull(catalogoDto.getIntCodIndicador()) != null) {
				criteria.andIntCodIndicadorEqualTo(catalogoDto.getIntCodIndicador());
			}
		}
		
		catalogoParamDef.setOrderByClause("1");
		List<Catalogo>	 list	= catalogoMapper.selectByDefaultParameter(catalogoParamDef);
		return list;
	}
	
	public Catalogo buscarById(CatalogoDto catalogoDto) throws Exception {
		Catalogo catalogo		= new Catalogo();
		BeanUtils.copyProperties(catalogoDto, catalogo);
		return catalogoMapper.selectByPrimaryKey(catalogo);
	}
	
	@Transactional
	public Integer guardar(CatalogoDto catalogoDto) throws Exception {
		Catalogo catalogo		= new Catalogo();
		BeanUtils.copyProperties(catalogoDto, catalogo);
		int rs	= 0;
		Catalogo exiteCatalogo		= catalogoMapper.selectByPrimaryKey(catalogo);
		if(exiteCatalogo != null) {
			rs	= catalogoMapper.updateByPrimaryKeySelective(catalogo);
		} else {
			rs	= catalogoMapper.insertSelective(catalogo);
			
			Integer srlIdCatalogo	= catalogoMapper.lastSequence();
			catalogoDto.setSrlIdCatalogo(srlIdCatalogo);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(CatalogoDto catalogoDto) throws Exception {
		Catalogo catalogo		= new Catalogo();
		BeanUtils.copyProperties(catalogoDto, catalogo);
		Integer rs	= catalogoMapper.deleteByPrimaryKey(catalogo);
		return rs;
	}
	
}
