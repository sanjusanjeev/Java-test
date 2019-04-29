package com.kgisl.qs1;

import java.util.Scanner;

public class MilesConversion {
    void convert() {
        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the selection:");
            String sa = scan.next();
            switch (sa) {
            case "m":
                Scanner mi = new Scanner(System.in);
                System.out.println("Enter miles");
                double ms = mi.nextDouble();
                System.out.println(ms + " miles = " + milesTokm(ms) + " km");
                mi.close();
                break;
            case "k":
                Scanner km = new Scanner(System.in);
                System.out.println("Enter kilometers");
                double ks = km.nextDouble();
                System.out.println(ks + " km = " + kmTomiles(ks) + " miles");
                MilesConversion c1 = new MilesConversion();
                c1.convert();
                km.close();
                break;
            default: {
                MilesConversion mc = new MilesConversion();
            }
            }
            break;
        }
    }
 
    private double milesTokm(double ms) {
        return ms * 1.609;
    }
 
    private double kmTomiles(double ks) {
        return ks * 0.621;
    }
 
    public static void main(String[] args) {
        MilesConversion c = new MilesConversion();
        c.convert();
    }
 
 }