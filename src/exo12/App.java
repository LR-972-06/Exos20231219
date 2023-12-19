package exo12;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("** Voici l'exercice 12 **");

        // Exercice 12 : Nombre magique
        // Écrire un programme Java qui permet à l'utilisateur de deviner un nombre choisi aléatoirement par l'ordinateur. 
        // Le programme doit donner des indications à l'utilisateur sur si le nombre à deviner est plus grand ou plus 
        // petit que la proposition de l'utilisateur. 
        // Le jeu doit se poursuivre tant que l'utilisateur n'a pas correctement deviné le nombre.
        // 
        // Aide :
        // La boucle while est appropriée pour cet exercice car le nombre de tentatives nécessaires pour deviner le nombre 
        // est inconnu à l'avance. 
        // La boucle while continue tant que la condition spécifiée est vraie.

        Random rand = new Random();
        int toGuess = rand.nextInt();

        // Cheat commande pour pour afficher le nombre à trouver.
        // System.out.println(toGuess);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quelle est votre proposition ?");
        int choix = scanner.nextInt();
        int i=1;

        while (choix!=toGuess) {
            if (choix > toGuess){
                System.out.println("Trop grand, choisir plus petit nombre.");
            }   
            else if (choix < toGuess){
                System.out.println("Trop petit, choisir plus grand nombre.");
            }

            System.out.println("Faites ne autre proposition svp :");
            choix = scanner.nextInt();
            i=i+1; 
        }
           
        
        if (choix==toGuess)
            System.out.println("Bravo, trouvé en "+i+ " tentative(s).");
    
        scanner.close();
    }

    @Override
    public String toString() {
        return "App []";
    }
}
