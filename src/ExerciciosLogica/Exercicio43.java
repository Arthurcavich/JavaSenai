package ExerciciosLogica;

//• Escreva um programa que converta de string para inteiro em java;

import java.util.Scanner;
public class Exercicio43 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro para ser convertido em string: ");
        String entrada = sc.nextLine();

        int resultado = Integer.parseInt(entrada);
        System.out.printf("O número inteiro é: %d", resultado);
        System.out.printf("\n");

    }


}

