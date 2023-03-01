package ExerciciosLogica;
import java.util.Scanner;

//• Escreva um programa Java para exibir a seguinte estrutura losango de caracteres
public class Exercicio57 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int n = sc.nextInt();
        int c = 1;
        int c1 = 1;
        char c2 = 'A';

        for(int i = 1; i < (n * 2); i++){
            for (int spc = n - c1; spc > 0; spc--){
                System.out.print(" ");
            }
            if (i < n){
                c1++;
            }else{
                c1--;
            }
            for (int j = 0; j < c; j++){
                System.out.print(c2);
                if (j < c / 2){
                    c2++;
                }else{
                    c2--;
                }
            }
            if (i < n){
                c = c + 2;
            }else{
                c = c -2;
            }
            c2 = 'A';
            System.out.println();
        }

    }
}
