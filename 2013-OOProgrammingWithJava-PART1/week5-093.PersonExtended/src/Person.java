import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        this(name, birthday.getDay(), birthday.getMonth(), birthday.getYear());
    }
    
    public Person(String name) {
         this(name, Calendar.getInstance().get(Calendar.DATE),
                    Calendar.getInstance().get(Calendar.MONTH) + 1, // January is 0 so we add one
                    Calendar.getInstance().get(Calendar.YEAR));
    }
    
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int tDay = Calendar.getInstance().get(Calendar.DATE);
        int tMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int tYear = Calendar.getInstance().get(Calendar.YEAR);
        MyDate today = new MyDate(tDay, tMonth, tYear);
        
        return birthday.differenceInYears(today);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        return this.birthday.earlier(compared.birthday);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
