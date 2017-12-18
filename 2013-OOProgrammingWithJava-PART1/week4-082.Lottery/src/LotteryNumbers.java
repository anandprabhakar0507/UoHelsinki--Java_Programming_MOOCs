import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    Random randomizer = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        for(int i = 0; i < 7; i++){
            int num = randomizer.nextInt(39)+1;
            if (!containsNumber(num))
                numbers.add(num);
            else
                i--;
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return numbers.contains(number);
    }
}
