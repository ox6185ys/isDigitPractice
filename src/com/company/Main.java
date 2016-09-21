package com.company;
import java.util.*;
import static java.lang.Character.*;
public class Main {

    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);
    public static void main(String[] args) {
/*      System.out.println(Character.isDigit('c'));
        System.out.println(Character.isDigit('5'));*/
        int secretNumber = 8;
        System.out.println("Enter a number between 0 and 10. ");
        //Initially used .nextString which broke it.
        int userGuess = numberScanner.nextInt();
        while (!isDigit(userGuess)){
            System.out.println("Wrong.");
            System.out.println("Guess again.");
            userGuess = numberScanner.nextInt();
            break;
        }
            System.out.println("Correct. ");
    }
}
