
import java.util.List;
import people.Person;
import people.Student;
import people.Teacher;

public class Main {

    public static void main(String[] args) {
        Person olli = new Person("Olli", "Ida Albergintie Street 1 00400 Helsinki");
//        olli.credits();        // NOT WORKING!
//        olli.study();              // NOT WORKING!
        System.out.println( olli.toString() );   // olli.toString() IT WORKS!
    }

    public static void printDepartment(List<Person> people) {
        people.forEach(n -> System.out.println(n));
    }

}
