package adventureGame;

import java.util.ArrayList;

public class investigateBed {
	public static void findDagger(){
		System.out.println("You have found a dagger!");
		System.out.println("The dagger has been added to your inventory.");
		
		adventureMain.inventory.add("Dagger");
	}

}

