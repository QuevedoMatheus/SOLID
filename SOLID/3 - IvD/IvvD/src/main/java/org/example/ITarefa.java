package br.ufba.idp;

public interface    ITarefa {
    void realizarTrabalho(double horas);

    void completarTarefa();

    String getNome();

    void setNome(String nome);

    IFuncionario getResponsavel();

    void setResponsavel(Funcionario responsavel);

    double getHorasTrabalhadas();

    boolean isCompleta();
}
