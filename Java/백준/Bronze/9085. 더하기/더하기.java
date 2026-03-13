import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            
            int total_sum = 0;
            
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                total_sum += num;
            }
            System.out.println(total_sum);
        }
        sc.close();
    }
}