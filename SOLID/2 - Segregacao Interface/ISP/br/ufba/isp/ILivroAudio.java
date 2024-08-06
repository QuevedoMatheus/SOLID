package br.ufba.isp;

public interface ILivroAudio extends ILivroAudioEmprestavel{

    public String getAutor();

    public void setAutor(String autor);

    public int getDuracaoEmMinutos();

    public void setDuracaoEmMinutos(int duracaoEmMinutos);
}
