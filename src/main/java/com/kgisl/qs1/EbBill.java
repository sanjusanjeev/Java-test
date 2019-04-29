package com.kgisl.qs1;

import java.util.Scanner;

/**
 * EbBill
 */
public class EbBill {
    public static void main(String[] args) {
        int custId, units;
        String name;
        double amount, surcharge;
        double totalAmount=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n **** Pleace Enter the Customer Details **** \n");
        System.out.println("\n Enter the Cust Id \n");
        custId = scan.nextInt();
        System.out.println("\n Enter the Cust Name \n");
        name = scan.next();
        System.out.println("\n Enter the Cust Units \n");
        units = scan.nextInt();
        if (units <= 199) {
            amount = units * 1.20;
            totalAmount = amount + 100;
        } else if (units < 400) {
            amount=(units  * 1.50);
            surcharge = amount * (15 % 100);
            totalAmount=surcharge;
        } else if (units < 600) {
            amount = (units  * 1.80);
            surcharge = amount * (15 % 100);
            totalAmount=surcharge;
        } else if (units > 600) {
            amount =  (units* 2);
            surcharge = amount * (15 % 100);
            totalAmount=surcharge;
        }
       System.out.println("Bill to pay : " + totalAmount); 
    }

}