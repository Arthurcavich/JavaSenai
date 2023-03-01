package ExerciciosLogica;//Ligue o código à saída correspondente.

public class Exercicio18 {
    public static void main (String[] args){
        int x = 0;
        int y = 0;
        while (x < 5){
            y = x - y; //= 00 11 21 32 42 - 1
            y = y + x; //= 00 11 23 36 410 - 2
            y = y + 2; //= 02 14 25 36 47 - 3
            if (y > 4){
                y = y - 1;
            }
            x = x + 1; //= 11 34 59 - 4
            y = y + x;
            if (y < 5) { //= 02 14 36 48 - 5
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
//Saídas não encontradas: 22 46 | 02 14 26 38 | 11 21 32 42 53 |