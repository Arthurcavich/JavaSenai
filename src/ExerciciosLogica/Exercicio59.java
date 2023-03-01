package ExerciciosLogica;
import java.util.Arrays;

//• Escreva um programa Java para remover um elemento específico de um array.
public class Exercicio59 {
    public static void main(String[] args){
        int[] minhaLista = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Original: " + Arrays.toString(minhaLista));

        int removerItem = 5;

        for (int i = removerItem; i < minhaLista.length - 1; i++){
            minhaLista[i] = minhaLista[i + 1];
        }
        System.out.println("Após remover o item: " + Arrays.toString(minhaLista));
    }
}
