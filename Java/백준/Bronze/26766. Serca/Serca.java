import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String heart = " @@@   @@@ \n" +
                       "@   @ @   @\n" +
                       "@    @    @\n" +
                       "@         @\n" +
                       " @       @ \n" +
                       "  @     @  \n" +
                       "   @   @   \n" +
                       "    @ @    \n" +
                       "     @     ";

        for (int i = 0; i < n; i++) {
            System.out.println(heart);
        }
        
        sc.close();
    }
}