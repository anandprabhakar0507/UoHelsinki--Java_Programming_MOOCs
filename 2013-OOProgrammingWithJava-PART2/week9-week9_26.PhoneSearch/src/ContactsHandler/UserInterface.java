/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactsHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nathan
 */
public class UserInterface {
    private Scanner reader;
    private ContactList contacts;
    
    public UserInterface(Scanner reader){
        this.reader = reader;
        this.contacts = new ContactList();
    }
    
    public void start(){
        System.out.println( "phone search\n" +
                            "available operations:\n" +
                            " 1 add a number\n" +
                            " 2 search for a number\n" +
                            " 3 search for a person by phone number\n" +
                            " 4 add an address\n" +
                            " 5 search for personal information\n" +
                            " 6 delete personal information\n" +
                            " 7 filtered listing\n" +
                            " x quit");
        System.out.println("");
        String input;
        
        OUTER:
        while (true){
            System.out.print("command: ");
            input = reader.nextLine();
            
            switch(input){
                case "x":
                    break OUTER;
                case "1":
                    addNumber();
                    break;
                case "2":
                    searchForNumberByPerson();
                    break;
                case "3":
                    searchForPersonByNumber();
                    break;
                case "4":
                    addAddress();
                    break;
                case "5":
                    searchInformation();
                    break;
                case "6":
                    deleteInformation();
                    break;
                case "7":
                    searchKeyword();
                    break;
            }
            System.out.println("");//spacer
        }
        
    }
    
    public void addNumber(){
        System.out.print("whose number: ");
        String name = reader.nextLine();
        
        System.out.print("number: ");
        String number = reader.nextLine();
        contacts.addNumber(name, number);
    }
    
    public void searchForNumberByPerson(){
        System.out.print("whose number: ");
        String name = reader.nextLine();
        
        ArrayList<String> numbers = (ArrayList<String>)contacts.searchForNumberByPerson(name);
        if (!numbers.isEmpty())
            for (String number : numbers)
                System.out.println(" " + number);
        else{
            System.out.println("  not found");
        }
    }
    
    public void searchForPersonByNumber(){
        System.out.print("number: ");
        String number = reader.nextLine();
        
        Person result = contacts.searchForPersonByNumber(number);
        if (result == null){
            System.out.println(" not found");
        } else{
            System.out.println(" " + result.getName());
        }
    }
    
    public void addAddress(){
        System.out.print("whose address: ");
        String name = reader.nextLine();
        
        System.out.print("street: ");
        String street = reader.nextLine();
        
        System.out.print("city: ");
        String city = reader.nextLine();
        
        contacts.addAddress(name, street, city);
    }
    
    public void searchInformation(){
        System.out.print("whose information: ");
        String name = reader.nextLine();
        Person result = contacts.searchForInformation(name);
        
        if (result != null){
            result.printAddress();
            result.printNumbers();
        } else
            System.out.println("  not found");
        
    }
    
    public void deleteInformation(){
        System.out.print("whose information: ");
        String name = reader.nextLine();
        
        contacts.deleteInformation(name);
    }
    
    public void searchKeyword(){
        System.out.print("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        
        ArrayList<Person> results = (ArrayList<Person>)contacts.keywordSearch(keyword);
        if (results.isEmpty())
            System.out.println(" keyword not found");
        else{
            Collections.sort(results);
            results.forEach(n -> n.printPerson());
        }
    }
    
    
}
