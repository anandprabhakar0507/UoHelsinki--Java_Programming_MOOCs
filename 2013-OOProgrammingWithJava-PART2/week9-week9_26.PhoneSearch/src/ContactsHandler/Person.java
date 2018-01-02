/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactsHandler;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nathan
 */
public class Person implements Comparable<Person>{

    private Address address;
    private List<String> numbers;
    private String name;

    public Person(String name, List<String> numbers, Address address) {
        this.address = address;
        this.numbers = numbers;
        this.name = name;
    }

    public Person(String name) {
        this(name, new ArrayList<String>(), new Address());
    }
    
    public void addNumber(String number){
        numbers.add(number);
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public String getName() {
        return name;
    }
    
    public void setAddress(String street, String city){
        address.setStreet(street);
        address.setCity(city);
    }
    
    public Address getAddress(){
        return address;
    }
    
    public void printAddress(){
        if (address.getCity() == null)
            System.out.println("  address unknown");
        else
            System.out.println("  address: " + address);
    }
    
    public void printNumbers(){
        if (numbers.isEmpty())
            System.out.println("  phone number not found");
        else{
            System.out.println("  phone numbers:");
            numbers.forEach(n -> System.out.println("   "+ n));
        }
    }
    
    public void printPerson(){
        System.out.println("");
        System.out.println(this);
        this.printAddress();
        this.printNumbers();
    }
    
    @Override
    public String toString() {
        return " " + name;
    }
    
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
    
}
