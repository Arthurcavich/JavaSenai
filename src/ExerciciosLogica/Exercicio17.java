package ExerciciosLogica;//Peça ao usuário a temperatura de temperatura em graus Celsius (°C):
// Converta e exiba em Kelvin (K), Fahrenheit (F), Réaumur (°Ré) e Rankine (Ra).

import java.util.Scanner;
public class Exercicio17 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        double celsius, K, F, RE, RA;

        System.out.println("Qual a temperatura em Celsius?");
        celsius = entrada.nextDouble();

        K = celsius + 273;
        F = celsius * 1.8 + 32;
        RE = celsius * 0.8;
        RA = celsius * 1.8 + 32 + 459;

        System.out.println("A conversao de C em Kelvin eh: " + K);

        System.out.println("A conversão de C em Fahrenheit eh: " + F);

        System.out.printf("A conversão de C em Reaumur eh : " + "%.2f" , RE);

        System.out.println("\nA conversão de C em Rankine eh: " + RA);
    }
}