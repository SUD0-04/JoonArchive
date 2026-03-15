import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        
        long total_sum = 0;
        
        for (int i = 0; i < n; i++) {
            int mt = sc.nextInt();
            total_sum += mt;
        }
        
        System.out.print(total_sum - (n - 1));
        
        sc.close();
    }
}