package com.company;
import java.util.Scanner;
public class MarksForBoard {
    public static void main (String[] args){
        System.out.println("let's find out percentage for your cbse board");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for 1st subject");
        int a = sc.nextInt();
        System.out.println("Enter the marks for 2nd subject");
        int b = sc.nextInt();
        System.out.println("Enter the marks for 3rd subject");
        int c = sc.nextInt();
        System.out.println("Enter the marks for 4th subject");
        int d = sc.nextInt();
        System.out.println("Enter the marks for 5th subject");
        int e = sc.nextInt();
        int sum = a + b + c + d + e ;
        int percentage = (sum*100 /500);
        System.out.println("the percentage that you have got is :");
        System.out.println(percentage);
    }
}
