package logica.programacao;

import java.util.ArrayList;

public class EstruturaDeRepiticao {
    public static void main(String[] args) {
        //listaDePalavras();
        //forclassico();
        forpuro();
    }

    private static void listaDePalavras(String[] args) {
        ArrayList<String> palavrasList = new ArrayList<>();

        palavrasList.add("Fabricio");
        palavrasList.add("Moreira");
        palavrasList.add("Costa");

        for (String palavra : palavrasList) {
            System.out.println(palavra);
        }
    }
        private static void forclassico (){

            ArrayList<String> palavrasList = new ArrayList<>();

            palavrasList.add("Fabricio");
            palavrasList.add("Moreira");
            palavrasList.add("Costa");

            for (int posicao = 1; posicao < palavrasList.size(); posicao++) {
                System.out.println(palavrasList.get(posicao));
            // posição é referente a ordem que vai comecar a sequência das palavras
            }
        }

    private static void forpuro() {
            for (int posicao = 1; posicao <= 10; posicao = posicao + 1){
                System.out.println(posicao);
        }
    }
    }
