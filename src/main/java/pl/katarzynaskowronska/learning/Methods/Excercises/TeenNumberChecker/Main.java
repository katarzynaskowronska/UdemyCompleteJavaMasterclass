package main.java.pl.katarzynaskowronska.learning.Methods.Excercises.TeenNumberChecker;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(0, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22,23,34));
    }

    public static boolean hasTeen (int firstNumber, int secondNumber, int thirdNumber){
        if((firstNumber >= 13 && firstNumber <= 19) || (secondNumber >= 13 && secondNumber <= 19) || (thirdNumber >= 13 && thirdNumber <= 19)){
            return true;
        }
        return false;
    }
}
