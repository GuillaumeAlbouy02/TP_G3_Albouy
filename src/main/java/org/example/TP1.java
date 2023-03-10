package org.example;

import java.util.Scanner;

public class TP1 {
    public static void TP1(Scanner scanner) {
        //Question 1 : le programme attend que l'utilisateur rentre un entier et un flottant puis les affiche
        //Scanner.nextInt récupère le prochain entier rentré par l'utilisateur et Scanner.nextFloat renvoie le flottant entré par l'utilisateur
        /*int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();

        System.out.println("j'ai un entier: "+ unEntier);
        System.out.println("j'ai un ree: l"+unReel);*/

        //somme();
        //division();

        System.out.println("Exercices\n" +
                "1 : Prénom\n" +
                "2 : Somme\n" +
                "3 : Division\n" +
                "4 : Volume\n" +
                "5 : Quitter\n" +
                "6 : bonus : rectangle");
        int i = 1;
        while (i != 0) {
            System.out.println("Choisissez un exercice :");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                maFonction(scanner);
                break;
                case 2:
                    somme(scanner);
                    break;
                case 3:
                    division(scanner);
                    break;
                case 4:
                    volume(scanner);
                    break;
                case 5:
                    i = 0;
                    break;
                case 6:
                    rectangle(scanner);
                    break;
                default:
                    System.out.println("Aucun exercice sélectionné");
                    break;

            }
        }
    }






    public static void somme(Scanner scanner) {

        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxième entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = deuxiemeEntier + premierEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est égale à " + somme);

    }

    public static void division(Scanner scanner) {
        // pour avoir la vraie valeur de la division et pas juste la division euclidienne, on peut mettre une des valeurs entière en float pour avoir un float en sortie de la division
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxième entier");
        int deuxiemeEntier = scanner.nextInt();
            while (deuxiemeEntier == 0) {
                System.out.println("Veuillez saisir un deuxième entier DIFFERENT DE 0");
                deuxiemeEntier = scanner.nextInt();
            }
        int div = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier + " est égale à " + div);
    }

    public static void volume(Scanner scanner) {
        System.out.println("Veuillez saisir la longueur");
        float longu = getValue(scanner);
        System.out.println("Veuillez saisir la largeur");
        float larg = getValue(scanner);
        System.out.println("Veuillez saisir la hauteur");
        float haut = getValue(scanner);
        float vol = longu * larg * haut;
        System.out.println("Le volume de votre parallélépipède rectangle est : " + vol);
    }

    public static float getValue(Scanner scanner) {
        float i = scanner.nextFloat();
        if (i == 0) {
            while (i == 0) {
                System.out.println("Veuillez saisir une valeur DIFFERENTE DE 0");
                i = scanner.nextFloat();
            }
        }
        return i;

    }

    public static void maFonction(Scanner scanner){
        System.out.println("Bonjour, quel est votre prénom ?");
        String eol = scanner.nextLine();
        String prenom=scanner.nextLine();
        System.out.println("Bonjour, "+ prenom);
    }

    public static void rectangle(Scanner scanner){
        System.out.println("Veuillez saisir la longueur");
        float longu = getValue(scanner);
        System.out.println("Veuillez saisir la largeur");
        float larg = getValue(scanner);
        System.out.print(" ");
        for(int i=0;i<larg;i++){
            System.out.print("* ");
        }

        for(int c=0;c<longu-2;c++){
            System.out.print("\n *");
            for(int t=0;t<larg;t++){
                System.out.print(" ");
            }
            System.out.print(" * ");
        }
        System.out.print("\n ");
        for(int i=0;i<larg;i++){
            System.out.print("* ");
        }
        System.out.println("\n");
    }
}

