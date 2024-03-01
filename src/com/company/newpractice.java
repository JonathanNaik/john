package com.company;
import java.util.Scanner;
public class newpractice {
    public static void main(String[] args) {
      float tax;
      Scanner sc = new Scanner(System.in);
        System.out.println("Enetr your yearly income in lacks");
      tax = sc.nextFloat();
      if(tax>10.0f){
          System.out.println("30% Income tax");
      }
      else if(tax>5.0f && tax<10.0f){
          System.out.println("20% Income tax");
      }
      else if(tax>2.5f && tax<5.0f){
          System.out.println("5% Income tax");
      }
      else{
          System.out.println("no need to pay");
      }
        System.out.println("thanks for using my code");
    }
}
