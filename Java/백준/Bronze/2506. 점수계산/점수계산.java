import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        
        int total = 0;
        int streak = 0;
        
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            
            if (score == 1) {
                streak++;
                total += streak;
            } else {
                streak = 0;
            }
        }
        
        System.out.print(total);
        
        sc.close();
    } 
}