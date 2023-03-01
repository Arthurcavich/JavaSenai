package ExerciciosLogica;

//• Escreva um programa Java para arredondar um número float para decimais especificados.
//• Número original: 451.3256531
//• Arredondado para 4 casas decimais: 451,3257
public class Exercicio44 {
    public static void main(String[] args) {
        double valorOriginal = 451.3256531;

        System.out.println(valorOriginal);
        System.out.printf("%.4f", valorOriginal);
    }
}
