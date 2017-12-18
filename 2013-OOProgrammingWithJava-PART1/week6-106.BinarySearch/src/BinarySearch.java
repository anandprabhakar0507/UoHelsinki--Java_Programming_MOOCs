public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;
        int middle = (beginning + end) / 2;
        
        //invariant: middle is the midpoint between beginning and end.
        while (beginning < end) {
            if (searchedValue > array[middle]){
                beginning = middle + 1;
            } else{
                end = middle;
            }
            middle = (beginning + end) / 2; //invariant
        }
            

            // restrict the search area 
        
        return array[middle] == searchedValue;
    }
}
