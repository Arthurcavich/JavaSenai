package ExerciciosLogica;

//• Suponhamos que uma loja repassa 17% de comissão aos vendedores.
//• Calcule a comissão obtida de um carro. Peça ao usuário o valor do carro.
//• Qual o valor obtido na comissão pela venda do produto?

import java.util.Scanner;
public class Exercicio31 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valor, porcentagem, comissao;

        System.out.println("Qual o valor do carro vendido?");
        valor = sc.nextDouble();

        porcentagem = 17.0 / 100;

        comissao = porcentagem * valor;

        System.out.printf("O valor da sua comissão nesta venda é de: " + "%.2f", comissao);
    }
}
