import java.util.Scanner;

public class ex_13 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        double numero ;
        System.out.println("Digite um valor");
        numero = i.nextDouble();

        if(numero <= 0 || numero >= 100 ){
                System.out.println("Fora de intervalo");
        } else if (numero <= 25.0) {
                System.out.println("Intervalo [0,25]");
        }else if (numero <= 50.0){
                System.out.println("Intervalo [25,50]");
        } else if (numero <= 75.0 ) {
                System.out.println("Intervalo [75,100]");
        }
    }
}
