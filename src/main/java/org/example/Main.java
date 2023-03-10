package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while(i!=0) {
            System.out.println("Tapez le numéro du TP à exécuter : 1, 2\n Tapez 3 pour quitter");

            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                TP1.TP1(scanner);
                break;
                case 2:
                    TP2.TP2(scanner);
                    break;
                case 3:
                    i=0;
                    break;


            }
        }
    }
}