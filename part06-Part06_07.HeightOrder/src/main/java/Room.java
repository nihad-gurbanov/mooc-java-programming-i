import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nihad
 */
public class Room {
    private ArrayList<Person> persons= new ArrayList<>();;
    
    public Room() { 
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return persons;
    }
    
    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person shortest = persons.get(0);
        
        for (Person person: persons) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take() {
        Person shortest = this.shortest();
        persons.remove(shortest);
        return shortest;
    }
    
}
