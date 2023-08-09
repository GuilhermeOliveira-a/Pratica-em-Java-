import java.util.Scanner;

public class ex_25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int fatorial = 1;


        for (int i=1; i<=r; i++){
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

    }
}
