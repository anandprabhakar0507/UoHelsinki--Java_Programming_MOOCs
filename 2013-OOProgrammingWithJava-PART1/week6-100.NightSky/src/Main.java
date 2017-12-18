
public class Main {

    public static void main(String[] args) {
        // Test your code here
        NightSky t = new NightSky(0.05, 40, 20);
        
        t.print();
        System.out.println(t.starsInLastPrint());
    }
}
