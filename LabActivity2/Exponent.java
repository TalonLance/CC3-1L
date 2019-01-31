package exponent;

import java.util.Scanner;
public class Exponent {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Input a number: ");
        int X = sc.nextInt();
        
        System.out.println("Squared: " + SquareMethod(X));
        System.out.println("Cubed: " + CubeMethod(X));
        
    }
    
    
    public static int SquareMethod(int a) {
        
        a = a * a;
        return a;
        
    }
    
    public static int CubeMethod(int b) {
        
        b = b * b * b;
        return b;
        
    }
    
}
