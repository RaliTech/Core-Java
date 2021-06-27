public class COuntVC {
    public static void main(String[] args) {
        String inf = "Chandihgarh University is very famous University in Punjab";
        int vcount = 0, ccount = 0;
        for (int i = 0; i < inf.length(); i++) {
            if (inf.charAt(i) == 'a' || inf.charAt(i) == 'e' || inf.charAt(i) == 'i' || inf.charAt(i) == 'o'
                    || inf.charAt(i) == 'u') {
                vcount++;
            } else if (inf.charAt(i) >= 'a' && inf.charAt(i) <= 'z') {
                ccount++;
            }
        }
        System.out.println("Number of vowels are:=" + vcount);
        System.out.println("Number of consonants:=" + ccount);
    }
}