/*
 * Date:   4/1/18
 * Author: Lauren Wiebenga
 * File:   PizzaOrderForm/src/business/Pizza.java
 */
package business;

import java.util.Collection;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

public class Pizza {
    /************************
     *  INSTANCE VARIABLES  *
     ************************/
    final private static int LIMIT = 7;
    private int totalIngred;
    private Topping crust;
    private HashMap<String, Topping> toppings;
    
    /******************
     *  CONSTRUCTORS  *
     ******************/
    public Pizza() {
        totalIngred = 0;
        crust = new Topping("none", "none");
        toppings = new HashMap<>();
    }
    
    /************************
     *  FUNCTIONAL METHODS  *
     ************************/
    public void clear() {
        totalIngred = 0;
        crust = new Topping("none", "none");
        toppings.clear();
    }
    
    public void handleTopping(JComboBox box, String key, String ingred) {
        if (box.getSelectedIndex() == 0) {
            this.removeTopping(key);
        }
        else {
            if (totalIngred < LIMIT) {
                this.addTopping(key, 
                new Topping(ingred, box.getSelectedItem().toString()));
            }
            else {
                 JOptionPane.showMessageDialog(null, "You have already reached the topping limit.", 
                "Limit Reached", ERROR_MESSAGE);
                 box.setSelectedIndex(0);
            }
        }
    }
    
    public void addCrust(Topping t) {
        crust = t;
    }
    public void addTopping(String key, Topping t) {
        // check if already in HashMap
        if (toppings.containsKey(key)) {
            toppings.replace(key, t);
        }
        // add if new key
        else {
            toppings.put(key, t);
            totalIngred++;
        }

    }
    public void removeTopping(String key) {
        if (toppings.containsKey(key)) {
            toppings.remove(key);
            totalIngred--;
        }
    }
    @Override
    public String toString() {
        // return final order
        String order = String.format("%s", "YOUR ORDER:\n\n");
        order += crust.toString() + "\n";
        Collection<Topping> allTop = toppings.values();
        for (Topping t : allTop) {
            order += t.toString() + "\n";
        }
        return order;
    }
}
