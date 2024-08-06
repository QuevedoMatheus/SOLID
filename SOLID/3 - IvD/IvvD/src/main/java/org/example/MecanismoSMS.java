package br.ufba.idp;

public class MecanismoSMS implements IMecanismoMensagem{
    @Override
    public void enviarMensagem(IFuncionario funcionario, String mensagem) {
        System.out.println("Simulando envio de email para" + funcionario.getNome());
    }
}
