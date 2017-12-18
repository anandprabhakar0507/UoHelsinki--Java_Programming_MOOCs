
import java.util.ArrayList;
import java.util.Iterator;

// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

public class Application {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(1);
        nums.add(1);
        
        Iterator<Integer> itr = nums.iterator();
        
        while (itr.next().equals(1))
            System.out.println("ok");
        
        

    }
}
