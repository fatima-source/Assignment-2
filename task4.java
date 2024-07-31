import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class task4 {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter date (YYYY-MM-DD:)");
        String str = input.nextLine();
        LocalDate date = LocalDate.parse(str);
        date = date.plusDays(30);
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));


    }
}
