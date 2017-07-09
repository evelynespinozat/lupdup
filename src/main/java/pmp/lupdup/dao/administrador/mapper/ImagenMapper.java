package pmp.lupdup.dao.administrador.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.administrador.domain.Imagen;
import pmp.lupdup.dao.administrador.domain.ImagenKey;
import pmp.lupdup.dao.administrador.domain.ImagenParamDef;

@Service
public interface ImagenMapper {
	
	public List<Imagen> selectByDefaultParameter(ImagenParamDef imagenParamDef);
	public Imagen selectByPrimaryKey(ImagenKey imagenKey);
	public int insertSelective(Imagen imagen);
	public int updateByPrimaryKeySelective(Imagen imagen);
	public int deleteByPrimaryKey(ImagenKey imagenKey);
	
	public int lastSequence();

	
}
