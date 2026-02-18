import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(ZoneId.of("UTC"));
        
        System.out.println(today.getYear());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfMonth());
    }
}