package com.company;
import java.util.Scanner;
public class practice_set_elseif {
    public static void main(String[] args) {
        System.out.println("welcome");
        int marks ,marks2 ,marks3 ;
        System.out.println("enter marks for 1st subject");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();

        System.out.println("Enter marks for 2nd");
        marks2= sc.nextInt();

        System.out.println("Enter marks for 3rd ");
        marks3 = sc.nextInt();
        float total = (marks + marks2 + marks3)/3.0f;
        System.out.println("so you got "+ total + " percentage");
        if(total>40 && marks>=33  && marks2>=33  && marks3>=33){
            System.out.println("you are pass");
        }
        else{
            System.out.println("you are fail");
        }
    }
}
