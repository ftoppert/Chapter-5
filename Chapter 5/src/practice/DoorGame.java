package practice;

import java.util.Scanner;

public class DoorGame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int doorChoice;
		int chestChoice ;
		int bookChoice = 0 ;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door and door. \n1- for door One\n1- for door Two\n3- for door Three");
		doorChoice = input.nextInt();
		if(doorChoice == 1)
		{
			System.out.println("Door 1 good choice choose amoung the following Chests");
			System.out.println("1- For chest one/n2-forchest two");
			chestChoice = input.nextInt();
		}
			else if(chestChoice == 1)
			{
				result = "Pile of gold";
			}
			else if (chestChoice ==2) 
			{
			result= "EMPTY HAHAHAHAH";
			}
			else
			{
				result = " just kidding, I said 1 or 2! Now die!";
		}
		else if (doorChoice == 2) 
		{
			result = "Donkey";
		}
			
		else if(doorChoice == 3)
		{
			result = "Barely compitent cashier";
		}
		else if(doorChoice == 999) 
		{
		System.out.println("You enter a special room with 3 books on the table, there are no +" + "words on the cover. Do you choose Book 1, Book 2< or Book 3?");
		bookChoice = input.nextInt();
			if(bookChoice == 1)
			{
			result = "Harry Potter";
			}
			else if(bookChoice == 2)
			{}
			result = "The Help";
		}
		else if(bookChoice == 3)
		{
			result = "The Unwanteds";
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

