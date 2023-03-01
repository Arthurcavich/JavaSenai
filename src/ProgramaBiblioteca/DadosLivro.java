import java.util.Scanner;

public class DadosLivro {

    public String titulo, ano, autor;
    Scanner sc = new Scanner(System.in);

    public String CadastraLivro() {
        System.out.println("Qual o titulo do livro?");
        titulo = sc.nextLine();
        return titulo;
    }
    public String CadastraAno() {
        System.out.println("Qual o ano de publicacao do livro?");
        ano = sc.nextLine();
        return ano;
    }
    public String CadastraAutor(){
        System.out.println("Qual o nome do autor?");
        autor = sc.nextLine();
        return autor;
    }
}
