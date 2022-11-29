import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int num = i.nextInt();

        if (num >= 0){
            System.out.println("Não negativo");
        }
        else {
            System.out.println("Negativo");
        }
    }
}
