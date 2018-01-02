/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author nathan
 */
public class Employees {
    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<Person>();
    }
    
    public void add(Person person){
        this.employees.add(person);
    }
    
    public void add(List<Person> persons){
        persons.forEach(n -> this.employees.add(n));
    }
    
    public void fire(Education education){
        Iterator<Person> itr = employees.iterator();
        while (itr.hasNext()){
            if (itr.next().getEducation() == education)
                itr.remove();
        }
    }
    
    public void print(){
        this.employees.forEach(n -> System.out.println(n));
    }
    
    public void print(Education education){
        Iterator<Person> itr = employees.iterator();
        while (itr.hasNext()){
            Person next = itr.next();
            if (next.getEducation() == education)
                System.out.println(next);
        }
    }
    
    
}
