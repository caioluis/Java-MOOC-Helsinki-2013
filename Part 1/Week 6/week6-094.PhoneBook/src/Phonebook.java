/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */
import java.util.ArrayList;
public class Phonebook {
    
    private ArrayList<Person> phonebook;
             
    public Phonebook(){
      this.phonebook = new ArrayList<Person>();    
    }
    
    public void add(String name, String number){
        Person x = new Person(name, number);
        this.phonebook.add(x);
    }
    
    public void printAll(){
        for (Person x : phonebook) {
            System.out.println(x);
        }
    }
    
    public String searchNumber(String name){
        for (Person x : phonebook) {
            if (x.getName().contains(name)) {
                return x.getNumber();
            }
        }
        return "number not known";
    }
}
