/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */
import java.util.*;
public class Reader {
    
    private Scanner s = new Scanner(System.in);
    
    public String readString(){
       String stringInput = s.nextLine();
        return stringInput;
    }
    
    public int readInteger(){
        int intInput = Integer.parseInt(s.nextLine());
        return intInput;
    }
}
