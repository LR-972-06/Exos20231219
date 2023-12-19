package exo10;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("** Voici l'exercice 10 **");
                
        // Exercice 10 :
        // Écrivez un programme Java qui inverse une chaîne de caractères.
        // Aide : Utiliser StringBuilder pour inverser la chaîne de manière efficace
        // https://www.codecademy.com/resources/docs/java/stringbuilder/reverse

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entrez une phrase");
        String phrase = scanner.nextLine();

        StringBuilder str = new StringBuilder(phrase);
    
        str.reverse();
        System.out.println(str.toString());
       
        scanner.close();
    }
}
