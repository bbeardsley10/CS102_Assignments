package Assignment04.part01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * mainClass
 */
public class mainClass {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            Queue<Integer> myQ = new LinkedList();

            //Adding numbers to the Linked List
            myQ.add(5);
            myQ.add(20);
            myQ.add(3);
            myQ.add(35);

            int minNum = 0;
           int value1 = myQ.poll();
           
           int value2 = myQ.poll();

           if(value1 < value2)
           {
                minNum = value1;
           } else if(value2 < value1)
           {
                minNum = value2;
           }

           int value3 = myQ.poll();

           if(value3 < minNum)
           {
                minNum = value3;
           } 
           int value4 = myQ.poll();
           if(value4 < minNum)
           {
            minNum = value4;
           }
           
           //Print statement that finds the minimum value of the Linked List
           System.out.println("The minimum number is " + minNum);
         
    }
}