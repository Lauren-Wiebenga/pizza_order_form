/*
 * Date:   4/7/18
 * Author: Lauren Wiebenga
 * File:   PizzaOrderForm/src/business/Topping.java
 */
package business;

public class Topping {
    /************************
     *  INSTANCE VARIABLES  *
     ************************/
    private String type;
    private String amount;
    private double cost;
    
    /******************
     *  CONSTRUCTORS  *
     ******************/
    public Topping (String type, String amount) {
        this.type = type;
        this.amount = amount;
        // this.cost = cost;
    }
    
    /************************
     *  FUNCTIONAL METHODS  *
     ************************/
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    public String getAmount() {
        return this.amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    
//    public double getCost() {
//        return cost;
//    }
//    public void setCost(double cost) {
//        this.cost = cost;
//    }
    
    @Override
    public String toString() {
        // add cost
        return String.format("%-35s:%30s", this.type, this.amount);
    }
}
