import java.util.Scanner;

public class Usuario {
        Acoes acao = new Acoes();
        Scanner sc = new Scanner(System.in);
        int opcaoUsuario = 0, IDf = 0, IDa;
        public void opcao() {

                System.out.println("Quem eh o usuario?\n1 - Funcionario\n2 - Aluno \n3 - Visitante");
                opcaoUsuario = sc.nextInt();
                switch (opcaoUsuario) {
                        case 1 -> {
                                System.out.println("Qual o ID do funcionario? ");
                                IDf = sc.nextInt();
                        }
                        case 2 -> {
                                System.out.println("Qual o ID do aluno? ");
                                IDa = sc.nextInt();
                        }
                        case 3 -> {
                                System.out.println("Visitante pode apenas consultar livro.");
                                acao.getConsultarLivro();
                        }
                }
        }
}