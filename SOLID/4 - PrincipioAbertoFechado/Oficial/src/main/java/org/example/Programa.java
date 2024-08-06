package org.example;
import java.util.*;

import org.example.modelo.*;

public class Programa {

    public static void main(String[] args) {
        List<ICandidato> candidatoGenericos = new ArrayList<ICandidato>();
        candidatoGenericos.add(new CandidatoGenerico("Carlos", "Silva"));
        candidatoGenericos.add(new CandidatoGerente("Maria", "Souza"));
        candidatoGenericos.add(new CandidatoDiretor("Ana", "Lopes"));

        List<Empregado> empregados = new ArrayList<Empregado>();

        for (ICandidato candidato : candidatoGenericos)
        {
            empregados.add(candidato.obterCriador().criar(candidato));
        }

        for (Empregado empregado: empregados)
        {
            System.out.println(empregado.getNome() + " " + empregado.getSobrenome() + " "
                    + empregado.getEmail() +
                    " Gerente: " + empregado.isGerente() + " Diretor(a): " + empregado.isDiretor());
        }

    }

}
