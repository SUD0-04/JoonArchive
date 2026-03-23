import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int total = 0;
        int[] count = new int[1001];
        int avg = 0;
        
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            
            total += n;
            count[n]++;
        }
        
        avg = total / 10;
        
        int maxIdx = 0;
        
        for (int i = 1; i <= 1000; i++) {
            if (count[i] > count[maxIdx]) {
                maxIdx = i;
            }
        }
        
        System.out.println(avg);
        System.out.println(maxIdx);
        
        sc.close();
    }
}