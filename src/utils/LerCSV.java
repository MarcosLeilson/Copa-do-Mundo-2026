package utils;

import main.Selecao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class LerCSV {

    public static ArrayList<Selecao> lerSelecoes() {

        ArrayList<Selecao> selecoes = new ArrayList<>();

        String caminho = "src/files/selecoes.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] valores = linha.split(",");
                String nome = valores[0];
                int posicao = Integer.parseInt(valores[1]);
                double pontos = Double.parseDouble(valores[2]);
                char grupo = valores[3].charAt(0);
                Selecao selecao = new Selecao(nome, posicao, pontos, grupo);
                selecoes.add(selecao);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return selecoes;
    }
}