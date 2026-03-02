import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        
        if (A > B) {
            System.out.println("Subway");
        } else if (A < B) {
            System.out.println("Bus");
        } else {
            System.out.println("Anything");
        }
        
        sc.close();
    }
}