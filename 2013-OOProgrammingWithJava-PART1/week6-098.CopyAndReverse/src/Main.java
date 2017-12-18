

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int[] copy(int[] array){
        int[] copy = new int[array.length];
        
        for(int i = 0; i < array.length; i++)
            copy[i] = array[i];
        return copy;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] copy = new int[array.length];
        
        for(int i = 0; i < array.length; i++)
            copy[array.length - i - 1] = array[i];
        return copy;
    }
    
}
