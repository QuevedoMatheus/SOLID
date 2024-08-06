package br.ufba.isp;

import java.time.LocalDateTime;

public class Revista implements IRevistaEmprestavel{
    public String idItemBiblioteca;
    public String titulo;
    public int duracaoEmprestimoEmDias = 21;
    public String usuarioEmprestimo;
    public LocalDateTime dataEmprestimo;
    public  int numeroPaginas;

    public String frequencia;

    @Override
    public void emprestar(String usuarioEmprestimo) {
        this.usuarioEmprestimo = usuarioEmprestimo;
        this.dataEmprestimo = LocalDateTime.now();
    }

    @Override
    public void devolver() {
        this.usuarioEmprestimo = "";
    }

    @Override
    public LocalDateTime getDataDevolver() {
        return dataEmprestimo.plusDays(duracaoEmprestimoEmDias);
    }

    @Override
    public int getDuracaoEmprestimoEmDias() {
        return duracaoEmprestimoEmDias;
    }

    @Override
    public void setDuracaoEmprestimoEmDias(int duracaoEmprestimoEmDias) {
        this.duracaoEmprestimoEmDias = duracaoEmprestimoEmDias;
    }

    @Override
    public String getUsuarioEmprestimo() {
        return usuarioEmprestimo;
    }

    @Override
    public void setUsuarioEmprestimo(String usuarioEmprestimo) {
        this.usuarioEmprestimo = usuarioEmprestimo;
    }

    @Override
    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    @Override
    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    @Override
    public String getFrequencia() {
        return frequencia;
    }

    @Override
    public void setFrequencia() {
        this.frequencia = frequencia;
    }


    @Override
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public void setNumerosPaginas(int numerosPaginas) {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdItemBiblioteca() {
        return idItemBiblioteca;
    }

    public void setIdItemBiblioteca(String idItemBiblioteca) {
        this.idItemBiblioteca = idItemBiblioteca;
    }



}
