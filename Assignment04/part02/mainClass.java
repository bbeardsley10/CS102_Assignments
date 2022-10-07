package Assignment04.part02;

import java.util.Scanner;
import java.util.Stack;

/**
 * mainClass
 */
public class mainClass {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        Stack<Character> myStack = new Stack<Character>();
        System.out.print("Enter word: ");
        String word = input.nextLine();
        String reversedWord = "";

        //For loop to add letters from the string to the stack
        for(int i = 0; i < word.length(); i++)
        {
            myStack.push(word.charAt(i));
        }

        //Function to pull the last value of the stack
        while(!myStack.isEmpty())
        {
            reversedWord += myStack.pop();
        }

        //Checks whether or not the string is a palindrome and then prints the statement that corresponds to the function
        if(word.equals(reversedWord))
        {
            System.out.println(word + " is a palindrome");
        } else{
            System.out.println(word + " isn't a palindrome");
        }
    }
}