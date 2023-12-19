package exo2;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("** Voici l'exercice 2 **");

        // Exercice 2 :
        // Écrire un programme en Java qui permet de calculer la somme S=1+2+3+...+ 10. Utilisant la boucle for.

        int sum = 0;
        int partSum = 0;

        for (int i = 0; i<11; i++){
            sum = i + partSum;
            partSum = sum;
        }
        System.out.println("La somme des 10 premiers entiers est " + partSum + ".");


    }
}
