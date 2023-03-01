//Elabore um código em Java que imprima o resultado
//obtido pela interação de duas variáveis por meio dos
//operadores
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual numero eh maior?? \nDigite o primeiro numero: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = sc.nextInt();

        if (a > b){
            System.out.println(a + " é maior!");
        }
        else{
            System.out.println(b + " é maior!");
        }
    }
}
