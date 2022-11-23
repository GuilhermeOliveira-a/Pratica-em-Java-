//Fazer um programa para ler quadro de valores A,B,C e D.
import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D ;
        System.out.println("Digite 4 valores inteiros");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        int dif = (A*B - C*D);
        System.out.println("O resultado foi : "+dif);
    }
}
