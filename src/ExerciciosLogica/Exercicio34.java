package ExerciciosLogica;

//• Escreva um programa que mostre os números de 1 a 100 que são divisíveis por 3 e 5;

public class Exercicio34 {

    public static void main(String[] args) {
        System.out.println("Valores de 1 a 100 divisiveis por 3!!");
        for (int i = 3; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n\nValores de 1 a 100 divisiveis por 5!!");
        for (int x = 5; x < 100; x++) {
            if (x % 5 == 0) {
                System.out.print(x + ", ");
            }
        }
    }
}
