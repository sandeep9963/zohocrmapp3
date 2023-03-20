package com.zohocrm.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendEmail(String to, String sub, String emailBody) {
		SimpleMailMessage m = new SimpleMailMessage();
		m.setTo(to);
		m.setSubject(sub);
		m.setText(emailBody);
		javaMailSender.send(m);
	}

}
