package main.java.pl.katarzynaskowronska.learning.Methods.Excercises.BarkingDog;

public class Main {

    public static void main(String[] args) {
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));
    }

    public static boolean bark(boolean barking, int hourOfTheDay){
        if(hourOfTheDay < 24 && hourOfTheDay >= 0){
            if(barking == true && hourOfTheDay <8 || hourOfTheDay > 22){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
