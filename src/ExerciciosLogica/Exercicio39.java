package ExerciciosLogica;

//• Escreva um programa Java para inverter o conteúdo de uma frase (assuma um único espaço entre duas palavras) sem inverter cada palavra.
//• Faça um tratamento para strings nulas.

import java.util.*;
import java.util.Scanner;
public class Exercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma frase: ");
        String entrada = sc.nextLine();

        if (entrada.isBlank()){
            System.exit(0);
        }

        String [] entradaArray = entrada.split(" ");

        for (int i = entradaArray.length - 1; i >= 0; i--){
            System.out.print(entradaArray[i] + " ");
        }

    }
}
