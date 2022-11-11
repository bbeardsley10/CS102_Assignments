package Assignment07;
import java.util.Scanner;

// * Second Part of the Assignment 
// * Tower of Hanoi with 4 pegs

public class mainClass2 {
  static int counter = 0;

  public static void main(String[] args) {
    int userInput;

    Scanner input = new Scanner(System.in);
    System.out.println("--------------------------------");
    System.out.print("Enter number of disc(s): ");
    userInput = input.nextInt();
    System.out.println("--------------------------------");
    towerOfHanoi(userInput, "A", "B", "C", "D");
    System.out.println("--------------------------------");
    System.out.println("Total moves: " + counter);
    input.close();
  }

  public static void towerOfHanoi(int numOfDiscs, String from, String to, String helper1, String helper2) {

    if(numOfDiscs == 0) {
      return;
    } else if(numOfDiscs == 1) {
      System.out.println("Move disk " + numOfDiscs + " from " + from + " to " + to);
      counter++;
      return;
    }
    

    towerOfHanoi(numOfDiscs -2, from, helper1, helper2, to);
    System.out.println("Move disk " + (numOfDiscs-1) + " from " + from + " to " + helper2);
    counter++;
    System.out.println("Move disk " + (numOfDiscs-1) + " from " + from + " to " + helper1);
    counter++;
    System.out.println("Move disk " + numOfDiscs + " from " + helper2 + " to " + to);
    counter++;
    towerOfHanoi(numOfDiscs-2, helper1, to, from, helper2);
  }
}
