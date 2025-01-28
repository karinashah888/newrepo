
//	
// Name: Shah, Karina
// Homework: 2
// Due: Sep 19
// Course: cs-1400-05-f24
// This program will make change with coins
//


import java.util.Scanner;

public class MakeChange
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int changeAmount; // = 86; // cents

		System.out.print("\n");
		System.out.print("Change by K. Shah\n");
		System.out.print("\n");

		System.out.print("Enter change amount?");

		changeAmount = keyboard.nextInt();
		System.out.print("\n");

		if((changeAmount / 25) >= 1)
		{
			if((changeAmount / 25) > 1)
			{
				System.out.println("Quarters -> " + (changeAmount / 25));
			}
			else
			{
				System.out.println("Quarter -> " + (changeAmount / 25));
			}
		}
		changeAmount = changeAmount % 25; // what is left after taken out the quarters

		if((changeAmount / 10) >= 1)
		{
			if((changeAmount / 10) > 1)
			{
				System.out.println("Dimes -> " + (changeAmount / 10));
			}
			else
			{
				System.out.println("Dime -> " + (changeAmount / 10));
			}
		}
		changeAmount = changeAmount % 10; // what is left after taken out the dimes

		if((changeAmount / 5) >= 1)
		{
			if((changeAmount / 5) > 1)
			{
				System.out.println("Nickels -> " + (changeAmount / 5));
			}
			else
			{
				System.out.println("Nickel -> " + (changeAmount / 5));
			}
		}

		if((changeAmount / 1) >= 1)
		{
			if((changeAmount / 1) > 1)
			{
				System.out.println("Pennys -> " + (changeAmount % 5)); // what is left after taken out the nickels
			}
			else
			{
				System.out.println("Penny -> " + (changeAmount % 5));
			}
		}

		System.out.print("\n");

	}
}