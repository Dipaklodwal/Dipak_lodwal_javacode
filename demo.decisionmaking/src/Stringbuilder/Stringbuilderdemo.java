package Stringbuilder;
public class Stringbuilderdemo {
void show(){
    StringBuilder str =new StringBuilder();
    str.append(",riS olleH ");
    System.out.println("Line 1:="+str.toString());
    
    System.out.println("line 1 Reverse:="+str.reverse());
    
    StringBuilder str1 = new StringBuilder();
    System.out.println("line 1 replace:="+str.replace(7, 10, "Everyone"));
    
    StringBuilder str2 =new StringBuilder();
    System.out.println("line 2 insert :="+str.insert(16," My name Is Dipak Lodwal"));
     
    StringBuilder str3 =new StringBuilder();
    str.append(str);
    System.out.println("line 3 := "+str2.toString());
    
    StringBuilder str4= new StringBuilder("at.post Hivra Kabli Tq.jafrabad Dist Jalna");
    System.out.println("line 4 := "+ str4 .toString());
      
    StringBuilder str5=new StringBuilder();
    
    System.out.println("linr 5 := "+ str4.delete(19,31));
   
    
}    
public static void main(String[]args){
Stringbuilderdemo str8 =new Stringbuilderdemo();
str8.show();
}
}


