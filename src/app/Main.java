package app;

import java.util.Scanner;

public class Main {

    static double res;
    static String output;
    static Integer a;
    private final static String CURRENCY = "UAH";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please write your income in " + CURRENCY + ": ");
         a = sc.nextInt();


        if (a <= 10000) {
            res = a * 2.5 / 100;
        }
        else if (a <= 25000 & a >= 10000) {
            res = a * 4.3 / 100;
        }
        else {
            res = a * 6.7 / 100;
        }

        output = "Your tax is " + res + " " + CURRENCY;
        System.out.println(output + ".");


    }
}
