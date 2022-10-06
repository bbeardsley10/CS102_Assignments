package Assignment04.part01;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * mainClass
 */
public class mainClass {

    public static void main(String[] args) {

            Queue<Integer> myQ = new LinkedList();


            myQ.add(5);
            myQ.add(20);
            myQ.add(3);
            myQ.add(35);

            
            System.out.println("Minimum value is " + Collections.min(myQ));      
    }
}