package org.example;

public class Fabrica {
    public static IMecanismoRegistro obterMecanismoRegistro(){
        return new BancodeDados();

    }

    public static ICalcularImposto obterCalculador () {
        return new CalcularImposto();
    }
}
