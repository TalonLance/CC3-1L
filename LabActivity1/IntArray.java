package intarray;

import java.util.Scanner;
public class IntArray {
    
    //CONSTANT VARIABLES
    static Scanner sc = new Scanner(System.in);
    static int[] ARR = new int[5];
    static int i;
    
    public static void main(String[] args) {
        
        System.out.println("Enter five elements:");
        
        for(i = 0; i < ARR.length; i++) {
            
            System.out.print("Enter an integer: ");
            ARR[i] = sc.nextInt();
            
        }
        
        System.out.print("From first to last: ");
        
        for (i = 0; i < ARR.length; i++) {
            
            System.out.print(ARR[i] + " ");
            
        }
        
        System.out.print("\nFrom last to first: ");
        
        for (i = 4; i > 0; i--) {
            
            System.out.print(ARR[i] + " ");
            
        }
        
    }
    
}
