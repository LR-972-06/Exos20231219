package exo4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("** Voici l'exercice 4 **");
        
        // Exercice 4 :
        // Une boutique propose à ses clients, une réduction de 15% pour les montants d’achat supérieurs à 200 Euros. 
        // Écrire un programme en Java permettant de saisir le prix total HT et de calculer le  montant TTC en prenant 
        // en compte la réduction et la TVA=20%. 
        
        Scanner scanner = new Scanner(System.in);

        System.out.println(("Veuillez saisir le prix HT svp : "));
        float prixHT = scanner.nextFloat();
       
        double prixReduit = 0;
        double prixFinal = 0;

        if (prixHT > 200){
            prixReduit = prixHT-prixHT*0.15;
            prixFinal = prixReduit-prixReduit*0.2;
        }
        else{
            prixFinal = prixHT-prixHT*0.2;
        }

        System.out.println(("Le prix final est de " + prixFinal + " Euros."));
        
        scanner.close();
    }
}
