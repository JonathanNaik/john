package com.company;

import java.util.Random;
import java.util.Scanner;

class game{
     public int userInput;
     public int number;
     public int noOfGuess =0;

    public int getNoOfGuess(){
        return noOfGuess;
    }
    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }
    game(){
        Random rand = new Random();
        this.number =rand.nextInt(100);
    }
    void takeInputNumber(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        userInput =sc.nextInt();
    }
    boolean rightGuess() {
        noOfGuess++;
        if (userInput == number){
            System.out.format("yes you guessed it right it was %d & you guessed it in %d attempts ",number,noOfGuess);
            return true;
        } else if (userInput<number){
            System.out.println("guess is too low..");
        } else if (userInput>number){
            System.out.println("guess is too high..");
        }
        return false;
    }
}
public class GuessGame {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while(!b) {
            g.takeInputNumber();
            b = g.rightGuess();
        }

    }
}
