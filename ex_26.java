import java.util.Scanner;

public class ex_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        for (int i=1; i<=r; i++) {
            if (r % i == 0){
                System.out.println(i);
            }
        }
    }
}
