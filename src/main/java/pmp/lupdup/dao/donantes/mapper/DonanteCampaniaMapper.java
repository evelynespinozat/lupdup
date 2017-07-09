package pmp.lupdup.dao.donantes.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.donantes.domain.DonanteCampania;
import pmp.lupdup.dao.donantes.domain.DonanteCampaniaKey;
import pmp.lupdup.dao.donantes.domain.DonanteCampaniaParamDef;

@Service
public interface DonanteCampaniaMapper {
	
	public List<DonanteCampania> selectByDefaultParameter(DonanteCampaniaParamDef donanteCampaniaParamDef);
	public DonanteCampania selectByPrimaryKey(DonanteCampaniaKey donanteCampaniaKey);
	public int insertSelective(DonanteCampania donanteCampania);
	public int updateByPrimaryKeySelective(DonanteCampania donanteCampania);
	public int deleteByPrimaryKey(DonanteCampaniaKey donanteCampaniaKey);
	
	
}
