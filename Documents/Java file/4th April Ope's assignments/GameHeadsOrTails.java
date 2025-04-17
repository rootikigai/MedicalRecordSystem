import java.util.Scanner; 

public class GameHeadsOrTails {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int flipResult = (int)(Math.random() * 2);

		System.out.print("Head (0), Tail (1): ");
		int userGuess = input.nextInt();

		if (userGuess == 0 && flipResult == 1) {
			System.out.print("Coin landed on tail. You chose head. You are wrong");
		}
		else if (userGuess == 0 && flipResult == 0) {
			System.out.print("Coin landed on head. You chose head. You are right");
		}
		else if (userGuess == 1 && flipResult == 0) {
			System.out.print("Coin landed on head. You chose tail. You are wrong");
		}
		else if (userGuess == 01&& flipResult == 1) {
			System.out.print("Coin landed on tail. You chose tail. You are right");
		}
	}
}