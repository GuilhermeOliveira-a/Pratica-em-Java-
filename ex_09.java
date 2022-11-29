import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int num = i.nextInt();
        if( num % 2 == 0 ){
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }
    }
}
