package ExerciciosLogica;//Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas
//• Fazer um algoritmo que calcule e escreva:
//• a. maior e a menor altura do grupo;
//• b. média de altura dos homens;
//• c. número de mulheres;

import java.util.Scanner;
public class Exercicio24 {
    public static void main(String [] args){
        int sexo, qtMulheres = 0, qtHomens = 0;
        float altura, somaH = 0, mediaHomens = 0, maior = 0, menor = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Escolha o sexo da pessoa (1 - mulher, 2 - homem): ");
            sexo = sc.nextInt();
            System.out.println("Digite a altura: ");
            altura = sc.nextFloat();
            if (sexo == 1){
                qtMulheres++;
            }
            else if (sexo == 2){
                qtHomens++;
                somaH = somaH + altura;
            }
            else {
                System.out.println("Opcao invalida");
            }
            if (altura > maior){
                maior = altura;
            }
            else if (altura < menor){
                menor = altura;
            }
        }
        mediaHomens = somaH / qtHomens;

        System.out.println("A maior altura do grupo eh: " + maior + "m, e a menor eh de " + menor + "m");
        System.out.println("A media de altura dos homens eh " + mediaHomens + "m");
        System.out.println("O numero de mulheres eh " + qtMulheres);
    }
}
