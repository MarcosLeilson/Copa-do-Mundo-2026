package main;

public class Selecao {
    private String nome;
    private int posicao;
    private double pontos;
    private char grupo;

    public Selecao() {
    }

    public Selecao(String nome, int posicao, double pontos, char grupo) {
        this.nome = nome;
        this.posicao = posicao;
        this.pontos = pontos;
        this.grupo = grupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return nome + "-" + posicao + "-" + pontos + "-" + grupo;
    }
}
