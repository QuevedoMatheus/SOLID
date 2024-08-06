package br.ufba.idp;

public class Tarefa implements ITarefa {
	
	private String nome;
	private IFuncionario responsavel;
	private double horasTrabalhadas;
	private boolean completa = false;

	private IMecanismoMensagem mecanismoMensagem;
	private IMecanismoLog log;

	public Tarefa (IMecanismoLog log, IMecanismoMensagem mecanismoMensagem){
		this.log = log;
		this.mecanismoMensagem = mecanismoMensagem;
	}



	@Override
	public void realizarTrabalho(double horas)
    {
        this.horasTrabalhadas += horas;

        this.log.registrar("Trabalho realizado em " + nome + ".");
    }

    @Override
	public void completarTarefa()
    {
        completa = true;

        this.log.registrar("Tarefa " + nome + " completa.");

        this.mecanismoMensagem.enviarMensagem(responsavel, "A tarefa " + nome + " foi finalizada.");
    }
	
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public IFuncionario getResponsavel() {
		return responsavel;
	}

	@Override
	public void setResponsavel(IFuncionario responsavel) {

	}

	public void setResponsavel(IFuncionario responsavel) {
		this.responsavel = responsavel;
	}
	@Override
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	@Override
	public boolean isCompleta() {
		return completa;
	}
	
	
}
