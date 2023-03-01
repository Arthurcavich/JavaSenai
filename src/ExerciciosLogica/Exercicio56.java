package ExerciciosLogica;
import java.util.Scanner;

//• Escreva um programa Java para exibir o triângulo de Pascal.
//Número de linhas de entrada: 5

public class Exercicio56 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x, c = 1, b, i, j;

        System.out.println("Insira um número: ");
        x = sc.nextInt();

        for (i = 0; i < x; i++){
            for (b = 1; b <= x; b++)
                System.out.print(" ");
            for (j = 0; j <= i; j++){
                if(j == 0||i == 0)
                    c = 1;
                else
                    c = c *(i - j + 1) / j;
                System.out.print(" " + c);
            }
            System.out.println("\n");
        }
    }
}
