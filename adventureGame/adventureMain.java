package adventureGame;
import java.util.Scanner;
import java.util.ArrayList;


public class adventureMain {
	
public static	ArrayList<String> inventory = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to your adventure!");
		System.out.println("Are you ready???");
		System.out.println("Press 'Enter' to continue...");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine(); // wait for enter
		
		
		
		readIntroFunction.printIntro(); // calls the intro function from the read intro function class
		

		
	//	initialSelection.printIntialSelection()
		initialSelection.runSelection(scanner);
		
	}
}
