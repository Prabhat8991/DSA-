package phase1.string;

/**
 * S1 = "ABCD"
 * S2 = "AC"
 *
 * subsequence should be in same order and may not be continuous
 */
public class Subsequence {

    public static void main(String[] args) {
        String s1 = "ABCDE";
        String s2 = "ADC";
        System.out.print(isSubsequence(s1, s2));
    }

    private static boolean isSubsequence(String s1, String s2) {
        int i = 0,j = 0;

        while(i < s1.length() && j < s2.length()) {
            if(s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == s2.length();

    }
}
