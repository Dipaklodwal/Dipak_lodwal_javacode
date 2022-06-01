package Exceptiondemo;
import java.util.Scanner;
public class Throwexception {
    public static void main(String[] args){
 Scanner tt=new Scanner(System.in);
        System.out.println("Please Enter your Age:-");
        int age= tt.nextInt();
        if(age<18){
            throw new ArithmeticException(" He/She is  not eligible for Voting");
        }
        else{ 
            System.out.println(" He/She is  Eligible for Voting ");
        }
    }   
    
}
