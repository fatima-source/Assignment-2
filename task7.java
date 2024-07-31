import java.util.*;

public class task7 {
    public static void main(String [] args){
      String [] str_Arr = {"Free","Fry","Frog"};
        if (str_Arr.length==0)
            System.out.println("String is empty");
        else if(str_Arr.length==1)
            System.out.println(str_Arr[0]);
        else{
            String String1 = str_Arr[0];
            for (int i = 1; i < str_Arr.length ; i++) {
                String currstr = str_Arr[i];
                int j=0;
                while (j<currstr.length() && j<String1.length() &&//abc //abcd
                currstr.charAt(j)==String1.charAt(j)){
                    j++;
                }
                if (j==0) {
                    System.out.println("Not matched");
                    break;
                }
                String1 = currstr.substring(0,j);
            }
            System.out.print("Prefix is:");
            System.out.println(String1);


        }
    }
}
