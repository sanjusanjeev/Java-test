package com.kgisl.qs1;

import java.util.Scanner;

/**
 * Game
 */
public class Game {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Enter the A value \n");
        a = scan.nextInt();
        if (a % 2 == 0) {
            System.out.println(a * 2 + " " + ((a * 2) + 1) + " " + ((a * 2) + 2));
        } else if (a % 2 != 0) {

            System.out.println(a * 2 + " " + ((a * 2) + 1) + " " + ((a * 2) + 2));
        }

        System.out.println("Enter b:");
        b = scan.nextInt();

        if (b % 2 == 0) {
            System.out.println(b / 2 + " " + ((b / 2) / 2) + " " + ((b / 2) / 2 / 2));
        } else if (b % 2 != 0) {

            System.out.println(b / 2 + " " + ((b / 2) / 2) + " " + ((b / 2) / 2 / 2));
        }
    }
}