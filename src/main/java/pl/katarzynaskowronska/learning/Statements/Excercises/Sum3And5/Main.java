package main.java.pl.katarzynaskowronska.learning.Statements.Excercises.Sum3And5;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("Found number = " +i);
                sum += i;
                count++;
                if(count == 5){
                    System.out.println("Exiting loop");
                    break;
                }
            }
        }

        System.out.println("Sum = " + sum);
    }
}
