package br.ufba.srp;

public class ValidadorPessoa {
    public static boolean ValidarPessoa (Pessoa pessoa){

        // Verifica se os nomes são válidos
        if (pessoa.getPrimeiroNome().isEmpty()) {
           Mensagens.ErroValidacao();
            return false;
        }

        if (pessoa.getUltimoNome().isEmpty()) {
            Mensagens.ErroValidacao();
            return false;
        }
        return true;
    }
}
