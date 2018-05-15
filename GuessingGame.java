package loopyLab;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);    
		int mysteryNum = 0;
		int guess = 0;
		boolean playAgain = true;
		int numGuesses = 0;
		
		while (playAgain)
		{
			Random rand = new Random(); 
			mysteryNum = rand.nextInt(200)+1;
		
			System.out.println ("I am thinking of an integer between 1 and 200." );
			while (guess != mysteryNum && numGuesses < 10)
			{
				System.out.print ("Type your guess in the console window and press return: " );
				while (guess >200 || guess < 1)
				{
					guess = in.nextInt();
					if (guess > 200 || guess < 1 )
					{
						System.out.println ("I said, between 1 and 200, Silly!  Try again." );
						guess = 0;
					}
				}
				if (guess < mysteryNum)
					{System.out.println ("Your guess is too low.  Please guess again." );}
				else
					{System.out.println ("Your guess is too high.  Please guess again." );}
				numGuesses++;
			}
		
			System.out.println ();
			if (numGuesses<10)
				System.out.println ("Yay, in only "+ numGuesses + " tries, you guessed my number, " + mysteryNum +"!" );
			else 
			{
				System.out.println ("Sorry, I Win! My number was " + mysteryNum);
				if (mysteryNum > guess && mysteryNum - guess < 10 || mysteryNum < guess && guess - mysteryNum < 10)
					{System.out.println ("You were pretty close :).");}
				else if (mysteryNum > guess && mysteryNum - guess > 20 || mysteryNum < guess && guess - mysteryNum > 20)
						{System.out.println("You were not very close :(");}
			}
			
			numGuesses = 0;
			System.out.println ("If you would like to play again, type y and press enter. " );
			playAgain = (in.next().compareTo("y")== 0);      
		}
	}
}
