package ExerciciosLogica;

//• Escreva um programa Java para verificar se uma string segue um determinado padrão;

import java.util.Scanner;
import java.util.*;

public class Exercicio40 {
    public static void main(String[] args){
        String str = "red black black red";
        String entrada = "xyxx";
        System.out.println("A string e o padrão são compatíveis? " + word_Pattern_Match(str, entrada));
    }
    public static boolean word_Pattern_Match(String str, String entrada){
        char[] word_Pattern = entrada.toCharArray();
        String[] words = str.split(" ");

        Map < Character, String > Map = new HashMap<>();
        Set < String > set = new HashSet<>();
        for (int i = 0; i < word_Pattern.length; i++){
            if (Map.containsKey(word_Pattern[i])){
                if (!Map.get(word_Pattern[i]).equals(words[i])){
                    return false;
                }
                continue;
            }
            if (set.contains(words[i])){
                return false;
            }
            Map.put(word_Pattern[i], words[i]);
            set.add(words[i]);
        }
        return true;
    }

}
