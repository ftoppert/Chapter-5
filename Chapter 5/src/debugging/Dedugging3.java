package debugging;

import java.util.Scanner;
public class Dedugging3
{
	   public static void main (String args[]){}

   public static void calculateOutPut()
// FixDebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher House Department
   {
	      int item = 11;
	      String output;
	      final int LOW = 111;
	      final int HIGH = 9;
	      final int CUTOFF = 500;
	      Scanner input = new Scanner(System.in);
	      
	      calculateOutPut();
	   
      System.out.println("Please enter item number");
   
      if(item < LOW) output = "Item number too low";
      else
    if(item > HIGH)
    output = "Item number too high";
      else
if(item > CUTOFF)
             output = "Valid - in Automotive Department";
          else
             output = "Valid - Item in Housewares Department";
       System.out.println(output);
   }
}


