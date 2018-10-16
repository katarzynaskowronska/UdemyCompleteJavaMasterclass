package main.java.pl.katarzynaskowronska.learning.Methods.Lessons.MethodOverloading;

public class Main {
    public static void main(String[] args) {

        //System.out.println(calcFeetAndInchesToCentimeters(2,0));
        //System.out.println(calcFeetAndInchesToCentimeters(0,2));
//        calcFeetAndInchesToCentimeters(2,0);
//        calcFeetAndInchesToCentimeters(6,0);
//        calcFeetAndInchesToCentimeters(7,5);
//        System.out.println(calcFeetAndInchesToCentimeters(1,13));
        calcFeetAndInchesToCentimeters(156);
        System.out.println(calcFeetAndInchesToCentimeters(-156));
    }

    //1 inch = 2,54cm
    //1 foot = 12 inch
    public static int calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0 && ((inches >= 0) && (inches <= 12))){
            double feetToInch = feet * 12;
            double inchToCentimeter = (feetToInch + inches)* 2.54d;
            System.out.println(feet + " feet and " + inches + " inches = " + inchToCentimeter + " centimeters");
        } else return -1;
        return 0;
    }

    public static int calcFeetAndInchesToCentimeters (double inches){
        if(inches >= 0){
            double inchToFeet = (int) inches / 12;
            double remainingInches = inches % 12;
            System.out.println(calcFeetAndInchesToCentimeters(inchToFeet, remainingInches));
        } else return -1;
        return 0;
    }
}
