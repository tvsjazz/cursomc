package com.siqueira.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.siqueira.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
