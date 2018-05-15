package loopyLab;

import java.util.Scanner;

public class ColumnsOfNumbersFor
{
	public static void main(String[] args) 
	{
		boolean playAgain = true;
		int userInput=0;
		Scanner in = new Scanner(System.in);    

		while (playAgain) 
		{
			System.out.print ("Please type an integer in the console window and press return: " );
			userInput = in.nextInt(); 
			int widest = Integer.toString(userInput).length();					// # of digits in the highest number
		
			for (int i=1 ; i <=userInput ; i++)									// loop to print numbers in columns
			{
				int widthOfCurrentNumber = Integer.toString(i).length();
				for ( int j = 0 ; j < widest - widthOfCurrentNumber ; j++ )     // loop to create spaces to line-up the different width numbers
					{System.out.print(" ");}
				System.out.print(i + " ");
				if (i % 3 == 0 || i == userInput)								// starts a new line after each three numbers are printed
					System.out.println();
					
			}
			System.out.print ("If you would like to play again, please type y and press enter. " );
			playAgain = (in.next().compareTo("y")== 0);      
		}
	}
}