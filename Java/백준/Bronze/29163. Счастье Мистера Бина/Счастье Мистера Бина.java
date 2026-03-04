import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        
        int even_cnt = 0;
        int odd_cnt = 0;
        
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            
            if (num % 2 == 0) {
                even_cnt++;
            } else {
                odd_cnt++;
            }
        }
        
        if (even_cnt > odd_cnt) {
            System.out.print("Happy");
        } else {
            System.out.print("Sad");
        }
        
        sc.close();
    }
}