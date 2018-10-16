package main.java.pl.katarzynaskowronska.learning.Methods.Excercises.MegabytesConverter;

public class Main {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes >= 0) {
            int converter = kiloBytes / 1024;
            int reminder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + converter + " MB and " + reminder + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
