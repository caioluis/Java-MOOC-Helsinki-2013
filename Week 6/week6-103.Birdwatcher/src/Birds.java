
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */
public class Birds {
    private String name;
    private String latinName;
    private int timesObserved;
    
    private Scanner s = new Scanner(System.in);
    
    ArrayList<Birds> birds = new ArrayList();
    
    public Birds(){
        this.name = "";
        this.latinName = "";
        this.timesObserved = 0;
    }
    
    public Birds(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.timesObserved = 0;
    }

  
    public void add(){
        System.out.println("Name: ");
        String newName = s.nextLine();
        System.out.println("Latin Name: ");
        String newLatinName = s.nextLine();
        birds.add(new Birds(newName, newLatinName));
    }
    
    public void observation(){
        System.out.println("What was observed?");
        String identifier = s.nextLine();
        for (Birds i : this.birds) {
            if (i.name.equals(identifier) || i.latinName.equals(identifier)) {
                i.timesObserved++;
            } else{
                System.out.println("This is not a bird!");
            }
        }
    }
    
    public void stats(){
        for (Birds i : this.birds) {
            i.toString();
        }
    }
    
    public String toString(){
        return name + "(" + latinName + "): " + timesObserved + " observations";
    }
    
    public void show(){
        System.out.println("What?");
        String identifier = s.nextLine();
        for (Birds i : this.birds) {
            if (i.name.equals(identifier) || i.latinName.equals(identifier)) {
                i.toString();
            } else{
                System.out.println("This is not a bird!");
            }
        }
    }
    
    public void Watcher(){
        while (true) {
           System.out.println("?");
           String command = s.nextLine();
            if (command.toUpperCase().equals("ADD")) {
                add();
            } else if (command.toUpperCase().equals("OBSERVATION")) {
               observation(); 
            } else if (command.toUpperCase().equals("STATISTICS")) {
               stats();
            } else if (command.toUpperCase().equals("SHOW")) {
                show();
            } else if (command.toUpperCase().equals("QUIT")) {
                break;
            }
            
            System.out.println(birds);
           
        }  
        
    }
    
    
    
}
