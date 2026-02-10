import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String sentence = sc.next();
        
        String result = sentence.toUpperCase();
        
        System.out.println(result);
        
        sc.close();
    }
}