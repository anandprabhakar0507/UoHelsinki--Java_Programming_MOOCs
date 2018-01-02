
public class Main {

    public static void main(String[] args) {
          System.out.println(clockTime("00:54:34"));
    }
    
    public static boolean isAWeekDay(String string){
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public static boolean allVowels(String string){
        return string.matches("[aeiouäö]*");
    }
    
    public static boolean clockTime(String string){
        return string.matches("(([0-1]\\d)|(2[0-3]))(:[0-5]\\d:[0-5]\\d)");
    }
}
