package salary;

import java.util.Scanner;
public class Salary {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
          System.out.println("Please input your hourly pay rate: ");
          double HOUR_PAY_RATE = sc.nextDouble();
          System.out.println("Regular hours: ");
          double REG_HOURS = sc.nextDouble();
          System.out.println("Overtime hours: ");
          double OVERTIME = sc.nextDouble();
          
          System.out.println("Overtime Pay: $" + 
                  overtime(HOUR_PAY_RATE, REG_HOURS, OVERTIME));
        
    }
    
    public static double overtime(double x, double y, double z) {
        
        double OVERTIME_PAY = (y * x) + ((z * 1.5) * x);
        
        return OVERTIME_PAY;
        
    }
    
}
