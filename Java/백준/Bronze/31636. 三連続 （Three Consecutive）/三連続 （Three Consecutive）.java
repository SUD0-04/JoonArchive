import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        boolean found = false;
        
        for (int i = 0; i <= n - 3; i++) {
            if (s.charAt(i) == 'o' && s.charAt(i+1) == 'o' && s.charAt(i+2) == 'o') {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}