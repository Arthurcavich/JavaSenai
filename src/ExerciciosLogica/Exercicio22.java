package ExerciciosLogica;//Calcule a area do triangulo.

import java.util.*;
public class Exercicio22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Insira o valor da base do triangulo: ");
        base = sc.nextDouble();

        System.out.println("Insira o valor da altura do triangulo: ");
        altura = sc.nextDouble();

        area = (base * altura) / 2;

        System.out.println("A area do tringulo eh: " + area);
    }
}
