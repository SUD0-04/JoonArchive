import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String str = "WelcomeToSMUPC";
        int length = str.length();
        
        int n = sc.nextInt();
        
        int index = (int) ((n - 1) % length);
        
        System.out.print(str.charAt(index));
        
        sc.close();
    }
}