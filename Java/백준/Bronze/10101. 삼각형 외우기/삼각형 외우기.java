import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int[] arr = new int[3];
        int total = 0;
        
        for (int i = 0; i <3; i++) {
            arr[i] = sc.nextInt();
            
            total += arr[i];
        }
        
        if (total == 180 && (arr[0] == arr[1] && arr[1] == arr[2]))
            System.out.print("Equilateral");
        else if (total == 180 && (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]))
            System.out.print("Isosceles");
        else if (total == 180 && (arr[0] != arr[1] && arr[1] != arr[2] && arr[2] != arr[0]))
            System.out.print("Scalene");
        else
            System.out.print("Error");
        
        sc.close();
    }
}