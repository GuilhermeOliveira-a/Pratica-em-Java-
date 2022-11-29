import java.util.Scanner;

public class ex_16 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Digite a senha");
        int senha = i.nextInt();

        while (senha != 2002){
            System.out.println("Acesso negado!");
            senha = i.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
