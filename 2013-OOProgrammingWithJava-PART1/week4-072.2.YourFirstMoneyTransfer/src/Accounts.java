
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        Account act1 = new Account("Matt's account", 1000);
        Account myAct = new Account("My account", 0);
        
        act1.withdrawal(100);
        myAct.deposit(100);
        
        System.out.println(act1.toString());
        System.out.println(myAct.toString());
        
        
    }

}
