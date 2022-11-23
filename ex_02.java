import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 ;
        int num2  ;

        System.out.println("Digite dois números inteiros ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int result = num1 + num2 ;
        System.out.println("seu resultado foi "+result);

    }
}
