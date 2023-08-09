import java.util.Scanner;

//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
public class ex_22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int inteiro = 0;
        int outros = 0;

        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                inteiro = inteiro + 1;
            }
            else {
                outros = outros + 1;
            }
        }

        System.out.println(inteiro + " inteiro");
        System.out.println(outros + " outros");
    }
}