package Exceptiondemo;

public class Throwdemo1 {

    static void show() {
        try {
            throw new NullPointerException("Nullpointer Exception");
        } catch (NullPointerException e) {
            System.out.println(" Caught inside fun ");
            throw e; // e object throw to the main class but Exception is same like nullpointer 
        }
    }

    public static void main(String[] args) {
        try {
            show();
        } catch (NullPointerException e) {
            System.out.println(" caught in main ");

        } catch (ArithmeticException e) {// Catch only one  Exception Handeler in all program due to exception are not same 
            System.out.println("this is aslo Execute");
        }
    }
}
