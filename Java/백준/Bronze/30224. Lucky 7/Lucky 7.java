import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        String s = String.valueOf(n);
        
        boolean Has7 = s.contains("7");
        boolean Div7 = (n % 7 == 0);
        
        if (!Has7 && !Div7) {
            System.out.print(0);
        } else if (!Has7 && Div7) {
            System.out.print(1);
        } else if (Has7 && !Div7) {
            System.out.print(2);
        } else {
            System.out.print(3);
        }
        
        sc.close();
    }
}