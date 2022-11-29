import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        int horaI, horaF, duracao ;
        Scanner i = new Scanner(System.in);
        System.out.println("Digite a hora inicial e hora final do jogo");
        horaI = i.nextInt();
        horaF = i.nextInt();

        if (horaI < horaF){
            duracao = horaF - horaI;
        }
        else {
            duracao = 24 - horaI + horaF;
        }


    }
}
