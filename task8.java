import java.util.*;
public class task8 {
    public static void main (String []args){
        System.out.println("Enter a string :");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char [] charArray = s.toCharArray();
        char [] c2 = new char[charArray.length];
        int index = 0;
        for (int i = 0; i < charArray.length; i++){
            boolean b = false;
            for (int j = 0; j < i; j++){
                if (charArray[i] == charArray[j]){
                    b = true;
                }
            }
            if (b != true){
                c2[index] = charArray[i];
                index++;
            }

        }
        System.out.println(c2);
    }
}
