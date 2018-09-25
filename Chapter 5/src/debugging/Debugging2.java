package debugging;
import java.util.Scanner;
public class Debugging2
{
   public static void main(String args)
		   // FixDebugFive2.java
		   // Decides if two numbers are evenly divisible
   {
      int num;
      int num2;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number ");
      num = input.nextInt();
      System.out.print("Enter another number ");
      num2 = (int) input.nextDouble();
      if((num % num2 <= 0) | (num2 / num) <= 0);
         System.out.println("One of these numbers is evenly divisible into the other");
 
         System.out.println("Neither of these numbers is evenly divisible into the other");

   }

}