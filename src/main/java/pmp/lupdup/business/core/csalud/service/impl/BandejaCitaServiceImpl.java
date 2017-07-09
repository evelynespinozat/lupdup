package pmp.lupdup.business.core.csalud.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pmp.lupdup.business.core.csalud.dto.BandejaCitaDto;
import pmp.lupdup.business.core.csalud.service.BandejaCitaService;
import pmp.lupdup.business.core.donantes.dto.DetalleFichaDto;
import pmp.lupdup.business.core.donantes.dto.FichaResultadosDto;
import pmp.lupdup.business.core.donantes.dto.HistorialPuntosDto;
import pmp.lupdup.business.core.donantes.service.DetalleFichaService;
import pmp.lupdup.business.core.donantes.service.FichaResultadosService;
import pmp.lupdup.business.core.donantes.service.HistorialPuntosService;
import pmp.lupdup.dao.csalud.domain.BandejaCita;
import pmp.lupdup.dao.csalud.domain.BandejaCitaParamDef;
import pmp.lupdup.dao.csalud.domain.BandejaCitaParamDef.Criteria;
import pmp.lupdup.dao.csalud.mapper.BandejaCitaMapper;
import pmp.lupdup.dao.donantes.domain.DetalleFicha;
import pmp.lupdup.dao.donantes.domain.FichaResultados;
import pmp.lupdup.general.util.CadenaUtil;
import pmp.lupdup.general.util.ConfiguracionProperties;
import pmp.lupdup.general.util.Mail;
import pmp.lupdup.general.util.Mensaje;

@Service
public class BandejaCitaServiceImpl implements BandejaCitaService {
	@Autowired
	private BandejaCitaMapper bandejaCitaMapper;
	
	@Autowired
	private FichaResultadosService fichaResultadosService;
	
	@Autowired
	private DetalleFichaService detalleFichaService;

	@Autowired
	private HistorialPuntosService historialPuntosService;
	
	public List<BandejaCita> buscar(BandejaCitaDto bandejaCitaDto) throws Exception {
		BandejaCitaParamDef bandejaCitaParamDef		= new BandejaCitaParamDef();
		
		Criteria criteria		= bandejaCitaParamDef.createCriteria();
		if(bandejaCitaDto != null) {
			if(bandejaCitaDto.getDteFecCita() != null) {
				criteria.andDteFecCitaEqualTo(bandejaCitaDto.getDteFecCita());
			}
			if(CadenaUtil.getStrNull(bandejaCitaDto.getStrHorCita()) != null) {
				criteria.andStrHorCitaLike(bandejaCitaDto.getStrHorCita());
			}
			if(CadenaUtil.getStrNull(bandejaCitaDto.getStrNomNombre()) != null) {
				criteria.andStrNomNombreLike(bandejaCitaDto.getStrNomNombre());
			}
			if(CadenaUtil.getStrNull(bandejaCitaDto.getStrNomAppaterno()) != null) {
				criteria.andStrNomAppaternoLike(bandejaCitaDto.getStrNomAppaterno());
			}
			if(CadenaUtil.getStrNull(bandejaCitaDto.getStrNomApmaterno()) != null) {
				criteria.andStrNomApmaternoLike(bandejaCitaDto.getStrNomApmaterno());
			}
			if(CadenaUtil.getStrNull(bandejaCitaDto.getStrNumDni()) != null) {
				criteria.andStrNumDniLike(bandejaCitaDto.getStrNumDni());
			}
			if(bandejaCitaDto.getIntIdEstado() != null) {
				criteria.andIntIdEstadoEqualTo(bandejaCitaDto.getIntIdEstado());
			}
			if(bandejaCitaDto.getIntIdSede() != null) {
				criteria.andIntIdSedeEqualTo(bandejaCitaDto.getIntIdSede());
			}
		}
		
		bandejaCitaParamDef.setOrderByClause("fec_cita desc, hor_cita");
		List<BandejaCita>	 list	= bandejaCitaMapper.selectByDefaultParameter(bandejaCitaParamDef);
		return list;
	}
	
