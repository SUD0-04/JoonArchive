import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        
        String oldest_name = "";
        long minBirthVal = 99999999;
        
        String youngest_name = "";
        long maxBirthVal = 0;
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            long d = sc.nextLong();
            long m = sc.nextLong();
            long y = sc.nextLong();
            
            long currentBirthVal = (long) y * 10000 + (long) m * 100 + d;
            
            if (currentBirthVal > maxBirthVal) {
                maxBirthVal = currentBirthVal;
                youngest_name = name;
            }
            
            if (currentBirthVal < minBirthVal) {
                minBirthVal = currentBirthVal;
                oldest_name = name;
            }
            
        }
        
        System.out.println(youngest_name);
        System.out.println(oldest_name);
        
        sc.close();
    }
}