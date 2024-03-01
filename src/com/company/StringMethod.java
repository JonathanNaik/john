package com.company;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String name = "harry";
        System.out.println(name);
        int Lstring = name.length();
        System.out.println(Lstring);
        String Lcase = name.toLowerCase();
        System.out.println(Lcase);
        String ucase = name.toUpperCase();
        System.out.println(ucase);
        String nontrimmed = "    Harry   ";
        System.out.println(nontrimmed);
        String trimmed = nontrimmed.trim();
        System.out.println(trimmed);
        String pop = "HARRY";
        String lowercase = pop.toLowerCase();
        System.out.println(lowercase);
        String tod = "Harry   is the good boy";
        tod = tod.replace(" ","_");
        System.out.println(tod);

    }

}
