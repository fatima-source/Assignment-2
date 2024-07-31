import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class task3 {
    public static void main (String []args){
        LocalDate today =LocalDate.now();
        String newDate  = today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("before: "+today);
        System.out.println("after: "+newDate);

    }
}
