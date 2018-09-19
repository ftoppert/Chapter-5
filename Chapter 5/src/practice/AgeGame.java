package practice;

import java.util.Scanner;

public class AgeGame 
{

	

	public static void main(String[] args) 
	{
		
			int usersAge;
			String result = null;
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter your age to be insulted");
			usersAge = input.nextInt();
			
	
			if(usersAge >= 12)
			{
				result = "You are a child. Go away.";
			}
			else if(usersAge >= 13 && usersAge <= 18)
			{
				result = "You are a snotty teen";
			}
			else if(usersAge >= 19 && usersAge <= 25)
			{
				result = "Get a Job";
			}
			else if(usersAge >= 26 && usersAge <= 30)
			{
				result = "Get a girlfriend";
			}
			else if(usersAge >= 30 && usersAge <= 40)
			{
				result = "Wow still no girlfriend";
			}
			else if(usersAge >= 41 && usersAge <= 50)
			{
				result = "Your moms not proud of you";
			}
			else if(usersAge >= 51 && usersAge <= 60)
			{
				result = "You're gonna die soon";
			}
			else if(usersAge >= 61 && usersAge <= 61)
			{
				result = "die";
			}
	
			
			
			System.out.println(result);
	}

}
