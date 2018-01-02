
public class Main {

    public static void main(String[] args) throws Exception {
        // write some test code here
        // for testing purposes, project has files
        //    src/textfile.txt
        //    src/kalevala.txt
        Printer t = new Printer("src/textfile.txt");

//        printer.printLinesWhichContain("Väinämöinen");
//        System.out.println("-----");
        t.printLinesWhichContain("vanha");
//        System.out.println("-----");
//        printer.printLinesWhichContain("");
//        System.out.println("-----");
    }
}
