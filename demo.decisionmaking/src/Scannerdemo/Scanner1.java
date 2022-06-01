package Scannerdemo;
import java.util.*;
public class Scanner1 {
     public static void main(String[] args) {          
            Scanner isr= new Scanner(System.in);
    
            System.out.println("Enter the ID of Employee:-");
            int id=isr.nextInt();
    
            System.out.println("Enter the Name of Employee:-");
            String name = isr.next();
    
            System.out.println("Enter the age of Employee:-");
            int age =isr.nextInt();
    
            System.out.println("Enter the Salary of Employee:-");
           double salary=isr.nextDouble();

            System.out.println("Enter the post of Employee:-");
            String post= isr.next();
    
            System.out.println("Enter the Address of Employee:-");
            String address= isr.next();
           System.out.println(" ");
           System.out.println("Id of Employee:-"+id+" .");
           System.out.println("Name of the Employee:-"+name+".");
           System.out.println("Age of the Employee:-"+age+" Yr");
           System.out.println("Salary of Employee:-"+ salary+" LPA");
           System.out.println("Address of Employee:-"+address+" .");
           System.out.println("Post of Empolyee:-"+post+" .");
    
    
        
       }
         

   
}
