import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = (a + b) % 12;
        
        if (result == 0) {
            System.out.print(12);
        } else {
            System.out.print(result);
        }
        
        sc.close();
    }
}