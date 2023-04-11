package com.example.emailhogjava.dto;

import com.example.emailhogjava.model.Email;

public class EmailLayout {

    private static final String QUEBRA_LINHA_DUPLA = "<br><br>";
    private static final String QUEBRA_LINHA_UNICA = "<br>";

    public Email montarEmailAdministrador(String destinatario, String assunto) {
        StringBuilder texto = new StringBuilder();

        texto.append("A/C Administrador");
        texto.append(QUEBRA_LINHA_DUPLA);

        texto.append("Solicito alteração de senha do sistema!");
        texto.append(QUEBRA_LINHA_DUPLA);

        gerarAssinatura(texto);

        gerarRodape(texto);

        return new Email(destinatario, assunto, texto.toString());
    }

    private String gerarAssinatura(StringBuilder texto) {
        texto.append("Att.:");
        texto.append(QUEBRA_LINHA_UNICA);
        texto.append("Operador de Caixa");
        texto.append(QUEBRA_LINHA_DUPLA);
        return texto.toString();
    }

    private String gerarRodape(StringBuilder texto) {
        return texto.append("E-mail automático. Favor não responder.").toString();
    }

}
