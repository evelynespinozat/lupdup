package pmp.lupdup.general.util;

import java.util.ArrayList;
import java.util.List;

public class ConfiguracionProperties {
	public static String RUTA_BASE_REPOSITORIO								= "ruta_base_repositorio";
	public static String CATALOGO_ESTADO_CIVIL								= "catalogo_estado_civil";
	public static String CATALOGO_SEXO										= "catalogo_sexo";
	public static String CATALOGO_GRADO_INSTRUCCION							= "catalogo_grado_instruccion";
	public static String CATALOGO_SI_NO										= "catalogo_si_no";
	public static String CATALOGO_TIPO_CUESTIONARIO							= "catalogo_tipo_cuestionario";
	public static String CATALOGO_ESTADO_CITA_DONANTE						= "catalogo_estado_cita_donante";
	public static String CATALOGO_ESTADO_CITA_DONANTE_PROGRAMADO			= "catalogo_estado_cita_donante_programado";
	public static String CATALOGO_ESTADO_CITA_DONANTE_ASISTIO				= "catalogo_estado_cita_donante_asistio";
	public static String CATALOGO_ESTADO_CITA_DONANTE_RESULTADO				= "catalogo_estado_cita_donante_resultado";
	public static String CATALOGO_ESTADO_CITA_DONANTE_CORREO				= "catalogo_estado_cita_donante_correo";
	
	public static String CATALOGO_ESTADO_DONANTE_CAMPANIA					= "catalogo_estado_donante_campania";
	public static String CATALOGO_ESTADO_DONANTE_CAMPANIA_SEPARADO			= "catalogo_estado_donante_campania_separado";
	public static String CATALOGO_ESTADO_DONANTE_CAMPANIA_ATENDIDO			= "catalogo_estado_donante_campania_atendido";
	
	public static String CATALOGO_TIPO_HISTORIAL_PUNTOS						= "catalogo_tipo_historial_puntos";
	public static String CATALOGO_TIPO_HISTORIAL_PUNTOS_GANADOS				= "catalogo_tipo_historial_puntos_ganados";
	public static String CATALOGO_TIPO_HISTORIAL_PUNTOS_PERDIDOS			= "catalogo_tipo_historial_puntos_perdidos";
	
	public static String CATALOGO_TIPO_ALLEGADO								= "catalogo_tipo_allegado";
	
	public static String TIEMPO_NOTIFICACION_CORREO_INICIA_A_LAS			= "tiempo_notificacion_correo_inicia_a_las";
	public static String TIEMPO_NOTIFICACION_CORREO_EJECUCION_CADA_EN_HORAS	= "tiempo_notificacion_correo_ejecucion_cada_en_horas";
	
	public static String MAIL_RESULTADOS_ASUNTO								= "mail_resultados_asunto";
	public static String MAIL_RESULTADOS_CUERPO								= "mail_resultados_cuerpo";
	
	public static String MAIL_USUARIO										= "mail_usuario";
	public static String MAIL_PASSWORD										= "mail_password";
	public static String MAIL_SMTP											= "mail_smtp";
	public static String MAIL_PUERTO										= "mail_puerto";
	
	public static String PERFIL_DONANTE										= "perfil_donante";
	public static String PERFIL_ADMINISTRADOR								= "perfil_administrador";
	public static String PERFIL_CENTRO_SALUD								= "perfil_centro_salud";
	public static String PERFIL_ENTIDAD_COOPERANTE							= "perfil_entidad_cooperante";
	
	public static List<String> getConstanteList(String strParam) {
		List<String> list	= new ArrayList<String>();
		int intIdContador	= 0;
		while(true) {
			String strValue	= getConstanteStr(strParam + CadenaUtil.llenarPorIzquierda(String.valueOf(intIdContador), 2, "0") );
			if(strValue.equals("")) {
				break;
			}
			intIdContador++;
			list.add(strValue);
		}
		return list;
	}
	
	public static int getConstanteInt(String strParam) {
		return CadenaUtil.getInte(ConfiguracionProperties.getParametro("configuracion", strParam));
	}
	
	public static String getConstanteStr(String strParam) {
		return CadenaUtil.getStr(ConfiguracionProperties.getParametro("configuracion", strParam));
	}
	
	private static String getParametro(String file, String paramName) {
		return ObtienePoperties.getParametro(file, paramName);
	}
	
}