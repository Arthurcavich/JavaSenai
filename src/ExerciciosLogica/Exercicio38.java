package ExerciciosLogica;

//• Escreva um programa Java para obter duas strings e verificar se a segunda string contém a primeira.
//• Faça um tratamento para strings nulas

import java.util.*;
import java.util.Scanner;
public class Exercicio38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String str1 = sc.nextLine();

        System.out.println("Digite a segunda palavra: ");
        String str2 = sc.nextLine();

        System.out.println("A segunda string contém a primeira? " + is_str_contains(str1, str2));
    }

    public static boolean is_str_contains(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Você não pode passar strings nulas como entrada");
        }
        boolean ans = false;
        for (int i = 0; i < str2.length() - 1; i++) {
            if (str2.charAt(i) == str1.charAt(0)) {
                for (int j = 0; j < str1.length(); j++) {
                    if ((i + j) < str2.length() && str1.charAt(j) == str2.charAt(i + j) && j == str1.length() - 1) {
                        ans = true;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}

