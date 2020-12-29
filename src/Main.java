
import java.util.Random;
import java.util.Scanner;




public class Main {
    
 


    public static void main(String[] args) {
        
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        
       
        System.out.println("shoot the number that computer picked [0-100]");
        int yourNumber;
        int attempts = 0;
    
         
         do {
         
         attempts++;
         Scanner scanner = new Scanner(System.in);
         yourNumber = scanner.nextInt();
        
         if(yourNumber == randomNumber)  {
           System.out.println("great, you did it, computer picked " + randomNumber);  
           System.out.println("u needed " + attempts + " attempts");
         }
                 
         else if (yourNumber > randomNumber) 
             System.out.println("too high, pick lower number");  
         
         else 
             System.out.println("too low, pick higher number");

         }
         while(yourNumber != randomNumber);
         
}
