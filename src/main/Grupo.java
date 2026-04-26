package main;

import java.util.ArrayList;

public class Grupo {
    public char letra;
    public ArrayList<Selecao> selecoes = new ArrayList<>();
    public double scoreGrupo = 0;

    @Override
    public String toString() {
        return "Grupo " + letra + " = " + selecoes;
    }

    public void adicionarSelecao(Selecao selecao) {
        this.selecoes.add(selecao);
        this.scoreGrupo += selecao.getPontos();
    }
}
