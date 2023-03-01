package ExerciciosLogica;

//• Escreva um programa Java para converter segundos em horas, minutos e segundos.
//• Entrada: 86399;
//• Saída: 23:59:59;
public class Exercicio35 {
    public static void main(String[] args){

        int segueingEntrant = 86399;
        int horas = 0, minutos = 0, segundos = 0;

        minutos = segueingEntrant / 60;
        horas = minutos / 60;
        segundos = minutos % 60;
        minutos = segueingEntrant % 60;

        System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
