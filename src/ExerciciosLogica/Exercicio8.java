//Desenvolver um programa que converta valores em dólar para real.

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float dolar, real, resultado;


        System.out.print("Qual o valor do $ em R$?\n- ");
        real = sc.nextFloat();

        System.out.print("Quantos $ vendidos? \n- ");
        dolar = sc.nextFloat();

        resultado = real * dolar;
        System.out.println("Voce ganhou R$" + resultado + " em vendas.");
    }
}
