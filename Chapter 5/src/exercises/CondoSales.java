package exercises;

import java.util.Scanner;

public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userChoice;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("Pick a number for condo >> ");
		userChoice =  input.nextInt();
			if (userChoice == 1)
			{
				System.out.println(" You choose Park view for $150,000");
				userChoice =  input.nextInt();
			}
			else if (userChoice == 2)
			{
			System.out.println(" You choose golf course view for $170,000");
			userChoice =  input.nextInt();
			}
			else if (userChoice == 3)
			{
			System.out.println(" You choose lake view for $210,000");
			userChoice =  input.nextInt();
			}
			else if (userChoice > 3)
			{
			System.out.println(" You choose none for $0");
			userChoice =  input.nextInt();
			}

	}

}
