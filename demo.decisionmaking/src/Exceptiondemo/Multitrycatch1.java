package Exceptiondemo;

public class Multitrycatch1 {

    public static void main(String[] args) {

        try {
            int myArray[] = new int[10];
            myArray[5] = 10 + 0;
            myArray[10] = 10 / 0;
            System.out.println(myArray[5]);
            System.out.println(myArray[6]);
        //} catch (ArithmeticException e) {
            //System.out.println("Exception :- " + e.getMessage());

       // } catch (ArrayIndexOutOfBoundsException e) {
          //  System.out.println("Exception :- " + e.getMessage());
        }catch (Exception eh){
            System.out.println("Exception:- "+eh.getMessage());
        }
        System.out.println("Hello Friends ");
        System.out.println("Fuel Orgnazation Pune");
        System.out.println("Deogiri Collele Aurangabad");

    }

}
