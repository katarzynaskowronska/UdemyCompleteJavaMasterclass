package main.java.pl.katarzynaskowronska.learning.Statements.Excercises.SumOdd;

public class Main {
    public static void main(String[] args) {

        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
        System.out.println(sumOdd(5,11));

    }

    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        } else if(number % 2 == 0){
            return false;
        }
        return true;
    }

    public static int sumOdd(int startNumber, int endNumber) {
        int sum = 0;
        if (startNumber > endNumber || startNumber < 0 || endNumber < 0) {
            return -1;
        }
        for (int i = startNumber; i <= endNumber; i++) {
            if (isOdd(i)) {
                sum += i;
            }

        }
        return sum;
    }

    }

