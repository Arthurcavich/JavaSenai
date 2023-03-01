import java.util.Scanner;

public class Acoes {

    public int consultar = 0, atraso = 0;
    public String emprestar;
    Scanner sc = new Scanner(System.in);



    public void getEmprestimo() {
            System.out.println("Qual livro esta sendo emprestado?");
            emprestar = sc.nextLine();
        }
    public void getConsultarLivro() {
            System.out.println("Qual livro voce quer consultar?");
        }
    public void getDevolucao() {

        System.out.println("Quantos dias foram entregue?");

        atraso = sc.nextInt();

        if (atraso >= 7) {
            System.out.println("Atrasado. Não receber sem pagar multa.");
        } else {
            System.out.println("Em dia. Pode receber.");
            }
        }
    }