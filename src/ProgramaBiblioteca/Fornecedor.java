import java.util.Scanner;

public class Fornecedor {

    Scanner sc = new Scanner(System.in);
    public String nome, cnpj, endereço;

    public void QuemForneceu(){
        System.out.println("Nome do fornecedor?");
        nome = sc.nextLine();

        System.out.println("Qual o CNPJ da empresa fornecedora?");
        cnpj = sc.nextLine();

        System.out.println("Qual o endereco da empresa fornecedora?");
        endereço = sc.nextLine();
    }


}
