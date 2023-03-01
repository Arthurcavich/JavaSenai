//Exercicio para criar variáveis e comparar elas.
public class Exercicio4 {
    public static void main(String[] args){
        double x = 9.997;
        int nx = (int) x;

        System.out.println(nx);

        int a = 4;
        int b = 1;
        boolean c = a < b;

        System.out.println(c);

        boolean ab = true, ba = false;
        int cc = 0;
        if (ab && !ba) cc++;
        System.out.println(cc);
    }
}
