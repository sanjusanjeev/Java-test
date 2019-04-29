package com.kgisl.qs1;

import java.util.ArrayList;

/**
 * Conversion
 */
public class Conversion {

    public static void main(String[] args) {
        ArrayList<String>alist=new ArrayList<String>();
        alist.add("Sanju");
        alist.add("Sasi");
        alist.add("Gowtham");
        alist.add("kavin");
        Object[] objects=alist.toArray();
        for (Object obj : objects) 
            System.out.println(obj + " "); 
            
        }

	public void convert() {
	}
    }
