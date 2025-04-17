 /*3.17 (Game: scissor, rock, paper) Write a program that plays the popular scissor-rock
paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can 
wrap a rock.) The program randomly generates a number 0,1, or 2 representing 
scissor, rock, and paper. The program prompts the user to enter a number 0,1, or 
2 and displays a message indicating whether the user or the computer wins, loses, 
or draws. Here are sample runs:
 scissor (0), rock (1), paper (2): 1
 The computer is scissor. You are rock. You won 
scissor (0), rock (1), paper (2): 2
 The computer is paper. You are paper too. It is a draw*/ 

import java.util.Scanner; 

public class GameScissorRockPaper {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int compInput = (int)(Math.random() * 3);

		System.out.print("scissor (0), rock (1), paper (2): ");
		int userInput = input.nextInt();

		if (userInput == 0 && compInput == 1) {
			System.out.println("The computer is rock. You are scissor. You lose");
		}
		else if (userInput == 0 && compInput == 2) {
			System.out.println("The computer is paper. You are scissor. You win");
		}
		else if (userInput == 0 && compInput == 0) {
			System.out.println("The computer is scissor. You are scissor. It is a draw");
		}

		
		if (userInput == 1 && compInput == 0) {
			System.out.println("The computer is scissor. You are rock. You win");
		}
		else if (userInput == 1 && compInput == 2) {
			System.out.println("The computer is paper. You are rock. You lose");
		}
		else if (userInput == 1 && compInput == 1) {
			System.out.println("The computer is rock. You are rock. It is a draw");
		}

		if (userInput == 2 && compInput == 0) {
			System.out.println("The computer is scissor. You are paper. You lose");
		}
		else if (userInput == 2 && compInput == 1) {
			System.out.println("The computer is rock. You are paper. You win");
		}
		else if (userInput == 2 && compInput == 2) {
			System.out.println("The computer is paper. You are paper. It is a draw");
		}
	}
}
		



