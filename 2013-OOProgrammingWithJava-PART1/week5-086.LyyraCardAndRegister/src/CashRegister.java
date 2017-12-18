
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister(double startingCash){
        this.cashInRegister = startingCash;
    }
    public CashRegister() {
        // at start the register has 1000 euros 
        this(1000);
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double price = 2.5;
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= price){
        //    the price of lunch is added to register
            cashInRegister += price;
        //    the amount of sold lunch is incremented by one
            economicalSold++;
        //    method returns cashGiven - lunch price 
            return cashGiven - price;
        
        // if not enough money given, all is returned and nothing else happens  
        } else
            return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double price = 4.0;
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= price){
        //    the price of lunch is added to register
            cashInRegister += price;
        //    the amount of sold lunch is incremented by one
            gourmetSold++;
        //    method returns cashGiven - lunch price 
            return cashGiven - price;
        // if not enough money given, all is returned and nothing else happens
        } else
            return cashGiven;
    }
    
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        double price = 2.5;
        boolean successQ = card.pay(price);
        if (successQ)
            economicalSold++;
        return successQ;
    }

    public boolean payGourmet(LyyraCard card) {
        double price = 4;
        boolean successQ = card.pay(price);
        if (successQ)
            gourmetSold++;
        return successQ;
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        
        if (sum > 0){
            card.loadMoney(sum);
            cashInRegister+=sum;
        }
    }
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}