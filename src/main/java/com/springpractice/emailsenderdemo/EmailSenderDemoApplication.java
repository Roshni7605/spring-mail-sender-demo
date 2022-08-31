package com.springpractice.emailsenderdemo;

import com.springpractice.emailsenderdemo.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderDemoApplication {

	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailSenderDemoApplication.class, args);
	}

	@EventListener(ApplicationEvent.class)
	public void sendEmail(){
		emailSenderService.sendEmail("receiveraddress@gmail.com", "This is the Subject", "This is the body of mail");
	}

}
