
package javaapplication1;
import java.util.*;



public class Guessinggame {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
       int player1value = 0;
       int success = 0;
       int guess = 0 ;
       int x = 0;
       
       
        System.out.println("enter a number");
        player1value = input.nextInt();
        for (x=0; x < 50; x++){
            x++; System.out.println("");
        }
       
       while (success ==0)
     {
        System.out.println("please enter a number(1-1000): ");
        guess = input.nextInt();
        

           if (guess < 1 || guess > 1000){
              System.out.println("Wrong");
           }
           

           else if (guess == player1value){
              success++;
              System.out.println("Correct");

           }
           else if (guess < player1value){
              System.out.println("Your guess is too low!");
              if (player1value %2 == 0)
                   System.out.println("the number is even");
           }
           else if (guess > player1value){
              System.out.println("Your guess is too high!");
              if (player1value %2 != 0)
                   System.out.println("the number is odd");
    }
    }
  
        
        
        
        
        
        
        
        
        
        

    
    }
    
}
