
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account act1 = new Account("Some account", 100.00);
        
        act1.deposit(20);
        
        System.out.println(act1.toString());
    }

}
