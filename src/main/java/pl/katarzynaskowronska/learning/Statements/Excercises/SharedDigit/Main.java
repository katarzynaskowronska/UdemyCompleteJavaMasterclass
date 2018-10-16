package main.java.pl.katarzynaskowronska.learning.Statements.Excercises.SharedDigit;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println(hasSharedDigit(12,23));
        //System.out.println(hasSharedDigit(9,99));
        //System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(12,43));
        //System.out.println(hasSharedDigit(12,13));
    }

    public static boolean hasSharedDigit (int firstNumber, int secondNumber){
        if(firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99){
            return false;
        }


        while(firstNumber > 0){
            int numberToCompare = firstNumber % 10;
            System.out.println("numberToCompare = " + numberToCompare);
            int iterator = secondNumber;
            System.out.println("iterator0 before while = " + iterator);
                while(iterator > 0) {
                    int secondNumberToCompare = iterator % 10;
                    //System.out.println("secondNumberToCompare = " + secondNumberToCompare);
                    System.out.println("iterator1 = " + secondNumberToCompare);
                    if(secondNumberToCompare == numberToCompare){
                        return true;
                    }
                    iterator /= 10;
                    //System.out.println("secondNumber at the end = " + secondNumber);
                    System.out.println("iterator2 = " + iterator);
                }

            firstNumber /= 10;
            System.out.println("firstNumber at the end = " + firstNumber);
        }
        return false;
    }
}