	public BandejaCita buscarById(BandejaCitaDto bandejaCitaDto) throws Exception {
		BandejaCita bandejaCita		= new BandejaCita();
		BeanUtils.copyProperties(bandejaCitaDto, bandejaCita);
		return bandejaCitaMapper.selectByPrimaryKey(bandejaCita);
	}
	
	@Transactional
	public Integer guardar(BandejaCitaDto bandejaCitaDto) throws Exception {
		BandejaCita bandejaCita		= new BandejaCita();
		BeanUtils.copyProperties(bandejaCitaDto, bandejaCita);
		int rs	= 0;
		BandejaCita exiteBandejaCita		= bandejaCitaMapper.selectByPrimaryKey(bandejaCita);
		if(exiteBandejaCita != null) {
			rs	= bandejaCitaMapper.updateByPrimaryKeySelective(bandejaCita);
		} else {
			rs	= bandejaCitaMapper.insertSelective(bandejaCita);
			
			Integer srlIdCita	= bandejaCitaMapper.lastSequence();
			bandejaCitaDto.setSrlIdCita(srlIdCita);

		}
		return rs;
	}
	
	@Transactional
	public Integer guardarFicha(FichaResultadosDto edicion_fichaResultadosDto, DetalleFichaDto edicion_detalleFichaDto) throws Exception {
		edicion_fichaResultadosDto.setIntIdCita(edicion_fichaResultadosDto.getIntIdCita());
		fichaResultadosService.guardar(edicion_fichaResultadosDto);
		
		edicion_detalleFichaDto.setIntIdFicha(edicion_fichaResultadosDto.getSrlIdFicha());
		detalleFichaService.guardar(edicion_detalleFichaDto);
		
		BandejaCitaDto bandejaCitaDto		= new BandejaCitaDto();
		bandejaCitaDto.setSrlIdCita(edicion_fichaResultadosDto.getIntIdCita());
		BandejaCita bandejaCita				= buscarById(bandejaCitaDto);
		if(bandejaCita != null) {
			BandejaCitaDto edicion_bandejaCitaDto		= new BandejaCitaDto();
			BeanUtils.copyProperties(bandejaCita, edicion_bandejaCitaDto);
			edicion_bandejaCitaDto.setIntIdEstado(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_ESTADO_CITA_DONANTE_RESULTADO));
			guardar(edicion_bandejaCitaDto);
		}
		
