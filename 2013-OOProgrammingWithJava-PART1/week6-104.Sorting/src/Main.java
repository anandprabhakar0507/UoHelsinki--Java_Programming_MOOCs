
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);   
    }
    
    public static int smallest(int[] array) {
        int min = array[0];
        
        for(int i = 0; i < array.length; i++)
            min = Math.min(min, array[i]);
        
        return min;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int min = smallest(array);

        for(int i = 0; i < array.length; i++)
            if (min == array[i])
                return i;
        return indexOfTheSmallest(array); //if infinite loop, then somethign is wrong with this method.
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int min = array[index];
        int minIndex = index;
        for(int i = index; i < array.length; i++){
            if (array[i] < min){
                minIndex = i;
                min = array[i];
            }
        }
        return minIndex; //if infinite loop, then somethign is wrong with this method.
    }
    
    public static void swap(int[] array, int i, int j){
        int hold = array[i];
        array[i] = array[j];
        array[j] = hold;
    }
    
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++){
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
    
}
