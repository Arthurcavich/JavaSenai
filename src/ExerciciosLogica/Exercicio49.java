package ExerciciosLogica;
import java.util.Scanner;

//• Escreva um programa Java que leia dois números de ponto flutuante e teste se eles são iguais até três casas decimais.
public class Exercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número que seja ponto flutuante: ");
        double x = sc.nextDouble();

        System.out.println("Insira outro número que seja ponto flutuante: ");
        double y = sc.nextDouble();

        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if(x == y) {
            System.out.println("Eles são iguais até três casas decimais!!");
        }
        else{
            System.out.println("Diferentes!!");
        }
    }
}