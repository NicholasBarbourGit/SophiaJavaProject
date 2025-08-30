package adventureGame;

import java.util.ArrayList;

public class investigateWalls {
	
	public static void findShield(){
		System.out.println("You have found a shield!");
		System.out.println("The shield has been added to your inventory.");
		
		adventureMain.inventory.add("Shield");
	}

}

