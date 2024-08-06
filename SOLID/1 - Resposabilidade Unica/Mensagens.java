package br.ufba.srp;

public class Mensagens {
    public static void MensagemBemVindo() {
        System.out.println("Seja bem-vinda ou bem-vindo.");
    }
    public static void MensagemPrimeiroNome() {
        System.out.println("Qual é seu primeiro nome?");
    }
    public  static void MensagemUltimoNome() {
        System.out.println("Qual é seu último nome?");
    }
    public static void FimdoPrograma() {
        System.out.println("Fim do Programa");
    }
    public static void ErroValidacao() {
        System.out.println("Você não forneceu um nome válido");
    }
    public static void mensagemSolicitacaoDados(String dado) {
        System.out.println("Qual seu" + dado +" ?");
    }

}
