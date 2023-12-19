package exo11;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("** Voici l'exercice 11 **");

        // Exercice 11 :
        // Écrivez un programme java qui renvoie le plus grand entier dans un tableau.
        // Exemple:
        // int[] tab = {1, 2, 9, 4};

        Scanner scanner = new Scanner(System.in);

        int[] tab = { 1, 2, 9, 4 };
        int max = 0;

        for (int i = 0; i < (tab.length-1); i++) {
            if (tab[i] >= tab[i + 1])
                max = tab[i];
            else
                max = tab[i + 1];
        }

        System.out.println(max);

        scanner.close();

    }
}
