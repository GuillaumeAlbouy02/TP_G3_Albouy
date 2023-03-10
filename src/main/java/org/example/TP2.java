package org.example;

import java.util.Scanner;

public class TP2 {
    public static void TP2(Scanner scanner) {
        int i=1;
        while(i==1) {
            System.out.println("\nChoisir un exercice :\n 1 : Discriminant\n 2 : Parité d'un nombre\n 3 : Maximum\n 4 : Egalité de chaînes de caractères\n 5 : Factorielle\n 6 : Compte à rebours\n 7 : Valeurs de carrés\n 8 : Table de multiplication\n 9 : Division d'entiers\n 10 : Règle graduée\n 11 : Nombres premiers\n 12 : Informations Tableau\n 13 : Inversion de Tableau\n 14 : Quitter");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    discriminant(scanner);
                    break;
                case 2:
                    parite(scanner);
                    break;
                case 3:
                    max(scanner);
                    break;
                case 4:
                    egaliteStr(scanner);
                    break;
                case 5:
                    factorielle(scanner);
                    break;
                case 6:
                    countdown(scanner);
                    break;
                case 7:
                    carre(scanner);
                    break;
                case 8:
                    tableMultiplication(scanner);
                case 9:
                    division(scanner);
                    break;
                case 10:
                    regle(scanner);
                    break;
                case 11:
                    nombrePremier(scanner);
                    break;
                case 12:
                    initialisationTableau(scanner);
                    break;
                case 13:
                    inverseTableau(scanner);
                    break;
                case 14:
                    i=0;
                    break;
                default:
                    System.out.println("Veuillez choisir une option valable");
                    break;
            }
        }

    }

    public static void discriminant(Scanner scanner) {

        float racine = 0;
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        double delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("ce polynome n'a pas de racine reelle, ses racines complexes sont");
            System.out.println("-" + b / 2.0 * a + "+" + Math.sqrt(-delta) / 2.0 * a + "*i");
            System.out.println("-" + b / 2.0 * a + "-" + Math.sqrt(-delta) / 2.0 * a + "*i");
        } else if (delta == 0) {
            racine = -(b) / 2 * a;
            System.out.println("Le discriminant est nul, la racine de ce polynôme est " + racine);
        } else {
            System.out.println(delta);
            System.out.println("Ce polynôme admet deux racines réelles, qui sont :");
            System.out.println(-b + Math.sqrt(delta) / 2 * a);
            System.out.println(-b - Math.sqrt(delta) / 2 * a);

        }
    }

    public static void parite(Scanner scanner) {

        System.out.println("saisir un nombre");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Le nombre " + a + " est pair");
        } else {
            System.out.println("Le nombre " + a + " est pair");
        }
    }

    public static void max(Scanner scanner) {
        System.out.println("Saisir un premier entier");
        int a = scanner.nextInt();
        System.out.println("Saisir un second entier");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(a + "est supérieur à " + b);
        } else if (a < b) {
            System.out.println(b + "est supérieur à " + a);
        } else {
            System.out.println(a + " et " + b + " sont égaux");
        }
    }

    public static void egaliteStr(Scanner scanner) {
        System.out.println("Saisir une chaine de caractères");
        String a = scanner.nextLine();
        System.out.println("Saisir une autre chaine de caractères");
        String b = scanner.nextLine();
        if (a.equals(b)) {
            System.out.println("Les chaines sont identiques");

        } else {
            System.out.println("Les chaines sont différentes");
        }
    }

    public static void factorielle(Scanner scanner) {
        int factorielle = 1;
        System.out.println("Entrer un entier positif ou nul");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);

    }

    public static void countdown(Scanner scanner) {
        for (int i = 10; i != 0; i--) {
            System.out.println(i);
        }
        System.out.println("0\nBOOM!");
    }

    public static void carre(Scanner scanner) {
        System.out.println("entrer un nombre : ");
        int x = scanner.nextInt();
        System.out.println(x + "\t" + x * x);
    }

    public static void tableMultiplication(Scanner scanner) {
        for (int i = 1; i < 11; i++) {
            for (int c = 1; c < 11; c++) {
                System.out.print(c * i + "\t");
            }
            System.out.print("\n");
        }

    }

    public static void division(Scanner scanner) {
        System.out.println("Veuillez saisir le numérateur");
        int num = scanner.nextInt();
        int denom = 0;
        do {
            System.out.println("Veuillez saisir un dénominateur non nul");
            denom = scanner.nextInt();
        } while (denom == 0);
        System.out.println("Le résultat est : " + num / (denom * 1.0));
    }

    public static void regle(Scanner scanner) {
        System.out.println("Veuillez saisir un entier");
        int ent = scanner.nextInt();
        for (int i = 0; i < ent / 10; i++) {
            for (int c = 0; c < 9; c++) {
                System.out.print("-");
            }
            System.out.print("|");
        }
        for (int a = 0; a < ent % 10; a++) {
            System.out.print("-");
        }

    }

    public static void nombrePremier(Scanner scanner) {
        System.out.println("Veuillez saisir un nombre");
        int nombre = scanner.nextInt();
        boolean premier = true;
        for (int i = 2; i < nombre / 2; i++) {
            if (nombre % i == 0) {
                premier = false;
            }
        }
        System.out.println(premier);
    }

    public static void initialisationTableau(Scanner scanner){
        int[] tableau = new int[20];
        for (int i=0;i<tableau.length;i++){
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }
        int max = tableau[0];
        int min = tableau[0];
        int sum = 0;
        System.out.println("éléments pairs :");
        int[] pair = new int[10];
        for (int c=0;c<20;c++){
            if (tableau[c]<min){
                min = tableau[c];
            }
            else if(tableau[c]>max){
                max = tableau[c];
            }
            sum+=tableau[c];
            if (c%2==0){
                pair[c/2]=tableau[c];
            }
            if (tableau[c]%2==0){
                System.out.println(tableau[c]);
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
        System.out.println("Somme des éléments du tableau : "+sum);
        System.out.println("éléments d'idice pairs : ");
        for (int c=0;c<10;c++){
            System.out.println(pair[c]);
        }
    }
    public static void inverseTableau(Scanner scanner){
        int[] tableau = new int[5];
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }
        int[] inverse = new int[tableau.length];
            for(int i=1;i<=tableau.length;i++){
                inverse[i-1]=tableau[tableau.length - i];
                System.out.println(inverse[i-1]);
            }

    }
}
