import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        
        long sum = n * (n + 1) / 2;
        long sumSquared = sum * sum;
        
        System.out.println(sum);
        System.out.println(sumSquared);
        System.out.println(sumSquared);
        
        sc.close();
    }
}