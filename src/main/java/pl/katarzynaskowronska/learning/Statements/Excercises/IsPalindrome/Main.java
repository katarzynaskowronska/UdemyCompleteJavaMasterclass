package main.java.pl.katarzynaskowronska.learning.Statements.Excercises.IsPalindrome;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int comparingNumber = number;

        while(number != 0){
                int lastDigit = number % 10;
                //System.out.println("last digit = " + lastDigit);
                reverse += lastDigit;
                //System.out.println("reverse + lastDigit = " + reverse);
                reverse *= 10;
                //System.out.println("reverse * 10 = " + reverse);
                number /= 10;
                //System.out.println("number / 10 = " + number);

        }
        reverse /= 10;
        System.out.println("Final reverse " + reverse + ", comparingNumber: " + comparingNumber);
        if(comparingNumber == reverse){
            return true;

        } else return false;
    }}
