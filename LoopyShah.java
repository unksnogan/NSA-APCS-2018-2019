package loopyLab;

import java.util.Random;
import java.util.Scanner;

public class LoopyShah
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int userInput = 0;
		int myNumber = 0;
		int userReply = 1;
		int n = 1;
		while ( userReply == 1 )
		{
		myNumber = rand.nextInt(181) + 20;
		//System.out.print(myNumber);
		Scanner in = new Scanner(System.in);
		System.out.print( "Welcome to my guessing game pick a number 1 through 200 ");
		userInput = in.nextInt();
		while ( userInput >= 1 && userInput <= 200 )
		{
			while ( n <= 10 - 1 )
			{
				if ( userInput < myNumber )
					{
						System.out.println("Sorry, the mystical number is higher than your number. Guess again? ");
						userInput = in.nextInt();
					}
				else if ( userInput > myNumber )
					{
						System.out.println("Sorry, the mystical number is lower than your number. Guess again? ");
						userInput = in.nextInt();
					}
				else if ( userInput == myNumber )
					{
						System.out.println("Great Job! You guessed the right number! You win!");
						n = 10;
					}
			n++;
				if ( n == 10 )
					System.out.println("Sorry! The number was " + myNumber + ". Good try though!");
			}
			userInput = 300;
		}
		System.out.println("Would you like to play again? Press 1 to play again and any other number to stop. ");
		userReply = in.nextInt();
		}
		System.out.print("Goodbye. I had fun playing with you. Have a nice day!");
		{;}
	}
}