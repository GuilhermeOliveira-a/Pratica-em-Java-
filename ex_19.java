import java.util.Scanner;

public class ex_19 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        int x = i.nextInt();
        int y = i.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y >0){
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x <0 && y <0){
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }

            x = i.nextInt();
            y = i.nextInt();
        }
    }
}
