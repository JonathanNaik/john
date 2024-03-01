package com.company;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose between 0: for Rock, 1: for paper, 2: for scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);
        if(userInput==computerInput){
            System.out.println("draw");
        }
        else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 ||userInput==2 && computerInput==1){
            System.out.println("you won");
        }
        else{
            System.out.println("computer won");
        }
        if(computerInput==0){
            System.out.println("Computer choice: rock");
        }
        else if(computerInput==1){
            System.out.println("Computer choice: paper");
        }
        else if(computerInput==2){
            System.out.println("Computer choice: scissor");
        }

    }
}
