package Stringdemo;
public class String40 {
void display(){
        String s40="Deogiri Institute Of Engineering And Management Studies";
        System.out.println("Odd char:- ");
        for(int i=0;i<=s40.length()-1;i++) {
            if (i%2!=0){
                System.out.println(i + " : " + s40.charAt(i));
            }
           }System.out.println("Even Char:-");        
             for(int j=0; j<=s40.length()-1; j++){
               if(j%2==0){
             System.out.println(j + " : " + s40.charAt(j));
          
                           }
       
               
                    }
        
         System.out.println("Total length of the String:-");        
         System.out.println(s40.length());
             
    
                 }

            }

    

