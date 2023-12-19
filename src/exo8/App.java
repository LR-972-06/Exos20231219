package exo8;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("** Voici l'exercice 8 **");
         
        // Exercice 8 :
        // Écrire un programme en Java qui  permet de saisir 10 entiers dans un tableau. 
        // - compter combien y a-t-il  d'éléments pairs et  impairs.
        // - mettre les éléments pairs dans  un tableau T1 et les éléments impaires dans un tableau T2. 
        // - Puis afficher T1  et  T2

        Scanner scanner = new Scanner(System.in);

        int[] tab = new int[10];
        int t1length = 0 ;
        int t2length = 0 ;

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Entrez l'élément " + (i+1) + " du tableau :");
            tab[i]= scanner.nextInt();
        }

         for (int i = 0; i < tab.length; i++) {
            if (tab [i] %2==0)
                t1length = t1length + 1;   
            else 
                t2length = t2length + 1;
        }

        System.out.println("***********************************" );     
        System.out.println("Il y a " +t1length+ " éléments pairs." );
        System.out.println("Il y a " +t2length+ " éléments impairs." );

        int[] T1 = new int[t1length];
        int[] T2 = new int[t2length];

        int it1 = 0 ;
        int it2 = 0 ;

        for (int j = 0; j < tab.length; j++) {
            if (tab[j] %2==0)
                T1 [it1++] = tab [j]; // on crée un index qui va s'incrémenter
            else
                T2 [it2++] = tab [j];
        }
        
        System.out.println("***********************************" ); 
        System.out.println("Tableau des éléments pairs :");
        
        for (int k = 0; k <T1.length; k++) {
            System.out.println(T1[k]);
        }
        
        System.out.println("***********************************" ); 
        System.out.println("Tableau des éléments impairs :");    
        
        for (int n = 0; n <T2.length; n++) {
            System.out.println(T2[n]);
        }
      
        scanner.close();
    }
}
