import java.util.*;
public class task5 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        String str = input.nextLine();
        int n = Integer.parseInt(str);
        String[] roman = { "M",  "CM", "D", "C",  "XC", "L",  "X", "IX", "V", "I" };
        int[] value = {  1000, 900, 500, 100, 90, 50, 10, 9, 5, 1 };
        String result = "";
        for (int i = 0; i < value.length; i++) {
            int num = n / value[i];
        if (num == 0)
            continue;
            result += (num == 4 && i > 0)? roman[i] + roman[i - 1]: roman[i];
            n = n % value[i];
        }
        System.out.println("roman number = "+result);
    }
}
