package main;

import java.util.ArrayList;

public class Jogo {

    Selecao selecao1, selecao2;
    private double score = 0;
    private double diferenca = 0;
    static ArrayList<Jogo> jogos = new ArrayList<>();
    static Jogo jogoMaiorDiferenca;
    static Jogo jogoMenorDiferenca;


    public Jogo(Selecao selecao1, Selecao selecao2){
        this.selecao1 = selecao1;
        this.selecao2 = selecao2;
        calcularScore();
        jogos.add(this);
    }

    public double getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        String scoreString = String.format("%.2f", score);
        String diferencaString = String.format("%.2f", diferenca);
        return "Jogo{" +
                "selecao1=" + selecao1 +
                ", selecao2=" + selecao2 +
                ", score=" + scoreString +
                ", diferenca=" + diferencaString +
                '}';
    }

    public void calcularScore() {
        double ajuste = 0.3;
        this.score = (selecao1.getPontos() + selecao2.getPontos()) - (ajuste * Math.abs(selecao1.getPontos() - selecao2.getPontos()));
        calcularDiferenca();
    }

    public void calcularDiferenca() {
        this.diferenca = Math.abs(selecao1.getPontos() - selecao2.getPontos());
        if (jogoMaiorDiferenca == null) {
            jogoMaiorDiferenca = jogoMenorDiferenca = this;
        } else if (this.diferenca > jogoMaiorDiferenca.diferenca) {
            jogoMaiorDiferenca = this;
        } else if (this.diferenca < jogoMenorDiferenca.diferenca) {
            jogoMenorDiferenca = this;
        }
    }
}
