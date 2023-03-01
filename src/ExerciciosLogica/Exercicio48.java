package ExerciciosLogica;
import java.util.Scanner;
//• Escreva um programa Java para resolver equações do segundo grau (use if, else if e else).
public class Exercicio48 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        double a = sc.nextDouble();

        System.out.println("Insira o valor de B: ");
        double b = sc.nextDouble();

        System.out.println("Insira o valor de C: ");
        double c = sc.nextDouble();

        double resultado = b * b - 4.0 * a * c;

        if (resultado > 0.0){
            double r1 = (-b + Math.pow(resultado, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(resultado, 0.5)) / (2.0 * a);
            System.out.println("As raízes são: " + r1 + " e " + r2);
        }
        else if (resultado == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("A raíz é: " + r1);
        }
        else{
            System.out.println("A equação não tem raízes reais!!");
        }
    }
}
