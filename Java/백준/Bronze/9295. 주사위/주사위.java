import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int c = sc.nextInt();
        
        int total_sum = 0;
        
        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            total_sum = n + m;
            
            System.out.println("Case " + (i + 1) + ": " + total_sum);
        }
        
        sc.close();
    }
}