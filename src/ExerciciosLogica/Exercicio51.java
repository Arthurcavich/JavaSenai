package ExerciciosLogica;

//• Escreva um programa Java que leve o usuário a fornecer um único caractere do alfabeto
//• Imprima Vogal ou Consoante, dependendo da entrada do usuário. Se a entrada do usuário não for uma letra
// (entre A e A ou A e Z), ou for uma string de comprimento > 1, imprima uma mensagem de erro.

import java.util.Scanner;
public class Exercicio51 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma letra do alfabeto: ");
        String entrada = sc.next().toLowerCase();

        boolean uppercase = entrada.charAt(0) >= 65 && entrada.charAt(0) <= 90;
        boolean lowercase = entrada.charAt(0) >= 97 && entrada.charAt(0) <= 122;
        boolean vowels = entrada.equals("a") || entrada.equals("e") || entrada.equals("i") || entrada.equals("o") || entrada.equals("u");

        if (entrada.length() > 1){
            System.out.println("Erro. Digite um único caracter");
        }
        else if (!(uppercase || lowercase)){
            System.out.println("Erro. Não é uma letra. Digite letra maiúscila ou minúscula.");
        }
        else if(vowels){
            System.out.println("Vogal");
        }
        else {
            System.out.println("Consoante");
        }
    }
}
