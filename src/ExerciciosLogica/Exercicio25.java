package ExerciciosLogica;/*• Crie um programa que calcule a média de um aluno para a matéria de matemática.
        • O aluno deve informar seu nome e as cinco notas da matéria.
        • O código deve mostrar:
        • Média da nota;
        • Maior nota;
        • Menor nota;
*/

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float media, soma = 0, n1, n2, n3, n4, n5, maior = 0, menor = 0, qtNotas;
        String nome;

        System.out.println("Qual seu nome? ");
        nome = sc.nextLine();

        System.out.println("Por favor, " + nome + ", insira a quantidade de notas que deseja inserir: ");
        qtNotas = sc.nextFloat();

        for(int i = 1; i <= qtNotas; i++){
            System.out.println(nome + ", digite a nota 1: ");
            n1 = sc.nextFloat();
            System.out.println(nome + ", digite a nota 2: ");
            n2 = sc.nextFloat();
            System.out.println(nome + ", digite a nota 3: ");
            n3 = sc.nextFloat();
            System.out.println(nome + ", digite a nota 4: ");
            n4 = sc.nextFloat();
            System.out.println(nome + ", digite a nota 5: ");
            n5 = sc.nextFloat();

            soma = soma + n1 + n2 + n3 + n4 + n5;

            if (n1 > maior){
                maior = n1;
            }
            else {
                menor = n1;
            }
            if (n2 > maior){
                maior = n2;
            }
            else {
                menor = n2;
            }
            if (n3 > maior){
                maior = n3;
            }
            else{
                menor = n3;
            }
            if (n4 > maior){
                maior = n4;
            }
            else {
                menor = n4;
            }
            if (n5 > maior){
                maior = n5;
            }
            else {
                menor = n5;
            }
            media = soma / 5;

            System.out.println("A maior nota eh " + maior + " . E a menor eh " + menor + " ");
            System.out.println("A media eh: " + media);
        }
    }
}
