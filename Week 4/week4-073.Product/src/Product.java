/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ocaioluis
 */
public class Product {
    private final String nameAtStart;
    private final double priceAtStart;
    private final int amountAtStart;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.nameAtStart = nameAtStart;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
        
    }
    
    public void printProduct() {
        System.out.println(this.nameAtStart + ", " + this.priceAtStart + ", " + this.amountAtStart);
    }
}
