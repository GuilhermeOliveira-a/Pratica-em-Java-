import java.util.Scanner;

public class ex_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        for (int i=0; i<=r; i++){

            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            if (n2 == 0){
                System.out.println("Divisão impossivel");
            }else{
                double div = (double) n1/n2;
                System.out.printf("%.1f%n", div);
            }
        }
    }
}
