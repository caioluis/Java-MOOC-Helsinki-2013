/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */
public class Change {
    
    private char fromCharacter;
    private char toCharacter;
    
    public Change(char fromCharacter, char toCharacter){
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    
    
    public String change(String characterString){     
        String replaced = characterString.replaceAll(String.valueOf(fromCharacter), String.valueOf(toCharacter));
        return replaced;
    }
    
    
}
