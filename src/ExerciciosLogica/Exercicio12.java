package ExerciciosLogica;//Crie um programa que troque os valores que estão armazenados nas variáveis.

import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome1;
        String nome2;
        String aux;

        nome1 = "ABC";
        nome2 = "";

        System.out.println("Troca valores entre variaveis");

        System.out.println("Qual o seu nome? ");
        nome2 = sc.nextLine();

        aux = nome2;
        nome2 = nome1;
        nome1 = aux;
        System.out.println(nome1 + " " + nome2);
    }
}