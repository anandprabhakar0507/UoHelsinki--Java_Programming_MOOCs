
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class Phonebook {
    private ArrayList<Person> contacts = new ArrayList<Person>();
    
    public void add(String name, String number){
        contacts.add(new Person(name, number));
    }
    
    public void printAll(){
        for (Person p : contacts)
            System.out.println(p);
    }
    
    public String searchNumber(String name){
        for (Person p : contacts)
            if (p.getName().equals(name))
                return p.getNumber();
        return "number not known";
    }
}
