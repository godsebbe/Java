package org.yourcompany.yourproject;
import java.util.Scanner;

public class Exercise_4_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scannner

        // Enter letter
        System.out.print("Enter a letter: ");
        String userInput = input.next().toLowerCase();

        //Checking input if its a single letter
        if (userInput.length() == 1 && Character.isLetter(userInput.charAt(0))) {

            char letter = userInput.charAt(0);

            if("aeiou".indexOf(letter) != -1) { // checking if the letter is vowel or a constant
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
        } else { // if its neither, aka the first if statement is false, it will be an invalid input meaning no constant or vowel or its more than one letter.
            System.out.println(userInput + " is an invalid input");
        }
        input.close(); //Closing scanner
    }
    
}
