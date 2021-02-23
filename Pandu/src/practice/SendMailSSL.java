package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;  
class SendMailSSL{    
	 public static void main(String[] args) throws IOException {   
		 InputStreamReader obj = new InputStreamReader(System.in);
		 BufferedReader br = new BufferedReader(obj);
		 System.out.print("Enter your Email: ");
		 String name = br.readLine();
		 System.out.print("Enter your Mail Password: ");
		 String password=br.readLine();
		 System.out.print("Enter another person Email: ");
		 String name1 = br.readLine();
		 System.out.print("Enter Subject: ");
		 String sub = br.readLine();
		 System.out.print("Enter your Message: ");
		 String msg = br.readLine();
		 Mail.send(name,password,name1,sub,msg);    
	 }    
	}    

class Mail{ 
	
    public static void send(String from,String password,String to,String sub,String msg){   
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
        //  props.put("mail.smtp.port", "465");    
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(from,password);  
           }    
          });    
             
          try {   
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
           message.setSubject(sub);    
           message.setText(msg);    
           Transport.send(message);    
           System.out.println("message sent successfully");
          } catch (MessagingException e) {throw new RuntimeException(e);}    
             
    }  
}  

