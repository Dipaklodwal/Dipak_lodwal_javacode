public class Testgarbagecollector {
     public void finalize(){
         System.out.println(" Object is Garbage collected:- ");
         }
public static void main(String[] args) {
    Testgarbagecollector T1= new Testgarbagecollector();
    Testgarbagecollector T2= new Testgarbagecollector();
    T1= null;
    T2=null;
    System.gc();
   }    
}
