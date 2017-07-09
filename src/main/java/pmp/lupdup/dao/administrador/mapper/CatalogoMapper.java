package pmp.lupdup.dao.administrador.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.administrador.domain.Catalogo;
import pmp.lupdup.dao.administrador.domain.CatalogoKey;
import pmp.lupdup.dao.administrador.domain.CatalogoParamDef;

@Service
public interface CatalogoMapper {
	
	public List<Catalogo> selectByDefaultParameter(CatalogoParamDef catalogoParamDef);
	public Catalogo selectByPrimaryKey(CatalogoKey catalogoKey);
	public int insertSelective(Catalogo catalogo);
	public int updateByPrimaryKeySelective(Catalogo catalogo);
	public int deleteByPrimaryKey(CatalogoKey catalogoKey);
	
	public int lastSequence();

	
}
