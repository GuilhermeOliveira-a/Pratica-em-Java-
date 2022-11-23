import java.util.Locale;
import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double triangulo, circulo, trapezio, quadrado , retangulo;
        System.out.println("Digite o valor de A B e C");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        triangulo = A*C / 2.0;
        circulo = 3.14159*C*C;
        trapezio = (A+B) / 2.0 *C ;
        quadrado = B * B;
        retangulo = A*B;

        System.out.printf("Triangulo: %.3f%n", triangulo);
        System.out.printf("Circulo: %.3f%n", circulo);
        System.out.printf("Trapezio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retangulo: %.3f%n", retangulo);

    }
}
