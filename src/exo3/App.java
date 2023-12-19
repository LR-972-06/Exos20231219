package exo3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("** Voici l'exercice 3 **");
        
        // Exercice 3 :
        // Écrire  un programme en Java  qui  permet d'échanger le contenu de deux entiers  A et B  saisis par l'utilisateur
        // et afficher ces entiers  après l’échange.

        Scanner scanner = new Scanner(System.in);

        System.out.println(("Veuillez saisir un premier nombre svp : "));
        int nb1 = scanner.nextInt();

        System.out.println(("Veuillez saisir un autre nombre svp : "));
        int nb2 = scanner.nextInt();

        int nb3 = nb1;
        nb1 = nb2;
        nb2 = nb3;

        System.out.println(("Après inversion, votre premier nombre devient " + nb1 + " et votre deuxième, "+nb2+"."));

        scanner.close();        

    }
}
