package adventureGame;

import java.util.ArrayList;
import java.util.Scanner;

public class initialSelection {
	
	public static void printIntialSelection() {
		System.out.println("\nWould you like to \n1. Inspect your Bed \n2. Inspect the walls? \n3. Inspect the doors? ");
	
	}
	
	public static void runSelection(Scanner scanner) {
		//Dynamically keep track of options
		
				ArrayList<String> selectionOptions = new ArrayList<>();
				selectionOptions.add("Investigate the Bed...");
				selectionOptions.add("Investigate the Walls...");
				selectionOptions.add("Investigate the Doors...");
				
				
				
				while (!selectionOptions.isEmpty()) {
				
				System.out.println("\nPlease make a selection...");
				for (int i = 0; i < selectionOptions.size(); i++) {
					System.out.println((i + 1) + ". " + selectionOptions.get(i));
				}
				
				
			//	input selected option
				int selection = scanner.nextInt();
				
			
			// ensures that the player selects a valid option from the menu	
			if (selection < 1 || selection > selectionOptions.size()) {
				System.out.println("Please select a valid option!");
				continue;
			}
			
			String chosen = selectionOptions.get(selection -1);
			
			//  calls function from bed class	
				if (chosen.equals("Investigate the Bed...")) {
					investigateBed.findDagger();
					selectionOptions.remove("Investigate the Bed..."); // removes the option from the ArrayList
					continue;
				}
			//  calls function from wall class	
				else if (chosen.equals("Investigate the Walls...")) {
					investigateWalls.findShield();
					selectionOptions.remove("Investigate the Walls..."); // removes the option from the ArrayList
					continue;
					
				}
			//  calls function from door class	
				else if (chosen.equals("Investigate the Doors...") ) {
					investigateDoor.printDoor();
					investigateDoor.selectDoor(scanner);
					return;
					
					
					
				}
			// 	restarts the menu selection if the play selects an invalid option	
				else {
					System.out.println("Please Select a Valid Option");
					initialSelection.printIntialSelection();
					continue; //go back to the menu instead of reprinting manually
				}

			}
			}
	}


