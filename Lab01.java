import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean again = true;

		Dice diceGame = new Dice();
		Card cardGame = new Card();

		while (again) {

			int diceNum = diceGame.Throw();
			diceGame.setHistory(diceNum);
			
			int cardNum = cardGame.Pick();
			cardGame.setHistory(cardNum);

			System.out.printf("Dice number: %d\n", diceNum);
			System.out.println("Dice History:");
			for (int i = 0; i < 5; i++)
			{
				System.out.println(diceGame.getHistory(i));
			}
			
			System.out.printf("Card number: %d\n", cardNum);
			System.out.println("Card History:");
			for (int i = 0; i < 5; i++)
			{
				System.out.println(cardGame.getHistory(i));
			}

			System.out.printf("\nEnter 1 to play again: ");
			int playAgain = input.nextInt();
			if (playAgain != 1)
				again = false;

		}
	}
}
