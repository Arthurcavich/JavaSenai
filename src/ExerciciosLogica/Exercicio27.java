package ExerciciosLogica;//Escreva um programa que peça ao usuário as medidas :
//• Altura da parede;
//• Largura da parede;
//• Altura do azulejo;
//• Largura do azulejo;
//Calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.

import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double altParede, largParede, altAzulejo, largAzulejo, qtdade;

        System.out.println("Insira a altura da parede: ");
        altParede = sc.nextDouble();

        System.out.println("Insira a largura da parede");
        largParede = sc.nextDouble();

        System.out.println("Insira a altura do azulejo");
        altAzulejo = sc.nextDouble();

        System.out.println("Insira a largura do azulejo");
        largAzulejo = sc.nextDouble();

        qtdade = (altParede * largParede) / (altAzulejo * largAzulejo);

        System.out.println("Quantidade de azulejos necessarios para cobrir a parede: " + qtdade);
    }
}
