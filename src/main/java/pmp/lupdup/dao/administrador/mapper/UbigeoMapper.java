package pmp.lupdup.dao.administrador.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.administrador.domain.Ubigeo;
import pmp.lupdup.dao.administrador.domain.UbigeoKey;
import pmp.lupdup.dao.administrador.domain.UbigeoParamDef;

@Service
public interface UbigeoMapper {
	
	public List<Ubigeo> selectByDefaultParameter(UbigeoParamDef ubigeoParamDef);
	public Ubigeo selectByPrimaryKey(UbigeoKey ubigeoKey);
	public int insertSelective(Ubigeo ubigeo);
	public int updateByPrimaryKeySelective(Ubigeo ubigeo);
	public int deleteByPrimaryKey(UbigeoKey ubigeoKey);
	
	public int lastSequence();

	
}
