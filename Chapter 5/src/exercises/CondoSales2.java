package exercises;

import java.util.Scanner;

public class CondoSales2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int userChoice;
		int garageChoice;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like a garage 1 for yes 2 for no >> ");
		garageChoice =  input.nextInt();
		
		if(garageChoice== 2) 
		{
		System.out.println("Pick a number for condo without a garage >> ");
		userChoice =  input.nextInt();
			if (userChoice == 1)
			{
				System.out.println(" You choose Park view for $150,000");
				
			}
			else if (userChoice == 2)
			{
				System.out.println(" You choose golf course view for $170,000");
			}
			else if (userChoice == 3)
			{
				System.out.println(" You choose lake view for $210,000");
			
			}
			else if (userChoice > 3)
			{
				System.out.println(" You choose none for $0");
			}
		}
		else if(garageChoice == 1) 
		{
			System.out.println("Pick a number for condo with a garage >> ");
			userChoice =  input.nextInt();
			if (userChoice == 1)
			{
				System.out.println(" You choose Park view with garage for $155,000");
				
			}
			else if (userChoice == 2)
			{
			System.out.println(" You choose golf course view with garage for $175,000");
			
			}
			else if (userChoice == 3)
			{
			System.out.println(" You choose lake view with garage for $215,000");
			
			}
			else if (userChoice > 3)
			{
			System.out.println(" You choose none for $0");
			
			}
		}
	}
}
			
			
			

	



