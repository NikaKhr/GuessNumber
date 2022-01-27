package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ugadai chislo");
        for (int i = 10; i <= 30; i += 10) Level(i);
        System.out.println("Pobeda!!!");
        scanner.close();

    }
    private static void Level(int range){
        int chislo = (int) (Math.random() * range);
        System.out.println("Napishi chislo ot 0 do " + range);
        while (true) {

            int input_chislo = scanner.nextInt();
            if (input_chislo == chislo) {
                System.out.println("Ugadano");
                System.out.println("Next level");
                break;
            } else if (input_chislo > chislo) {
                System.out.println("Zagadanoe chislo menshe");
            } else {
                System.out.println("Zagadanoe chislo bolshe");
            }
        }
    }
}
