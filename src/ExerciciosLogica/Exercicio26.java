package ExerciciosLogica;//• Escreva uma mensagem na tela que contenha:
//• Uma variável preenchida pelo usuário
//• Uma variável preenchida no código

import java.util.Scanner;
public class Exercicio26 {
    public static void main(String[] args){
        String a = "Seja bem-vindo ";
        int b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano atual: ");
        b = sc.nextInt();

        System.out.println(a + b);

    }
}
