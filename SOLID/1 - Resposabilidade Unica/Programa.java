package br.ufba.srp;

import java.io.IOException;


public class Programa {

	public static void main(String[] args) throws IOException {

		
		Pessoa pessoa = Capturardados.CapturarDados();

		boolean usuarioValidado = ValidadorPessoa.ValidarPessoa(pessoa);
		if(usuarioValidado == false){
			Mensagens.FimdoPrograma();
			return;
		}

		Mensagens.MensagemBemVindo();



		

	}

}