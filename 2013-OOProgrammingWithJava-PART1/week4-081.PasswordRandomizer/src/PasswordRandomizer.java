import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    int length;
    final String chars = "abcdefghijklmnopqrstuvwxyz";
    Random randomizer = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pw = "";
        for(int i = 0; i < length; i++)
            pw += chars.charAt(randomizer.nextInt(chars.length()));
        return pw;
    }
    
    
}
