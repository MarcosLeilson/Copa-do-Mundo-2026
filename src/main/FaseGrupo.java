package main;

import java.util.ArrayList;

public class FaseGrupo {
    ArrayList<Selecao> selecoes;
    ArrayList<Jogo> jogos = new ArrayList<>();
    double scoreGrupo;

    public FaseGrupo(ArrayList<Selecao> selecoes) {
        this.selecoes = selecoes;
        this.calcularScores();
    }

    //TODO criar método para calcular a força do grupo usando algum desvio padrão e não apenas a soma das seleções.
    public void calcularScores() {
        Jogo jogo1 = new Jogo(selecoes.get(0), selecoes.get(1));
        jogos.add(jogo1);
        Jogo jogo2 = new Jogo(selecoes.get(2), selecoes.get(3));
        jogos.add(jogo2);
        Jogo jogo3 = new Jogo(selecoes.get(0), selecoes.get(2));
        jogos.add(jogo3);
        Jogo jogo4 = new Jogo(selecoes.get(1), selecoes.get(3));
        jogos.add(jogo4);
        Jogo jogo5 = new Jogo(selecoes.get(0), selecoes.get(3));
        jogos.add(jogo5);
        Jogo jogo6 = new Jogo(selecoes.get(1), selecoes.get(2));
        jogos.add(jogo6);

        for (Selecao selecao : selecoes) {
            scoreGrupo += selecao.getPontos();
        }

        for (int i = 0; i < jogos.size(); i++) {
            Jogo jogo = jogos.get(i);
            Selecao selecao1 = jogo.selecao1;
            Selecao selecao2 = jogo.selecao2;
            String score = String.format("%.2f", jogo.getScore());

            System.out.println("\tJogo " + (i + 1) + ": " +
                    selecao1.getNome() + " = " + selecao1.getPontos() +
                    "; " + selecao2.getNome() + " = " + selecao2.getPontos() +
                    "; score = " + score);
        }
    }
}
