
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added){
        return new Money(this.euros+added.euros, this.cents+added.cents);
    }
    
    public boolean less(Money compare){
        if (this.euros < compare.euros )
            return true;
        if (this.euros == compare.euros && this.cents < compare.cents)
            return true;
        return false;
    }
    
    public Money minus(Money decremented){
        int e = this.euros - decremented.euros;
        int c = this.cents - decremented.cents;
        
        while (c < 0){
            e--;
            c+=100;
        }
        
        if (e < 0){
            e = 0;
            c = 0;
        }
        
        return new Money(e, c);
    }
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
