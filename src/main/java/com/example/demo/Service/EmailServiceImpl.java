package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl {
   private final JavaMailSender mailSender;
	 private MimeMessage message;
	 private MimeMessageHelper helper;

	    @Autowired
	    public EmailServiceImpl(JavaMailSender mailSender) {
	        this.mailSender = mailSender;
		}
	    public boolean sendEmail() throws MessagingException {
	        try {
	        	message = mailSender.createMimeMessage();
	            helper = new MimeMessageHelper(message, true);
	            helper.setTo("aaryan14032006@gmail.com");
	            helper.setSubject("ok test");
	            helper.setText("hi");
	            mailSender.send(message);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }
}