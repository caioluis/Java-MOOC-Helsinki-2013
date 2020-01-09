

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

public class Storehouse {

    private String product;
    private int price;
    private int stock;
    private Map<String, Integer> things;
    private Map<String, Integer> stocks;

    public Storehouse() {
        things = new HashMap<String, Integer>();
        stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        things.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        if (things.containsKey(product)) {
            return things.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (stocks.containsKey(product)) {
            return stocks.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (stocks.containsKey(product)) {
            if (stocks.get(product) > 0) {
                stocks.put(product, stocks.get(product) - 1);
                return true;
            }
            
        } 
            return false;
    }
    
    //to be continued
    public Set<String> products(){
        Set<String> store = new HashSet<String>();
        for (String key : things.keySet()) {
            store.add(key);
        }
        
        return store;
    }
}
