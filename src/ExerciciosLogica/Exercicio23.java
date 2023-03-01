package ExerciciosLogica;//Verificar se os numeros são pares ou impares. Fazer de duas formas: 1- entrada do usuário 2 - atribuir o valor ao código.

import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = 2, n2 = 3;

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        if ((n1 % 2) == 0){
            System.out.println(n1 + " Eh par");
        }
        else{
            System.out.println(n1 + " Eh impar");
        }
        if ((n2 % 2) == 0){
            System.out.println(n2 + " Eh par");
        }
        else{
            System.out.println(n2 + " Eh impar");
        }
        if((num1 % 2) == 0){
            System.out.println(num1 + " Eh par");
        }
        else{
            System.out.println(num1 + " Eh impar");
        }
        if((num2 % 2) == 0){
            System.out.println(num2 + " Eh par");
        }
        else{
            System.out.println(num2 + " Eh impar");
        }
    }
}
