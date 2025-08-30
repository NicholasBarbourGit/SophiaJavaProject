package adventureGame;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class investigateDoor {
	

	public static void printDoor() {
	try {
		List<String> lines = Files.readAllLines(Paths.get("door.txt"));
		
		for (String line : lines) {
			System.out.println(line);
		}
	} catch (IOException ex) {
		ex.printStackTrace();
	}
	
}
	
	public static void selectDoor(Scanner scanner) {
		ArrayList<String> doorSelection = new ArrayList<>();
		doorSelection.add("Select the castle door...");
		doorSelection.add("Select the rocket door...");
		
		System.out.println("\nChoose a door:");
		for (int i = 0; i < doorSelection.size(); i++) {
			System.out.println((i + 1) + ". " + doorSelection.get(i));
		}
		
		int intDoor = scanner.nextInt();
		
		if (intDoor < 1 || intDoor > doorSelection.size()) {
			System.out.println("Please select a valid option!");
		}
		String selectedDoor = doorSelection.get(intDoor - 1);
		
		//  calls function from bed class	
		if (selectedDoor.equals("Select the castle door...")) {
			readPortalText();
			castleDoor.printCastle();
			castleDoor.castleOptions(scanner);
			return;
		}
	//  calls function from wall class	
		else if (selectedDoor.equals("Select the rocket door...")) {
			readPortalText();
			rocketDoor.printRocket();
			return;
			
		}
		
	}
	
	public static void readPortalText() {
	try {
		List<String> lines = Files.readAllLines(Paths.get("portalText.txt"));
		
		for (String line : lines) {
			System.out.println(line);
		}
	} catch (IOException ex) {
		ex.printStackTrace();
	}
	}	
}

