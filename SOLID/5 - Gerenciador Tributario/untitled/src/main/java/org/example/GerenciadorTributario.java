package org.example;

import java.util.List;

public class GerenciadorTributario {

    public void registraTotalImpostoMes(int ano, int mes, List<Venda> vendasMes) {

        ICalcularImposto calcularImposto = Fabrica.obterCalculador();
        double imposto = calcularImposto.calculaImposto(vendasMes);

        IMecanismoRegistro mecanismoRegistro = Fabrica.obterMecanismoRegistro();
        mecanismoRegistro.registra(ano, mes, imposto);


    }

}
