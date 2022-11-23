/**/
import java.util.Locale;
import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do primeiro produto");
        int codeOne = sc.nextInt();
        System.out.println("Digite o numero de peças");
        int pieceOne = sc.nextInt();
        System.out.println("Digite o valor da primeira peça");
        double valueOne = sc.nextDouble();
        System.out.println();
        System.out.println("Digite o código do segundo produto");
        int codeTwo = sc.nextInt();
        System.out.println("Digite o numero de peças");
        int pieceTwo = sc.nextInt();
        System.out.println("Digite o valor da segunda peça");
        double valueTwo = sc.nextDouble();

        double valueFinal = valueOne * pieceOne + valueTwo * pieceTwo ;
        System.out.printf("Valor a pagar: RS%.2f",valueFinal);



    }
}
