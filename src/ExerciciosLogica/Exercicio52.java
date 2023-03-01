package ExerciciosLogica;
import java.util.Scanner;

//• Escreva um programa em Java para exibir o cubo do número até dado um inteiro.
//• Exemplo: 4
public class Exercicio52 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, n;

        System.out.println("Insira um valor: ");
        n = sc.nextInt();


        for (i = 1; i <= n; i++){
            System.out.println(i + " Elevado ao cubo é: " + (i*i*i));
        }
    }
}
