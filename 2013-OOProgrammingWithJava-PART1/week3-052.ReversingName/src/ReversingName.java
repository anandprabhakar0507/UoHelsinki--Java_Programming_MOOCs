import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String in = reader.nextLine();
        
        System.out.print("In reverse order: ");
        int i = in.length()-1;
        for(int j = i; j >=0; j--)
            System.out.print(in.charAt(j));
        System.out.println("");
    }
}
