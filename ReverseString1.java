public class ReverseString {
    public static void main(String[] args) {
        String name = "Ramzan";
        String r = "";
        char[] a = str.toCharArray();
        int len = a.length;
        for (int i = len - 1; i >= 0; i--) {
            r = r + a[i];

        }
        System.out.println(r);
    }
}