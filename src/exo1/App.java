package exo1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("** Voici l'exercice 1 **");

        // Exercice 1 :
        // Écrire un programme en Java qui demande l'âge d'un enfant et permet d'informer de sa catégorie sachant que les catégories sont les suivantes: 
        // "poussin de 6 a 7 ans"
        // "pupille de 8 a 9 ans "
        // "minime de 10 a 11 ans "
        // " cadet après 12 ans ".

        Scanner scanner = new Scanner(System.in);

        System.out.println(("Veuillez saisir l'âge de l'enfant svp : "));
        int age = scanner.nextInt();

        if (age >=6 && age <= 7)
            System.out.println(age + " ans => Catégorie Poussin");
        if (age >=8 && age <=9)
            System.out.println(age + " ans => Catégorie Pupille");
        if (age >=10 && age <=11)
            System.out.println(age + " ans => Catégorie Minime");
        if (age >=12)
            System.out.println(age + " ans => Catégorie Cadet");

        scanner.close();

    }
}
