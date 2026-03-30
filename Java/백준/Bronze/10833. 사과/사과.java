import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        
        int total_apls = 0;
        
        for (int i = 0; i < n; i++) {
            int snts = sc.nextInt();
            int apls = sc.nextInt();
            
            total_apls += (apls % snts);
        }
        
        System.out.println(total_apls);
        
        sc.close();
    }
}