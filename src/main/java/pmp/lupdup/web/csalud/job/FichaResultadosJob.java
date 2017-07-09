package pmp.lupdup.web.csalud.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pmp.lupdup.business.core.csalud.service.BandejaCitaService;
import pmp.lupdup.general.util.SpringContextUtil;

public class FichaResultadosJob implements Job {
	private BandejaCitaService bandejaCitaService;
	
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			SpringContextUtil.setCtx(context);
			new FichaResultadosJob().execute(null);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		try {
			if (bandejaCitaService == null) {
				ApplicationContext contextAC = new ClassPathXmlApplicationContext("applicationContext.xml");
				SpringContextUtil.setCtx(contextAC);
				ApplicationContext appContext = SpringContextUtil.getCtx();
				bandejaCitaService				= (BandejaCitaService) appContext.getBean("bandejaCitaServiceImpl");
			}
			bandejaCitaService.enviarNotificacionCorreo();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
