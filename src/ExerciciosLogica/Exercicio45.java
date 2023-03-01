package ExerciciosLogica;

//• Escreva um programa Java para converter um número positivo de 3 dígitos em um determinado formato.

import java.util.Scanner;
public class Exercicio45 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número positivo (máximo 3 digitos): ");
        char[] num = String.format("%03d", sc.nextInt()).toCharArray();
        StringBuilder tm = new StringBuilder();
        for (int i = 0; i < num[0] - '0'; i++){
            tm.append("H");
        }
        for (int i = 0;i < num[1] - '0'; i++){
            tm.append("T");
        }
        for (int i = 0;i < num[2] - '0'; i++) {
            tm.append(i + 1);
        }
        System.out.println("Resultado:");
        System.out.println(tm.toString());
    }
}
