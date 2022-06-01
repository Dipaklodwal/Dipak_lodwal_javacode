package disicitionmakingdemo.program;

public class Ifelsedemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 30;
        if (a <= 30) {
            System.out.println("A is less than 30");
        }
        {
            System.out.println("---------------------------------------");
            if (a > b) {
                System.out.println("A is greter than 30");
            } else {
                System.out.println("A is less than B ");
            }
            {
                System.out.println("---------------------------------");
            }
            if (b != a) {
                System.out.println(" B is same as A ");
            } else {
                System.out.println("B is greter than A");
            }
            {
                System.out.println("-----------------------------------");
            }
            if (a == b) {
                System.out.println("A is equal to B");
            } else {
                System.out.println("A is not equal to B ");
            }
            {
                System.out.println("-------------------------------------");
            }
        }
    }
}
