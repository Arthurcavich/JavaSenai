//Imprimir o valor inserido pelo usuário, ao contrário.
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma sequencia de numeros por favor: ");
        int valor = sc.nextInt();
        int resto = 0;

        resto = valor % 10;
        valor = valor / 10;

        System.out.print(resto); //imprime o ultimo digito inserido pelo usuário.

        resto = valor % 10;
        valor = valor / 10;

        System.out.print(resto);//saída dos outros dois.
        System.out.print(valor);

    }
}
