package Assignment04.part03;

import java.util.Scanner;

public class mainClass {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter math expression: ");

        String inputExpression = input.nextLine();


        int leftCounter = 0;
        int rightCounter = 0;
        int numCounter = 0;

        
        for(int i =0; i < inputExpression.length(); i++)
        {
            char value = inputExpression.charAt(i);
            if(value == '(')
            {
                leftCounter++;
                //Increases the counter whenever the expression is true
             } else if(value == ')')
            {
                rightCounter++;
                //Increases the counter whenever the expression is true
            } else{  
                numCounter++;
            }
        }

        //Statements to display whether or not the expression is balanced
        if(leftCounter == rightCounter)
        {
            System.out.println("\n" + inputExpression + " is a balanced equation.");
        } else{
            System.out.println("\n" + inputExpression + " is not a balanced equation.");
        }
    }
}
