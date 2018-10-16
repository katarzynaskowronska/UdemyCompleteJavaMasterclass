package main.java.pl.katarzynaskowronska.learning.Statements.Excercises.FirstAndLastDigitSum;

public class Main {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 0;
        }
        int numberToCheck = number;
        int sum = 0;
        int firstDigit;
        int reverse = 0;

        while(number !=0){
           int lastDigit = number % 10;
           // System.out.println("While last digit: " + lastDigit);
           reverse += lastDigit;
           // System.out.println("reverse: " + reverse);
           reverse *= 10;
           // System.out.println("reverse * 10: " + reverse);
           number /= 10;
           // System.out.println("number at the end of loop: " + number);
        }

        reverse /=10;
        firstDigit = reverse % 10 ;
        System.out.println("first digit: " + firstDigit);

        int finalLastDigit = numberToCheck % 10;
        System.out.println("last digit: " + finalLastDigit);

        sum = finalLastDigit + firstDigit;
        return sum;
    }
}
