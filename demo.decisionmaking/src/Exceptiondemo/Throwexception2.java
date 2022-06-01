package Exceptiondemo;

public class Throwexception2 {

    static void arithmatic() {
        try {
            int a = 10 / 0;
            throw new ArithmeticException(" 1 Arthmatic Exception handled");
        } catch (ArithmeticException e) {
            System.out.println(" 1 Arithmatic Exception caught ");
            throw e;
        }
    }

    static void fun() {
        try {
            System.out.println("Hello");
        } catch (NullPointerException e) {
            System.out.println(" Caught Inside fun()");
            throw e;
        }

    }

    public static void main(String[] args) {

        try {
            fun();
            Throwexception2 t = new Throwexception2();
            t.arithmatic();

        } catch (NullPointerException e) {
            System.out.println(" Caught in main ");

        } catch (ArithmeticException e) {
            System.out.println("This is Also Execute");
        }
    }
}
