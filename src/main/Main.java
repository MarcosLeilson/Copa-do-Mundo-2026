package main;

import utils.LerCSV;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Copa do Mundo 2026");

        ArrayList<Selecao> selecoes = LerCSV.lerSelecoes();

        ArrayList<Grupo> grupos = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            grupos.add(new Grupo());
        }

        for (Selecao selecao : selecoes) {
            switch (selecao.getGrupo()) {
                case 'A':
                    grupos.get(0).adicionarSelecao(selecao);
                    grupos.get(0).letra = 'A';
                    break;
                case 'B':
                    grupos.get(1).adicionarSelecao(selecao);
                    grupos.get(1).letra = 'B';
                    break;
                case 'C':
                    grupos.get(2).adicionarSelecao(selecao);
                    grupos.get(2).letra = 'C';
                    break;
                case 'D':
                    grupos.get(3).adicionarSelecao(selecao);
                    grupos.get(3).letra = 'D';
                    break;
                case 'E':
                    grupos.get(4).adicionarSelecao(selecao);
                    grupos.get(4).letra = 'E';
                    break;
                case 'F':
                    grupos.get(5).adicionarSelecao(selecao);
                    grupos.get(5).letra = 'F';
                    break;
                case 'G':
                    grupos.get(6).adicionarSelecao(selecao);
                    grupos.get(6).letra = 'G';
                    break;
                case 'H':
                    grupos.get(7).adicionarSelecao(selecao);
                    grupos.get(7).letra = 'H';
                    break;
                case 'I':
                    grupos.get(8).adicionarSelecao(selecao);
                    grupos.get(8).letra = 'I';
                    break;
                case 'J':
                    grupos.get(9).adicionarSelecao(selecao);
                    grupos.get(9).letra = 'J';
                    break;
                case 'K':
                    grupos.get(10).adicionarSelecao(selecao);
                    grupos.get(10).letra = 'K';
                    break;
                case 'L':
                    grupos.get(11).adicionarSelecao(selecao);
                    grupos.get(11).letra = 'L';
                    break;
            }
        }

        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("***FORÇA DE CADA GRUPO E SEUS JOGOS***");
        System.out.println();

        for (int i = 0; i < grupos.size(); i++) {
            System.out.println(grupos.get(i));
            FaseGrupo faseGrupo = new FaseGrupo(grupos.get(i).selecoes);
            double scoreGrupo = faseGrupo.scoreGrupo;
            System.out.println("Score do grupo " + grupos.get(i).letra + " = " + String.format("%.2f", scoreGrupo));
            System.out.println();
        }

        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("***TODOS OS JOGOS DA FASE DE GRUPO***");
        System.out.println();

        for (int i = 0; i < Jogo.jogos.size(); i++) {
            Jogo jogo = Jogo.jogos.get(i);
            Selecao selecao1 = jogo.selecao1;
            Selecao selecao2 = jogo.selecao2;
            String score = String.format("%.2f", jogo.getScore());

            System.out.println("\tJogo " + (i + 1) + ": " +
                    selecao1.getNome() + " = " + selecao1.getPontos() +
                    "; " + selecao2.getNome() + " = " + selecao2.getPontos() +
                    "; score = " + score);
        }

        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("***SEQUENCIA DE JOGOS DA FASE DE GRUPO EM FORÇA***");
        System.out.println();


        //jogos.sort(Comparator.comparingDouble(Jogo::getScore).reversed());

        List<Jogo> jogosOrdenados = Jogo.jogos;

        jogosOrdenados.sort(Comparator.comparingDouble(Jogo::getScore).reversed());

        for (int i = 0; i < jogosOrdenados.size(); i++) {
            Jogo jogo = jogosOrdenados.get(i);
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
