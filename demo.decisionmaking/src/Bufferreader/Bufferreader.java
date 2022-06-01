package Bufferreader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
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
        
    
        public class Bufferreader{
        public  void bufferInput()throws IOException{
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    
        System.out.println("Enter the ID of Employee:-");
        int id=Integer.parseInt(br.readLine());
    
        System.out.println("Enter the Name of Employee:-");
        String name = br.readLine();
    
    System.out.println("Enter the age of Employee:-");
    int age = Integer.parseInt(br.readLine());
    
    System.out.println("Enter the Salary of Employee:-");
    double salaly= Double.parseDouble(br.readLine());

    System.out.println("Enter the post of Employee:-");
    String post= br.readLine();
    
    System.out.println("Enter the Address of Employee:-");
    String address= br.readLine();
    
    Employee ep=new Employee(id, age, name, salaly, post, address);
    ep.display();
   } 
    public static void main(String[] args) throws IOException{
        Bufferreader reader =new Bufferreader();
        reader.bufferInput();
        
       }
         
   }

