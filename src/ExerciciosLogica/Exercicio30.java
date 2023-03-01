package ExerciciosLogica;

public class Exercicio30 {

    public static void main(String [] args) {
        double compra = 687.00;
        double venda = 789.00;
        double lucro = 0.00;

        while (compra + ((lucro / 100.0) * compra) < venda) {
            lucro = lucro + 0.1;
        }
        System.out.printf("Porcentagem de lucro foi: " + "%.2f", lucro);
    }
}
