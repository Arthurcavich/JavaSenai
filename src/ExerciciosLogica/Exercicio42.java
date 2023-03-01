package ExerciciosLogica;

//• Escreva um programa Java para verificar se cada letra de uma determinada palavra (palavra abecadariano) é menor que a anterior.
//• Um abecadariano (ou abecedário) é uma inscrição que consiste nas letras de um alfabeto, quase sempre listadas em ordem.
//• Exemplo: Digite uma palavra: ABCD || • Abecadariano é palavra? verdadeiro
public class Exercicio42 {
    public static void main(String[] args){
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXZY";
        String palavra = "ABC";

        System.out.println("A segunda string contém na primeira?? " + alfabeto.contains(palavra));
    }
}
