public class task1 {
    public static void main(String[] args) {

        String str = "abcba";

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
    }
}
