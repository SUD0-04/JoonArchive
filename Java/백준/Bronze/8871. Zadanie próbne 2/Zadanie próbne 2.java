import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int num = sc.nextInt();
        
        int min = 2 * (num + 1);
        int max = 3 * (num + 1);
        
        System.out.println(min);
        System.out.println(max);
        
        sc.close();
    }
} 