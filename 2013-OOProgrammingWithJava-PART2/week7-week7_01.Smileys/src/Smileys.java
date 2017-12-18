
public class Smileys {
    private static String framePattern = "XD";
    
    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        String mid = middleRow(characterString);
        String frame = frame(mid.length());
        
        System.out.println(frame);
        System.out.println(mid);
        System.out.println(frame);
        
    }

    private static String middleRow(String characterString){
        int rightSpacerLength = framePattern.length() - characterString.length()%framePattern.length() - 1;
        if (rightSpacerLength == 0)
            rightSpacerLength = framePattern.length();
        String rightSpacer = "";
        for (int i = 0; i < rightSpacerLength; i++)
            rightSpacer += " ";
        
        return framePattern + " " + characterString + rightSpacer + framePattern;
    }
    
    private static String frame(int length){
        String frame = "";
        for (int i = 0; i < length; i+=framePattern.length())
            frame += framePattern;
        return frame;
    }
    
    
}
