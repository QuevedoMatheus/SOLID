package org.example.modelo;

public class CandidatoDiretor implements ICandidato{

    private String nome;
    private String sobrenome;

    private TipoCandidato tipoCandidato = TipoCandidato.DIRETOR;

    public CandidatoDiretor(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public ICriadorContas obterCriador() {
        return new CriadorContasDiretor();
    }
}
