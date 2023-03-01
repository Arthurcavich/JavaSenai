package ExerciciosLogica;
import java.util.Scanner;

//• Escreva um programa em Java para fazer um padrão como triângulo de ângulo reto com um número que repetirá um número em uma linha.
// O padrão é o seguinte:
//1
//22
//333
//4444

public class Exercicio54 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int i, j, n;

        System.out.println("Insira um número: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++){
            for(j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println(" ");
        }

    }
}
