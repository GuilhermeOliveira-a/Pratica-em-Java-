import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora
e calcula o salário desse funcionário.*/
public class ex_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    System.out.println("Digite o código do funcionário");
    int code = sc.nextInt();
    System.out.println("Digite o numero de horas trabalhadas do funcionário "+code);
    int hours = sc.nextInt();
    System.out.println("Digite o valor que o funcionário "+code+" recebe por hora: ");
    double valueH = sc.nextDouble();
    System.out.println();
    double valueFinal = valueH * hours ;
    System.out.printf("O salário do funcionário é %.2f",valueFinal);

    }
}
