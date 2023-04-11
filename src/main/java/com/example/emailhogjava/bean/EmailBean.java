package com.example.emailhogjava.bean;

import com.example.emailhogjava.dto.EmailLayout;
import com.example.emailhogjava.model.Email;
import com.example.emailhogjava.service.EmailService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class EmailBean implements Serializable {

    private static final String DESTINATARIO = "tadeu@gmail.com";
    private static final String ASSUNTO = "Mudança de senha!";

    @Inject
    private EmailService emailService;

    public String enviarEmail() {
        emailService.enviar(montarEmail());
        return null;
    }

    private Email montarEmail() {
        EmailLayout layout = new EmailLayout();
        return layout.montarEmailAdministrador(DESTINATARIO, ASSUNTO);
    }

}
