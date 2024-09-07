package logica.programacao;
import java.text.ParseException;
import java.util.Scanner;

public class estruturaDeDecisao {
    public static void main(String[] args) throws ParseException {
        nome();
        idade();
    }

    private static void idade() {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        if (idade > 17) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
    private static void nome(){
        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
    }
}


