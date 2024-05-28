/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JESUS
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {
    
    private List<Person> people;
    
    public Employees () {
        people = new ArrayList<Person>();
    }
    
    public void add(Person personToAdd) {
        this.people.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        this.people.addAll(peopleToAdd);
    }
    
    public void print() {
        Iterator<Person> iterator = this.people.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.people.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getEducation() == education) {
                System.out.println(next);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.people.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getEducation() == education) {
                iterator.remove();
            }
        }
    }
    
}
