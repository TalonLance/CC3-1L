package prices;

import java.util.Scanner;
public class Prices {
    
    static Scanner sc = new Scanner(System.in);
    static double[] PRICES = new double[20];
    static double SUM = 0;
    static double AVERAGE;
    
    public static void main(String[] args) {
        
        System.out.println("Enter 20 prices: ");
        
        for (int i = 0; i < 20; i++) {
            
            System.out.print("$");
            PRICES[i] = sc.nextDouble();
            
        }
        
        for (int i = 0; i < 20; i++) {
            
            SUM += PRICES[i];
            
        }
        
        System.out.println("Sum of all prices: $" + SUM);
        
        System.out.println("Prices lower than $5.00: ");
        for (int i = 0; i < 20; i++) {
            
            if(PRICES[i] < 5.00) {
                
                System.out.print("$" + PRICES[i] + " ");
                
            }
            
        }
        System.out.println();
        
        System.out.println("The average of all prices: " + (SUM / 20));
        
        System.out.println("Prices above the average: ");
        for (int i = 0; i < 20; i++) {
            
            if(PRICES[i] > (SUM / 20)) {
                
                System.out.print("$" + PRICES[i] + " ");
                
            }
            
        }
        
    }
    
}
