package ExerciciosLogica;//Faça o exercício de duas formas:
//• Peça ao usuário 1 número;
//• Atribua no código uma variável com um valor;
//• Imprimir antecessor e sucessor do número das duas formas.

import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, antecessor, sucessor;

        System.out.println("Insira um valor: ");
        valor = sc.nextInt();

        antecessor = valor - 1;
        System.out.println("O numero antecessor a este eh: " + antecessor);

        sucessor = valor + 1;
        System.out.println("O numero sucessor a este eh: " + sucessor);

   }
}

