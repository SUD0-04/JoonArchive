import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int c = sc.nextInt();
        
        for (int i = 0; i < c; i++) {
            long s = sc.nextLong();
            long n = sc.nextLong();
            
            long op_sum = 0;
            
            for (int j = 0; j < n; j++) {
                long q = sc.nextLong();
                long p = sc.nextLong();

                op_sum += q * p;
            }
            System.out.println(s + op_sum);
        }
        sc.close();
    }
}