package pizzachoice;

import javax.swing.JOptionPane;
public class PizzaChoice {

    
    static char[] SIZE = {'S', 'M', 'L', 'X'};
    static double[] PRICE = {6.99, 8.99, 12.50, 15.00};
    static String ORDER_SIZE;
    static String RETRY;
    static boolean REDO = false;
    static int ARR_LENGTH = SIZE.length;
    
    public static void main(String[] args) {
        
        do {
            
        ORDER_SIZE = JOptionPane.showInputDialog("Enter Pizza Size (S, M, L or X):");
        
        switch(ORDER_SIZE) {
            
            case "S":
            case "s":
                RETRY = JOptionPane.showInputDialog("The price of a small pizza is $" + PRICE[0]
                 + "\nTry Again? Y/N");
                switch(RETRY) {
                    case "Y":
                    case "y":
                        REDO = true;
                        break;
                    default:
                        REDO = false;
                        break;
                }
                break;
            case "M":
            case "m":
                 RETRY = JOptionPane.showInputDialog("The price of a medium pizza is $" + PRICE[1]
                 + "\nTry Again? Y/N");
                 switch(RETRY) {
                    case "Y":
                    case "y":
                        REDO = true;
                        break;
                    default:
                        REDO = false;
                        break;
                }
                break;
            case "L":
            case "l":
                 RETRY = JOptionPane.showInputDialog("The price of a large pizza is $" + PRICE[2]
                 + "\nTry Again? Y/N");
                 switch(RETRY) {
                    case "Y":
                    case "y":
                        REDO = true;
                        break;
                    default:
                        REDO = false;
                        break;
                }
                 break;
            case "X":
            case "x":
                RETRY = JOptionPane.showInputDialog("The price of a extra large pizza is $" + PRICE[3]
                + "\nTry Again? Y/N");
                switch(RETRY) {
                    case "Y":
                    case "y":
                        REDO = true;
                        break;
                    default:
                        REDO = false;
                        break;
                }
                break;
            default:
                RETRY = JOptionPane.showInputDialog("Invalid choice. Try again? Y/N");
                switch(RETRY) {
                    case "Y":
                    case "y":
                        REDO = true;
                        break;
                    default:
                        REDO = false;
                        break;
                }
            
        }
        
        }while(REDO);
        
    }
    
}
