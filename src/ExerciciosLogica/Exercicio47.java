package ExerciciosLogica;
import java.util.Scanner;
//• Escreva um programa Java para obter um número do usuário e imprima se é positivo ou negativo.
public class Exercicio47 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int input = sc.nextInt();

        if(input > 0){
            System.out.println("O número é positivo!");
        }
        else if (input < 0){
            System.out.println("O número é negativo!");
        }
        else {
            System.out.println("O número é zero!!");
        }
    }
}
