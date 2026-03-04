import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double num = sc.nextDouble();
        
        double result = num / 4.0;
        
        System.out.printf("%.2f", result);
        
        sc.close();
    }
}