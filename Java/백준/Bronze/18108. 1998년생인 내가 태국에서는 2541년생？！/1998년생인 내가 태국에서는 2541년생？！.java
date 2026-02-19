import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        long year = sc.nextLong();
        
        System.out.println(year - 543);
        
        sc.close();
    }
}