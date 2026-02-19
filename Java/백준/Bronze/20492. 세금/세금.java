import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        
        int case1 = (N / 100) * 78;
        int case2 = (N / 1000) * 956;
        
        System.out.println(case1 + " " + case2);
        
        sc.close();
    }
}