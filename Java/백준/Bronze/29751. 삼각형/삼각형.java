import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double H = sc.nextLong();
        double W = sc.nextLong();
        
        System.out.printf("%.1f", (H * W) / 2.0);
        
        sc.close();
    }
}