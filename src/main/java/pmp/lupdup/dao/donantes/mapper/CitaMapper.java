package pmp.lupdup.dao.donantes.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.donantes.domain.Cita;
import pmp.lupdup.dao.donantes.domain.CitaKey;
import pmp.lupdup.dao.donantes.domain.CitaParamDef;

@Service
public interface CitaMapper {
	
	public List<Cita> selectByDefaultParameter(CitaParamDef citaParamDef);
	public Cita selectByPrimaryKey(CitaKey citaKey);
	public int insertSelective(Cita cita);
	public int updateByPrimaryKeySelective(Cita cita);
	public int deleteByPrimaryKey(CitaKey citaKey);
	
	public int lastSequence();

	
}
