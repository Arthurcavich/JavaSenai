package ExerciciosLogica;
//• Suponhamos que um produto que custe R$ 985,00.
//• Como você pagou no dinheiro e teve um desconto de 43% no valor final.
//• Qual o valor final do produto?
public class Exercicio29 {
    public static void main(String[] args){
        double valor = 985.00;
        double desconto = 43.0;

        double valor_final = valor - ((desconto * valor) / 100);

        System.out.println("Com o desconto aplicado fica no valor de: " + valor_final);
    }
}
