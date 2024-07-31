import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task6 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter brackets:");
        String str = input.nextLine();// ()
        if(Pattern.compile("\\(\\)|\\(\\)\\{\\}\\[\\]|\\[\\{\\(\\)\\}\\]").matcher(str).matches())
            System.out.println("valid");
        else
            System.out.println("Invalid");
    }
}
