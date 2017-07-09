package pmp.lupdup.dao.ecooperante.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import pmp.lupdup.dao.ecooperante.domain.ClubDonanteCampania;
import pmp.lupdup.dao.ecooperante.domain.ClubDonanteCampaniaKey;
import pmp.lupdup.dao.ecooperante.domain.ClubDonanteCampaniaParamDef;

@Service
public interface ClubDonanteCampaniaMapper {
	
	public List<ClubDonanteCampania> selectByDefaultParameter(ClubDonanteCampaniaParamDef clubDonanteCampaniaParamDef);
	public ClubDonanteCampania selectByPrimaryKey(ClubDonanteCampaniaKey clubDonanteCampaniaKey);
	public int insertSelective(ClubDonanteCampania clubDonanteCampania);
	public int updateByPrimaryKeySelective(ClubDonanteCampania clubDonanteCampania);
	public int deleteByPrimaryKey(ClubDonanteCampaniaKey clubDonanteCampaniaKey);
	
	
}
