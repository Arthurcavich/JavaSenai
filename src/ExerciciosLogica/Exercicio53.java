package ExerciciosLogica;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
//• Escreva um programa em Java para exibir o padrão como triângulo de ângulo reto com um número. Exemplo: 10.
public class Exercicio53 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, j, n;

        System.out.print("Insira um valor:");
        n = sc.nextInt();

        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++)
                System.out.print(j);
                System.out.println("");
            }
        }

    }
