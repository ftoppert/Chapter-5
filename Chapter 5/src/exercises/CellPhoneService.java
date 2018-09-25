package exercises;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minutes;
		int textMessages ;
		int dataUsage;
		String result = null;
		Scanner input = new Scanner(System.in);
		System.out.println("How many minutes are you going to use? >> ");
		minutes = input.nextInt();
		System.out.println("How much data usage are you planning on using? >>");
		dataUsage = input.nextInt();
		System.out.println("How many text messages are hoping to send? >> ");
		textMessages = input.nextInt();
		

		if(minutes > 500 && dataUsage == 0 && textMessages == 0)
		{
			result = "You need plan A for $49";
		}
		else if(minutes > 500 && dataUsage == 0 && textMessages < 0 )
		{
			result = "You need plan B for $55";
		}
		else if( minutes < 500 && dataUsage == 0 && textMessages == 100 )
		{
			result = "You need plan C for $61";
		}
		else if( minutes < 500 && dataUsage == 0 && textMessages < 100 )
		{
			result = "You need plan D for $71";
		}
		else if( minutes < 500 && dataUsage == 2 && textMessages < 100 )
		{
			result = "You need plan E for $79";
		}
		else if( minutes < 500 && dataUsage < 2 && textMessages < 100 )
		{
			result = "You need plan F for $87";
		}
	
				System.out.print(result);

		}
	
	}


