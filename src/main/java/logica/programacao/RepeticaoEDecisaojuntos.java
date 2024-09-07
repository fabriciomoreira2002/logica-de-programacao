package logica.programacao;
import java.util.ArrayList;

public class RepeticaoEDecisaojuntos {
    public static void main(String[] args) {
        ArrayList<Integer> ListadeUmADez = new ArrayList<>();
        for (int posicao = 1; posicao <= 10; posicao++){
            ListadeUmADez.add(posicao);
        }
        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        for (Integer numero : ListadeUmADez) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            } else {
                numerosImpares.add(numero);
            }
        }
        for (Integer numeroPar : numerosPares) {
            System.out.println(numeroPar);
        }
        for (Integer numeroImpar : numerosImpares) {
            System.out.println(numeroImpar);
        }
    }
}
