package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
 class Employee{
     String name;
     int salary;
     public int getSalary(){
         return salary;
     }
     public String getName(){
         return name;
     }
     public void setName(String n){
          name = n;
     }
     public void setSalary(int n){
         salary = n;
     }

 }
  class cellphone{
     public void ring(){
         System.out.println("ringing..");
     }
     public void vibrate(){
         System.out.println("vibrating..");
     }
     public void calling(){
         System.out.println("calling mukul...");
     }
 }
 class square{
     int side;
     public int side(){
         System.out.println("Enter the side");
         Scanner sc= new Scanner(System.in);
         side = sc.nextInt();
         return side;
     }
     public int Area(){
         int side,area;
         Scanner sc= new Scanner(System.in);
         side = sc.nextInt();
         area= side * side;
         return area;
     }
     public int Perimeter(){
         int side,Perimeter;
         Scanner sc= new Scanner(System.in);
         side = sc.nextInt();
         Perimeter=4 * side;
         return Perimeter;
     }
 }

public class AssignmentNo1 {
    public static void main(String[] args) {
        Employee john = new Employee();
        john.setName("harry");
        john.setSalary(233);
        System.out.println(john.getSalary());
        System.out.println(john.getName());

        cellphone asus = new cellphone();
        asus.calling();
        asus.vibrate();
        asus.ring();

        square club = new square();
        System.out.println(club.side());
        System.out.println(club.Area());
        System.out.println(club.Perimeter());


    }
}

