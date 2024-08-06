package org.example;

import java.util.List;

public class CalcularImposto implements ICalcularImposto {


    public double calculaImposto(List<Venda> vendas) {
        double imposto = 0;
        for(Venda venda: vendas){

            if (venda.getValor() < 1000) {
                imposto+= 0.05 * venda.getValor();
            } else {
                imposto+= 0.07 * venda.getValor();
            }

        }

        return imposto;

    }
}
