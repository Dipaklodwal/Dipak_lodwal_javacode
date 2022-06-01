package Loopprogramdemo;
public class pattern7 {
    public static void main(String[] args) {
        int c=4;
        int a=10;
        for(int i=1;i<=c;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a--;
            }
            System.out.println();
        }
    }
     
}
