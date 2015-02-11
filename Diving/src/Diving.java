import java.util.Scanner;

public class Diving 
{
	static Scanner keyboard = new Scanner(System.in);
	static double score[] = new double[7];
	static double difficulty = 0;
	static double sum = 0;
	static double total = 0;
	static double total1= 0;
	public static void main(String[] args)
	{
		//Call valid scores method
		inputValidScores();
		//Call degree of difficulty method
		inputValidDegreeOfDifficulty();
		//Call score calculator method
		calculateScore();
		
	}
	//Receive scores from user
	public static void inputValidScores()
	{
		for(int i=0; i<score.length; i++)
		{
			System.out.println("Enter diver's score (1-10): ");
			score[i] = keyboard.nextDouble();
			//If user enters score less than one, display error
			if (score[i] < 1)
			{
				System.out.println("Invalid score entry");
				System.out.println("Please restart program and try again.");
				System.exit(0);
			}
			//If user enters score greater than 10, display error
			else if (score[i] > 10)
			{
				System.out.println("Invalid score entry.");
				System.out.println("Please restart program and try again.");
				System.exit(0);
			}
			sum+=score[i];
		}
	}
	//Receive degree of difficulty from user
	public static void inputValidDegreeOfDifficulty()
	{
		System.out.println("Enter diver's degree of difficulty from 1.2 to 3.8: ");
		difficulty = keyboard.nextDouble();
		//If user enters difficulty less than 1.2, display error
		if (difficulty < 1.2)
		{
			System.out.println("Invalid input for difficulty.");
			System.out.println("Please restart program and try again.");
			System.exit(0);
		}
		//If user enters difficulty greater than 3.8, display error
		else if (difficulty > 3.8)
		{
			System.out.println("Invalid input for difficulty.");
			System.out.println("Please restart program and try again.");
			System.exit(0);
		}
		
	}
	//Calculate the diver's score
	public static void calculateScore()
	{
	total = difficulty*sum;
	total1 = total*0.6;
	System.out.println("The diver's score is: " + total1);
	}
}
