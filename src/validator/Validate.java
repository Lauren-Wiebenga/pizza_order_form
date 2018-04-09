/*
 * Date:   4/7/18
 * Author: Lauren Wiebenga
 * File:   PizzaOrderForm/src/validator/Validate.java
 */
package validator;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Validate {
    public static boolean isChosen(JComboBox box) {
        if (box.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, 
                errorMsg(box.getName()), "Invalid", ERROR_MESSAGE);
            return false;
        }
        else {
        return true;
        }
    }
    
    private static String errorMsg(String name) {
        return String.format("Please select an option for %s", name);
    }
}
