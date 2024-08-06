package br.ufba.srp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Capturardados {

    public static Pessoa CapturarDados() throws IOException {

    // Obtém dados da pessoa
    Pessoa pessoa = new Pessoa();

    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        Mensagens.mensagemSolicitacaoDados("primeiro nome");
    pessoa.setPrimeiroNome(teclado.readLine());

    Mensagens.mensagemSolicitacaoDados("último nome");
    pessoa.setUltimoNome(teclado.readLine());

    return pessoa;
    }
}
