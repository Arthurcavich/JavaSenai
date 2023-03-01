package ExerciciosLogica;//Imprimir tabuada;
import java.util.Scanner;
public class Exercicio11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual taboada voce deseja saber?");
        int tabuada = sc.nextInt();

        for (int i = 0; i < 11; i++)
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));


    }
}
