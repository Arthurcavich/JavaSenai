package ExerciciosLogica;
//• Faça um programa que realize o sorteio de um número de 1 a 1000.
//• Solicite ao usuário a digitação de um número na tela. A cada tentativa informe ao usuário se o número é maior ou menor que o número sorteado.
//• Informe ao usuário se ele acertou.

import java.util.Scanner;
import java.util.Random;
public class Exercicio36 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int num = 0, rand = 0;

        Random gerador = new Random();
        rand = gerador.nextInt();
        System.out.println(rand);
        System.out.println("Escolha um numero: ");
        num = sc.nextInt();

        while(rand !=num){
            if(num > rand){
                System.out.println("O número selecionado é maior que o sorteado!");
            }
            if (num < rand){
                System.out.println("O número selecionado é menor que o sorteado!");
            }
            System.out.println("Escolha outro número: ");
            num = sc.nextInt();
        }
        System.out.println("Parabéns, você acertou!!");
    }
}
