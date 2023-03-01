package ExerciciosLogica;

//• Escreva um programa Java para quebrar um inteiro em uma sequência de dígitos individuais.
//• Entrada: 123456
//• Saída: 1 2 3 4 5 6
public class Exercicio37 {

    public static void main(String[] args){
        int num = 123456;

        String num1 = Integer.toString(num);

        String [] lista = num1.split("");

        System.out.println(lista[0] + " " + lista[1] + " " + lista[2] + " " + lista [3] + " " + lista [4] + " " + lista [5]);

    }
}
