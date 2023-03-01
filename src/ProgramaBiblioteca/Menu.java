import java.util.Scanner;

public class Menu {

    DadosLivro dl = new DadosLivro();
    Fornecedor fornecedor = new Fornecedor();
    Usuario usu = new Usuario();
    Acoes acao = new Acoes();

    Patrimonio pt = new Patrimonio();

    int escolha = 0;
    Scanner sc = new Scanner(System.in);
    public void Menu() {
        System.out.println("1 - Cadastrar livro.\n2 - Cadastrar usuario.\n3 - Cadastrar fornecedor.\n4 - Cadastrar emprestimo.\n5 - Cadastrar patrimonio.\n6 - Devolucao.");
        escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                dl.CadastraLivro();
                dl.CadastraAno();
                dl.CadastraAutor();
                break;
            case 2:
                usu.opcao();
                break;
            case 3:
                fornecedor.QuemForneceu();
                break;
            case 4:
                acao.getEmprestimo();
                usu.opcao();
                break;
            case 5:
                pt.getValidadeCadeira();
                pt.getValidadeEstante();
                pt.getValidadeMesa();
                pt.getValidadeNotebook();
            case 6:
                acao.getDevolucao();
        }
    }
}