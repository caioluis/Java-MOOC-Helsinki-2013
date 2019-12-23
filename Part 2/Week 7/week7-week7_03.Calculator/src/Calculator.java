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
public class Calculator {
    private Reader reader;
    private int numberOfOperations;
    
    public Calculator(){
        reader = new Reader();

    }
    
    private void sum() {
        int first;
        int second;
        System.out.println("Type the first number");
        first = reader.readInteger();
        System.out.println("Type the second number");
        second = reader.readInteger();
        System.out.println("sum: " + (first + second));
        numberOfOperations++;
    }
    
    private void difference() {
        int first;
        int second;
        System.out.println("Type the first number");
        first = reader.readInteger();
        System.out.println("Type the second number");
        second = reader.readInteger();
        System.out.println("difference:" + (first - second));
        numberOfOperations++;
    }
    
    private void product() {
        int first;
        int second;
        System.out.println("Type the first number");
        first = reader.readInteger();
        System.out.println("Type the second number");
        second = reader.readInteger();
        System.out.println("product:" + (first * second));
        numberOfOperations++;
    }
    
    private void statistics(){
        System.out.println("The number of operations done with the calculator is: " + numberOfOperations);
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
}
