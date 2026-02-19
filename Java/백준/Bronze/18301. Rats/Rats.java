import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N12 = sc.nextInt();
        
        int result = ((N1 + 1) * (N2 + 1)) / (N12 + 1) - 1;
        
        System.out.println(result);
        
        sc.close();
    }
}