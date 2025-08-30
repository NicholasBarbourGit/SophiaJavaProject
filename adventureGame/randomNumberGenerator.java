package adventureGame;
import java.util.Random;

public class randomNumberGenerator {

    public static int attackRoll() {
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        System.out.println("Your random number is: " + randomNumber);
        return randomNumber;
    }
	

public static int savingRoll() {
    Random random = new Random();
    int randomNumber = random.nextInt(20) + 1;
    System.out.println("Your random number is: " + randomNumber);
    return randomNumber;
}
}

