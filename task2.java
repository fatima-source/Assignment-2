import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an email address:");
        String email = scanner.nextLine().trim();
        scanner.close();


        String studentEmailRegex = "^[a-zA-Z]\\d{10}@umt\\.edu\\.pk$";
        String facultyEmailRegex = "^[a-zA-Z]+\\.[a-zA-Z]+@umt\\.edu\\.pk$";


        Pattern studentPattern = Pattern.compile(studentEmailRegex);
        Pattern facultyPattern = Pattern.compile(facultyEmailRegex);

        Matcher studentMatcher = studentPattern.matcher(email);
        Matcher facultyMatcher = facultyPattern.matcher(email);


        if (studentMatcher.matches() || facultyMatcher.matches()) {
            System.out.println(email + " valid");
        } else {
            System.out.println(email + " invalid");
        }
    }
}
