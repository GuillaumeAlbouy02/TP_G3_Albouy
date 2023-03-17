package org.example;

import java.awt.datatransfer.StringSelection;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TP5 {
    private static final int SIZE = Integer.MAX_VALUE/10000;
    private static int[] tableau =new int[SIZE];

    public static void TP5(SafeScanner sc) {
        System.out.println("Tris\n" +
                "1 : Selection\n" +
                "2 : Insertion\n" +
                "3 : Bulle\n" +
                "4 : Quick\n" +
                "5 : Java natif\n");

        int i = 1;
        while (i != 0) {
            System.out.println("Choisissez un tri :");
            int choix = sc.getInt2();
            initialiserTableau();


            switch (choix) {
                case 1:

                    int[] tableauSelection = new int[SIZE];
                    System.arraycopy(tableau, 0, tableauSelection, 0, SIZE);
                    triSelection(tableauSelection); //complexité en O(n²)
                    break;
                case 2:
                    int[] tableauInsertion = new int[SIZE];
                    System.arraycopy(tableau, 0, tableauInsertion, 0, SIZE);
                    triInsertion(tableauInsertion); //complexité en O(n²)
                    break;
                case 3:
                    int[] tableauBulle = new int[SIZE];
                    System.arraycopy(tableau, 0, tableauBulle, 0, SIZE);
                    triBulleDeDana(tableauBulle); // complexité en O(n²)
                    break;
                case 4:
                    int[] tableauQuick = new int[SIZE];
                    System.arraycopy(tableau, 0, tableauQuick, 0, SIZE);
                    Instant start = Instant.now();
                    quicksort(tableauQuick,0, tableauQuick.length-1); // Complexité en O(nlog(n))
                    Instant end = Instant.now();
                    duration(start, end, "quick");
                    break;
                case 5:
                    int[] tableauJava = new int[SIZE];
                    System.arraycopy(tableau, 0, tableauJava, 0, SIZE);
                    triJava(tableauJava);
                    break;







            }


        }
    }
    public static void triJava(int[] tableau){
        Instant start = Instant.now();
        Arrays.sort(tableau);
        Instant end = Instant.now();
        duration(start, end, "Java");
    }
    public static void quicksort(int[] tableau, int indiceGauche, int indiceDroit) {
        if (indiceGauche < indiceDroit) {
            int indicePartition = partition(tableau, indiceGauche, indiceDroit);
            quicksort(tableau, indiceGauche, indicePartition);
            quicksort(tableau, indicePartition + 1, indiceDroit);
        }
    }

    public static int partition(int[] tableau, int indiceGauche, int indiceDroit) {
        int elementPivot = tableau[indiceGauche + (indiceDroit - indiceGauche) / 2];
        int left = indiceGauche - 1;
        int right = indiceDroit + 1;
        while (true) {
            do {
                left++;
            } while (tableau[left] < elementPivot);
            do {
                right--;
            } while (tableau[right] > elementPivot);
            if (left >= right) {
                return right;
            }
            int tmp = tableau[left];
            tableau[left] = tableau[right];
            tableau[right] = tmp;
        }
    }

    public static void triSelection(int[] tableau){
        //Le tri par sélection a une complexité en O(n²)
        Instant start = Instant.now();
        for (int i = 0; i < tableau.length - 1; i++) {
            int indiceMin = i;
            for (int j = i; j < tableau.length; j++) {
                if (tableau[j] < tableau[indiceMin]) {
                    indiceMin = j;
                     }
                 }
            int swap = tableau[i];
            tableau[i] = tableau[indiceMin];
            tableau[indiceMin] = swap;

            }
        Instant end = Instant.now();
        duration(start,end,"sélection");


    }

    public static void triInsertion(int[] tableau){
        //complexité en O(n²)

        Instant start = Instant.now();

        for (int i = 1; i < tableau.length; i++) {
            int elementATrier = tableau[i];
            int j = i;
            while (j > 0 && tableau[j - 1] > elementATrier) {
                tableau[j] = tableau[j - 1];
                j--;
                }
             tableau[j] = elementATrier;
            }
        Instant end = Instant.now();
        duration(start,end,"insertion");
    }

    public static void triBulleDeDana(int[] tableau){
        Instant start = Instant.now();
        boolean estTrie = false;
        while (!estTrie) {
            estTrie = true;
            for (int i = 1; i < tableau.length; i++) {
                if (tableau[i - 1] > tableau[i]) {
                    int swap = tableau[i - 1];
                    tableau[i - 1] = tableau[i];
                    tableau[i] = swap;
                    estTrie = false;
                    }
                }
            }
        Instant end = Instant.now();
        duration(start,end,"bulle");
    }

    public static void initialiserTableau() {
        Instant start = Instant.now();
        System.out.println("Debut d’initialisation...");
        Random random = new Random();
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(SIZE);
        }
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("L’initialisation a pris " + duration + " ms");
    }

    public static void duration(Instant start, Instant end, String name){
        long duration = Duration.between(start,end).toMillis();
        System.out.println("Le tri par "+ name+"  a pris "+ duration+ " ms");

    }
}
