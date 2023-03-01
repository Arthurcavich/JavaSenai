import java.util.Scanner;

public class Patrimonio {
    public String cadeira, mesa, estante, notebook;

    Scanner sc = new Scanner(System.in);

    public String getValidadeCadeira() {
        System.out.println("Insira a data de validade das cadeiras");
        cadeira = sc.nextLine();
        return cadeira;
    }

    public String getValidadeMesa() {
        System.out.println("Insira a data de validade das mesa");
        mesa = sc.nextLine();
        return mesa;
    }

    public String getValidadeEstante() {
        System.out.println("Insira a data de validade das estante");
        estante = sc.nextLine();
        return estante;
    }

    public String getValidadeNotebook() {
        System.out.println("Insira a data de validade das notebook");
        notebook = sc.nextLine();
        return notebook;
    }

}
