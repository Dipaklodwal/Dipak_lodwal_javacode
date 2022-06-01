package Scannerdemo;
import java.io.*;
import java.util.Scanner;
class Employee{
    int id,age;
    String name;
    double salary;
    String post;
    String address;
    public Employee(int id,int age,String name,double salary,String post,String address){
        this.id=id;
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.address=address;
        this.post=post;
    }
    public void display(){
        System.out.println(" ");
        System.out.println("Id of Employee:-"+this.id+" .");
        System.out.println("Name of the Employee:-"+this.name+".");
        System.out.println("Age of the Employee:-"+this.age+" Yr");
        System.out.println("Salary of Employee:-"+this.salary+" LPA");
        System.out.println("Address of Employee:-"+this.address+" .");
        System.out.println("Post of Empolyee:-"+this.post+" .");
    }
}
        
    
        public class Scannerdemo{
            public static void main(String[] args) {          
            Scanner isr= new Scanner(System.in);
    
            System.out.println("Enter the ID of Employee:-");
            int id=Integer.parseInt(isr.nextLine());
    
            System.out.println("Enter the Name of Employee:-");
            String name = isr.nextLine();
    
            System.out.println("Enter the age of Employee:-");
    int age = Integer.parseInt(isr.nextLine());
    
    System.out.println("Enter the Salary of Employee:-");
    double salaly= Double.parseDouble(isr.nextLine());

    System.out.println("Enter the post of Employee:-");
    String post= isr.nextLine();
    
    System.out.println("Enter the Address of Employee:-");
    String address= isr.nextLine();
    
    Employee ep=new Employee(id, age, name, salaly, post, address);
    ep.display();
    
    
        
       }
         
   }

