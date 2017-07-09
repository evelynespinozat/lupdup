package pmp.lupdup.general.util;

import java.io.File;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Mail {
	
	public boolean sendInterno(Mensaje mensaje, String strFileAdjunto) {
		try {
			final String mail_envia_usuario		= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.MAIL_USUARIO);
			final String mail_envia_password	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.MAIL_PASSWORD);
			String mail_smtp				= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.MAIL_SMTP);
			String mail_port				= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.MAIL_PUERTO);
			
//			Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			
			// Propiedades de la conexi�n
			Properties props = new Properties();
			props.setProperty("mail.smtp.host", mail_smtp);
			props.setProperty("mail.smtp.user", mail_envia_usuario);
			props.setProperty("mail.smtp.auth", "true");
			if(mail_smtp.indexOf("gmail") != -1) {
				props.setProperty("mail.smtp.starttls.enable", "true");
				props.setProperty("mail.smtp.socketFactory.port", mail_port);
				props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
				props.setProperty("mail.smtp.socketFactory.fallback", "false");
				props.setProperty("mail.smtp.quitwait", "false");
			} else {
				props.setProperty("mail.smtp.starttls.enable", "false");
			}
			props.setProperty("mail.smtp.password", mail_envia_password);
			props.setProperty("mail.smtp.port", mail_port);
			
			// Preparamos la sesi�n
			Session varSession		= Session.getDefaultInstance(props, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(mail_envia_usuario,mail_envia_password);
				}
	        });
			
			// Construimos el mensaje
			MimeMessage message		= new MimeMessage(varSession);
			message.setFrom(new InternetAddress(mail_envia_usuario));
			
			String[] mailsPara = mensaje.getStrPara().split(",");
			for(String mail:mailsPara) {
				message.addRecipient(
						Message.RecipientType.TO,
						new InternetAddress(mail));
			}
			message.setSubject(mensaje.getStrAsunto());
//			message.setText("Welcome to JavaMail", "UTF-8", "text/html");
//			message.setContent(mensaje.getStrCuerpo(), "text/html");
			
			MimeBodyPart textPart = new MimeBodyPart();
			textPart.setHeader("Content-Type", "text/plain; charset=\"utf-8\"");
			textPart.setContent(mensaje.getStrCuerpo(), "text/html; charset=utf-8");
//			textPart.setContent("<html><body>"+mensaje.getStrCuerpo()+"</body></html>", "text/html; charset=utf-8");
//			textPart.setContent(mensaje.getStrCuerpo(), "text/html; charset=utf-8");
			
			MimeMultipart multipart = new MimeMultipart("mixed");
			multipart.addBodyPart(textPart);
			
//			MimeBodyPart imageBodypart	= new MimeBodyPart();
//			if(!CadenaUtil.getStr(strIdHtml).equals("")) {
//				FileDataSource fileDs	= new FileDataSource(filAdjunto.getAbsoluteFile());
//				imageBodypart.setDataHandler(new DataHandler(fileDs));
//				imageBodypart.setHeader("Content-ID", "<"+strIdHtml+">");
//				imageBodypart.setDisposition(MimeBodyPart.INLINE);
//				multipart.addBodyPart(imageBodypart);
//			}
			
			
			/*
			{
				BodyPart adjunto = new MimeBodyPart();
				adjunto.setDataHandler(new DataHandler(new FileDataSource(rutaRepositorio+"img"+File.separator+"logo"+File.separator+"logo_reservasdebiosfera-sp-01.jpg")));
				adjunto.setHeader("Content-ID", "<Logo01>");
				adjunto.setDisposition(MimeBodyPart.INLINE);
				multipart.addBodyPart(adjunto);
			}
			{
				BodyPart adjunto = new MimeBodyPart();
				adjunto.setDataHandler(new DataHandler(new FileDataSource(rutaRepositorio+"img"+File.separator+"logo"+File.separator+"LOGO_UNESCO-MAB_sp-color.jpg")));
				adjunto.setHeader("Content-ID", "<Logo03>");
				adjunto.setDisposition(MimeBodyPart.INLINE);
				multipart.addBodyPart(adjunto);
			}
			*/
			
			if(CadenaUtil.getStrNull(strFileAdjunto) != null) {
				BodyPart adjunto = new MimeBodyPart();
				adjunto.setDataHandler(new DataHandler(new FileDataSource(strFileAdjunto)));
				adjunto.setFileName(new File(strFileAdjunto).getName());
				multipart.addBodyPart(adjunto);
			}
			
			message.setContent(multipart);
			Transport t		= varSession.getTransport("smtp");
			t.connect(mail_envia_usuario, mail_envia_password);
			t.sendMessage(message, message.getAllRecipients());
			t.close();
			System.out.println("Mail: ["+mensaje.getStrPara()+"] SEND OK");
			return true;
		} catch (Exception e) {
			System.out.println("OCURRIO UN ERROR ENVIANDO NOTIFICACION DE CORREO: ");
			e.printStackTrace();
			return false;
		}
	}

	public void sendInternoThread(final Mensaje mensaje) {
		Thread proceso = new Thread() {
			public void run() {
				sendInterno(mensaje, null);
			}
		};
		proceso.start();
	}
	
}
