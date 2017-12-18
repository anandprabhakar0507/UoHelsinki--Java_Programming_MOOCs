
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        day = (day%30) + 1;
        if (day == 1){
            month = (month%12) + 1;
            if (month == 1){
                year++;
            }
        }
    }
    
    public void advance(int numberOfDays){
        for(int i = 0; i < numberOfDays; i++)
            advance();
    }
    
    public MyDate afterNumberOfDays(int days){
        MyDate future = new MyDate(this.day, this.month, this.year);
        future.advance(days);
        return future;
    }

}