package ExerciciosLogica;//Faça uma calculadora em Java com várias operações e operadores.

import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1, num2, soma, sub, div, multi, pot, restdiv;

        System.out.println("Insira o primeiro numero: ");
        num1 = sc.nextDouble();

        System.out.println("Insira o segundo numero: ");
        num2 = sc.nextDouble();

        soma = num1 + num2;
        System.out.println("A soma dos dois eh: " + soma);

        sub = num1 - num2;
        System.out.println("A subtracao dos dois eh: " + sub);

        div = num1 / num2;
        System.out.println("A divisao dos dois eh: " + div);
        System.out.println("O resto da divisão eh: " + num1 % num2);

        multi = num1 * num2;
        System.out.println("A multiplicacao dos dois eh: " + multi);

        System.out.println("Qual numero voce deseja saber a potencia? ");
        pot = sc.nextDouble();

        double pot1 = pot * pot;
        System.out.println("A potencia do numero " + pot + " eh: " + pot1);


    }
}
