import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        
        if (A > B) {
            System.out.print(1);
        } else if (A < B) {
            System.out.print(-1);
        } else {
            System.out.print(0);
        }
        
        sc.close();
    }
}