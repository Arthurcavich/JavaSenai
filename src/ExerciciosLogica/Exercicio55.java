package ExerciciosLogica;
import java.util.Scanner;


public class Exercicio55 {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int i, j, n, k=1;

        System.out.print("Insira um número: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++){
        for(j = 1; j <= i; j++)
            System.out.print(k++);
        System.out.println("");
        }

    }
}

