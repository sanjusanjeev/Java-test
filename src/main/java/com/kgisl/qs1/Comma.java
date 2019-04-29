package com.kgisl.qs1;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/**
 * Comma
 */
public class Comma {
    public static void main(String[] args) {
        String words = "My, Name, is, Sanju";
        String ltr[] = words.split("//s*,//s*");
        List<String> alist = Arrays.asList(ltr);
        ArrayList<String> lst = new ArrayList<String>(alist);
        System.out.println(lst);
        
    }

}