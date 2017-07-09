package pmp.lupdup.business.core.administrador.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pmp.lupdup.business.core.administrador.dto.ImagenDto;
import pmp.lupdup.business.core.administrador.service.ImagenService;
import pmp.lupdup.dao.administrador.domain.Imagen;
import pmp.lupdup.dao.administrador.domain.ImagenParamDef;
import pmp.lupdup.dao.administrador.domain.ImagenParamDef.Criteria;
import pmp.lupdup.dao.administrador.mapper.ImagenMapper;
import pmp.lupdup.general.util.CadenaUtil;

@Service
public class ImagenServiceImpl implements ImagenService {
	@Autowired
	private ImagenMapper imagenMapper;
	public List<Imagen> buscar(ImagenDto imagenDto) throws Exception {
		ImagenParamDef imagenParamDef		= new ImagenParamDef();
		
		Criteria criteria		= imagenParamDef.createCriteria();
		if(imagenDto != null) {
			if(CadenaUtil.getStrNull(imagenDto.getStrNomDescripcion()) != null) {
				criteria.andStrNomDescripcionLike(imagenDto.getStrNomDescripcion());
			}
			if(CadenaUtil.getStrNull(imagenDto.getStrNomCodigo()) != null) {
				criteria.andStrNomCodigoEqualTo(imagenDto.getStrNomCodigo());
			}
		}
		
		imagenParamDef.setOrderByClause("1");
		List<Imagen>	 list	= imagenMapper.selectByDefaultParameter(imagenParamDef);
		return list;
	}
	
	public Imagen buscarById(ImagenDto imagenDto) throws Exception {
		Imagen imagen		= new Imagen();
		BeanUtils.copyProperties(imagenDto, imagen);
		return imagenMapper.selectByPrimaryKey(imagen);
	}
	
	@Transactional
	public Integer guardar(ImagenDto imagenDto) throws Exception {
		Imagen imagen		= new Imagen();
		BeanUtils.copyProperties(imagenDto, imagen);
		int rs	= 0;
		Imagen exiteImagen		= imagenMapper.selectByPrimaryKey(imagen);
		if(exiteImagen != null) {
			rs	= imagenMapper.updateByPrimaryKeySelective(imagen);
		} else {
			rs	= imagenMapper.insertSelective(imagen);
			
			Integer srlIdImagen	= imagenMapper.lastSequence();
			imagenDto.setSrlIdImagen(srlIdImagen);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(ImagenDto imagenDto) throws Exception {
		Imagen imagen		= new Imagen();
		BeanUtils.copyProperties(imagenDto, imagen);
		Integer rs	= imagenMapper.deleteByPrimaryKey(imagen);
		return rs;
	}
	
}
