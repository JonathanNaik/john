package com.company;
import java.util.Scanner;
public class CWH_05_TakingInout {
    public static void main(String[] args) {
        System.out.println("everything fine here");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of the number is ");
        System.out.println(sum);
    }
}
