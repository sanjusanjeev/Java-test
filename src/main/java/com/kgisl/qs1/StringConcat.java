package com.kgisl.qs1;

/**
 * StringConcat
 */
import java.io.*;
public class StringConcat {
public static void main(String[] args) {
    

    String s1="Kari";
    String s2="Laitinen";
    String s3=s1.concat(s2);
    System.out.println("First name Length is = "+s1.length());
    System.out.println("Second name Length is = "+s2.length());
    System.out.println(s3);
int speed=58;
float distance=657.5f;
System.out.println(distance / speed + " Hours to travel 657.5 miles");

}
}