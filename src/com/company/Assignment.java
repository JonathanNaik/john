package com.company;

public class Assignment {
    public static void main(String[] args) {
        String letter = "Dear <|name|> thanks a lot!";
        letter = letter.replace("<|name|>","John");
        System.out.println(letter);

    }
}
