

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

    
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Storehouse() {
        prices = new HashMap<String, Integer>();
        stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        if (prices.containsKey(product)) {
            return prices.get(product);
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
    

    public Set<String> products(){
        Set<String> store = new HashSet<String>();
<<<<<<< HEAD
        for (String key : prices.keySet()) {
=======
        for (String key : things.keySet()) {
>>>>>>> a5e0eb8c2dd7fa44006004dbbd3c5bc044e41faf
            store.add(key);
        }
        
        return store;
    }
}
