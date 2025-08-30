package adventureGame;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class castleDoor {
	
	public static void printCastle() {
	try {
		List<String> lines = Files.readAllLines(Paths.get("castleText.txt"));
		
		for (String line : lines) {
			System.out.println(line);
		}
	} catch (IOException ex) {
		ex.printStackTrace();
	}
		
}
	
	public static void	castleOptions(Scanner scanner) {
		ArrayList<String> castleSelection = new ArrayList<>();
		castleSelection.add("Speak to the charging knight...");
		castleSelection.add("Duck and run for cover...");
		castleSelection.add("Attack!");
		
		System.out.println("\nHow would you like to proceed?");
		
		for (int i = 0; i < castleSelection.size(); i++) {
			System.out.println((i + 1) + ". " + castleSelection.get(i));
		}
		
		int intCastle = scanner.nextInt();
		
		if (intCastle < 1 || intCastle > castleSelection.size()) {
			System.out.println("Please select a valid option!");
		}
		
		String selectedCastle = castleSelection.get(intCastle -1);
		
		if(selectedCastle.equals("Speak to the charging knight...")) {
			System.out.println("The knight has no interest in speak. He pulls out his sword and impales you.");
			System.out.println("You have died. ");
			
		}
		
		else if(selectedCastle.equals("Duck and run for cover...")) {
			System.out.println("Thinking you are a foe, the knight quickly pivots and impales you.");
			System.out.println("You have died.");
			
		}
		
		else if(selectedCastle.equals("Attack!")) {
			int attackRoll = randomNumberGenerator.attackRoll();
			if(attackRoll>= 15) {
				try {
					List<String> lines = Files.readAllLines(Paths.get("savingCastle.txt"));
					
					for (String line : lines) {
						System.out.println(line);
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			else {
				System.out.println("You telegraph your attack and the knight blocks the dagger. You feel the breath forced from your lungs. You look down to see\nyour chest impaled by his sword.");
				System.out.println("You...have...died....");
			}
		}
	}
}
