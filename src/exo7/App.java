package exo7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("** Voici l'exercice 7 **");
        
        // Exercice 7
        // Écrivez un programme Java qui accepte trois nombres et affiche "Tous les nombres sont égaux" 
        // si les trois nombres sont égaux, "Tous les nombres sont différents" si les trois nombres sont différents 
        // et sinon "Ni tous ni égaux ni différents".

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est votre premier nombre ?");
        float nb1 = scanner.nextFloat();

        System.out.println("Quel est votre deuxième nombre ?");
        float nb2 = scanner.nextFloat();

        System.out.println("Quel est votre troisième nombre ?");
        float nb3 = scanner.nextFloat();

        if (nb1==nb2 && nb2==nb3) {
            System.out.println("Tous les nombres sont égaux.");
        }
        else if (nb1!=nb2 && nb2!=nb3 && nb1!=nb3) {
            System.out.println("Tous les nombres sont différents.");
        }
        else {
             System.out.println("Ni tous ni égaux ni différents.");
        }

        scanner.close();
        
    }
}
