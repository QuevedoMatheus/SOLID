package org.example.modelo;

public class CriadorContasDiretor implements ICriadorContas{
    @Override
    public Empregado criar(ICandidato candidato) {
        Empregado empregado = new Empregado();

        empregado.setNome(candidato.getNome());
        empregado.setSobrenome(candidato.getSobrenome());
        empregado.setEmail(candidato.getNome() + candidato.getSobrenome() + "@xptodiretoris.com");

        empregado.setDiretor(true);

        return empregado;
    }
}
