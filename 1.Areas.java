
package areas;
import java.util.*;

public class Areas {

   
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
        System.out.println("Enter Radius: ");
        double r = input.nextDouble();
        System.out.println("Triangle Base: ");
        int b =input.nextInt();
        System.out.println("Triangle Height: ");
        int c =input.nextInt();
        System.out.println("Enter a Square Side: ");
        int a =input.nextInt();
        
        
        double circle = Math.PI*Math.pow(r,2);
        double triangle = b*c/2;
        double square = Math.pow(s,2);
        
        
        System.out.println("Area of a circle"+circle);
        System.out.println("Area of a triangle"+triangle);
        System.out.println("Area of a square"+square);
        
        
        
      
    }
    
}
