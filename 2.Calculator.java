
package calculator;
import java.util.*;

public class Calculator {

    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int sum;
        System.out.println("enter value a: ");
        int a = in.nextInt();
        System.out.println("enter value b: ");
        int b = in.nextInt();
        System.out.println("Enter arithmetic operator: ");
        String user = in.next();
        switch(user){
            case("+"):
            case("add"):
                sum=a+b;
                System.out.println("the sum is=" +sum);
                break;
            case("subtract"):
            case("-"):
                sum=a-b;
                System.out.println("the difference is="+sum);
                break;
            case("multiply"):
            case("*"):
                sum=a*b;
                System.out.println("the qoutient is ="+sum);
                break;
            case("modulo"):
            case("%"):
                sum=a%b;
                System.out.println("the modulo is = "+sum);
                break;
            default:
                System.out.println("hm hm hm no no no");
                    
        }
    }
    
}
