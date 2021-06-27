public class ReverseString {
    public static void main(String[] args) {
        // Using + (String concatenation) operator

        String str = "ABCD";
        String rev = "";
        /*
         * int len = str.length(); str.charAt(0); for (int i = len - 1; i >= 0; i--) {
         * rev = rev + str.charAt(i); }
         */
        // Using character array
        char[] a = str.toCharArray();
        int len = a.length;
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + a[i];

        }
        System.out.println(rev);
    }
}