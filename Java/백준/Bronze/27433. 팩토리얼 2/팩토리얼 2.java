import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        long N = sc.nextLong();
        long factorial = LongStream.rangeClosed(1, N)
                                   .reduce(1, (A, B) -> A * B);
        
        System.out.print(factorial);
        
        sc.close();
    }
}