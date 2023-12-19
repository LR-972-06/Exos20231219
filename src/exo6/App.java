package exo6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("** Voici l'exercice 6 **");
        

        // Exercice 6 :
        // Écrivez un programme Java qui demande deux nombres à un utilisateur, pour afficher 
        // la somme (addition), multiplier, soustraire, diviser et le reste.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est votre premier nombre ?");
        float nb1 = scanner.nextFloat();

        System.out.println("Quel est votre deuxième nombre ?");
        float nb2 = scanner.nextFloat();

        System.out.println("La somme de vos deux nombres est : " + (nb1+nb2));
        System.out.println("Le produit de vos deux nombres est : " + (nb1*nb2));
        System.out.println("La différence entre vos deux nombres est : " + (nb1 - nb2));

        if (nb2==0) {
            System.out.println("| ! | le calcul de la division est impossible.");
        }
        else{
            System.out.println("Le résultat de la dision est : " + (int)(nb1/nb2) + " (quotient), " + (nb1 % nb2) + " (reste).");
        }

        scanner.close();
        
    }
}
