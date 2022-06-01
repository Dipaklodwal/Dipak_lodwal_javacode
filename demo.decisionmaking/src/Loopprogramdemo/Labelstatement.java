package Loopprogramdemo;
import java.util.*;
public class Labelstatement {
    void shows(){
        first:
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==1){
                    continue first;
                }
                System.out.println("[i= "+ i +" , j= " + j +"]");
            }
        }
        System.out.println( );
    
               
        Secound:
        for(int i=0;i<3;i++){
            for(int j=0; j<3; j++){
                if(i==1){
                    break Secound;
                }
                System.out.println("[i=  "+ i + " :: j="+j+ "]" );
            }
        }
        
        System.out.println();
                }
            
        }
