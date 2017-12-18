
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Storehouse() {
        prices = new HashMap<String, Integer>();
        stocks = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        prices.put(product, price);
        stocks.put(product, stock);
    }
            
    public int price(String product){
        if (prices.containsKey(product))
            return prices.get(product);
        else
            return -99;
    }
    
    public int stock(String product){
        if (stocks.containsKey(product) && stocks.get(product)>0)
            return stocks.get(product);
        return 0;
    }
    
    public boolean take(String product){
        if (stocks.containsKey(product)){
            int stock = stocks.get(product);
            if (stock > 0 ){
                stocks.put(product, stock-1);
                return true;
            }
        }
        return false;
    }
    
    public Set<String> products(){
        return prices.keySet();
    }
    
    
}
