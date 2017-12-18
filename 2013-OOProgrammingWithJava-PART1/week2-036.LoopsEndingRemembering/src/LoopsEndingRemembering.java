import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        List<Integer> nums = new ArrayList();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int i = 0;
        while ( i != -1){
            i = Integer.parseInt(reader.nextLine());
            nums.add(i);
        }
        
        System.out.println("Thank you and see you later!");
        
        Iterator itr = nums.iterator();
        double sum = 0;
        int c = 0;
        int even = 0;
        int odd = 0;
        
        int next = (Integer)itr.next();
        while (next != -1){
            
            sum += next;
            c+=1;
            if (next%2 ==0)
                even++;
            else
                odd++;
            next = (Integer)itr.next();
        }
        
        System.out.println("The sum is " + (int)sum);
        System.out.println("How many numbers: " + c);
        System.out.println("Average: " + sum/c);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: "+ odd);
        
        
    }
}
