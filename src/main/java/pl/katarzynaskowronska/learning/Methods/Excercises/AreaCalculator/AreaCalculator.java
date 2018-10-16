package main.java.pl.katarzynaskowronska.learning.Methods.Excercises.AreaCalculator;


public class AreaCalculator {


    public static void main(String[] args) {

        System.out.println(area(5));
        System.out.println(area(-1));
        System.out.println(area(5,4));
        System.out.println(area(-1, 4));
    }

    public static double area(double radius) {

        if (radius < 0) {
            return -1.0;
        }
        double pi = 3.14159;
        return radius * radius * pi;
    }

    public static double area(double x, double y){
        if (x < 0 || y<0) {
            return -1.0;
        }
        return x*y;
    }

}
