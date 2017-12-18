
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the points [0-60]: ");
        
        int s = Integer.parseInt(reader.nextLine());
        
        int r;
        if (s >= 50)
            r = 5;
        else if ( s >= 45)
            r = 4;
        else if ( s >= 40)
            r = 3;
        else if ( s >= 35)
            r = 2; 
        else if ( s >= 30)
            r = 1;
        else {
            System.out.println("Grade: failed");
            return;
        }
        
        System.out.println("Grade: " + r);
    }
}
