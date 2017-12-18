
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        String inName;
        String inID;
        while(true){
            System.out.println("name: ");
            inName = reader.nextLine();
            if (inName.equals(""))
                break;
            System.out.println("studentnumber: ");
            inID = reader.nextLine();
            students.add(new Student(inName, inID));
        }
        
        for(Student s : students)
            System.out.println(s.toString());
        
        String inSearchTerm;
        System.out.println("Give search term: ");
        inSearchTerm = reader.nextLine();
        System.out.println("Result: ");
        for (Student s : students){
            if (s.getName().contains(inSearchTerm))
                System.out.println(s.toString());
        }
        
    }
}