import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'J') {
                System.out.println(s.charAt(i - 1));
            }
        }
        
        sc.close();
    }
}