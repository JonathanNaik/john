package com.company;

public class PracticeSet {
    public static void main(String[] args) {
      //  int[] numb = {34,45,56,67,78};
       // System.out.println(numb[0] + numb[1] + numb[2] + numb[3]+ numb[4]);
       /* float [] marks = { 45.2f,54.3f,46.5f,67.5f,98.9f};
        float sum =0;
        for(float element : marks){
            sum = sum + element;
          //  System.out.println(sum);
        }
        System.out.println(sum);*/
        int [] marks = {34,45,56,67,78,89};
        int numbs = 36;
        boolean itsInArray = false;
        for( int element : marks) {
            if (numbs == element) {
                itsInArray = true;
                break;
            }
        }
        if(itsInArray){
                System.out.println("present");
            }
            else{
                System.out.println("Not present");
            }
        }
    }

