package com.kgisl.qs1;

/**
 * App
 */
public class Static {

    {
        System.out.println("Normal block");
    }
    static {
        System.out.println("Static block");
    }

    public Static() {
            System.out.println("Constructor");
        }

    public static void main(String[] args) {
        new Static();
    }

}