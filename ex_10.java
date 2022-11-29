import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {
        int A, B ;
        Scanner i = new Scanner(System.in);
        System.out.println("Digite 2 valores inteiro");
        A = i.nextInt();
        B = i.nextInt();

        if (A % B == 0 ||  B % A == 0){
            System.out.println("São Multiplos");
        }
        else {
            System.out.println("Não são Multiplos");
        }


    }
}
