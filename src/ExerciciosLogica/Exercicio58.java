package ExerciciosLogica;
import java.util.Scanner;
//• Escreva um programa Java para verificar se determinado elemento se encontra no array.
public class Exercicio58 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] digitos = {9, 3, 7, 2};

        System.out.println("Digite o número que deseja buscar: ");
        int procurar = sc.nextInt();

        boolean achou = false;

        for(int i = 0; i < digitos.length; i++){
            if (digitos[i] == procurar ){
                achou = true;
                break;
            }
        }
        if (achou){
            System.out.println("O número que você procura está na lista!");
        }else{
            System.out.println("O número que você procura não está na lista!!");
        }

    }

}
