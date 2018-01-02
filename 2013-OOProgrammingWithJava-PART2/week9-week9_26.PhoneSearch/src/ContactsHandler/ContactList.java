/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactsHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nathan
 */
public class ContactList {
    private Map<String, Person> nameToPerson;
    private Map<String, Person> numberToPerson;

    public ContactList() {
        nameToPerson = new HashMap<String, Person>();
        numberToPerson = new HashMap<String, Person>();
    }
    
    public void addNumber(String name, String number){
        
        if (nameToPerson.get(name) != null){ 
            
            nameToPerson.get(name).addNumber(number);
        } else{
            nameToPerson.put(name, new Person(name));
            nameToPerson.get(name).addNumber(number);
        }
        
        numberToPerson.put(number, nameToPerson.get(name));
    }
    
    public List<String> searchForNumberByPerson(String name){
        try{
            return nameToPerson.get(name).getNumbers();
        } catch (NullPointerException e){
            return new ArrayList<String>();
        }
    }
    
    public Person searchForPersonByNumber(String number){
        return numberToPerson.get(number);
    }
    
    public void addAddress(String name, String street, String city){
        if (nameToPerson.containsKey(name)){
            nameToPerson.get(name).setAddress(street, city);
        } else{
            nameToPerson.put(name, new Person(name));
            nameToPerson.get(name).setAddress(street, city);
        }
    }
    
    public Person searchForInformation(String name){
        if (nameToPerson.containsKey(name)){
            return nameToPerson.get(name);
        } else{
            return null;
        }
    }
    
    public void deleteInformation(String name){
        if (nameToPerson.containsKey(name)){
            for (String number : nameToPerson.get(name).getNumbers())
                numberToPerson.remove(number);
            nameToPerson.remove(name);
        }
    }
    
    public List<Person> keywordSearch(String keyword){
        List<Person> results = new ArrayList<Person>();
        for (Person person : nameToPerson.values()){
            if (person.getAddress().getStreet() == null){
                if (person.getName().contains(keyword))
                    results.add(person);
            } else if (person.getAddress().getStreet().contains(keyword) ||
                person.getAddress().getCity().contains(keyword)   ||
                person.getName().contains(keyword)                   )
                results.add(person);
        }
        return results;
    }
    
}
