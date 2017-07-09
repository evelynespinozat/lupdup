package pmp.lupdup.web.csalud.job;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;
import pmp.lupdup.general.util.CadenaUtil;
import pmp.lupdup.general.util.ConfiguracionProperties;

public class FichaResultadosListener implements ServletContextListener {
	
	public void contextInitialized(ServletContextEvent event) {
		try {
			JobDetail jobDetail		= newJob(FichaResultadosJob.class).withIdentity("jobFichaResultados", "groupFichaResultados").build();
			System.out.println("Definido el Job en el listener " + new Date().toString());
			
			String strHoraInicio	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.TIEMPO_NOTIFICACION_CORREO_INICIA_A_LAS);
			Date dteFechaHoraInicio		= CadenaUtil.getDateHoraMinutosFromStr(CadenaUtil.getStrDate(new Date()) + " " + strHoraInicio );
			
			if(dteFechaHoraInicio.getTime() < new Date().getTime()) {
				Calendar calendar	= new GregorianCalendar();
				calendar.setTimeInMillis(CadenaUtil.getDateFromStr(CadenaUtil.getStrDate(new Date())).getTime());
				calendar.add(Calendar.DATE, 1);
				dteFechaHoraInicio		= CadenaUtil.getDateHoraMinutosFromStr(CadenaUtil.getStrDate(calendar.getTime()) + " " + strHoraInicio );
			}
			SimpleTrigger trigger	= newTrigger()
					.withIdentity("triggerCargaDirectorio", "groupCargaDirectorio")
					.startAt(dteFechaHoraInicio)
					.withSchedule(SimpleScheduleBuilder.simpleSchedule()
							.withIntervalInHours(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.TIEMPO_NOTIFICACION_CORREO_EJECUCION_CADA_EN_HORAS))
							.repeatForever())
							.build();
			
			SchedulerFactory schedulerFactory	= new StdSchedulerFactory();
			Scheduler scheduler					= schedulerFactory.getScheduler();
			scheduler.scheduleJob(jobDetail, trigger);
			scheduler.start();
			
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
	
	public void contextDestroyed(ServletContextEvent event) {
		
	}
	
}