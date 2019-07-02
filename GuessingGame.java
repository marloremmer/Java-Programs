import java.util.*;
//Macaraeg Marlo Remmer P.
public class GuessingGame{

	public static void main (String [] args)
	{
	
		Scanner in = new Scanner(System.in);
		
		
		for (int loops =1 ; loops>=1; loops++){
		try 
		{
			System.out.print("\nGuess a number from 1 to 50!");
			System.out.print("\nEnter your Guess: ");
			int guess = in.nextInt();
			if (guess==34)
			{
				System.out.print("Process Completed");
				break;
			}
			else if (guess > 50)
			{
				System.out.print("Too High. Try Again");
			}
			else 
			{
				System.out.print("Too Low. Try Again");
			}
			
		}
	
		catch (InputMismatchException ex)
		{
		  System.out.print("Invalid Input");
		  break;
		}
		
		finally 
		{
		  System.out.print("\nThank you.");
		}
		
	}
}
}
