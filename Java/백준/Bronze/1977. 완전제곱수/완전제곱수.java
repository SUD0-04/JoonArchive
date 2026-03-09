import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        int sum = 0;
        int min_val = -1;
        
        for (int i = 1; i <= 100; i++) {
            int square = i * i;
            
            if (square >= M && square <= N) {
                if (min_val == -1) {
                    min_val = square;
                }
                sum += square;
            }
        }
        
        if (min_val == -1) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min_val);
        }
        
        sc.close();
    }
}