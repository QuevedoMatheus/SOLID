package br.ufba.idp;

public class MecanismoLog implements IMecanismoLog {
	
	@Override
	public void log(String mensagem) {
		System.out.println(mensagem);
	}

	@Override
	public void registrar(String s) {

	}
}
