package main.java.pl.katarzynaskowronska.learning.Methods.Excercises.DecimalComparator;

public class Main {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.0, 3.0));
    }

    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber){
        firstNumber *= 1000;
        //System.out.println(firstNumber);
        int castedFirstNumber = (int) firstNumber;
        //System.out.println(castedFirstNumber);
        secondNumber *=1000;
        //System.out.println(secondNumber);
        int castedSecondNumber = (int) secondNumber;
        //System.out.println(castedSecondNumber);
        if(castedFirstNumber == castedSecondNumber){
            return true;
        }

        return false;
    }

}
