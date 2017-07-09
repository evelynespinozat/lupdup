package pmp.lupdup.dao.donantes.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.donantes.domain.HistorialPuntos;
import pmp.lupdup.dao.donantes.domain.HistorialPuntosKey;
import pmp.lupdup.dao.donantes.domain.HistorialPuntosParamDef;

@Service
public interface HistorialPuntosMapper {
	
	public List<HistorialPuntos> selectByDefaultParameter(HistorialPuntosParamDef historialPuntosParamDef);
	public HistorialPuntos selectByPrimaryKey(HistorialPuntosKey historialPuntosKey);
	public int insertSelective(HistorialPuntos historialPuntos);
	public int updateByPrimaryKeySelective(HistorialPuntos historialPuntos);
	public int deleteByPrimaryKey(HistorialPuntosKey historialPuntosKey);
	
	public int lastSequence();

	
}
