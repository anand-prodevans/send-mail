package marcus.controller;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	
	private JavaMailSender mailSender;
	
	public JavaMailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void sendMail(String name,String emailId,String subject,String msg)
	{
		MimeMessage message =  this.mailSender.createMimeMessage();
		MimeMessageHelper mimeHelper;
		try {
			mimeHelper = new MimeMessageHelper(message,true);
			mimeHelper.setTo(emailId);
			
			
			mimeHelper.setFrom("ssiddu200@gmail.com");
			mimeHelper.setSubject("Password Reset");
			mimeHelper.setText("<html><body>Hi ,"+name+""+emailId+","+subject+","+msg+"</body></html>",true);
			mailSender.send(message);
		} catch (MessagingException e) {
			System.out.println("Error Sending email "+ e.getMessage());
		}
	}
		public void sendMail1(String name,String emailId, String subject, String msg)
		{
			MimeMessage message =  this.mailSender.createMimeMessage();
			MimeMessageHelper mimeHelper;
			try {
				mimeHelper = new MimeMessageHelper(message,true);
				mimeHelper.setTo("anand.prodevans@gmail.com");
				
				
				mimeHelper.setFrom("ssiddu200@gmail.com");
				mimeHelper.setSubject(subject);
				mimeHelper.setText("<html><body><h2>Customer Details</h2><table><tr><th>Name:</th><td> "+name+"</td></tr></th> <tr><th> Email: </th> <td>"+emailId+"</td></tr><tr><th>Subject:</th><td>"+subject+"</td></tr><tr><th>Message: </th><td>"+msg+"</td></tr></table></body></html>",true);
				mailSender.send(message);
			} catch (MessagingException e) {
				System.out.println("Error Sending email "+ e.getMessage());
			}
	}
}
