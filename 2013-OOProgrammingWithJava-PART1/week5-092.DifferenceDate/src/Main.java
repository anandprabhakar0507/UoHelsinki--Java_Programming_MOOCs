
public class Main {

    public static void main(String[] args) {
        // write testcode here
        MyDate d1 = new MyDate(2, 6, 2010);
        MyDate d2 = new MyDate(1,5,2000);
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1.differenceInYears(d2));
        System.out.println(d1);
        System.out.println(d2);
    }
}
