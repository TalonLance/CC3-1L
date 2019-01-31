package exponent2;

import java.util.Scanner;
public class Exponent2 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Input a number: ");
        int X = sc.nextInt();
        
        System.out.println("Squared (" + X + ")^2: " + SquareMethod(X));
        System.out.println("Cubed: (" + X + ")^3: " + CubeMethod(X));
        
    }
    
    public static int SquareMethod(int a) {
        
        a = a * a;
        return a;
        
    }
    
    public static int CubeMethod(int b) {
        
        int a = SquareMethod(b);
        a = b * a; 
        return a;
        
    }
    
}
