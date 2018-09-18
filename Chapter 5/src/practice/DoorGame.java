package practice;

import java.util.Scanner;

public class DoorGame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int doorChoice = 0;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door and door. \n1- for door One\n1- for door Two\n3- for door Three");
		if(doorChoice == 1)
		{
			result = "Pile of gold";
		}
		else if(doorChoice == 2) 
		{
			result = "Donkey";
		}
			
		else if(doorChoice == 3)
		{
			result = "Barely compitent cashier";
		}
		else
		{
				result= " nothing because that was not a choice";
		}
			displayMessage(result);
	}
		public static void displayMessage(String Result) 
		{
				System.out.println("You won " + Result);
		}
}

