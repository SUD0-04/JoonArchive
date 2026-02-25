import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        
        int repeat = n / 4;
        
        for (int i = 0; i < repeat; i++) {
            System.out.println("long");
        }
        
        System.out.println("int");
        
        sc.close();
    }
}