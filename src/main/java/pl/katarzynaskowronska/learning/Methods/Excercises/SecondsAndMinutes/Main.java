package main.java.pl.katarzynaskowronska.learning.Methods.Excercises.SecondsAndMinutes;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {


        getDurationString(181,9);
        getDurationString(3945);
        getDurationString(-4);

    }

    public static void getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {

            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            String hoursString = hours + "h ";
            if(hours < 10){
                hoursString = "0" + hoursString;
            }

            String minutesString = remainingMinutes + "m ";
            if(remainingMinutes < 10){
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s ";
            if(seconds < 10){
                secondsString = "0" + secondsString;
            }

            System.out.println(hoursString + minutesString + secondsString);
        }
    }

    public static void getDurationString(int seconds){
        if(seconds < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            getDurationString(minutes, remainingSeconds);
        }

    }

}
