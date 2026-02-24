import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int[] scores = new int[2];
        
        for (int i = 0; i < 2; i++) {
            int T = sc.nextInt();
            int F = sc.nextInt();
            int K = sc.nextInt();
            int P = sc.nextInt();
            int S = sc.nextInt();
            
            scores[i] = (T * 6) + (F * 3) + (K * 2) + (P * 1) + (S * 2);
        }
        
        System.out.println(scores[0] + " " + scores[1]);
        
        sc.close();
    }
}