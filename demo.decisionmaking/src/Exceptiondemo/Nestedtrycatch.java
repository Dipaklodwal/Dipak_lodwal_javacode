package Exceptiondemo;

public class Nestedtrycatch {

    public static void main(String[] args) {
        try {
            int array[] = new int[5];
            array[4] = 10;
            System.out.println("Inside the Block ");
            try {
                System.out.println("First Block ");
                int num = 10 / 1;
                System.out.println(num);
            } catch (ArithmeticException e) {
                System.out.println("Exception::" + e.getMessage());
            }
            try {
                System.out.println("Secound Block");
                int num = 15 / 2;
                System.out.println(num);

            } catch (Exception eh) {
                System.out.println("Exception::" + eh.getMessage());
            }
        } catch (ArithmeticException eb) {
            System.out.println("Exception::" + eb.getMessage());
        } catch (Exception h) {
            System.out.println("Exception::" + "BLOCK 1 AND BLOCK 2");
        }

    }
}
