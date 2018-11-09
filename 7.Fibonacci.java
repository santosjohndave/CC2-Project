
package fibo;
import java.util.Scanner;

public class Fibo {

    
    public static void main(String[] args) {
    display();   
    }
    static int fibo(int n){
        if(n==0){
            return 0;
        }else
            if(n==1){
                return 1;
            }else
                return fibo(n-1)+fibo(n-2);
    }
    static void display(){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter Int: ");
        int q = x.nextInt();
        for (int i = -1;i<q;i++){
            int s=i+1;
            System.out.print("f("+s+")"+"\t");
            }
        for(int i= -1;i<q;i++){
            System.out.println();
            for(int y=-1;y<=i;y++){
                int fib=fibo(y+1);
                System.out.print(fib+"\t");
            }
        }         
    }
    
}
