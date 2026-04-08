import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        long n_fac = factorial(n);
        long k_fac = factorial(k);
        long total_fac = factorial(n - k);
        
        long result = n_fac / (k_fac * total_fac);
        
        System.out.println(result);
        
        sc.close();
    }
    
    public static long factorial (int num) {
        if (num <= 1) return 1;
        return num * factorial (num - 1);
    }
}