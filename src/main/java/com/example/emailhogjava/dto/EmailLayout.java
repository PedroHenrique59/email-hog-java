package com.example.emailhogjava.dto;

import com.example.emailhogjava.model.Email;

public class EmailLayout {

    public Email montarEmailAdministrador(String destinatario, String assunto) {
        StringBuilder texto = new StringBuilder();

        return new Email(destinatario, assunto, texto.toString());

    }

}
