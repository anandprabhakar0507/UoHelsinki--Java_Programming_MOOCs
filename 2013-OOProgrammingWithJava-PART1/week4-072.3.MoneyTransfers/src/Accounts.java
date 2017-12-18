
public class Accounts {

    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
    
    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account actA = new Account("A", 100);
        Account actB = new Account("B", 0);
        Account actC = new Account("C", 0);
        
        transfer(actA, actB, 50);
        transfer(actB, actC, 25);
        
        
    }


}
