package com.company;
import java.util.Scanner;
public class leapYar {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year to know whether leap or not.");
        year = sc.nextInt();

        if((year%4==0 && year%400==0)|| (year%100!=0)){
            System.out.println("leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
