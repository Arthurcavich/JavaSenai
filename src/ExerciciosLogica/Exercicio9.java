//Calcular a média das notas do alunos.
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3, resultado;

        System.out.println("Digita a nota da primeira prova: ");
        nota1 = sc.nextFloat();

        System.out.println("Digita a nota da segunda prova: ");
        nota2 = sc.nextFloat();

        System.out.println("Digita a nota da terceira prova: ");
        nota3 = sc.nextFloat();

        resultado = nota1 + nota2 + nota3 / 3;
        System.out.printf("Sua media eh: " + "%.1f" , resultado);
    }
}
