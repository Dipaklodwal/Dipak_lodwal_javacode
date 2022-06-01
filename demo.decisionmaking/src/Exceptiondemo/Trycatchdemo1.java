package Exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trycatchdemo1 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        try {
            System.out.println("Please Enter the Value  1  :-");
            int val1 = scr.nextInt();
            System.out.println("Please Enter the value  2 :-");
            int val2 = scr.nextInt();
            try {
                int val3 = val1 / val2;
                System.out.println(val3);
            } catch (ArithmeticException e) {
                System.out.println("Please Enter the value :: > 0 ");
            }

        } catch (InputMismatchException e) {
            System.out.println(" Dear user,Please Enter the intger type of Value");
        }
        System.out.println("Hello Friends");
        System.out.println("FUEL Pune");
        System.out.println("Name;- Dipak Lodwal ");
    }
}

