package ExerciciosLogica;

//• Escreva um programa Java para verificar se um determinado número é ou não um número de Fibonacci.
import java.util.*;
public class Exercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("O número é fibonacci? " + éFibonacci(n));
        }
    }
        static boolean éQuadradoPerfeito(int x){
            int s = (int) Math.sqrt(x);
            return (s*s == x);
        }
        static boolean éFibonacci (int x){
            return éQuadradoPerfeito(5*x*x + 4) || éQuadradoPerfeito(5*x*x - 4);
        }
    }
