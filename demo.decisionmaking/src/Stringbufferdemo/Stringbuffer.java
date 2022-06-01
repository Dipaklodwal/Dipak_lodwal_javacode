package Stringbufferdemo;
public class Stringbuffer {
void show1(){
    StringBuffer str =new StringBuffer();
    str.append(",riS olleH ");
    System.out.println("Line 1:="+str.toString());
    
    System.out.println("line 1 Reverse:="+str.reverse());
    
    StringBuffer str1 = new StringBuffer();
    System.out.println("line 1 replace:="+str.replace(7, 10, "Everyone"));
    
    StringBuffer str2 =new StringBuffer();
    System.out.println("line 2 insert :="+str.insert(16," My name Is Dipak Lodwal"));
     
    StringBuffer str3 =new StringBuffer();
    str.append(str2);
    System.out.println("line 3 := "+str3.toString());
    
    StringBuffer str4= new StringBuffer("at.post Hivra Kabli Tq.jafrabad Dist Jalna");
    System.out.println("line 4 := "+ str4 .toString());
      
    StringBuffer str5=new StringBuffer();
    
    System.out.println("linr 5 := "+ str4.delete(19,31));
   
    
}    
public static void main(String[]args){
Stringbuffer str8 =new Stringbuffer();
str8.show1();
}
}
    
  
