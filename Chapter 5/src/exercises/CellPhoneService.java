package exercises;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minutes;
		int textMessages ;
		int dataUsage;
		String result;
		Scanner input = new Scanner(System.in);

		if(minutes > 500 && dataUsage == 0 && textMessages == 0);
		{
			result = "You need plan A for $49";
		}
		else if(minutes > 500 && dataUsage == 0 && textMessages < 0 );
		{
			result = "You need plan B for $55";
		}
		else if( minutes < 500 && dataUsage == 0 && textMessages == 100 );
		{
			result = "You need plan C for $61";
		}
		else if( minutes < 500 && dataUsage == 0 && textMessages < 100 );
		{
			result = "You need plan D for $71";
		}
		else if( minutes < 500 && dataUsage == 2 && textMessages < 100 );
		{
			result = "You need plan E for $79";
		}
		else if( minutes < 500 && dataUsage < 2 && textMessages < 100 );
		{
			result = "You need plan F for $87";
		}
	
	}

}
