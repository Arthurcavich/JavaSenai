package ExerciciosLogica;

//• Escreva um programa Java para encontrar o número de dias em um mês.

import java.util.Scanner;
public class Exercicio50 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int nDDias = 0;
        String nomeDoMês = "Desconhecido";

        System.out.println("Insira um mês: ");
        int mês = sc.nextInt();

        System.out.println("Insira um ano: ");
        int ano = sc.nextInt();

        switch(mês){
            case 1:
                nomeDoMês = "Janeiro";
                nDDias = 31;
                break;
            case 2:
                nomeDoMês = "Fevereiro";
                if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0 ))){
                    nDDias = 29;
                }else {
                    nDDias = 28;
                }
                break;
            case 3:
                nomeDoMês = "Março";
                nDDias = 31;
                break;
            case 4:
                nomeDoMês = "Abril";
                nDDias = 30;
                break;
            case 5:
                nomeDoMês = "Maio";
                nDDias = 31;
                break;
            case 6:
                nomeDoMês = "Junho";
                nDDias = 30;
                break;
            case 7:
                nomeDoMês = "Julho";
                nDDias = 31;
                break;
            case 8:
                nomeDoMês = "Agosto";
                nDDias = 31;
                break;
            case 9:
                nomeDoMês = "Setembro";
                nDDias = 30;
                break;
            case 10:
                nomeDoMês = "Outubro";
                nDDias = 31;
                break;
            case 11:
                nomeDoMês = "Novembro";
                nDDias = 30;
                break;
            case 12:
                nomeDoMês = "Dezembro";
                nDDias = 31;
                break;

        }
        System.out.println(nomeDoMês + "/" + ano + " tem " + nDDias + "dias ");
    }
}