		HistorialPuntosDto historialPuntosDto	= new HistorialPuntosDto();
		historialPuntosDto.setIntIdDonante(bandejaCita.getIntIdDonante());
		historialPuntosDto.setDteFecPunto(new Date());
		historialPuntosDto.setIntCntPuntoganado(edicion_fichaResultadosDto.getIntNumUnidades() * 10);
		historialPuntosDto.setIntCntPuntoperdido(0);
		historialPuntosDto.setIntIndTipopunto(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_TIPO_HISTORIAL_PUNTOS_GANADOS));
		historialPuntosService.guardar(historialPuntosDto);
		
		return 1;
	}

	public void enviarNotificacionCorreo() throws Exception {
		try {
			System.out.println("***** INICIANDO NOTIFICACIONES POR CORREO *****");
			String strCorreoAsunto	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.MAIL_RESULTADOS_ASUNTO);
			String strCorreoCuerpo	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.MAIL_RESULTADOS_CUERPO);
			BandejaCitaDto bandejaCitaDto		= new BandejaCitaDto();
			bandejaCitaDto.setIntIdEstado(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_ESTADO_CITA_DONANTE_RESULTADO));
			List<BandejaCita> listBandejaCita	= buscar(bandejaCitaDto);
			if(listBandejaCita != null && listBandejaCita.size() > 0) {
				for(int i = 0;i < listBandejaCita.size();i++) {
					BandejaCita bandejaCita		= listBandejaCita.get(i);
					String strNombre	= bandejaCita.getStrNomNombre() + " " + bandejaCita.getStrNomAppaterno() + " " + bandejaCita.getStrNomApmaterno();
					strCorreoCuerpo		= CadenaUtil.reemplazarStr(strCorreoCuerpo, "[[NOMBRE_DONANTE]]", strNombre);
					Mensaje mensaje		= new Mensaje();
					mensaje.setStrAsunto(strCorreoAsunto);
					mensaje.setStrCuerpo(strCorreoCuerpo);
					mensaje.setStrPara(bandejaCita.getStrDesCorreo());
					Mail mail = new Mail();
					String strFileSalida	= generarPDF(bandejaCita.getSrlIdCita());
					if(mail.sendInterno(mensaje, strFileSalida)) {
						bandejaCitaDto	= new BandejaCitaDto();
						BeanUtils.copyProperties(bandejaCita, bandejaCitaDto);
						bandejaCitaDto.setIntIdEstado(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CATALOGO_ESTADO_CITA_DONANTE_CORREO));
						guardar(bandejaCitaDto);
					}
				}
			}
			System.out.println("***** FINALIZANDO NOTIFICACIONES POR CORREO *****");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new BandejaCitaServiceImpl().generarPDF(0);
	}
	
	public String generarPDF(Integer intIdCita) {
		String strFileSalida	= "";
		try {
			Map fichaResultadosMap	= new HashMap();
			FichaResultadosDto fichaResultadosDto	= new FichaResultadosDto();
			fichaResultadosDto.setIntIdCita(intIdCita);
			List<FichaResultados> listFichaResultados	= fichaResultadosService.buscar(fichaResultadosDto);
			FichaResultados fichaResultados	= null;
			if(listFichaResultados.size() > 0) {
				fichaResultados			= listFichaResultados.get(0);
//				BeanUtils.copyProperties(fichaResultados, fichaResultadosMap);
//				org.apache.commons.beanutils.BeanUtils.populate(fichaResultados, fichaResultadosMap);
				ObjectMapper m = new ObjectMapper();
				Map<String,Object> props = m.convertValue(fichaResultados, Map.class);
				
				fichaResultadosMap.putAll(props);
				
				DetalleFichaDto detalleFichaDto			= new DetalleFichaDto();
				detalleFichaDto.setIntIdFicha(fichaResultados.getSrlIdFicha());
				List<DetalleFicha> listDetalleFicha		= detalleFichaService.buscar(detalleFichaDto);
				DetalleFicha detalleFicha	= null;
				if(listDetalleFicha.size() > 0) {
					detalleFicha			= listDetalleFicha.get(0);
//					BeanUtils.copyProperties(detalleFicha, fichaResultadosMap);
//					org.apache.commons.beanutils.BeanUtils.populate(detalleFicha, fichaResultadosMap);
					Map<String,Object> props2 = m.convertValue(detalleFicha, Map.class);
					fichaResultadosMap.putAll(props2);

					
					String strRutaBase	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.RUTA_BASE_REPOSITORIO);
					List<Map> records	= new ArrayList<Map>();
					InputStream reportC1 = getClass().getResourceAsStream("/reporteFichaResultados.jasper");
					Map params		= new HashMap();
					params.put("parametro.strNombreCompleto", fichaResultados.getStrNombreCompletoDonante());
					
					Iterator<String> ite	= fichaResultadosMap.keySet().iterator();
					String key		= "";
					while(ite.hasNext()) {
						key			= ite.next();
						fichaResultadosMap.put(key, CadenaUtil.getStr(fichaResultadosMap.get(key)));
					}
					records.add(fichaResultadosMap);
					
					byte[] bytes			= JasperRunManager.runReportToPdf(reportC1, params, new JRBeanCollectionDataSource(records));
					strFileSalida			= strRutaBase + File.separator + "reporte_"+CadenaUtil.getStrDateHoraMinutosTodoJunto(new Date())+".pdf";
					FileOutputStream fos	= new FileOutputStream(strFileSalida);
					fos.write(bytes);
					fos.flush();
					fos.close();
				}
			}

			//PdfReader doc = new PdfReader(bytes);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return strFileSalida;
	}
	
	@Transactional
	public Integer eliminar(BandejaCitaDto bandejaCitaDto) throws Exception {
		BandejaCita bandejaCita		= new BandejaCita();
		BeanUtils.copyProperties(bandejaCitaDto, bandejaCita);
		Integer rs	= bandejaCitaMapper.deleteByPrimaryKey(bandejaCita);
		return rs;
	}
	
}
