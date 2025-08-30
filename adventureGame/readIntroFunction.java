package adventureGame;
import java.nio.file.*;
import java.io.IOException;
import java.util.List;



public class readIntroFunction {
	
	public static void printIntro() {
	try {
		List<String> lines = Files.readAllLines(Paths.get("intro.txt"));
		
		for (String line : lines) {
			System.out.println(line);
		}
	} catch (IOException ex) {
		ex.printStackTrace();
	}
	}	
}

	

	


