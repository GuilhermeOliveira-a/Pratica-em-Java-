import java.util.Scanner;

public class ex_18 {
    public static void main(String[] args) {
        int senha;
        Scanner i = new Scanner(System.in);
        System.out.println("Digite sua senha");
        senha = i.nextInt();
        while (senha != 2002){
            System.out.println("Senha Invalida");
            senha = i.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
