import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int c = 0;
        for(Integer num : list)
            c+=num;
        return c;
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        return sum(list)/((double)list.size());
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double mean = average(list);
        double deltaSquareSum = 0;
        
        for ( Integer i : list)
            deltaSquareSum += Math.pow(mean - i, 2);
        
        return deltaSquareSum/(list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
