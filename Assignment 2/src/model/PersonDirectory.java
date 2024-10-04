/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author gunav
 */
public class PersonDirectory {
    
    ArrayList<Person> persons;
    
    public PersonDirectory(){
        this.persons = new ArrayList<Person>();
    }
    
    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    
    public Person addPerson(){
        Person person = new Person();
        persons.add(person);
        return person;
        
    }
    
    public void delAccount(Person person){
        persons.remove(person);
    }
    
    public Person searchByFirstName(String firstName){
        for (Person p: persons){
            if(p.getFirstName().contains(firstName)){
                return p;
            }
        }
        
        return null;
    }
    
    public Person searchByLastName(String lastName){
        for (Person p: persons){
            if(p.getLastName().contains(lastName)){
                return p;
            }
        }
        
        return null;
    }
    
    public Person searchByAdd(String streetAdd){
        for (Person p: persons){
            if(p.getWorkAdd().streetAdd.contains(streetAdd)){
                return p;
            }
        }
        
        return null;
    }
    
    
    
}
