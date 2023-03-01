package ExerciciosLogica;/* Calcular reajuste do salário de um funcionário
        • Recebe aumento salarial anualmente
        • 2005: contratado com salario inicial de R$1000,00
        • 2006: recebeu aumento de 1.5% sobre seu salario inicial
        • 2007: aumentos salariais corresponderam ao dobro do percentual do ano anterior;
        • Faça um algoritmo que determine o salário atual (2023)
        desse funcionário;

 */


import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float aumento = 1.5f, salario = 1000, ano = 2005;

        do {
            salario = salario + (salario * aumento / 100);
            ano++;
        }
        while (ano <= 2023);
        System.out.printf("%.2f", salario);

    }
}
