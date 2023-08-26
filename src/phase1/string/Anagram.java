package phase1.string;

public class Anagram {

    public static void main(String[] args) {
         String s1 = "TILE";
         String s2 = "LITU";
         System.out.print(isAnagram(s1, s2));
    }

    private static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        int [] resultArray = new int[256];

        for(int i = 0; i < s1.length(); i++) {
            resultArray[s1.charAt(i)]++;
            resultArray[s2.charAt(i)]--;
        }

        for(int i = 0; i < resultArray.length; i++) {
            if(resultArray[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
