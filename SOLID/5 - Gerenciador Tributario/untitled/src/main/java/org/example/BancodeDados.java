package org.example;

public class BancodeDados implements IMecanismoRegistro {

    @Override
    public void registra(int ano, int mes, double valor) {
        System.out.println("Simulando o registro em banco de dados: "
                + ano + "/" + mes + " " + valor);
    }
}
