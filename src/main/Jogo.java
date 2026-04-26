package main;

import java.util.ArrayList;

public class Jogo {

    Selecao selecao1, selecao2;
    private double score = 0;
    static ArrayList<Jogo> jogos = new ArrayList<>();

    public Jogo(Selecao selecao1, Selecao selecao2){
        this.selecao1 = selecao1;
        this.selecao2 = selecao2;
        calcularScore();
        jogos.add(this);
    }

    public double getScore() {
        return this.score;
    }

    public void calcularScore() {
        double ajuste = 0.3;
        score = (selecao1.getPontos() + selecao2.getPontos()) - (ajuste * Math.abs(selecao1.getPontos() - selecao2.getPontos()));
    }
}
