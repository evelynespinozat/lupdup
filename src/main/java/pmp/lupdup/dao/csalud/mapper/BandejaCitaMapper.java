package pmp.lupdup.dao.csalud.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.csalud.domain.BandejaCita;
import pmp.lupdup.dao.csalud.domain.BandejaCitaKey;
import pmp.lupdup.dao.csalud.domain.BandejaCitaParamDef;

@Service
public interface BandejaCitaMapper {
	
	public List<BandejaCita> selectByDefaultParameter(BandejaCitaParamDef bandejaCitaParamDef);
	public BandejaCita selectByPrimaryKey(BandejaCitaKey bandejaCitaKey);
	public int insertSelective(BandejaCita bandejaCita);
	public int updateByPrimaryKeySelective(BandejaCita bandejaCita);
	public int deleteByPrimaryKey(BandejaCitaKey bandejaCitaKey);
	
	public int lastSequence();

	
}
