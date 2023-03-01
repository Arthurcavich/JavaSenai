package ExerciciosLogica;
//• Suponhamos que um produto que custe R$ 578,00.
//• Como você pagou no cartão de crédito e teve um acréscimo de 37% no valor final.
//• Qual o valor final do produto?

public class Exercicio28 {
    public static void main(String[] args){
        double valor = 578.00;
        double porcentagem = 37.0;

        double valor_final = ((porcentagem * valor) / 100) + valor;
        System.out.println("O valor final do produto eh: " + valor_final);
    }

}
