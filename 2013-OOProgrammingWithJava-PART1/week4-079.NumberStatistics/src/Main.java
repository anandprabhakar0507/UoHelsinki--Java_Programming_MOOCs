import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        System.out.println("Type numbers:");
        int in = Integer.parseInt(reader.nextLine());
        NumberStatistics stuff = new NumberStatistics();
        NumberStatistics evenStuff = new NumberStatistics();
        NumberStatistics oddStuff = new NumberStatistics();
        
        while (in != -1){
            stuff.addNumber(in);
            if (in%2 == 0)
                evenStuff.addNumber(in);
            else
                oddStuff.addNumber(in);
            in = Integer.parseInt(reader.nextLine());
        }
        System.out.println("sum: " + stuff.sum());
        System.out.println("sum of even: " + evenStuff.sum());
        System.out.println("sum of odd: " + oddStuff.sum());
            
        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order

    }
}
