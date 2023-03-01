package ExerciciosLogica;

//• Escreva um programa Java para obter partes inteiras e fracionárias de um valor double.
//• Valor original: 12,56
//• Parte inteiro: 12,0
//• Parte fracionária: 0,5600000000000005
public class Exercicio41 {

    public static void main(String[] args){
        double valor = 12.56;
        double fraçãoDoValor = valor % 1;
        double inteiroDoValor = valor - fraçãoDoValor;

        System.out.println("Valor original: " + valor);
        System.out.println("Parte inteira do valor: " + inteiroDoValor);
        System.out.printf("Parte fracionária do valor: " + "%.2f", fraçãoDoValor);
    }
}
