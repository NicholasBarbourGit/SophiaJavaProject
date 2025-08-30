package adventureGame;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class rocketDoor {

	
	public static void printRocket() {
	try {
		List<String> lines = Files.readAllLines(Paths.get("rocketText.txt"));
		
		for (String line : lines) {
			System.out.println(line);
		}
	} catch (IOException ex) {
		ex.printStackTrace();
	}
	}
	
	public static void	rocketOptions(Scanner scanner) {
		ArrayList<String> rocketSelection = new ArrayList<>();
		rocketSelection.add("Talk to the person who bumped into you...");
		rocketSelection.add("Head towards the other portion of the ship...");
		
		System.out.println("\nHow would you like to proceed?");
		
		for (int i = 0; i < rocketSelection.size(); i++) {
			System.out.println((i + 1) + ". " + rocketSelection.get(i));
		}
		
		int intRocket = scanner.nextInt();
		
		if (intRocket < 1 || intRocket > rocketSelection.size()) {
			System.out.println("Please select a valid option!");
		}
		
		String selectedRocket = rocketSelection.get(intRocket -1);
		
		if(selectedRocket.equals("Talk to the person who bumped into you...")) {
			System.out.println("The knight has no interest in speak. He pulls out his sword and impales you.");
			System.out.println("You have died. ");
			
		}
		
		else if(selectedRocket.equals("Head towards the other portion of the ship...")) {
			int savingRoll = randomNumberGenerator.savingRoll();
			if(savingRoll>= 15) {
				try {
					List<String> lines = Files.readAllLines(Paths.get("savingRocket.txt"));
					
					for (String line : lines) {
						System.out.println(line);
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			else {
				try {
					List<String> lines = Files.readAllLines(Paths.get("failedRocket.txt"));
					
					for (String line : lines) {
						System.out.println(line);
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
		}
	}
		
	}
}

