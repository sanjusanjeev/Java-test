package com.kgisl.qs1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Duplicate
 */
public class Duplicate {
    public static void main(String[] args) {
        ArrayList<String> duplicateWord = new ArrayList<String>();

        duplicateWord.add("Sanju");
        duplicateWord.add("sasi");
        duplicateWord.add("Kavin");
        duplicateWord.add("Sanju");
        duplicateWord.add("Gowtham");
        duplicateWord.add("Kavin");
        ArrayList<String> notDuplicate = new ArrayList<String>();

        Iterator<String> duplicate = duplicateWord.iterator();
        while (duplicate.hasNext()) {
            String dupWord = duplicate.next();
            if (notDuplicate.contains(dupWord)) {
                duplicate.remove();
            } else {
                notDuplicate.add(dupWord);
            }
        }
        System.out.println(notDuplicate);
    }
    
}