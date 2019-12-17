import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		//Create a random number for the user to guess
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		do {
			int theNumber = (int)((2 *(Math.random()* 100 + 1)) - 100);
			int guess = 0;
			int numberofTries = 0;
			while (guess != theNumber) {
				System.out.println("Guess a number between -100 and 100");
				numberofTries= numberofTries + 1;
				guess = scan.nextInt();
				if (guess < theNumber)
					System.out.println(guess + " is too low. Try again.");
				else if (guess > theNumber)
					System.out.println("You entered " + guess + ". It's too high. Try Again.");
				else if (guess == theNumber)
					System.out.println(guess + "is correct. You win. "
							+ "It only took you " + numberofTries + "tries! Good Work!" );
				else
					System.out.println(guess + "is not a valid number :/" );
					
				// End of while loop for guessing
			}
			System.out.println("Would you like to play again (y/n)?");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("thank you for playing! Goodbye.");
		scan.close();
	}
}
